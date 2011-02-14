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
package org.eclipselabs.emf.scaffolding.runtime.status.storage;

import java.util.ArrayList;
import java.util.List;

import org.drools.runtime.StatefulKnowledgeSession;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil.Copier;
import org.eclipselabs.emf.scaffolding.runtime.status.ScaffoldingContext;

public class TransientStrategy extends
		AbstractScaffoldingStatusStorageStrategy {

	private List<EObject> contentsBackup;

	private EList<EObject> resourceContents;

	public StatefulKnowledgeSession getKnowledgeSession() {
		return getScaffoldingExecutionEnvironment().getKnowledgeSession();
	}

	@Override
	public void afterLoad(EObject element) {
		fireScaffoldingRules(element);
	}

	protected void fireScaffoldingRules(EObject element) {
		ScaffoldingContext.inScaffoldingSession(new Runnable() {
			@Override
			public void run() {
				getKnowledgeSession().fireAllRules();
			}
		});
	}

	@Override
	public void beforeSave(Resource resource) {
		resourceContents = resource.getContents();

		contentsBackup = null;

		contentsBackup = new ArrayList<EObject>();
		contentsBackup.addAll(resourceContents);

		Copier copier = new ScaffoldingStatusPruneCopier();
		EObject pruned = copier.copy(resourceContents.get(0));
		copier.copyReferences();

		resourceContents.clear();
		resourceContents.add(pruned);
	}

	@Override
	public void afterSave(Resource resource) {
		// Resource content restore must be done after timestamp check
		resourceContents.clear();
		resourceContents.addAll(contentsBackup);
		resourceContents = null;
	}

}
