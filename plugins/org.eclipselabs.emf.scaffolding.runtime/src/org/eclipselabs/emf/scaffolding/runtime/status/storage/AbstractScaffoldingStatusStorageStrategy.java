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

import java.io.IOException;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipselabs.emf.scaffolding.runtime.ScaffoldingExecutionEnvironment;
import org.eclipselabs.emf.scaffolding.runtime.status.ScaffoldingStatusAdapterFactory;

public abstract class AbstractScaffoldingStatusStorageStrategy implements
		ScaffoldingStatusStorageStrategy {

	protected static final String FS_ROOT = "memory:";

	private ScaffoldingExecutionEnvironment scaffoldingExecutionEnvironment;

	@Override
	public void setScaffoldingExecutionEnvironment(
			ScaffoldingExecutionEnvironment scaffoldingExecutionEnvironment) {
		this.scaffoldingExecutionEnvironment = scaffoldingExecutionEnvironment;
	}

	@Override
	public ScaffoldingExecutionEnvironment getScaffoldingExecutionEnvironment() {
		return scaffoldingExecutionEnvironment;
	}

	@Override
	public void afterLoad(EObject application) {
	}

	@Override
	public void beforeSave(ResourceSet rs) {
	}

	@Override
	public void beforeLoad(ResourceSet resourceSet) throws IOException {
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
	}

}
