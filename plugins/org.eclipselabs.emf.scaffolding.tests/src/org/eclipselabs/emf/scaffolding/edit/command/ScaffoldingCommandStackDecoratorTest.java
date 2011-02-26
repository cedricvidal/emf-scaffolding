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

import java.util.List;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CommandStack;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipselabs.emf.scaffolding.edit.EditScaffoldingExecutionEnvironment;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import static org.mockito.BDDMockito.*;

/**
 * @author cvidal
 *
 */
@RunWith(MockitoJUnitRunner.class)
public class ScaffoldingCommandStackDecoratorTest {

	@Mock EditScaffoldingExecutionEnvironment execEnv;
	@Mock CommandStack delegate;
	@Mock Command command;
	@Mock EditingDomain editingDomain;
	@Mock ResourceSet resourceSet;

	ScaffoldingCommandStackDecorator scaffoldingCommandStackDecorator;

	@Before
	public void setup() {
		scaffoldingCommandStackDecorator = new ScaffoldingCommandStackDecorator(delegate, execEnv);
		given(execEnv.getEditingDomain()).willReturn(editingDomain);
		given(editingDomain.getResourceSet()).willReturn(resourceSet);
	}

	/**
	 * Test method for {@link org.eclipselabs.emf.scaffolding.edit.command.ScaffoldingCommandStackDecorator#execute(org.eclipse.emf.common.command.Command)}.
	 */
	@Test
	public void executeShouldDecorateTheCommandWithScaffoldingCommand() {
		scaffoldingCommandStackDecorator.execute(command);
		ArgumentCaptor<ScaffoldingCommand> argument = ArgumentCaptor.forClass(ScaffoldingCommand.class);
		verify(delegate).execute(argument.capture());
		List<Command> commands = argument.getValue().getCommandList();
		assertEquals(2, commands.size());
		assertEquals(command, commands.get(0));
		assertTrue(commands.get(1) instanceof FiringCommand);
	}

}
