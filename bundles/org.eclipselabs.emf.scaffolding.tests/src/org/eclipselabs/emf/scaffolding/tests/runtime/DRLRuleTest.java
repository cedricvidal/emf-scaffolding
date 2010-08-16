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

import static org.junit.Assert.*;
import static org.junit.Assert.assertNotNull;

import java.util.Collection;

import org.drools.KnowledgeBase;
import org.drools.KnowledgeBaseFactory;
import org.drools.builder.KnowledgeBuilder;
import org.drools.builder.KnowledgeBuilderConfiguration;
import org.drools.builder.KnowledgeBuilderFactory;
import org.drools.builder.ResourceType;
import org.drools.definition.KnowledgePackage;
import org.drools.io.ResourceFactory;
import org.eclipselabs.emf.scaffolding.runtime.ScaffoldingExecutionEnvironment;
import org.eclipselabs.emf.scaffolding.tests.BaseTest;
import org.eclipselabs.emf.scaffolding.tests.model1.Application;
import org.eclipselabs.emf.scaffolding.tests.model1.DAO;
import org.eclipselabs.emf.scaffolding.tests.model1.Entity;
import org.eclipselabs.emf.scaffolding.tests.model1.Method;
import org.eclipselabs.emf.scaffolding.tests.model1.Model1Factory;
import org.junit.Test;

public class DRLRuleTest extends BaseTest{

	/**
	 * Proves that scaffolding is fired on collection add
	 * 
	 * @throws Exception
	 */
	@Test
	public void daoShouldBeScaffoldedWhenEntityWithNameIsAddedToApplication() throws Exception {
		Application application = Model1Factory.eINSTANCE.createApplication();

		//Init Knowledge Base from drl files
		KnowledgeBase kbase = KnowledgeBaseFactory.newKnowledgeBase();
		KnowledgeBuilderConfiguration knowledgeBuilderConfig = KnowledgeBuilderFactory.newKnowledgeBuilderConfiguration();
		KnowledgeBuilder kbuilder = KnowledgeBuilderFactory
				.newKnowledgeBuilder(knowledgeBuilderConfig);
		kbuilder.add(ResourceFactory.newClassPathResource("/Entity2Dao.drl",
				DRLRuleTest.class), ResourceType.DRL);
		Collection<KnowledgePackage> pkgs = kbuilder.getKnowledgePackages();
		kbase.addKnowledgePackages(pkgs);

		//Init Exec environment
		ScaffoldingExecutionEnvironment execEnv = new ScaffoldingExecutionEnvironment(kbase);
		execEnv.register(application);

		Entity user = Model1Factory.eINSTANCE.createEntity();
		user.setName("user");

		application.getElements().add(user);
		assertScaffoldingAdapterIsRegistered(user);

		assertEquals("DAO was not scaffolded on composition add", 2, application.getElements().size());
		DAO userDao = (DAO) application.getElements().get(1);
		assertNotNull(userDao);
		assertEquals(user, userDao.getEntity());
		assertScaffoldingAdapterIsRegistered(user);

	}

	/**
	 * Proves that scaffolding is fired on property set
	 * 
	 * @throws Exception
	 */
	@Test
	public void daoShouldBeScaffoldedWhenEntityNameIsSet() throws Exception {
		Application application = Model1Factory.eINSTANCE.createApplication();

		//Init Knowledge Base from drl files
		KnowledgeBase kbase = KnowledgeBaseFactory.newKnowledgeBase();
		KnowledgeBuilderConfiguration knowledgeBuilderConfig = KnowledgeBuilderFactory.newKnowledgeBuilderConfiguration();
		KnowledgeBuilder kbuilder = KnowledgeBuilderFactory
				.newKnowledgeBuilder(knowledgeBuilderConfig);
		kbuilder.add(ResourceFactory.newClassPathResource("/Entity2Dao.drl",
				DRLRuleTest.class), ResourceType.DRL);
		Collection<KnowledgePackage> pkgs = kbuilder.getKnowledgePackages();
		kbase.addKnowledgePackages(pkgs);

		//Init Exec environment
		ScaffoldingExecutionEnvironment execEnv = new ScaffoldingExecutionEnvironment(kbase);
		execEnv.register(application);

		Entity user = Model1Factory.eINSTANCE.createEntity();
		assertEquals(0, application.getElements().size());
		application.getElements().add(user);
		assertEquals("Something has been scaffolded when it shouldn't have been", 1, application.getElements().size());
		assertScaffoldingAdapterIsRegistered(user);

		user.setName("user");

		assertEquals("DAO was not scaffolded on property set", 2, application.getElements().size());

		DAO userDao = (DAO) application.getElements().get(1);
		assertNotNull(userDao);
		assertEquals(user, userDao.getEntity());
		assertScaffoldingAdapterIsRegistered(userDao);
	}

	/**
	 * Proves that scaffolded elements can themselves be scaffolded
	 * 
	 * @throws Exception
	 */
	@Test
	public void daoFindByIdMethodShouldBeScaffoldedAfterDaoHasBeenScaffolded() throws Exception {
		Application application = Model1Factory.eINSTANCE.createApplication();

		//Init Knowledge Base from drl files
		KnowledgeBase kbase = KnowledgeBaseFactory.newKnowledgeBase();
		KnowledgeBuilderConfiguration knowledgeBuilderConfig = KnowledgeBuilderFactory.newKnowledgeBuilderConfiguration();
		KnowledgeBuilder kbuilder = KnowledgeBuilderFactory
				.newKnowledgeBuilder(knowledgeBuilderConfig);
		kbuilder.add(ResourceFactory.newClassPathResource("/Entity2Dao.drl",
				DRLRuleTest.class), ResourceType.DRL);
		kbuilder.add(ResourceFactory.newClassPathResource("/Dao2CrudMethods.drl",
				DRLRuleTest.class), ResourceType.DRL);
		Collection<KnowledgePackage> pkgs = kbuilder.getKnowledgePackages();
		kbase.addKnowledgePackages(pkgs);

		//Init Exec environment
		ScaffoldingExecutionEnvironment execEnv = new ScaffoldingExecutionEnvironment(kbase);
		execEnv.register(application);

		Entity user = Model1Factory.eINSTANCE.createEntity();
		user.setName("user");
		assertEquals(0, application.getElements().size());
		application.getElements().add(user);
		assertScaffoldingAdapterIsRegistered(user);

		assertEquals(2, application.getElements().size());
		DAO userDao = (DAO) application.getElements().get(1);
		assertNotNull(userDao);
		assertEquals(user, userDao.getEntity());
		assertScaffoldingAdapterIsRegistered(userDao);

		assertNotNull(userDao.getMethods());
		assertEquals(1, userDao.getMethods().size());
		
		Method findById = userDao.getMethods().get(0);
		assertEquals("findById", findById.getName());
		assertScaffoldingAdapterIsRegistered(findById);
	}

}
