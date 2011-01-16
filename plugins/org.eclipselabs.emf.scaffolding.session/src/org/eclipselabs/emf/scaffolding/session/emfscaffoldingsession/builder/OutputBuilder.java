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
import org.eclipselabs.emf.scaffolding.session.emfscaffoldingsession.Output;

public class OutputBuilder extends AbstractEMFScaffoldingSessionBuilder
{

	public OutputBuilder() {
	}
	
	public OutputBuilder(java.lang.String	name) {
		end().setName(name);
	}

	protected Output create() {
		return org.eclipselabs.emf.scaffolding.session.emfscaffoldingsession.EMFScaffoldingSessionFactory.eINSTANCE.createOutput();
	}

	public OutputBuilder withName(java.lang.String value) {
		end().setName(value);
		return this;
	}

	public OutputBuilder addElements(EObject eobject) {
		end().getElements().add(eobject);
		return this;
	}

	public Output end() {
		return (Output) current;
	}

}
