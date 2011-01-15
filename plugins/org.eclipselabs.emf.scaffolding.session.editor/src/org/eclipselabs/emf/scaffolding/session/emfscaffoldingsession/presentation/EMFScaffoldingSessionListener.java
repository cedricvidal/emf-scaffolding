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
import org.drools.definition.rule.Rule;
import org.drools.io.impl.InputStreamResource;
import org.drools.runtime.StatefulKnowledgeSession;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
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
import org.eclipselabs.emf.scaffolding.session.util.EmfRegistryClassLoader;
import org.eclipselabs.emf.scaffolding.session.util.ScaffoldingConsoleDroolsEventListenerManager;

public class EMFScaffoldingSessionListener extends EContentAdapter {

	private ScaffoldingStatusAdapterFactory scaffoldingStatusAdapterFactory;

	public EMFScaffoldingSessionListener(
			ScaffoldingStatusAdapterFactory scaffoldingStatusAdapterFactory) {
		super();
		this.scaffoldingStatusAdapterFactory = scaffoldingStatusAdapterFactory;
	}

	private ScaffoldingExecutionEnvironment execEnv = null;
	private StatefulKnowledgeSession knowledgeSession = null;
	private KnowledgeBase kbase;

	private Collection<KnowledgePackage> knowledgePackages = null;
	private String filePath;

	private ClassLoader classLoader = new EmfRegistryClassLoader(this.getClass().getClassLoader(), EPackage.Registry.INSTANCE);

	@Override
	public void notifyChanged(Notification notification) {
		super.notifyChanged(notification);

		EObject notifier = (EObject) notification.getNotifier();

		/*
		 * Inputs
		 */
		if (isInputModel(notification) || isScaffoldingInputs(notification)) {
			configureInputs(notifier);

			/*
			 * Configure ScaffoldingSession
			 */
			ScaffoldingExecutionEnvironment scaffoldingExecutionEnvironment = getScaffoldingExecutionEnvironment();
			ScaffoldingSession session = findScaffoldingSession(notifier);
			if (scaffoldingExecutionEnvironment != null && session != null) {
				scaffoldingExecutionEnvironment.register(session);
			}

			/*
			 * Fire rules
			 */
			final StatefulKnowledgeSession knowledgeSession = getKnowledgeSession();
			if (knowledgeSession != null) {
				ScaffoldingContext.inScaffoldingSession(new Runnable() {
					@Override
					public void run() {
						knowledgeSession.fireAllRules();
					}
				});
			}

		}

		/*
		 * Packages
		 */
		if (isScaffoldingFilePath(notification) || knowledgePackages == null) {

			String newFilePath = getScaffoldingFilePath(notifier);

			// Unload old packages if deactivated
			if (filePath != null && !filePath.equals(newFilePath) && knowledgePackages != null) {
				for (KnowledgePackage knowledgePackage : knowledgePackages) {
					for (Rule rule : knowledgePackage.getRules()) {
						kbase.removeRule(knowledgePackage.getName(), rule.getName());
					}
				}
				knowledgePackages.clear();
				knowledgePackages = null;
				filePath = null;
			}

			// Load new packages if activated
			if(newFilePath != null && filePath == null) {
				
				try {
					knowledgePackages = buildKnowledgePackages(classLoader, newFilePath);
					kbase.addKnowledgePackages(knowledgePackages);
				} catch (CoreException e) {
				}
				this.filePath = newFilePath;

				reapplyScaffoldingRules();
			}
		}
	}

	protected void reapplyScaffoldingRules() {
		// TODO Auto-generated method stub
		
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
		ScaffoldingFile scaffoldingFile = findScaffoldingSession(eobject).getScaffoldingFile();
		return scaffoldingFile != null ? scaffoldingFile.getPath() : null;
	}

	private void configureInputs(EObject eobject) {
		ScaffoldingSession session = findScaffoldingSession(eobject);
		if (session != null) {
			for (Input input : session.getInputs()) {
				EObject model = input.getModel();
				if (model != null) {
					configureScaffolding(model);
				}
			}
		}
	}

	private ScaffoldingSession findScaffoldingSession(EObject eobject) {
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

		ScaffoldingExecutionEnvironment scaffoldingExecutionEnvironment = getScaffoldingExecutionEnvironment();

		if (scaffoldingExecutionEnvironment != null) {
			scaffoldingExecutionEnvironment.register(model);
		}
		
	}

	protected ScaffoldingExecutionEnvironment getScaffoldingExecutionEnvironment() {
		StatefulKnowledgeSession knowledgeSession = getKnowledgeSession();

		if(knowledgeSession != null && execEnv == null) {
			execEnv = new ScaffoldingExecutionEnvironment(knowledgeSession);
			MessageConsoleStream output = ScaffoldingSessionEditorPlugin.INSTANCE.getConsole().newMessageStream();
		}
		return execEnv;
	}

	protected StatefulKnowledgeSession getKnowledgeSession() {
		if (knowledgeSession == null) {
			try {
				knowledgeSession = buildKnowledgeSession();
			} catch (CoreException e) {
				return null;
			}
		}
		return knowledgeSession;
	}

	private StatefulKnowledgeSession buildKnowledgeSession() throws CoreException {
		KnowledgeBase kbase = getKnowledgeBase();

		final StatefulKnowledgeSession statefulKnowledgeSession = kbase.newStatefulKnowledgeSession();
		configureLogging(statefulKnowledgeSession);
		
		return statefulKnowledgeSession;
	}

	private KnowledgeBase getKnowledgeBase()
			throws CoreException {
		if (kbase == null) {
			kbase = createKnowledgeBase(classLoader);
		}
		return kbase;
	}

	protected void configureLogging(
			final StatefulKnowledgeSession statefulKnowledgeSession) {
		MessageConsoleStream output = ScaffoldingSessionEditorPlugin.INSTANCE.getConsole().newMessageStream();
		ScaffoldingConsoleDroolsEventListenerManager manager = new ScaffoldingConsoleDroolsEventListenerManager(output);
		manager.configureListeners(statefulKnowledgeSession);
	}

	private KnowledgeBase createKnowledgeBase(ClassLoader classLoader) throws CoreException {
		KnowledgeBaseConfiguration knowledgeBaseConfiguration = KnowledgeBaseFactory.newKnowledgeBaseConfiguration(new Properties(), classLoader);
		KnowledgeBase kbase = KnowledgeBaseFactory.newKnowledgeBase(knowledgeBaseConfiguration);
		return kbase;
	}

	private Collection<KnowledgePackage> buildKnowledgePackages(
			ClassLoader classLoader, String filePath) throws CoreException {
		Path path = new Path(filePath);
		IFile file = ResourcesPlugin.getWorkspace().getRoot().getFile(path);

		InputStream contents = file.getContents();
		
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
		return pkgs;
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
