/*******************************************************************************
 * Copyright (c) 2010 Contributors - see below
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Cedric Vidal - initial API and implementation
 *     Jerome Benois - Rewrite compiler and runtime based on new Drools Knowledge API
 *******************************************************************************/
package org.eclipselabs.emf.scaffolding.runtime.internal.compiler;

import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.Resource.Diagnostic;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.Scaffolding;

public class ESLParser {

	public ESLParser() {

	}

	public Scaffolding parse(InputStream inputStream) throws IOException {
		ResourceSet rs = new ResourceSetImpl();
		Resource resource = rs.createResource(URI.createURI("InMemoryKnowledgeBase.esl"));
		resource.load(inputStream, Collections.emptyMap());
		if(!resource.getErrors().isEmpty()) {
			Diagnostic d = resource.getErrors().get(0);
			String message = d.getMessage() + " on line " + d.getLine();
			throw new IOException(message);
		}
		return (Scaffolding) resource.getContents().get(0);
	}

}
