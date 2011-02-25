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
package org.eclipselabs.emf.scaffolding.tests.edit;

import static org.eclipselabs.emf.scaffolding.tests.ESAssert.assertScaffoldingAdapterIsRegistered;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.util.Collection;
import java.util.EventObject;

import org.drools.KnowledgeBase;
import org.drools.KnowledgeBaseFactory;
import org.drools.builder.KnowledgeBuilder;
import org.drools.builder.KnowledgeBuilderConfiguration;
import org.drools.builder.KnowledgeBuilderFactory;
import org.drools.builder.ResourceType;
import org.drools.definition.KnowledgePackage;
import org.drools.event.rule.DebugWorkingMemoryEventListener;
import org.drools.io.ResourceFactory;
import org.drools.runtime.StatefulKnowledgeSession;
import org.eclipse.emf.common.command.BasicCommandStack;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CommandStack;
import org.eclipse.emf.common.command.CommandStackListener;
import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.edit.command.ChangeCommand;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipselabs.emf.scaffolding.edit.EditScaffoldingExecutionEnvironment;
import org.eclipselabs.emf.scaffolding.runtime.ScaffoldingEventListener;
import org.eclipselabs.emf.scaffolding.runtime.ScaffoldingExecutionEnvironment;
import org.eclipselabs.emf.scaffolding.runtime.internal.engine.FactPublisher;
import org.eclipselabs.emf.scaffolding.runtime.status.ScaffoldingContext;
import org.eclipselabs.emf.scaffolding.tests.model1.Application;
import org.eclipselabs.emf.scaffolding.tests.model1.DAO;
import org.eclipselabs.emf.scaffolding.tests.model1.Entity;
import org.eclipselabs.emf.scaffolding.tests.model1.Model1Factory;
import org.eclipselabs.emf.scaffolding.tests.model1.Model1Package;
import org.eclipselabs.emf.scaffolding.tests.model1.util.Model1AdapterFactory;
import org.eclipselabs.emf.scaffolding.tests.resources.Resources;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

/**
 * Tests for ChangeCommand. In each case, the model is built, the command is
 * created, executed, undone, and redone. The state of the model and the
 * executability/undoability/redoability of the command are tested between each
 * step.
 */
public class EditingDomainIntegrationTest {

	protected EditingDomain editingDomain;
	private EditScaffoldingExecutionEnvironment execEnv;
	private ScaffoldingEventListener scaffoldingEventListener;

	@Before
	public void setup() {
		AdapterFactory adapterFactory = new Model1AdapterFactory();
		CommandStack commandStack = new BasicCommandStack();
		editingDomain = new AdapterFactoryEditingDomain(adapterFactory,
				commandStack);

		// Init Knowledge Base from drl files
		KnowledgeBase kbase = KnowledgeBaseFactory.newKnowledgeBase();
		KnowledgeBuilderConfiguration knowledgeBuilderConfig = KnowledgeBuilderFactory
				.newKnowledgeBuilderConfiguration();
		KnowledgeBuilder kbuilder = KnowledgeBuilderFactory
				.newKnowledgeBuilder(knowledgeBuilderConfig);
		kbuilder.add(ResourceFactory.newClassPathResource("Entity2Dao.drl",
				Resources.class), ResourceType.DRL);
		Collection<KnowledgePackage> pkgs = kbuilder.getKnowledgePackages();
		kbase.addKnowledgePackages(pkgs);

		final StatefulKnowledgeSession statefulKnowledgeSession = kbase.newStatefulKnowledgeSession();
		statefulKnowledgeSession.addEventListener(new DebugWorkingMemoryEventListener());

		execEnv = new EditScaffoldingExecutionEnvironment(statefulKnowledgeSession);

		scaffoldingEventListener = mock(ScaffoldingEventListener.class);
		execEnv.addEventListener(scaffoldingEventListener);

		execEnv.useEditingDomain(editingDomain);
	}

	@Test
	public void undoSetEntityNameShouldRemoveScaffoldedDao() {

		Application application = Model1Factory.eINSTANCE.createApplication();

		// Init Knowledge Base from drl files
		KnowledgeBase kbase = KnowledgeBaseFactory.newKnowledgeBase();
		KnowledgeBuilderConfiguration knowledgeBuilderConfig = KnowledgeBuilderFactory
				.newKnowledgeBuilderConfiguration();
		KnowledgeBuilder kbuilder = KnowledgeBuilderFactory
				.newKnowledgeBuilder(knowledgeBuilderConfig);
		kbuilder.add(ResourceFactory.newClassPathResource("Entity2Dao.drl",
				Resources.class), ResourceType.DRL);
		Collection<KnowledgePackage> pkgs = kbuilder.getKnowledgePackages();
		kbase.addKnowledgePackages(pkgs);

		final StatefulKnowledgeSession statefulKnowledgeSession = kbase.newStatefulKnowledgeSession();
		statefulKnowledgeSession.addEventListener(new DebugWorkingMemoryEventListener());

		// Init Exec environment
		final EditScaffoldingExecutionEnvironment execEnv = new EditScaffoldingExecutionEnvironment(statefulKnowledgeSession);
		execEnv.useEditingDomain(editingDomain);
		execEnv.register(application);

		// State 0

		final Entity user = Model1Factory.eINSTANCE.createEntity();
		assertEquals(0, application.getElements().size());
		application.getElements().add(user);
		assertEquals(
				"Something has been scaffolded when it shouldn't have been", 1,
				application.getElements().size());
		assertScaffoldingAdapterIsRegistered(user);
		assertNull(user.getName());

		ChangeCommand command = new ChangeCommand(application) {
			@Override
			protected void doExecute() {
				user.setName("user");
			}
		};

		editingDomain.getCommandStack().execute(command);
		assertTrue(command.canExecute());
		assertTrue(command.canUndo());

		assertEquals("user", user.getName());
		assertEquals("DAO was not scaffolded on property set", 2, application
				.getElements().size());

		DAO userDao = (DAO) application.getElements().get(1);
		assertNotNull(userDao);
		assertEquals(user, userDao.getEntity());
		assertScaffoldingAdapterIsRegistered(userDao);

		editingDomain.getCommandStack().undo();
		assertTrue(command.canExecute());
		assertTrue(command.canUndo());

		// State 0

		assertNull(user.getName());
		assertEquals(1, application.getElements().size());
		assertScaffoldingAdapterIsRegistered(user);

		editingDomain.getCommandStack().redo();
		assertTrue(command.canExecute());
		assertTrue(command.canUndo());

		// State 1

		assertEquals("user", user.getName());
		assertEquals("DAO was not scaffolded on property set", 2, application
				.getElements().size());

		userDao = (DAO) application.getElements().get(1);
		assertNotNull(userDao);
		assertEquals(user, userDao.getEntity());
		assertScaffoldingAdapterIsRegistered(userDao);
	}

}
