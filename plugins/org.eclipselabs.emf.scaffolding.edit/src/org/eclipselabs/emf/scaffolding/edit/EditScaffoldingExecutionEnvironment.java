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

import java.util.EventObject;

import org.drools.KnowledgeBase;
import org.drools.runtime.StatefulKnowledgeSession;
import org.eclipse.emf.common.command.CommandStackListener;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipselabs.emf.scaffolding.runtime.ScaffoldingExecutionEnvironment;

public class EditScaffoldingExecutionEnvironment extends ScaffoldingExecutionEnvironment {

	public EditScaffoldingExecutionEnvironment(KnowledgeBase kbase) {
		super(kbase);
	}

	public EditScaffoldingExecutionEnvironment(
			StatefulKnowledgeSession statefulKnowledgeSession) {
		super(statefulKnowledgeSession);
	}

	public void useEditingDomain(EditingDomain editingDomain) {
		editingDomain.getCommandStack().addCommandStackListener(new CommandStackListener() {
			@Override
			public void commandStackChanged(EventObject eventObject) {
				fire();
			}
		});
		factPublisher.setImmediateFire(false);
	}

}
