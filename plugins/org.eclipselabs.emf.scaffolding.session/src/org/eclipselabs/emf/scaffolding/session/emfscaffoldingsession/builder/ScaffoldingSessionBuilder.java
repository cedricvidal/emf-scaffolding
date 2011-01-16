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
package org.eclipselabs.emf.scaffolding.session.emfscaffoldingsession.builder;

import org.eclipselabs.emf.scaffolding.session.emfscaffoldingsession.ScaffoldingSession;

public class ScaffoldingSessionBuilder extends AbstractEMFScaffoldingSessionBuilder
{

	public ScaffoldingSessionBuilder() {
	}

	protected ScaffoldingSession create() {
		return org.eclipselabs.emf.scaffolding.session.emfscaffoldingsession.EMFScaffoldingSessionFactory.eINSTANCE.createScaffoldingSession();
	}


	public ScaffoldingSessionBuilder withScaffoldingFile(ScaffoldingFileBuilder builder) {
		end().setScaffoldingFile(builder.end());
		return this;
	}

	public ScaffoldingSessionBuilder addInputs(InputBuilder builder) {
		end().getInputs().add(builder.end());
		return this;
	}

	public ScaffoldingSessionBuilder withTrash(TrashBuilder builder) {
		end().setTrash(builder.end());
		return this;
	}

	public ScaffoldingSessionBuilder addOutputs(OutputBuilder builder) {
		end().getOutputs().add(builder.end());
		return this;
	}

	public ScaffoldingSession end() {
		return (ScaffoldingSession) current;
	}

}
