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
import org.eclipse.emf.ecore.EPackage;
import org.eclipselabs.emf.scaffolding.language.EMFScaffoldingDSLStandaloneSetup;
import org.eclipselabs.emf.scaffolding.runtime.ScaffoldingExecutionEnvironment;
import org.eclipselabs.emf.scaffolding.runtime.status.ScaffoldingStatusAdapterFactory;
import org.eclipselabs.emf.scaffolding.tests.model1.Model1Package;
import org.junit.After;
import org.junit.Before;

public class BaseTest {
	ClassLoader origCl;
	
	@Before
	public void doSetup(){
		EMFScaffoldingDSLStandaloneSetup.doSetup();	
		if (!EPackage.Registry.INSTANCE.containsKey("http://www.eclipselabs.org/emf/scaffolding/tests/model1")) {
			EPackage.Registry.INSTANCE.put("http://www.eclipselabs.org/emf/scaffolding/tests/model1", Model1Package.eINSTANCE);
		}
		this.origCl =  Thread.currentThread().getContextClassLoader();
        final ClassLoader classLoader = BaseTest.class.getClassLoader();
		Thread.currentThread().setContextClassLoader(classLoader);
	}
	
	@After
	public void doTearDown(){
		Thread.currentThread().setContextClassLoader(origCl);	       
	}

	public static void assertScaffoldingAdapterIsRegistered(EObject object) {
		assertTrue("Scaffolding adapter is not registered", ScaffoldingExecutionEnvironment.isConfigured(object));
	}

	public static void assertScaffolded(EObject element) {
		assertTrue("Not scaffolded", ScaffoldingStatusAdapterFactory.isScaffolded(element));
	}

	public static void assertNotScaffolded(EObject element) {
		assertFalse("Scaffolded", ScaffoldingStatusAdapterFactory.isScaffolded(element));
	}

}
