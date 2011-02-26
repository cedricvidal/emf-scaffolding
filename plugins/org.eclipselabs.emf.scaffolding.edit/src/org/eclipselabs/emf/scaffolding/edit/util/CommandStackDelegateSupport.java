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
package org.eclipselabs.emf.scaffolding.edit.util;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CommandStack;
import org.eclipse.emf.common.command.CommandStackListener;

public class CommandStackDelegateSupport implements CommandStack {

	private final CommandStack delegate;

	public CommandStackDelegateSupport(CommandStack delegate) {
		super();
		this.delegate = delegate;
	}

	public void addCommandStackListener(CommandStackListener listener) {
		delegate.addCommandStackListener(listener);
	}

	public boolean canRedo() {
		return delegate.canRedo();
	}

	public boolean canUndo() {
		return delegate.canUndo();
	}

	public void execute(Command command) {
		delegate.execute(command);
	}

	public void flush() {
		delegate.flush();
	}

	public Command getMostRecentCommand() {
		return delegate.getMostRecentCommand();
	}

	public Command getRedoCommand() {
		return delegate.getRedoCommand();
	}

	public Command getUndoCommand() {
		return delegate.getUndoCommand();
	}

	public void redo() {
		delegate.redo();
	}

	public void removeCommandStackListener(CommandStackListener listener) {
		delegate.removeCommandStackListener(listener);
	}

	public void undo() {
		delegate.undo();
	}

}
