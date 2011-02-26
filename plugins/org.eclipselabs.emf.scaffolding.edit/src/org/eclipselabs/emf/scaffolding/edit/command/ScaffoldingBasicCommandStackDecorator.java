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
package org.eclipselabs.emf.scaffolding.edit.command;

import org.eclipse.emf.common.command.BasicCommandStack;
import org.eclipse.emf.common.command.Command;
import org.eclipselabs.emf.scaffolding.edit.EditScaffoldingExecutionEnvironment;
import org.eclipselabs.emf.scaffolding.edit.util.BasicCommandStackDelegateSupport;

public class ScaffoldingBasicCommandStackDecorator extends
		BasicCommandStackDelegateSupport implements IScaffoldingCommandStackDecorator {

	private EditScaffoldingExecutionEnvironment scaffoldingExecutionEnvironment;

	public EditScaffoldingExecutionEnvironment getScaffoldingExecutionEnvironment() {
		return scaffoldingExecutionEnvironment;
	}

	public void setScaffoldingExecutionEnvironment(EditScaffoldingExecutionEnvironment execEnv) {
		this.scaffoldingExecutionEnvironment = execEnv;
	}

	public ScaffoldingBasicCommandStackDecorator(BasicCommandStack delegate) {
		super(delegate);
	}

	public ScaffoldingBasicCommandStackDecorator(BasicCommandStack delegate, EditScaffoldingExecutionEnvironment execEnv) {
		super(delegate);
		this.scaffoldingExecutionEnvironment = execEnv;
	}

	@Override
	public void execute(Command command) {
		ScaffoldingCommand wrapper = new ScaffoldingCommand(command, scaffoldingExecutionEnvironment, new FiringCommand(scaffoldingExecutionEnvironment));
		super.execute(wrapper);
	}

}
