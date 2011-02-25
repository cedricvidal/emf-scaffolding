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

import static org.junit.Assert.*;
import static org.mockito.BDDMockito.*;

import org.drools.runtime.StatefulKnowledgeSession;
import org.eclipse.emf.common.command.BasicCommandStack;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CommandStack;
import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.edit.command.ChangeCommand;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipselabs.emf.scaffolding.edit.EditScaffoldingExecutionEnvironment;
import org.eclipselabs.emf.scaffolding.edit.EditScaffoldingExecutionEnvironment.FireOnCommandStackChanged;
import org.eclipselabs.emf.scaffolding.runtime.ScaffoldingEventListener;
import org.eclipselabs.emf.scaffolding.runtime.internal.engine.FactPublisher;
import org.eclipselabs.emf.scaffolding.tests.model1.Application;
import org.eclipselabs.emf.scaffolding.tests.model1.Entity;
import org.eclipselabs.emf.scaffolding.tests.model1.Model1Factory;
import org.eclipselabs.emf.scaffolding.tests.model1.util.Model1AdapterFactory;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import com.google.common.base.Function;

@RunWith(Suite.class)
@SuiteClasses({EditScaffoldingExecutionEnvironmentTest.CommandStackFiring.class, EditScaffoldingExecutionEnvironmentTest.FiringConf.class})
public class EditScaffoldingExecutionEnvironmentTest {

	@RunWith(MockitoJUnitRunner.class)
	public static class CommandStackFiring {
		
		EditingDomain editingDomain;
		@Mock ScaffoldingEventListener scaffoldingEventListener;
		@Mock StatefulKnowledgeSession statefulKnowledgeSession;
		private CommandStack commandStack;

		private EditScaffoldingExecutionEnvironment execEnv;

		@Before
		public void setup() {
			AdapterFactory adapterFactory = new Model1AdapterFactory();
			commandStack = new BasicCommandStack();
			editingDomain = new AdapterFactoryEditingDomain(adapterFactory,commandStack);

			execEnv = new EditScaffoldingExecutionEnvironment(statefulKnowledgeSession);
			execEnv.addEventListener(scaffoldingEventListener);
		}

		@Test
		public void rulesShouldFireOnlyAfterTheCommandStackIsChangedSimpleCompound() {
			rulesShouldFireOnlyAfterTheCommandStackIsChanged(simpleCommand());
		}

		@Test
		public void rulesShouldFireOnlyAfterTheCommandStackIsChangedCompoundCommand() {
			rulesShouldFireOnlyAfterTheCommandStackIsChanged(compoundCommand());
		}

		protected Function<Application, Command> simpleCommand() {
			Function<Application, Command> simpleCommandFactory = new Function<Application, Command>() {
				@Override
				public ChangeCommand apply(final Application from) {
					return new ChangeCommand(from) {
						@Override
						protected void doExecute() {
							Entity entity = (Entity)from.getElements().get(0);
							entity.setName("user");
							verify(scaffoldingEventListener, times(0)).fired();
						}
					};
				}
			};
			return simpleCommandFactory;
		}

		protected void rulesShouldFireOnlyAfterTheCommandStackIsChanged(
				Function<Application, Command> function) {
			execEnv.useEditingDomain(editingDomain);
			Application application = Model1Factory.eINSTANCE.createApplication();
			execEnv.register(application);

			final Entity user = Model1Factory.eINSTANCE.createEntity();
			application.getElements().add(user);

			editingDomain.getCommandStack().execute(function.apply(application));

			verify(scaffoldingEventListener, times(1)).fired();
		}

		private Function<Application, Command> compoundCommand() {
			Function<Application, Command> compoundCommandFactory = new Function<Application, Command>() {
				@Override
				public Command apply(final Application application) {
					CompoundCommand command = new CompoundCommand();
					command.append(new ChangeCommand(application) {
						@Override
						protected void doExecute() {
							Entity entity = (Entity)application.getElements().get(0);
							entity.setName("user");
							verify(scaffoldingEventListener, times(0)).fired();
						}
					});
					command.append(new ChangeCommand(application) {
						@Override
						protected void doExecute() {
							Entity entity = (Entity)application.getElements().get(0);
							entity.setName(entity.getName() + "-suffix");
							verify(scaffoldingEventListener, times(0)).fired();
						}
					});
					return command;
				}
			};
			return compoundCommandFactory;
		}

	}

	@RunWith(MockitoJUnitRunner.class)
	public static class FiringConf {

		@Mock EditingDomain editingDomain;
		@Mock StatefulKnowledgeSession statefulKnowledgeSession;
		@Mock FactPublisher factPublisher;
		@Mock CommandStack commandStack;

		private EditScaffoldingExecutionEnvironment execEnv;

		@Before
		public void setup() {
			execEnv = new EditScaffoldingExecutionEnvironment(statefulKnowledgeSession, factPublisher);
			given(editingDomain.getCommandStack()).willReturn(commandStack);
		}

		@Test
		public void whenUsingAnEditingDomainThenImmediateFireIsOffAndFireOnCommandStackChanged() {
			execEnv.useEditingDomain(editingDomain);
			verify(factPublisher).setImmediateFire(false);
			verify(commandStack).addCommandStackListener(isA(FireOnCommandStackChanged.class));
		}

	}

}
