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
package org.eclipselabs.emf.scaffolding.session.util;

import org.drools.event.rule.ActivationCancelledEvent;
import org.drools.event.rule.ActivationCreatedEvent;
import org.drools.event.rule.AfterActivationFiredEvent;
import org.drools.event.rule.AgendaGroupPoppedEvent;
import org.drools.event.rule.AgendaGroupPushedEvent;
import org.drools.event.rule.BeforeActivationFiredEvent;
import org.drools.event.rule.DefaultAgendaEventListener;
import org.drools.event.rule.DefaultWorkingMemoryEventListener;
import org.drools.event.rule.ObjectInsertedEvent;
import org.drools.event.rule.ObjectRetractedEvent;
import org.drools.event.rule.ObjectUpdatedEvent;
import org.drools.runtime.StatefulKnowledgeSession;
import org.eclipse.ui.console.MessageConsoleStream;

public class ScaffoldingConsoleDroolsEventListenerManager {
	private MessageConsoleStream ouput = null;

	public ScaffoldingConsoleDroolsEventListenerManager(
			MessageConsoleStream ouput) {
		super();
		this.ouput = ouput;
	}

	class ConsoleWorkingMemoryEventListener extends
			DefaultWorkingMemoryEventListener {

		@Override
		public void objectInserted(ObjectInsertedEvent event) {
			ouput.println(event.toString());
		}

		@Override
		public void objectRetracted(ObjectRetractedEvent event) {
			ouput.println(event.toString());
		}

		@Override
		public void objectUpdated(ObjectUpdatedEvent event) {
			ouput.println(event.toString());
		}

	}

	class ConsoleAgendaEventListener extends DefaultAgendaEventListener {

		@Override
		public void activationCancelled(ActivationCancelledEvent event) {
			ouput.println(event.toString());
		}

		@Override
		public void activationCreated(ActivationCreatedEvent event) {
			ouput.println(event.toString());
		}

		@Override
		public void afterActivationFired(AfterActivationFiredEvent event) {
			ouput.println(event.toString());
		}

		@Override
		public void agendaGroupPopped(AgendaGroupPoppedEvent event) {
			ouput.println(event.toString());
		}

		@Override
		public void agendaGroupPushed(AgendaGroupPushedEvent event) {
			ouput.println(event.toString());
		}

		@Override
		public void beforeActivationFired(BeforeActivationFiredEvent event) {
			ouput.println(event.toString());
		}

	}

	public void configureListeners(StatefulKnowledgeSession session) {
		session.addEventListener(new ConsoleWorkingMemoryEventListener());
		session.addEventListener(new ConsoleAgendaEventListener());
	}

}
