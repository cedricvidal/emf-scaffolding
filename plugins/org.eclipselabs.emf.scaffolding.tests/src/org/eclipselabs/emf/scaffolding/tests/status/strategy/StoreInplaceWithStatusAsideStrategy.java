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

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipselabs.emf.scaffolding.runtime.status.ScaffoldingStatusAdapterFactory;
import org.eclipselabs.emf.scaffolding.runtime.status.scaffoldingStatusCache.ScaffoldingStatusCache;
import org.eclipselabs.emf.scaffolding.runtime.status.scaffoldingStatusCache.ScaffoldingStatusCacheFactory;

public class StoreInplaceWithStatusAsideStrategy extends AbstractScaffoldingStatusStorageStrategy {

	protected Resource cacheResource;

	protected ScaffoldingStatusCache cache;

	@Override
	public void afterLoad(EObject application) {
	}

	@Override
	public void beforeSave(ResourceSet rs) {
	}

	@Override
	public void beforeLoad(ResourceSet resourceSet)
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
	public void beforeSave(Resource resource) {
	}

	@Override
	public void afterSave(Resource resource) {
	}

	@Override
	public void configure(
			ScaffoldingStatusAdapterFactory scaffoldingStatusAdapterFactory) {
		scaffoldingStatusAdapterFactory.setScaffoldingStatusCache(cache);
	}

}
