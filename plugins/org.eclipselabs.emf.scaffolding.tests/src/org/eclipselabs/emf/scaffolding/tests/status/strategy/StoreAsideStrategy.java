/*******************************************************************************
 * Copyright (c) 2010 Contributors - see below
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Cedric Vidal - initial API and implementation
 *
 *******************************************************************************/
package org.eclipselabs.emf.scaffolding.tests.status.strategy;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.change.ChangeDescription;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipselabs.emf.scaffolding.runtime.ScaffoldingExecutionEnvironment;
import org.eclipselabs.emf.scaffolding.runtime.internal.engine.FactPublisher;
import org.eclipselabs.emf.scaffolding.runtime.status.ScaffoldingContext;
import org.eclipselabs.emf.scaffolding.session.util.ScaffoldingStatusPruner;

/**
 * Store scaffolded elements in a side resource. Scaffolding status is not
 * stored, it stays transient and is reestablished when loading scaffolded
 * elements from side resource.
 * 
 * Requires EMF 3.7 because of
 * https://bugs.eclipse.org/bugs/show_bug.cgi?id=336775
 * 
 * @author cvidal
 * 
 */
public class StoreAsideStrategy extends AbstractScaffoldingStatusStorageStrategy {

	private ScaffoldingStatusPruner pruner = new ScaffoldingStatusPruner();

	/**
	 * Tries to load a {@link ChangeDescription} containing scaffolded
	 * elements stored during previous save.
	 * 
	 * If available, applies the {@link ChangeDescription} to the model.
	 * 
	 * We want the elements created from the {@link ChangeDescription} to have
	 * their scaffolding status set to true. We therefore need to apply the
	 * {@link ChangeDescription} in a ScaffoldingSession but we don't want
	 * scaffolding to fire, so we need to deactivate immediate fire while
	 * applying the {@link ChangeDescription}. Immediate fire is restored after
	 * load.
	 * 
	 * Does nothing if a {@link #changeDescription} hasn't be found.
	 */
	@Override
	public void afterLoad(EObject model) {
		Resource changedescriptionResource = null;
		try {
			ResourceSet resourceSet = model.eResource().getResourceSet();
			changedescriptionResource = resourceSet.getResource(URI.createURI(FS_ROOT + "changedesc.xmi"), true);
		} catch (Exception e) {
			changedescriptionResource = null;
		}
		ChangeDescription changeDescription = null;
		if(changedescriptionResource != null) {
			changeDescription = (ChangeDescription) changedescriptionResource.getContents().get(0);
		}

		if(changeDescription == null) {
			return;
		}

		FactPublisher factPublisher = ScaffoldingExecutionEnvironment.getFactPublisher(model);

		boolean immediateFire = factPublisher.isImmediateFire();
		factPublisher.setImmediateFire(false);

		final ChangeDescription desc = changeDescription;
		ScaffoldingContext.inScaffoldingSession(new Runnable() {
			@Override
			public void run() {
				desc.apply();
			}
		});

		factPublisher.setImmediateFire(immediateFire);
		changeDescription = null;
	}

	/**
	 * Prunes scaffolded elements from {@link ResourceSet} and stores them in a
	 * {@link ChangeDescription}.
	 */
	@Override
	public void beforeSave(ResourceSet rs) {

		// TODO integrate better with FactPublisher, deactivating immediate fire should be enough
		for (Resource res : rs.getResources()) {
			for (EObject element : res.getContents()) {
				Adapter factPublisher = EcoreUtil.getExistingAdapter(element, FactPublisher.class);
				element.eAdapters().remove(factPublisher);
			}
		}

		ChangeDescription changeDescription = pruner.prune(rs);
		Resource changedescriptionResource = rs.createResource(URI.createURI(FS_ROOT + "changedesc.xmi"));
		changedescriptionResource.getContents().add(changeDescription);
	}

}
