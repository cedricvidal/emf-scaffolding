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
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import static org.eclipselabs.emf.scaffolding.tests.ESAssert.*;

import java.util.Collection;
import java.util.concurrent.atomic.AtomicBoolean;

import org.drools.KnowledgeBase;
import org.drools.KnowledgeBaseFactory;
import org.drools.builder.KnowledgeBuilder;
import org.drools.builder.KnowledgeBuilderConfiguration;
import org.drools.builder.KnowledgeBuilderError;
import org.drools.builder.KnowledgeBuilderFactory;
import org.drools.builder.ResourceType;
import org.drools.definition.KnowledgePackage;
import org.drools.event.rule.DebugWorkingMemoryEventListener;
import org.drools.io.ResourceFactory;
import org.drools.runtime.ObjectFilter;
import org.drools.runtime.StatefulKnowledgeSession;
import org.drools.runtime.rule.FactHandle;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.ecore.EObject;
import org.eclipselabs.emf.scaffolding.runtime.ScaffoldingExecutionEnvironment;
import org.eclipselabs.emf.scaffolding.runtime.status.ScaffoldingStatusAdapterFactory;
import org.eclipselabs.emf.scaffolding.runtime.takeover.TakeoverNotification;
import org.eclipselabs.emf.scaffolding.tests.BaseTest;
import org.eclipselabs.emf.scaffolding.tests.ESAssert;
import org.eclipselabs.emf.scaffolding.tests.model1.Application;
import org.eclipselabs.emf.scaffolding.tests.model1.DAO;
import org.eclipselabs.emf.scaffolding.tests.model1.Entity;
import org.eclipselabs.emf.scaffolding.tests.model1.Method;
import org.eclipselabs.emf.scaffolding.tests.model1.Model1Factory;
import org.eclipselabs.emf.scaffolding.tests.resources.Resources;
import org.junit.Test;

public class DRLRuleTest {

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
		kbuilder.add(ResourceFactory.newClassPathResource("Entity2Dao.drl",
				Resources.class), ResourceType.DRL);
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
		assertScaffoldingAdapterIsRegistered(userDao);

	}

	@Test
	public void adapterShouldBeAttachedToElementsAddedToContainmentReferences() throws Exception {
		Application application = Model1Factory.eINSTANCE.createApplication();

		//Init Knowledge Base from drl files
		KnowledgeBase kbase = KnowledgeBaseFactory.newKnowledgeBase();
		KnowledgeBuilderConfiguration knowledgeBuilderConfig = KnowledgeBuilderFactory.newKnowledgeBuilderConfiguration();
		KnowledgeBuilder kbuilder = KnowledgeBuilderFactory
				.newKnowledgeBuilder(knowledgeBuilderConfig);
		Collection<KnowledgePackage> pkgs = kbuilder.getKnowledgePackages();
		kbase.addKnowledgePackages(pkgs);

		//Init Exec environment
		StatefulKnowledgeSession ksession = kbase.newStatefulKnowledgeSession();
		ksession.addEventListener(new DebugWorkingMemoryEventListener());

		ScaffoldingExecutionEnvironment execEnv = new ScaffoldingExecutionEnvironment(ksession);
		execEnv.register(application);

		Entity user = Model1Factory.eINSTANCE.createEntity();
		user.setName("user");

		application.getElements().add(user);
		assertScaffoldingAdapterIsRegistered(user);
	}

	@Test
	public void adapterShouldNotBeAttachedToInsertedFacts() throws Exception {
		Application application = Model1Factory.eINSTANCE.createApplication();

		//Init Knowledge Base from drl files
		KnowledgeBase kbase = KnowledgeBaseFactory.newKnowledgeBase();
		KnowledgeBuilderConfiguration knowledgeBuilderConfig = KnowledgeBuilderFactory.newKnowledgeBuilderConfiguration();
		KnowledgeBuilder kbuilder = KnowledgeBuilderFactory
				.newKnowledgeBuilder(knowledgeBuilderConfig);
		kbuilder.add(ResourceFactory.newClassPathResource("Entity2Dao.drl",
				Resources.class), ResourceType.DRL);
		Collection<KnowledgePackage> pkgs = kbuilder.getKnowledgePackages();
		kbase.addKnowledgePackages(pkgs);

		StatefulKnowledgeSession ksession = kbase.newStatefulKnowledgeSession();
		ksession.addEventListener(new DebugWorkingMemoryEventListener());
		
		ksession.insert(application);
		assertFalse("Scaffolding adapter should not be registered", ScaffoldingExecutionEnvironment.isConfigured(application));

	}

	@Test
	public void configuredElementsShouldBeInsertedIntoWorkingMemory() throws Exception {
		Application application = Model1Factory.eINSTANCE.createApplication();

		//Init Knowledge Base from drl files
		KnowledgeBase kbase = KnowledgeBaseFactory.newKnowledgeBase();
		KnowledgeBuilderConfiguration knowledgeBuilderConfig = KnowledgeBuilderFactory.newKnowledgeBuilderConfiguration();
		KnowledgeBuilder kbuilder = KnowledgeBuilderFactory
				.newKnowledgeBuilder(knowledgeBuilderConfig);
		Collection<KnowledgePackage> pkgs = kbuilder.getKnowledgePackages();
		kbase.addKnowledgePackages(pkgs);

		//Init Exec environment
		StatefulKnowledgeSession ksession = kbase.newStatefulKnowledgeSession();
		ksession.addEventListener(new DebugWorkingMemoryEventListener());

		ScaffoldingExecutionEnvironment execEnv = new ScaffoldingExecutionEnvironment(ksession);
		execEnv.register(application);

		assertNotNull("Configured EObject has not been inserted into working memory", ksession.getFactHandle(application));

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
		kbuilder.add(ResourceFactory.newClassPathResource("Entity2Dao.drl",
				Resources.class), ResourceType.DRL);
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
		kbuilder.add(ResourceFactory.newClassPathResource("Entity2Dao.drl",
				Resources.class), ResourceType.DRL);
		kbuilder.add(ResourceFactory.newClassPathResource("Dao2CrudMethods.drl",
				Resources.class), ResourceType.DRL);
		for (KnowledgeBuilderError error : kbuilder.getErrors()) {
			System.err.println(error);
		}
		assertEquals(0, kbuilder.getErrors().size());

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
