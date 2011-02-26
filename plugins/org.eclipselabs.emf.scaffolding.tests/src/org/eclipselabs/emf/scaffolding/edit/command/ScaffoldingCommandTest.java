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

import static org.junit.Assert.*;
import static org.mockito.BDDMockito.*;

import org.eclipse.emf.common.command.BasicCommandStack;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CommandStack;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipselabs.emf.scaffolding.edit.EditScaffoldingExecutionEnvironment;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

/**
 * @author cvidal
 *
 */
@RunWith(MockitoJUnitRunner.class)
public class ScaffoldingCommandTest {

	@Mock EditScaffoldingExecutionEnvironment execEnv;
	@Mock CommandStack delegate;
	@Mock Command originalCommand;
	@Mock EditingDomain editingDomain;
	@Mock ResourceSet resourceSet;
	@Mock FiringCommand firingCommand;
	CommandStack commandStack = new BasicCommandStack();

	ScaffoldingCommand scaffoldingCommand;

	@Before
	public void setup() {
		given(execEnv.getEditingDomain()).willReturn(editingDomain);
		given(editingDomain.getResourceSet()).willReturn(resourceSet);
		given(originalCommand.canExecute()).willReturn(true);
		given(firingCommand.canExecute()).willReturn(true);
		scaffoldingCommand = new ScaffoldingCommand(originalCommand, execEnv, firingCommand);
	}

	@Test
	public void executeShouldExecuteOriginalAndFiringCommands() {
		scaffoldingCommand.execute();
		verify(originalCommand, times(1)).execute();
		verify(firingCommand, times(1)).execute();
	}

	@Test
	public void commandStackExecuteShouldExecuteOriginalAndFiringCommands() {
		commandStack.execute(scaffoldingCommand);
		verify(originalCommand, times(1)).execute();
		verify(firingCommand, times(1)).execute();
	}

	@Test
	public void scaffoldingCommandCanExecuteIfOriginalCommandCan() {
		assertTrue(scaffoldingCommand.canExecute());
	}

}
