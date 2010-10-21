/*******************************************************************************
 * Copyright (c) 2010 Contributors - see below
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Cedric Vidal - initial API and implementation
 *     Jerome Benois - Rewrite compiler and runtime based on new Drools Knowledge API
 *******************************************************************************/
package org.eclipselabs.emf.scaffolding.language;

import org.eclipse.xtext.conversion.IValueConverterService;
import org.eclipselabs.emf.scaffolding.language.converter.EMFScaffoldingDSLConverterService;

/**
 * Use this class to register components to be used at runtime / without the
 * Equinox extension registry.
 */
public class EMFScaffoldingDSLRuntimeModule
		extends
		org.eclipselabs.emf.scaffolding.language.AbstractEMFScaffoldingDSLRuntimeModule {

	@Override
	public Class<? extends IValueConverterService> bindIValueConverterService() {
		return EMFScaffoldingDSLConverterService.class;
	}

}
