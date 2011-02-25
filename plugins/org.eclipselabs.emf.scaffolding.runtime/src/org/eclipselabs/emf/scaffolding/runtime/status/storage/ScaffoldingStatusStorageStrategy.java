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

/**
 * TODO Find out whether we want handlers to work at EObject, Resource or ResourceSet level
 * 
 * @author cvidal
 *
 */
public interface ScaffoldingStatusStorageStrategy {

	public void setScaffoldingExecutionEnvironment(
			ScaffoldingExecutionEnvironment scaffoldingExecutionEnvironment);

	public ScaffoldingExecutionEnvironment getScaffoldingExecutionEnvironment();

	public void afterLoad(EObject model);

	public void beforeSave(ResourceSet rs);

	public void beforeLoad(ResourceSet resourceSet) throws IOException;

	public void beforeSave(Resource resource);

	public void afterSave(Resource resource);

	public void configure(
			ScaffoldingStatusAdapterFactory scaffoldingStatusAdapterFactory);

}