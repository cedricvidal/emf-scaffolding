/*******************************************************************************
 * Copyright (c) 2010 Contributors - see below
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Cedric Vidal - initial API and implementation
 *
 *******************************************************************************/
package org.eclipselabs.emf.scaffolding.tests;

import static org.eclipselabs.emf.scaffolding.tests.ESAssert.assertScaffoldingAdapterIsRegistered;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.Collection;

import org.drools.KnowledgeBase;
import org.drools.KnowledgeBaseFactory;
import org.drools.builder.KnowledgeBuilder;
import org.drools.builder.KnowledgeBuilderConfiguration;
import org.drools.builder.KnowledgeBuilderError;
import org.drools.builder.KnowledgeBuilderFactory;
import org.drools.builder.ResourceType;
import org.drools.definition.KnowledgePackage;
import org.drools.io.ResourceFactory;
import org.drools.runtime.ObjectFilter;
import org.drools.runtime.StatefulKnowledgeSession;
import org.drools.runtime.rule.FactHandle;
import org.eclipse.emf.ecore.EObject;
import org.eclipselabs.emf.scaffolding.runtime.ScaffoldingExecutionEnvironment;
import org.eclipselabs.emf.scaffolding.runtime.status.ScaffoldingStatusAdapterFactory;
import org.eclipselabs.emf.scaffolding.tests.model1.Application;
import org.eclipselabs.emf.scaffolding.tests.model1.DAO;
import org.eclipselabs.emf.scaffolding.tests.model1.Entity;
import org.eclipselabs.emf.scaffolding.tests.model1.Model1Factory;
import org.eclipselabs.emf.scaffolding.tests.resources.Resources;
import org.junit.Test;

public class RefreshTest {
	@Test
	public void removingKnowledgePackageShouldRemoveScaffoldedElements() throws Exception {
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
		StatefulKnowledgeSession ksession = kbase.newStatefulKnowledgeSession();
		ScaffoldingExecutionEnvironment execEnv = new ScaffoldingExecutionEnvironment(ksession);
		execEnv.register(application);

		// We need to track scaffolding status
		ScaffoldingStatusAdapterFactory scaffoldingStatusAdapterFactory = new ScaffoldingStatusAdapterFactory();
		scaffoldingStatusAdapterFactory.adaptAllNew(application);

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

		String dao2crudMethodsPackageName = "org.eclipselabs.emf.scaffolding.tests.dao2crudMethods";
		String entity2daoPackageName = "org.eclipselabs.emf.scaffolding.tests.entity2dao";
		kbase.removeKnowledgePackage(entity2daoPackageName);
		
		Entity stuff = Model1Factory.eINSTANCE.createEntity();
		stuff.setName("stuff");
		int size = application.getElements().size();
		application.getElements().add(stuff);
		assertScaffoldingAdapterIsRegistered(stuff);
		assertEquals("Stuff DAO should not be scaffolded", size + 1, application.getElements().size());
		
		for (FactHandle handle : ksession.getFactHandles(new ObjectFilter() {
			
			@Override
			public boolean accept(Object object) {
				if (object instanceof EObject) {
					EObject eobject = (EObject) object;
					boolean scaffolded = ScaffoldingStatusAdapterFactory.isScaffolded(eobject);
					return scaffolded;
				}
				return false;
			}
		})) {
			ksession.retract(handle);
		}
		
		assertEquals("DAO should be removed", 1, application.getElements().size());

	}

}
