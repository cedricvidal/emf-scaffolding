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

import org.eclipse.emf.ecore.change.ChangeDescription;
import org.eclipse.emf.ecore.change.util.ChangeRecorder;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.edit.command.ChangeCommand;
import org.eclipselabs.emf.scaffolding.edit.EditScaffoldingExecutionEnvironment;
import org.eclipselabs.emf.scaffolding.runtime.ScaffoldingExecutionEnvironment;
import org.eclipselabs.emf.scaffolding.runtime.status.ScaffoldingContext;

/**
 * @author cvidal
 *
 */
public class FiringCommand extends ChangeCommand {

	private ScaffoldingExecutionEnvironment execEnv;

	/**
	 * @param execEnv 
	 */
	public FiringCommand(EditScaffoldingExecutionEnvironment execEnv) {
		super(notifier(execEnv));
		this.execEnv = execEnv;
	}

	/**
	 * @param execEnv 
	 * @param changeRecorder TODO
	 */
	// TODO make it protected for Unit Test only
	public FiringCommand(EditScaffoldingExecutionEnvironment execEnv, ChangeRecorder changeRecorder) {
		super(changeRecorder, notifier(execEnv));
		this.execEnv = execEnv;
	}

	private static ResourceSet notifier(
			EditScaffoldingExecutionEnvironment execEnv) {
		return execEnv.getEditingDomain().getResourceSet();
	}

	/* (non-Javadoc)
	 * @see org.eclipse.emf.edit.command.ChangeCommand#doExecute()
	 */
	@Override
	protected void doExecute() {
		execEnv.fire();
	}

	/* (non-Javadoc)
	 * @see org.eclipse.emf.edit.command.ChangeCommand#undo()
	 */
	@Override
	public void undo() {
		ScaffoldingContext.inScaffoldingSession(new Runnable() {
			@Override
			public void run() {
				FiringCommand.super.undo();
			}
		});
	}

	/* (non-Javadoc)
	 * @see org.eclipse.emf.edit.command.ChangeCommand#redo()
	 */
	@Override
	public void redo() {
		ScaffoldingContext.inScaffoldingSession(new Runnable() {
			@Override
			public void run() {
				FiringCommand.super.redo();
			}
		});
	}

	/* (non-Javadoc)
	 * @see org.eclipse.emf.edit.command.ChangeCommand#getChangeDescription()
	 */
	@Override
	protected ChangeDescription getChangeDescription() {
		return super.getChangeDescription();
	}
}
