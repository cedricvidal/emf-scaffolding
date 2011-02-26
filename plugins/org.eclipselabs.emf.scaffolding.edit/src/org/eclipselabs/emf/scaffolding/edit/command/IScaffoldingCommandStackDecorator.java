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

import org.eclipse.emf.common.command.Command;
import org.eclipselabs.emf.scaffolding.edit.EditScaffoldingExecutionEnvironment;

/**
 * @author cvidal
 * 
 */
public interface IScaffoldingCommandStackDecorator {

	public void setScaffoldingExecutionEnvironment(EditScaffoldingExecutionEnvironment execEnv);

	public void execute(Command command);

}
