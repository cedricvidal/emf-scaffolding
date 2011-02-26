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

import org.eclipse.emf.common.command.BasicCommandStack;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CommandStackListener;

/**
 * @author cvidal
 *
 */
public class BasicCommandStackDelegateSupport extends BasicCommandStack {
	private BasicCommandStack delegate;

	public BasicCommandStackDelegateSupport(BasicCommandStack delegate) {
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

	public boolean equals(Object obj) {
		return delegate.equals(obj);
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

	public int hashCode() {
		return delegate.hashCode();
	}

	public boolean isSaveNeeded() {
		return delegate.isSaveNeeded();
	}

	public void redo() {
		delegate.redo();
	}

	public void removeCommandStackListener(CommandStackListener listener) {
		delegate.removeCommandStackListener(listener);
	}

	public void saveIsDone() {
		delegate.saveIsDone();
	}

	public String toString() {
		return delegate.toString();
	}

	public void undo() {
		delegate.undo();
	}
}
