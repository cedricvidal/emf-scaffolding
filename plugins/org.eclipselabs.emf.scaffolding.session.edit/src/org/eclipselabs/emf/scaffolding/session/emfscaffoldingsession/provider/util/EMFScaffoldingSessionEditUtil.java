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
package org.eclipselabs.emf.scaffolding.session.emfscaffoldingsession.provider.util;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.core.resources.IResource;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

public class EMFScaffoldingSessionEditUtil {

	public static Collection<?> elements(Iterable<IResource> res) {
		List<EObject> elements = new ArrayList<EObject>();
		for (IResource r : res) {
			Resource emfRes = resource(r, new ResourceSetImpl());
			elements.addAll(emfRes.getContents());
		}
		
		return elements;
	}

	public static Resource resource(IResource r, ResourceSet rs) {
		URI uri = URI.createURI(r.getFullPath().toString());
		Resource emfRes = rs.getResource(uri, true);
		return emfRes;
	}

}
