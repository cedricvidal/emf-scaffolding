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

import static org.eclipselabs.emf.scaffolding.tests.ESAssert.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.util.Collection;
import java.util.EventObject;
import java.util.HashMap;

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
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.command.ChangeCommand;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipselabs.emf.scaffolding.edit.EditScaffoldingExecutionEnvironment;
import org.eclipselabs.emf.scaffolding.runtime.ScaffoldingEventListener;
import org.eclipselabs.emf.scaffolding.runtime.ScaffoldingExecutionEnvironment;
import org.eclipselabs.emf.scaffolding.runtime.internal.engine.FactPublisher;
import org.eclipselabs.emf.scaffolding.runtime.status.ScaffoldingContext;
import org.eclipselabs.emf.scaffolding.runtime.status.ScaffoldingStatusAdapterFactory;
import org.eclipselabs.emf.scaffolding.tests.model1.Application;
import org.eclipselabs.emf.scaffolding.tests.model1.DAO;
import org.eclipselabs.emf.scaffolding.tests.model1.Entity;
import org.eclipselabs.emf.scaffolding.tests.model1.Model1Factory;
import org.eclipselabs.emf.scaffolding.tests.model1.Model1Package;
import org.eclipselabs.emf.scaffolding.tests.model1.util.Model1AdapterFactory;
import org.eclipselabs.emf.scaffolding.tests.resources.Resources;
import org.eclipselabs.emf.scaffolding.tests.util.MemoryUriHandler;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

/**
 * Tests for ChangeCommand. In each case, the model is built, the command is
 * created, executed, undone, and redone. The state of the model and the
 * executability/undoability/redoability of the command are tested between each
 * step.
 */
@RunWith(MockitoJUnitRunner.class)
public class EditingDomainIntegrationTest {

	protected EditingDomain editingDomain;
	private EditScaffoldingExecutionEnvironment execEnv;
	@Mock ScaffoldingEventListener scaffoldingEventListener;

	@Before
	public void setup() {

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

		ksession = kbase.newStatefulKnowledgeSession();
		ksession.addEventListener(new DebugWorkingMemoryEventListener());
		execEnv = new EditScaffoldingExecutionEnvironment(ksession);
		execEnv.addEventListener(scaffoldingEventListener);

		AdapterFactory adapterFactory = new Model1AdapterFactory();
		editingDomain = new AdapterFactoryEditingDomain(adapterFactory,
				execEnv.prepareCommandStack(new BasicCommandStack()));
		HashMap<URI, byte[]> store = new HashMap<URI, byte[]>();
		editingDomain.getResourceSet().getURIConverter().getURIHandlers().add(0, new MemoryUriHandler(store));

		execEnv.useEditingDomain(editingDomain);
	}

	protected static final String FS_ROOT = "memory:";
	private StatefulKnowledgeSession ksession;

	@Test
	public void undoSetEntityNameShouldRemoveScaffoldedDao() {
		doUndoSetEntity(false);
	}

	@Test
	public void undoTwiceSetEntityNameShouldRemoveScaffoldedDaoAndEntity() {
		doUndoSetEntity(true);
	}

	private void doUndoSetEntity(boolean undoTwice) {
		Resource res = editingDomain.getResourceSet().createResource(URI.createURI(FS_ROOT + "model.xmi"));
		final Application application = Model1Factory.eINSTANCE.createApplication();
		res.getContents().add(application);

		// Init Exec environment
		assertEquals(0, ksession.getFactCount());
		execEnv.register(application);
		assertEquals(1, ksession.getFactCount());

		ScaffoldingStatusAdapterFactory scaffoldingStatusAdapterFactory = new ScaffoldingStatusAdapterFactory();
		scaffoldingStatusAdapterFactory.adaptAllNew(application);

		// State 0

		assertEquals(0, application.getElements().size());

		// Add entity

		AddCommand addEntity = new AddCommand(editingDomain, application, Model1Package.Literals.APPLICATION__ELEMENTS, Model1Factory.eINSTANCE.createEntity());

		editingDomain.getCommandStack().execute(addEntity);
		verify(scaffoldingEventListener, times(1)).fired();
		assertTrue(addEntity.canExecute());
		assertTrue(addEntity.canUndo());

		// State 1

		assertEquals("Something has been scaffolded when it shouldn't have been", 1, application.getElements().size());
		Entity user = (Entity) application.getElements().get(0);
		assertNull(user.getName());
		assertScaffoldingAdapterIsRegistered(user);

		// State 2

		SetCommand setName = new SetCommand(editingDomain, user, Model1Package.Literals.APPLICATION_ELEMENT__NAME, "user") {
			@Override
			public void doExecute() {
				super.doExecute();
				verify(scaffoldingEventListener, times(0)).fired();
			}
		};

		reset(scaffoldingEventListener);
		editingDomain.getCommandStack().execute(setName);
		verify(scaffoldingEventListener, times(1)).fired();
		assertTrue(setName.canExecute());
		assertTrue(setName.canUndo());

		assertEquals("user", user.getName());
		assertEquals("DAO was not scaffolded on property set", 2, application
				.getElements().size());

		DAO userDao = (DAO) application.getElements().get(1);
		assertNotNull(userDao);
		assertEquals(user, userDao.getEntity());
		assertScaffoldingAdapterIsRegistered(userDao);
		assertScaffolded(userDao);

		// UNDO

		editingDomain.getCommandStack().undo();
		assertTrue(setName.canExecute());
		assertTrue(setName.canUndo());

		// State 1

		assertNull(user.getName());
		assertEquals(1, application.getElements().size());

		if(!undoTwice) {

			// REDO

			editingDomain.getCommandStack().redo();
			assertTrue(setName.canExecute());
			assertTrue(setName.canUndo());

			// State 1

			assertEquals("user", user.getName());
			assertEquals("DAO was not scaffolded on property set", 2, application
					.getElements().size());

			userDao = (DAO) application.getElements().get(1);
			assertNotNull(userDao);
			assertEquals(user, userDao.getEntity());
			assertScaffoldingAdapterIsRegistered(userDao);
			assertScaffolded(userDao);

		} else {
			
			// UNDO

			editingDomain.getCommandStack().undo();
			assertTrue(setName.canExecute());
			assertTrue(setName.canUndo());

			// State 0

			assertEquals(0, application.getElements().size());
			assertScaffoldingAdapterIsRegistered(application);
			assertEquals(1, ksession.getFactCount());

		}

	}

	@Test
	public void undoAddEntityShouldRemoveEntity() {

		Resource res = editingDomain.getResourceSet().createResource(URI.createURI(FS_ROOT + "model.xmi"));
		final Application application = Model1Factory.eINSTANCE.createApplication();
		res.getContents().add(application);

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
		execEnv.register(application);

		ScaffoldingStatusAdapterFactory scaffoldingStatusAdapterFactory = new ScaffoldingStatusAdapterFactory();
		scaffoldingStatusAdapterFactory.adaptAllNew(application);

		// State 0

		assertEquals(0, application.getElements().size());

		// Add entity

		ChangeCommand addEntity = new ChangeCommand(application) {
			@Override
			protected void doExecute() {
				final Entity user = Model1Factory.eINSTANCE.createEntity();
				application.getElements().add(user);
			}
		};

		editingDomain.getCommandStack().execute(addEntity);

		verify(scaffoldingEventListener, times(1)).fired();
		assertTrue(addEntity.canExecute());
		assertTrue(addEntity.canUndo());

		// State 1

		assertEquals(1, application.getElements().size());
		Entity user = (Entity) application.getElements().get(0);
		assertScaffoldingAdapterIsRegistered(user);

		// UNDO

		editingDomain.getCommandStack().undo();
		assertTrue(addEntity.canExecute());
		assertTrue(addEntity.canUndo());

		// State 0

		assertEquals(0, application.getElements().size());

		// REDO

		editingDomain.getCommandStack().redo();
		assertTrue(addEntity.canExecute());
		assertTrue(addEntity.canUndo());

		// State 1

		assertEquals(1, application.getElements().size());
		user = (Entity) application.getElements().get(0);
		assertScaffoldingAdapterIsRegistered(user);

	}

}
