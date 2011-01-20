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
import static org.junit.Assert.assertTrue;

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
import org.drools.io.ResourceFactory;
import org.drools.runtime.StatefulKnowledgeSession;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipselabs.emf.scaffolding.runtime.ScaffoldingExecutionEnvironment;
import org.eclipselabs.emf.scaffolding.runtime.status.ScaffoldingStatusAdapterFactory;
import org.eclipselabs.emf.scaffolding.runtime.takeover.TakeoverNotification;
import org.eclipselabs.emf.scaffolding.tests.BaseTest;
import org.eclipselabs.emf.scaffolding.tests.model1.Application;
import org.eclipselabs.emf.scaffolding.tests.model1.DAO;
import org.eclipselabs.emf.scaffolding.tests.model1.Entity;
import org.eclipselabs.emf.scaffolding.tests.model1.Method;
import org.eclipselabs.emf.scaffolding.tests.model1.Model1Factory;
import org.eclipselabs.emf.scaffolding.tests.model1.Service;
import org.eclipselabs.emf.scaffolding.tests.resources.Resources;
import org.junit.Before;
import org.junit.Test;

public class TakeoverTest extends BaseTest{

	private static final Model1Factory FACTORY = Model1Factory.eINSTANCE;
	private DAO userDao;
	private Entity user;
	private AtomicBoolean takeover;
	private Application application;

	@Before
	public void setup() {
		application = FACTORY.createApplication();

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
		StatefulKnowledgeSession ksession = kbase.newStatefulKnowledgeSession();
		ScaffoldingExecutionEnvironment execEnv = new ScaffoldingExecutionEnvironment(ksession);
		execEnv.register(application);

		takeover = new AtomicBoolean(false);
		execEnv.eAdapters().add(new AdapterImpl() {
			@Override
			public void notifyChanged(Notification msg) {
				if (msg instanceof TakeoverNotification) {
					takeover.set(true);
				}
			}
		});

		// We need to track scaffolding status
		ScaffoldingStatusAdapterFactory scaffoldingStatusAdapterFactory = new ScaffoldingStatusAdapterFactory();
		scaffoldingStatusAdapterFactory.adaptAllNew(application);

		user = FACTORY.createEntity();
		user.setName("user");
		assertEquals(0, application.getElements().size());
		application.getElements().add(user);
		assertScaffoldingAdapterIsRegistered(user);

		assertEquals(2, application.getElements().size());
		userDao = (DAO) application.getElements().get(1);
		assertNotNull(userDao);
		assertEquals(user, userDao.getEntity());
		assertScaffoldingAdapterIsRegistered(userDao);
	}

	@Test
	public void settingDaoNameTakesOverDao() throws Exception {
		assertScaffolded(userDao);
		userDao.setName("coolUserDao");
		assertTrue(takeover.get());
	}

	@Test
	public void changindDaoNameDaoTakesOverDao() throws Exception {
		assertScaffolded(userDao);
		userDao.setName("coolUserDao");
		assertTrue(takeover.get());
		assertNotScaffolded(userDao);
	}

	@Test
	public void addingFinderToDaoTakesOverDao() throws Exception {
		Method specialFinder = FACTORY.createMethod();
		specialFinder.setName("specialFinder");
		assertScaffolded(userDao);
		userDao.getMethods().add(specialFinder);
		userDao.setName("coolUserDao");
		assertTrue(takeover.get());
		assertNotScaffolded(userDao);
	}

	@Test
	public void addingDaoToServiceDependenciesTakesOverDao() throws Exception {
		Service service = FACTORY.createService();
		application.getElements().add(service);
		assertScaffolded(userDao);
		service.getDependencies().add(userDao);
		assertTrue(takeover.get());
		assertNotScaffolded(userDao);
	}

}
