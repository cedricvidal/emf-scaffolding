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

public abstract class EMFScaffoldingSessionBuilders {

	public static ScaffoldingSessionBuilder buildScaffoldingSession() {
		return new ScaffoldingSessionBuilder();
	}


	public static ScaffoldingFileBuilder buildScaffoldingFile() {
		return new ScaffoldingFileBuilder();
	}
	
	public static ScaffoldingFileBuilder buildScaffoldingFile(java.lang.String	path) {
		return new ScaffoldingFileBuilder(path);
	}


	public static InputBuilder buildInput() {
		return new InputBuilder();
	}


	public static TrashBuilder buildTrash() {
		return new TrashBuilder();
	}


	public static OutputBuilder buildOutput() {
		return new OutputBuilder();
	}
	
	public static OutputBuilder buildOutput(java.lang.String	name) {
		return new OutputBuilder(name);
	}


}
