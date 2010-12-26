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
package org.eclipselabs.emf.scaffolding.session.util;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EPackage.Registry;

public class EmfRegistryClassLoader extends ClassLoader {

	private Registry registry;

	public EmfRegistryClassLoader(ClassLoader parent, Registry registry) {
		super(parent);
		this.registry = registry;
	}

	public Class loadClass(String name) throws ClassNotFoundException {
		Class c = null;
		try {
			c = super.loadClass(name);
		} catch (ClassNotFoundException e) {
		}

		if(c == null) {
			Set<String> keys = new HashSet<String>();
			keys.addAll(registry.keySet());
			for (Iterator i = keys.iterator(); i.hasNext() && c == null;) {
				String key = (String) i.next();
				EPackage pkg = registry.getEPackage(key);
				ClassLoader pkgClassLoader = pkg.getClass().getClassLoader();
				try {
					c = pkgClassLoader.loadClass(name);
					System.out.println("Resolved class " + name + " from EPackage " + key);
				} catch (ClassNotFoundException e) {
				}
			}
		}

		if(c == null) {
			throw new ClassNotFoundException("Could not find class " + name + " in EMF registry");
		}
		return c;
	}

}
