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
package org.eclipselabs.emf.scaffolding.tests.status;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.drools.runtime.StatefulKnowledgeSession;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil.Copier;
import org.eclipselabs.emf.scaffolding.runtime.status.ScaffoldingContext;
import org.eclipselabs.emf.scaffolding.runtime.status.scaffoldingStatusCache.ScaffoldingStatusCache;
import org.eclipselabs.emf.scaffolding.runtime.status.scaffoldingStatusCache.ScaffoldingStatusCacheFactory;
import org.eclipselabs.emf.scaffolding.session.util.ScaffoldingStatusPruneCopier;
import org.eclipselabs.emf.scaffolding.tests.model1.Application;

public class TransientScaffoldingStatusAdapterTest extends
		AbstractScaffoldingStatusStorageTest {

	protected Resource cacheResource;

	protected ScaffoldingStatusCache cache;

	private List<EObject> contentsBackup;

	private EList<EObject> resourceContents;

	@Override
	protected void afterLoad(EObject element) {
		fireScaffoldingRules(element);
	}

	protected void fireScaffoldingRules(EObject element) {
		final StatefulKnowledgeSession knowledgeSession = ksession;
		if (knowledgeSession != null) {
			ScaffoldingContext.inScaffoldingSession(new Runnable() {
				@Override
				public void run() {
					knowledgeSession.fireAllRules();
				}
			});
		}
	}

	@Override
	protected void beforeSave(ResourceSet rs) {
	}

	protected ScaffoldingStatusCache getCache() {
		return cache;
	}

	protected void prepare(boolean firstRun, ResourceSet resourceSet)
			throws IOException {
		cacheResource = resourceSet.createResource(URI.createURI(FS_ROOT
				+ "cache.xmi"));
		cache = null;
		if (firstRun) {
			cache = ScaffoldingStatusCacheFactory.eINSTANCE
					.createScaffoldingStatusCache();
			cacheResource.getContents().add(getCache());
		} else {
			cacheResource.load(null);
			cache = (ScaffoldingStatusCache) cacheResource.getContents().get(0);
		}
	}

	@Override
	protected void afterSave(Resource resource) {
		// Resource content restore must be done after timestamp check
		resourceContents.clear();
		resourceContents.addAll(contentsBackup);
	}

	@Override
	protected void beforeSave(Resource resource) {
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
	protected boolean requiresFiringOnLoad() {
		return true;
	}

}
