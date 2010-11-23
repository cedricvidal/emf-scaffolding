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
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

import org.eclipse.emf.common.util.EList;
import org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.Match;
import org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.Operation;
import org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.Param;
import org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.Rule;
import org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.Scaffold;
import org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.Scaffolding;
import org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.ScaffoldingElement;
import org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.ThenBlock;
import org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.WhenBlock;
import org.eclipselabs.emf.scaffolding.runtime.internal.compiler.ESLParser;
import org.eclipselabs.emf.scaffolding.tests.BaseTest;
import org.eclipselabs.emf.scaffolding.tests.model1.Model1Package;
import org.junit.Test;

public class ParserTest extends BaseTest {

	@Test
	public void parsePackageAndRule() throws Exception {
		ESLParser parser = new ESLParser();
		InputStream inputStream = ParserTest.class
				.getResourceAsStream("/Entity2Dao.esl");
		Scaffolding scaffolding = parser.parse(inputStream);
		assertNotNull(scaffolding);
		Scaffold scaffold = scaffolding.getScaffold();
		assertNotNull(scaffold);
		assertEquals("http://www.eclipselabs.org/emf/scaffolding/tests/model1",
				scaffold.getRefPackage().getNsURI());
		EList<ScaffoldingElement> scaffoldingElements = scaffolding
				.getElements();
		assertNotNull(scaffoldingElements);
		assertEquals(1, scaffoldingElements.size());
		assertTrue(scaffoldingElements.get(0) instanceof Rule);
		Rule rule = (Rule) scaffoldingElements.get(0);
		assertEquals("Entity2Dao", rule.getName());
		WhenBlock condition = rule.getWhen();
		assertNotNull(condition);
		assertEquals(1, condition.getMatches().size());
		Match match = condition.getMatches().get(0);
		assertEquals(Model1Package.eINSTANCE.getEntity(), match.getType());
		assertNotNull(match.getType().getName());
		assertEquals("e", match.getVar().getName());
		assertEquals(1, match.getParams().size());
		Param param = match.getParams().get(0);
		assertTrue(param.getProperty() instanceof Operation);
		Operation bindingOperation = (Operation) param.getProperty();
		assertEquals("!=", bindingOperation.getOp());
		assertNotNull(bindingOperation.getLeft());
		assertNull(bindingOperation.getRight());
		ThenBlock consequence = rule.getThen();
		assertNotNull(consequence);
		// TODO assert consequence statements -> new DAO { name : $n + "DAO",
		// entity : $e guard }

	}

	@Test
	public void syntaxErrorThrowsIOException() {
		ESLParser parser = new ESLParser();
		try {
			parser.parse(new ByteArrayInputStream("i should not be there"
					.getBytes()));
			fail("Parsing an ESL with syntax errors should throw an IOException");
		} catch (IOException e) {
			; // ok
		}
	}

}
