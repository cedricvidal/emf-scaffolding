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

import static org.junit.Assert.assertTrue;
import static org.mockito.BDDMockito.*;

import org.eclipse.emf.common.command.BasicCommandStack;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CommandStack;
import org.eclipse.emf.ecore.change.util.ChangeRecorder;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipselabs.emf.scaffolding.edit.EditScaffoldingExecutionEnvironment;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InOrder;
import org.mockito.Mock;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.runners.MockitoJUnitRunner;
import org.mockito.stubbing.Answer;

@RunWith(MockitoJUnitRunner.class)
public class FiringCommandTest {

	@Mock EditScaffoldingExecutionEnvironment execEnv;
	@Mock CommandStack delegate;
	@Mock Command originalCommand;
	@Mock EditingDomain editingDomain;
	@Mock ResourceSet resourceSet;
	@Mock ChangeRecorder changeRecorder;

	FiringCommand firingCommand;

	@Before
	public void setup() {
		given(execEnv.getEditingDomain()).willReturn(editingDomain);
		given(editingDomain.getResourceSet()).willReturn(resourceSet);
		given(originalCommand.canExecute()).willReturn(true);
		firingCommand = new FiringCommand(execEnv, changeRecorder);
	}

	@Test
	public void executeShouldRecordAndFire() {
		firingCommand.execute();
		InOrder inOrder = inOrder(changeRecorder, execEnv);
		inOrder.verify(changeRecorder).beginRecording(anyCollectionOf(ResourceSet.class));
		inOrder.verify(execEnv).fire();
	}
//
//	@Test
//	public void changeset() {
//		
//		doAnswer(new Answer<Void>() {
//
//			@Override
//			public Void answer(InvocationOnMock invocation) throws Throwable {
//				// TODO Auto-generated method stub
//				return null;
//			}
//		}).when(execEnv).fire();
//
//		firingCommand.execute();
//	}

}
