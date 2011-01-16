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
package org.eclipselabs.emf.scaffolding.tests.runtime;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.drools.KnowledgeBase;
import org.eclipselabs.emf.scaffolding.runtime.ScaffoldingExecutionEnvironment;
import org.eclipselabs.emf.scaffolding.runtime.internal.compiler.ESLCompiler;
import org.eclipselabs.emf.scaffolding.tests.BaseTest;
import org.eclipselabs.emf.scaffolding.tests.model1.Application;
import org.eclipselabs.emf.scaffolding.tests.model1.DAO;
import org.eclipselabs.emf.scaffolding.tests.model1.Entity;
import org.eclipselabs.emf.scaffolding.tests.model1.Model1Factory;
import org.eclipselabs.emf.scaffolding.tests.resources.Resources;
import org.junit.Test;

public class ESLRuleTest extends BaseTest{

	@Test
	public void scaffoldFromESL() throws Exception {
		Application application = Model1Factory.eINSTANCE.createApplication();

		ESLCompiler compiler = new ESLCompiler();
		// TODO maybe create a ScallfoldBase to encapsulate KnowledgeBase
		KnowledgeBase kbase = compiler.compile(Resources.class.getResourceAsStream("Entity2Dao.esl"), ESLRuleTest.class.getClassLoader());
		
		// Init Exec environment
		ScaffoldingExecutionEnvironment execEnv = new ScaffoldingExecutionEnvironment(kbase);
		execEnv.register(application);

		Entity user = Model1Factory.eINSTANCE.createEntity();
		user.setName("user");
		application.getElements().add(user);

		assertEquals(2, application.getElements().size());
		DAO userDao = (DAO) application.getElements().get(1);
		assertNotNull(userDao);
		assertEquals(user, userDao.getEntity());

	}

}
