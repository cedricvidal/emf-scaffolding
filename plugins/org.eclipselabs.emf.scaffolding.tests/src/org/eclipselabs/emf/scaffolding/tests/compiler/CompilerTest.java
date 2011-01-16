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
package org.eclipselabs.emf.scaffolding.tests.compiler;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import org.drools.KnowledgeBase;
import org.eclipselabs.emf.scaffolding.runtime.internal.compiler.ESLCompiler;
import org.eclipselabs.emf.scaffolding.tests.BaseTest;
import org.eclipselabs.emf.scaffolding.tests.resources.Resources;
import org.junit.Test;

public class CompilerTest extends BaseTest {

	@Test
	public void compileRule() throws Exception {
		ESLCompiler compiler = new ESLCompiler();
		InputStream inputStream = Resources.class.getResourceAsStream("Entity2Dao.esl");
		KnowledgeBase kbase = compiler.compile(inputStream, CompilerTest.class.getClassLoader());
		assertNotNull(kbase);
		assertEquals(1, kbase.getKnowledgePackages().size());
	}

	@Test
	public void syntaxErrorThrowsRuntimeException() {
		ESLCompiler compiler = new ESLCompiler();
		try {
			KnowledgeBase kbase = compiler.compile(new ByteArrayInputStream("syntax error".getBytes()), CompilerTest.class.getClassLoader());
			fail("Compiling an ESL with syntax errors should throw a RuntimeException");
		} catch (RuntimeException e) {
			; // ok
		}
	}

}
