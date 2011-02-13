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

import java.io.IOException;

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
 * Requires EMF 3.7 because of https://bugs.eclipse.org/bugs/show_bug.cgi?id=336775
 * 
 * @author cvidal
 *
 */
public class StoreAsideStrategy extends AbstractScaffoldingStatusStorageStrategy {

	private ScaffoldingStatusPruner pruner = new ScaffoldingStatusPruner();
	private Resource changedescriptionResource;
	private ChangeDescription changeDescription;

	@Override
	public void afterLoad(EObject application) {
		FactPublisher factPublisher = ScaffoldingExecutionEnvironment.getFactPublisher(application);

		// We want the elements created from the changeDesc to have their
		// scaffolding status set to true. We therefore need to apply the
		// changeDesc in a ScaffoldingSession
		// but we don't want scaffolding to fire, so we need to deactivate
		// immediate fire while applying the changeDesc
		factPublisher.setImmediateFire(false);

		final ChangeDescription desc = changeDescription;
		ScaffoldingContext.inScaffoldingSession(new Runnable() {
			@Override
			public void run() {
				desc.apply();
			}
		});

		factPublisher.setImmediateFire(true);
	}

	@Override
	public void beforeLoad(ResourceSet resourceSet)
			throws IOException {
		try {
			changedescriptionResource = resourceSet.getResource(URI.createURI(FS_ROOT + "changedesc.xmi"), true);
		} catch (Exception e) {
			changedescriptionResource = null;
		}
		changeDescription = null;
		if(changedescriptionResource == null) {
			changedescriptionResource = resourceSet.createResource(URI.createURI(FS_ROOT + "changedesc.xmi"));
		} else {
			changeDescription = (ChangeDescription) changedescriptionResource.getContents().get(0);
		}
	}

	@Override
	public void beforeSave(ResourceSet rs) {

		// TODO integrate better with FactPublisher, deactivating immediate fire should be enough
		for (Resource res : rs.getResources()) {
			for (EObject element : res.getContents()) {
				Adapter factPublisher = EcoreUtil.getExistingAdapter(element, FactPublisher.class);
				element.eAdapters().remove(factPublisher);
			}
		}

		changeDescription = pruner.prune(rs);
		changedescriptionResource.getContents().add(changeDescription);
	}

}
