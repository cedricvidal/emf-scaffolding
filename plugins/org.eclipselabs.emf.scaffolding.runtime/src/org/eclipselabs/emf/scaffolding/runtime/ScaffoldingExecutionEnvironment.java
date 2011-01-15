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

import org.drools.KnowledgeBase;
import org.drools.builder.ResourceType;
import org.drools.event.rule.DebugWorkingMemoryEventListener;
import org.drools.runtime.StatefulKnowledgeSession;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipselabs.emf.scaffolding.runtime.internal.engine.FactPublisher;

public class ScaffoldingExecutionEnvironment {

	public static final ResourceType ESL = ResourceType.addResourceTypeToRegistry("ESL", "EMF Scaffolding DSL", "esl");
	
	protected FactPublisher factPublisher;

	private StatefulKnowledgeSession statefulKnowledgeSession;

	public ScaffoldingExecutionEnvironment(KnowledgeBase kbase) {
	    this(createSession(kbase));
	}

	public ScaffoldingExecutionEnvironment(StatefulKnowledgeSession statefulKnowledgeSession) {
	    this.factPublisher = new FactPublisher();
	    factPublisher.setStatefulKnowledgeSession(statefulKnowledgeSession);
	    this.statefulKnowledgeSession = statefulKnowledgeSession;
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

	public static boolean isConfigured(EObject object) {
		return EcoreUtil.getExistingAdapter(object, FactPublisher.class) != null;
	}

}
