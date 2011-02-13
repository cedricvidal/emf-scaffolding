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

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipselabs.emf.scaffolding.runtime.status.scaffoldingStatusCache.ScaffoldingStatusCache;
import org.eclipselabs.emf.scaffolding.runtime.status.scaffoldingStatusCache.ScaffoldingStatusCacheFactory;

public class PersistentScaffoldingStatusAdapterTest extends
		AbstractScaffoldingStatusStorageTest {

	protected Resource cacheResource;

	protected ScaffoldingStatusCache cache;

	@Override
	protected void afterLoad(ScaffoldingStatusStorageStrategy strategy, EObject application) {
	}

	@Override
	protected void beforeSave(ScaffoldingStatusStorageStrategy strategy, ResourceSet rs) {
	}

	protected ScaffoldingStatusCache getCache() {
		return cache;
	}

	protected void beforeLoad(ScaffoldingStatusStorageStrategy strategy, ResourceSet resourceSet)
			throws IOException {
		try {
			cacheResource = resourceSet.getResource(URI.createURI(FS_ROOT
					+ "cache.xmi"), true);
		} catch (Exception e) {
			cacheResource = null;
		}
		cache = null;
		if(cacheResource == null) {
			cacheResource = resourceSet.createResource(URI.createURI(FS_ROOT
					+ "cache.xmi"));
			cache = ScaffoldingStatusCacheFactory.eINSTANCE
			.createScaffoldingStatusCache();
			cacheResource.getContents().add(cache);
		} else {
			cache = (ScaffoldingStatusCache) cacheResource.getContents().get(0);
		}
	}

	@Override
	protected void beforeSave(ScaffoldingStatusStorageStrategy strategy, Resource resource) {
	}

	@Override
	protected void afterSave(ScaffoldingStatusStorageStrategy strategy, Resource resource) {
	}

	@Override
	protected boolean requiresFiringOnLoad() {
		return false;
	}

}
