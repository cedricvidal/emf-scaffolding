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
package org.eclipselabs.emf.scaffolding.runtime;

import java.util.ArrayList;
import java.util.List;

import org.drools.KnowledgeBase;
import org.drools.builder.ResourceType;
import org.drools.event.rule.DebugWorkingMemoryEventListener;
import org.drools.runtime.StatefulKnowledgeSession;
import org.eclipse.emf.common.notify.impl.NotifierImpl;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipselabs.emf.scaffolding.runtime.internal.engine.FactPublisher;
import org.eclipselabs.emf.scaffolding.runtime.status.ScaffoldingContext;

public class ScaffoldingExecutionEnvironment extends NotifierImpl {

	public static final ResourceType ESL = ResourceType.addResourceTypeToRegistry("ESL", "EMF Scaffolding DSL", "esl");

	protected FactPublisher factPublisher;

	private StatefulKnowledgeSession knowledgeSession;

	public ScaffoldingExecutionEnvironment() {
	}

	public ScaffoldingExecutionEnvironment(KnowledgeBase kbase) {
	    this(createSession(kbase));
	}

	public ScaffoldingExecutionEnvironment(StatefulKnowledgeSession statefulKnowledgeSession) {
	    this(statefulKnowledgeSession, new FactPublisher());
	}

	protected ScaffoldingExecutionEnvironment(StatefulKnowledgeSession statefulKnowledgeSession, FactPublisher factPublisher) {
	    this.factPublisher = factPublisher;
	    factPublisher.setStatefulKnowledgeSession(statefulKnowledgeSession);
	    factPublisher.setScaffoldingExecutionEnvironment(this);
	    this.knowledgeSession = statefulKnowledgeSession;
	}

	public StatefulKnowledgeSession getKnowledgeSession() {
		return knowledgeSession;
	}

	private static StatefulKnowledgeSession createSession(KnowledgeBase kbase) {
		StatefulKnowledgeSession statefulKnowledgeSession = kbase.newStatefulKnowledgeSession();
		statefulKnowledgeSession.addEventListener(new DebugWorkingMemoryEventListener());
		return statefulKnowledgeSession;
	}

	public void register(EObject object) {
		if (!isConfigured(object)) {
			object.eAdapters().add(factPublisher);
		}
	}

	public void fire() {
		if (!ScaffoldingContext.isScaffolding()) {
			ScaffoldingContext.inScaffoldingSession(new Runnable() {
				@Override
				public void run() {
					knowledgeSession.fireAllRules();
				}
			});
			for (ScaffoldingEventListener listener : listeners) {
				listener.fired();
			}
		} else {
			throw new IllegalStateException("Already firing");
		}
	}

	private List<ScaffoldingEventListener> listeners = new ArrayList<ScaffoldingEventListener>();

	public void addEventListener(ScaffoldingEventListener listener) {
		listeners.add(listener);
	}

	public static boolean isConfigured(EObject object) {
		FactPublisher factPublisher = getFactPublisher(object);
		return factPublisher != null;
	}

	public static FactPublisher getFactPublisher(EObject object) {
		FactPublisher factPublisher = (FactPublisher) EcoreUtil.getExistingAdapter(object, FactPublisher.class);
		return factPublisher;
	}

}
