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
package org.eclipselabs.emf.scaffolding.tests;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.eclipse.emf.ecore.EObject;
import org.eclipselabs.emf.scaffolding.runtime.ScaffoldingExecutionEnvironment;
import org.eclipselabs.emf.scaffolding.runtime.status.ScaffoldingStatusAdapterFactory;

public class ESAssert {

	public static void assertScaffoldingAdapterIsRegistered(EObject object) {
		assertTrue("Scaffolding adapter is not registered", ScaffoldingExecutionEnvironment.isConfigured(object));
	}

	public static void assertScaffoldingAdapterIsNotRegistered(EObject object) {
		assertTrue("Scaffolding adapter is registered", !ScaffoldingExecutionEnvironment.isConfigured(object));
	}

	public static void assertScaffolded(EObject element) {
		assertTrue("Not scaffolded", ScaffoldingStatusAdapterFactory.isScaffolded(element));
	}

	public static void assertNotScaffolded(EObject element) {
		assertFalse("Scaffolded", ScaffoldingStatusAdapterFactory.isScaffolded(element));
	}

}
