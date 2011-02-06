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
package org.eclipselabs.emf.scaffolding.tests.status;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

import org.drools.KnowledgeBase;
import org.drools.KnowledgeBaseFactory;
import org.drools.builder.KnowledgeBuilder;
import org.drools.builder.KnowledgeBuilderConfiguration;
import org.drools.builder.KnowledgeBuilderError;
import org.drools.builder.KnowledgeBuilderFactory;
import org.drools.builder.ResourceType;
import org.drools.definition.KnowledgePackage;
import org.drools.event.rule.ActivationCancelledEvent;
import org.drools.event.rule.ActivationCreatedEvent;
import org.drools.event.rule.AfterActivationFiredEvent;
import org.drools.event.rule.AgendaEventListener;
import org.drools.event.rule.AgendaGroupPoppedEvent;
import org.drools.event.rule.AgendaGroupPushedEvent;
import org.drools.event.rule.BeforeActivationFiredEvent;
import org.drools.event.rule.DefaultAgendaEventListener;
import org.drools.event.rule.WorkingMemoryEventListener;
import org.drools.io.ResourceFactory;
import org.drools.runtime.StatefulKnowledgeSession;
import org.drools.runtime.rule.Activation;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil.Copier;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipselabs.emf.scaffolding.runtime.ScaffoldingExecutionEnvironment;
import org.eclipselabs.emf.scaffolding.runtime.status.ScaffoldingStatusAdapterFactory;
import org.eclipselabs.emf.scaffolding.runtime.status.scaffoldingStatusCache.ScaffoldingStatusCache;
import org.eclipselabs.emf.scaffolding.runtime.status.scaffoldingStatusCache.ScaffoldingStatusCacheFactory;
import org.eclipselabs.emf.scaffolding.session.util.ScaffoldingStatusPruneCopier;
import org.eclipselabs.emf.scaffolding.tests.BaseTest;
import org.eclipselabs.emf.scaffolding.tests.model1.Application;
import org.eclipselabs.emf.scaffolding.tests.model1.DAO;
import org.eclipselabs.emf.scaffolding.tests.model1.Entity;
import org.eclipselabs.emf.scaffolding.tests.model1.Model1Factory;
import org.eclipselabs.emf.scaffolding.tests.resources.Resources;
import org.eclipselabs.emf.scaffolding.tests.util.MemoryUriHandler;
import org.junit.Before;
import org.junit.Test;

public class PersistentScaffoldingStatusAdapterTest extends BaseTest {

	private static final Model1Factory FACTORY = Model1Factory.eINSTANCE;

	@Before
	public void setup() {
	}

	@Test
	public void serialize() throws IOException {

		// The memory file store
		HashMap<URI, byte[]> store = new HashMap<URI, byte[]>();

		doSampleRun(store, true);
		doSampleRun(store, false);
	}

	protected void doSampleRun(HashMap<URI, byte[]> store, boolean firstRun) throws IOException {
		// Create a resource set.
		ResourceSet resourceSet = new ResourceSetImpl();
		resourceSet.getURIConverter().getURIHandlers().add(0, new MemoryUriHandler(store));

		// Register the default resource factory -- only needed for stand-alone!
		resourceSet
				.getResourceFactoryRegistry()
				.getExtensionToFactoryMap()
				.put(Resource.Factory.Registry.DEFAULT_EXTENSION,
						new XMIResourceFactoryImpl());

		// Create a resource for the cache.
		Resource cacheResource = resourceSet.createResource(URI.createURI("memory:cache.xmi"));
		ScaffoldingStatusCache cache = null;
		if(firstRun) {
			cache = ScaffoldingStatusCacheFactory.eINSTANCE.createScaffoldingStatusCache();
			cacheResource.getContents().add(cache);
		} else {
			cacheResource.load(null);
			cache = (ScaffoldingStatusCache) cacheResource.getContents().get(0);
		}

		// Create a resource for this file.
		Resource originalResource = resourceSet.createResource(URI.createURI("memory:original.xmi"));

		Application application = null;
		if(firstRun) {
			application = FACTORY.createApplication();
			originalResource.getContents().add(application);
		} else {
			originalResource.load(null);
			application = (Application) originalResource.getContents().get(0);
			assertScaffoldingAdapterIsNotRegistered(application);
		}

		// Keep track of fired activations to make sure no activations are fired when loading scaffolding status from store
		final List<Activation> activations = new ArrayList<Activation>();
		DefaultAgendaEventListener agendaListener = new DefaultAgendaEventListener() {
			@Override
			public void afterActivationFired(AfterActivationFiredEvent event) {
				activations.add(event.getActivation());
			}
		};

		createAndRegisterScaffoldingContext(cache, application, agendaListener);

		assertScaffoldingAdapterIsRegistered(application);

		Entity user = null;
		if(firstRun) {
			user = FACTORY.createEntity();
			user.setName("user");
			assertEquals(0, application.getElements().size());
			application.getElements().add(user);
		} else {
			user = (Entity) application.getElements().get(0);
		}

		if(firstRun) {
			// Scaffolded elements are computed
			assertEquals("2 activations on first run", 2, activations.size());
		} else {
			// Scaffolded elements are loaded
			assertEquals("No activations on second run", 0, activations.size());
		}

		assertScaffoldingAdapterIsRegistered(user);
		assertNotScaffolded(user);

		// Make sure infered elements are there and marked as scaffolded
		assertEquals(2, application.getElements().size());
		DAO userDao = (DAO) application.getElements().get(1);
		assertNotNull(userDao);
		assertEquals(user, userDao.getEntity());
		assertScaffoldingAdapterIsRegistered(userDao);
		assertScaffolded(userDao);

		// Save resources on first run, will load them from storage on second run
		if(firstRun) {
			System.out.println("Saving resources in resource set");
			for (Resource resource : resourceSet.getResources()) {
				resource.save(null);
			}
		}

		System.out.println("Model");
		print(originalResource);

		System.out.println("Scaffolding status cache");
		print(cacheResource);

		// Just to ease debugging, not relevant to the test
		if(firstRun) {
			// Pruned copy
			Copier copier = new ScaffoldingStatusPruneCopier();
			EObject pruned = copier.copy(application);
			copier.copyReferences();
			Resource prunedResource = resourceSet.createResource(URI.createURI("memory:pruned.xmi"));
			prunedResource.getContents().add(pruned);

			System.out.println("PRUNED");
			print(prunedResource);
			
		}

	}

	protected void createAndRegisterScaffoldingContext(ScaffoldingStatusCache cache,
			Application application, AgendaEventListener listener) {
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

		// Init Exec environment
		StatefulKnowledgeSession ksession = kbase.newStatefulKnowledgeSession();
		ksession.addEventListener(listener);
		ScaffoldingExecutionEnvironment execEnv = new ScaffoldingExecutionEnvironment(ksession);
		execEnv.register(application);

		// We need to track scaffolding status
		ScaffoldingStatusAdapterFactory scaffoldingStatusAdapterFactory = new ScaffoldingStatusAdapterFactory();
		scaffoldingStatusAdapterFactory.setScaffoldingStatusCache(cache);
		scaffoldingStatusAdapterFactory.adaptAllNew(application);
	}

	protected void print(Resource originalResource) {
		try {
			originalResource.save(System.out, Collections.EMPTY_MAP);
		} catch (IOException e) {
		}
	}

}
