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
package org.eclipselabs.emf.scaffolding.edit;

import org.drools.KnowledgeBase;
import org.drools.runtime.StatefulKnowledgeSession;
import org.eclipse.emf.common.command.CommandStack;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipselabs.emf.scaffolding.edit.command.ScaffoldingCommandStackDecorator;
import org.eclipselabs.emf.scaffolding.runtime.ScaffoldingExecutionEnvironment;
import org.eclipselabs.emf.scaffolding.runtime.internal.engine.FactPublisher;

public class EditScaffoldingExecutionEnvironment extends ScaffoldingExecutionEnvironment {

	private EditingDomain editingDomain;

	public EditingDomain getEditingDomain() {
		return editingDomain;
	}

	public EditScaffoldingExecutionEnvironment(KnowledgeBase kbase) {
		super(kbase);
	}

	public EditScaffoldingExecutionEnvironment(
			StatefulKnowledgeSession statefulKnowledgeSession) {
		super(statefulKnowledgeSession);
	}

	// TODO make this protected
	public EditScaffoldingExecutionEnvironment(
			StatefulKnowledgeSession statefulKnowledgeSession,
			FactPublisher factPublisher) {
		super(statefulKnowledgeSession, factPublisher);
	}

	public void useEditingDomain(EditingDomain editingDomain) {
		if (!(editingDomain.getCommandStack() instanceof ScaffoldingCommandStackDecorator)) {
			throw new IllegalStateException("EditingDomain has not been configured with the " + ScaffoldingCommandStackDecorator.class.getName());
		}
		factPublisher.setImmediateFire(false);
		this.editingDomain = editingDomain;
	}

	public ScaffoldingCommandStackDecorator prepareCommandStack(CommandStack commandStack) {
		return new ScaffoldingCommandStackDecorator(commandStack, this);
	}

}
