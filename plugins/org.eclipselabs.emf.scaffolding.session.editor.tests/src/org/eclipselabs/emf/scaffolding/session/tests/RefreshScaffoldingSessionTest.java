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
package org.eclipselabs.emf.scaffolding.session.tests;

import static org.eclipselabs.emf.scaffolding.session.emfscaffoldingsession.builder.EMFScaffoldingSessionBuilders.buildInput;
import static org.eclipselabs.emf.scaffolding.tests.model1.builder.Model1Builders.buildApplication;
import static org.eclipselabs.emf.scaffolding.tests.model1.builder.Model1Builders.buildEntity;

import java.net.URISyntaxException;
import java.net.URL;

import org.drools.runtime.StatefulKnowledgeSession;
import org.eclipselabs.emf.scaffolding.runtime.status.ScaffoldingStatusAdapterFactory;
import org.eclipselabs.emf.scaffolding.session.emfscaffoldingsession.EMFScaffoldingSessionFactory;
import org.eclipselabs.emf.scaffolding.session.emfscaffoldingsession.ScaffoldingFile;
import org.eclipselabs.emf.scaffolding.session.emfscaffoldingsession.ScaffoldingSession;
import org.eclipselabs.emf.scaffolding.session.emfscaffoldingsession.presentation.EMFScaffoldingSessionListener;
import org.eclipselabs.emf.scaffolding.session.jobs.SynchronousJobScheduler;
import org.eclipselabs.emf.scaffolding.session.util.KnowledgeSessionListenerManager;
import org.eclipselabs.emf.scaffolding.tests.model1.Application;
import org.eclipselabs.emf.scaffolding.tests.resources.Resources;
import org.junit.Test;

import static junit.framework.Assert.*;

public class RefreshScaffoldingSessionTest {

	@Test
	public void refreshScaffoldingSession() throws URISyntaxException {
		EMFScaffoldingSessionFactory f = EMFScaffoldingSessionFactory.eINSTANCE;

		String path = path("Entity2Dao.drl");
		ScaffoldingStatusAdapterFactory scaffoldingStatusAdapterFactory = new ScaffoldingStatusAdapterFactory();
		ScaffoldingSession session = f.createScaffoldingSession();
		scaffoldingStatusAdapterFactory.adaptAllNew(session);

		EMFScaffoldingSessionListener scaffoldingSessionListener = new EMFScaffoldingSessionListener(
				scaffoldingStatusAdapterFactory) {
			@Override
			protected KnowledgeSessionListenerManager createKnowledgeSessionListenerManager() {
				return new KnowledgeSessionListenerManager() {

					@Override
					public void configureListeners(
							StatefulKnowledgeSession session) {
					}
					
				};
			}
		};
		scaffoldingSessionListener.setJobScheduler(new SynchronousJobScheduler());

		session.eAdapters().add(scaffoldingSessionListener);
		ScaffoldingFile file = f.createScaffoldingFile();
		file.setPath(path);
		session.setScaffoldingFile(file);

		Application app = buildApplication().addElements(buildEntity("User")).end();

		session.getInputs().add(buildInput().withModel(app).end());

		assertEquals(2, app.getElements().size());
		
		// TODO deactivate sync, reload scaffolding file and reapply it
		
	}

	protected String path(String path) {
		URL url = Resources.class.getResource(path);
		String file = url.toString();
		return file;
	}

}
