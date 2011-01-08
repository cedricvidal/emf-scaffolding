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
package org.eclipselabs.emf.scaffolding.session.emfscaffoldingsession.presentation;

import java.io.InputStream;
import java.util.Collection;
import java.util.Properties;

import org.drools.KnowledgeBase;
import org.drools.KnowledgeBaseConfiguration;
import org.drools.KnowledgeBaseFactory;
import org.drools.builder.KnowledgeBuilder;
import org.drools.builder.KnowledgeBuilderConfiguration;
import org.drools.builder.KnowledgeBuilderError;
import org.drools.builder.KnowledgeBuilderErrors;
import org.drools.builder.KnowledgeBuilderFactory;
import org.drools.builder.ResourceType;
import org.drools.definition.KnowledgePackage;
import org.drools.event.rule.DebugWorkingMemoryEventListener;
import org.drools.io.impl.InputStreamResource;
import org.drools.runtime.StatefulKnowledgeSession;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.util.EContentAdapter;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.ui.console.MessageConsoleStream;
import org.eclipselabs.emf.scaffolding.runtime.ScaffoldingExecutionEnvironment;
import org.eclipselabs.emf.scaffolding.runtime.status.ScaffoldingContext;
import org.eclipselabs.emf.scaffolding.runtime.status.ScaffoldingStatusAdapterFactory;
import org.eclipselabs.emf.scaffolding.session.emfscaffoldingsession.EMFScaffoldingSessionPackage;
import org.eclipselabs.emf.scaffolding.session.emfscaffoldingsession.Input;
import org.eclipselabs.emf.scaffolding.session.emfscaffoldingsession.ScaffoldingFile;
import org.eclipselabs.emf.scaffolding.session.emfscaffoldingsession.ScaffoldingSession;
import org.eclipselabs.emf.scaffolding.session.util.ScaffoldingConsoleDroolsEventListenerManager;

public class EMFScaffoldingSessionListener extends EContentAdapter {

	private String filePath = null;
	private ScaffoldingStatusAdapterFactory scaffoldingStatusAdapterFactory;

	public EMFScaffoldingSessionListener(
			ScaffoldingStatusAdapterFactory scaffoldingStatusAdapterFactory) {
		super();
		this.scaffoldingStatusAdapterFactory = scaffoldingStatusAdapterFactory;
	}

	private ScaffoldingExecutionEnvironment execEnv = null;
	private StatefulKnowledgeSession knowledgeSession = null;
	private ClassLoader classLoader = EcorePackage.class.getClassLoader();

	@Override
	public void notifyChanged(Notification notification) {
		super.notifyChanged(notification);

		if (isScaffoldingFilePath(notification) || isInputModel(notification) || isScaffoldingInputs(notification)) {
			EObject notifier = (EObject) notification.getNotifier();
			filePath = getScaffoldingFilePath(notifier);

			if(filePath != null) {
				configureInputs(notifier);
			}
		}

	}

	private boolean isScaffoldingInputs(Notification notification) {
		Object notifier = notification.getNotifier();
		Object feature = notification.getFeature();
		if (notifier == null || feature == null) {
			return false;
		}

		boolean isPath = notifier instanceof ScaffoldingSession
				&& EMFScaffoldingSessionPackage.Literals.SCAFFOLDING_SESSION__INPUTS
						.equals(feature);
		return isPath;
	}

	private String getScaffoldingFilePath(EObject eobject) {
		ScaffoldingFile scaffoldingFile = getScaffoldingSession(eobject).getScaffoldingFile();
		return scaffoldingFile != null ? scaffoldingFile.getPath() : null;
	}

	private void configureInputs(EObject eobject) {
		ScaffoldingSession session = getScaffoldingSession(eobject);
		if (session != null) {
			for (Input input : session.getInputs()) {
				EObject model = input.getModel();
				if (model != null) {
					configureScaffolding(model);
				}
			}
		}

		if (execEnv != null && session != null) {
			execEnv.register(session);
		}
		
		if (knowledgeSession != null) {
			ScaffoldingContext.inScaffoldingSession(new Runnable() {
				@Override
				public void run() {
					knowledgeSession.fireAllRules();
				}
			});
		}

	}

	private ScaffoldingSession getScaffoldingSession(EObject eobject) {
		ScaffoldingSession session = null;
		EObject container = EcoreUtil.getRootContainer(eobject);
		if (container instanceof ScaffoldingSession) {
			session = (ScaffoldingSession) container;
		}
		return session;
	}

	private void configureScaffolding(EObject model) {
		scaffoldingStatusAdapterFactory.adaptAllNew(model);

		if(ScaffoldingExecutionEnvironment.isConfigured(model)) {
			return;
		}

		if (knowledgeSession == null) {
			try {
				knowledgeSession = buildKnowledgeSession(classLoader);
			} catch (CoreException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return;
			}
		}

		if(knowledgeSession != null && execEnv == null) {
			execEnv = new ScaffoldingExecutionEnvironment(knowledgeSession);
		}
		
		if (execEnv != null) {
			execEnv.register(model);
		}
		
	}

	private StatefulKnowledgeSession buildKnowledgeSession(
			ClassLoader classLoader) throws CoreException {
		KnowledgeBase kbase = buildKnowledgeBase(classLoader);

		final StatefulKnowledgeSession statefulKnowledgeSession = kbase.newStatefulKnowledgeSession();
		configureLogging(statefulKnowledgeSession);

		return statefulKnowledgeSession;
	}

	protected void configureLogging(
			final StatefulKnowledgeSession statefulKnowledgeSession) {
		MessageConsoleStream output = ScaffoldingSessionEditorPlugin.INSTANCE.getConsole().newMessageStream();
		ScaffoldingConsoleDroolsEventListenerManager manager = new ScaffoldingConsoleDroolsEventListenerManager(output);
		manager.configureListeners(statefulKnowledgeSession);
	}

	private KnowledgeBase buildKnowledgeBase(ClassLoader classLoader) throws CoreException {
		Path path = new Path(filePath);
		IFile file = ResourcesPlugin.getWorkspace().getRoot().getFile(path);

		InputStream contents = file.getContents();

		KnowledgeBaseConfiguration knowledgeBaseConfiguration = KnowledgeBaseFactory.newKnowledgeBaseConfiguration(new Properties(), classLoader);
		KnowledgeBase kbase = KnowledgeBaseFactory.newKnowledgeBase(knowledgeBaseConfiguration);
		
		KnowledgeBuilderConfiguration knowledgeBuilderConfig = KnowledgeBuilderFactory.newKnowledgeBuilderConfiguration(new Properties(), classLoader);
		KnowledgeBuilder kbuilder = KnowledgeBuilderFactory
				.newKnowledgeBuilder(knowledgeBuilderConfig);
		
		InputStreamResource res = new InputStreamResource(contents);
		kbuilder.add(res, ResourceType.DRL);

		Collection<KnowledgePackage> pkgs = kbuilder.getKnowledgePackages();
		KnowledgeBuilderErrors errors = kbuilder.getErrors();
		for (KnowledgeBuilderError error : errors) {
			System.err.println("KnowledgeBuilder error : " + error.getMessage());
		}

		kbase.addKnowledgePackages(pkgs);
		return kbase;
	}

	private boolean isScaffoldingFilePath(Notification notification) {
		Object notifier = notification.getNotifier();
		Object feature = notification.getFeature();
		if (notifier == null || feature == null) {
			return false;
		}

		boolean isPath = notifier instanceof ScaffoldingFile
				&& EMFScaffoldingSessionPackage.Literals.SCAFFOLDING_FILE__PATH
						.equals(feature);
		return isPath;
	}

	private boolean isInputModel(Notification notification) {
		Object notifier = notification.getNotifier();
		Object feature = notification.getFeature();
		if (notifier == null || feature == null) {
			return false;
		}

		boolean isPath = notifier instanceof Input
				&& EMFScaffoldingSessionPackage.Literals.INPUT__MODEL
						.equals(feature);
		return isPath;
	}

}
