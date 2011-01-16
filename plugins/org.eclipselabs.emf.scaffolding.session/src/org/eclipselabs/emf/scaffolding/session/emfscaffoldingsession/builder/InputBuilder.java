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

import org.eclipse.emf.ecore.EObject;
import org.eclipselabs.emf.scaffolding.session.emfscaffoldingsession.Input;

public class InputBuilder extends AbstractEMFScaffoldingSessionBuilder
{

	public InputBuilder() {
	}

	protected Input create() {
		return org.eclipselabs.emf.scaffolding.session.emfscaffoldingsession.EMFScaffoldingSessionFactory.eINSTANCE.createInput();
	}


	public InputBuilder withModel(EObject eobject) {
		end().setModel(eobject);
		return this;
	}

	public Input end() {
		return (Input) current;
	}

}
