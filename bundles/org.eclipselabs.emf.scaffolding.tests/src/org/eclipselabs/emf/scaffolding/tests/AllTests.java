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

import org.eclipselabs.emf.scaffolding.tests.compiler.CompilerTest;
import org.eclipselabs.emf.scaffolding.tests.compiler.ParserTest;
import org.eclipselabs.emf.scaffolding.tests.runtime.DRLRuleTest;
import org.eclipselabs.emf.scaffolding.tests.runtime.ESLRuleTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

//EMF Scaffolding Test Suite
@RunWith(Suite.class)
@SuiteClasses(value={
		ParserTest.class,
		CompilerTest.class,
		DRLRuleTest.class,
		ESLRuleTest.class
})
public class AllTests {
   
}
