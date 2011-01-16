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

import org.eclipselabs.emf.scaffolding.session.emfscaffoldingsession.ScaffoldingFile;

public class ScaffoldingFileBuilder extends AbstractEMFScaffoldingSessionBuilder
{

	public ScaffoldingFileBuilder() {
	}
	
	public ScaffoldingFileBuilder(java.lang.String	path) {
		end().setPath(path);
	}

	protected ScaffoldingFile create() {
		return org.eclipselabs.emf.scaffolding.session.emfscaffoldingsession.EMFScaffoldingSessionFactory.eINSTANCE.createScaffoldingFile();
	}

	public ScaffoldingFileBuilder withPath(java.lang.String value) {
		end().setPath(value);
		return this;
	}

	public ScaffoldingFile end() {
		return (ScaffoldingFile) current;
	}

}