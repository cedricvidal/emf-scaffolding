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

import java.net.URL;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EPackage.Registry;

public class EmfRegistryClassLoader extends ClassLoader {

	private Registry registry;

	public EmfRegistryClassLoader(ClassLoader parent, Registry registry) {
		super(parent);
		this.registry = registry;
	}

	@Override
	public URL getResource(String name) {
		URL url = null;

		if (url == null) {
			url = super.getResource(name);
		}

		if (url == null) {
			EPackage pkg = findEPackage(packageNameFromPath(name));
			if (pkg != null) {
				url = pkg.getClass().getClassLoader().getResource(name);
//				if(url != null) {
//					System.out.println("Found resource " + name + " from EPackage "
//							+ pkg);
//				}
			}
		}

		return url;
	}

	@Override
	protected synchronized Class<?> loadClass(String name, boolean resolve)
			throws ClassNotFoundException {
        Class< ? > c = null;

        if(c == null) {
        	try {
        		c = super.loadClass(name, resolve);
        	} catch (ClassNotFoundException e) {
        	}
        }
        
		if(c == null) {
			EPackage pkg = findEPackage(packageNameFromFqn(name));
			if(pkg != null) {
				try {
					c = pkg.getClass().getClassLoader().loadClass(name);
//					System.out.println("Resolved class " + name + " from EPackage "
//							+ pkg);
				} catch (ClassNotFoundException e) {
				}
			}
		}

		if(c == null) {
			throw new ClassNotFoundException("Could not find class " + name + " in EMF registry");
		}

        if ( resolve ) {
            resolveClass( c );
        }

		return c;
	}

	private Map<String, EPackage> packageMapping = null;

	protected synchronized Map<String, EPackage> getPackageMapping() {
		if(packageMapping == null) {
			HashMap<String, EPackage> map = new HashMap<String, EPackage>();
			Set<String> keys = new HashSet<String>();
			keys.addAll(registry.keySet());
			for (Iterator i = keys.iterator(); i.hasNext();) {
				String key = (String) i.next();
				EPackage pkg = registry.getEPackage(key);
				Class<? extends EPackage> pkgImplClass = pkg.getClass();
				Class<? extends EPackage> pkgInterClass = findEPackageInterface(pkgImplClass);
				String pkgFqn = null;
				if(pkgInterClass != null) {
					pkgFqn = packageNameFromFqn(pkgInterClass.getName());
				}
				if(pkgFqn != null) {
					map.put(pkgFqn, pkg);
				}
				String pkgImplFqn = packageNameFromFqn(pkgImplClass.getName());
				if(pkgImplFqn != null) {
					map.put(pkgImplFqn, pkg);
				}
			}
			packageMapping = map;
		}
		return packageMapping;
	}

	private EPackage findEPackage(String pkgFqn) {
		if (pkgFqn == null) {
			return null;
		}

		Map<String, EPackage> map = getPackageMapping();
		EPackage pkg = map.get(pkgFqn);
		if (pkg == null) {
			return null;
		}
		return pkg;
	}

	private Class<? extends EPackage> findEPackageInterface(
			Class<? extends EPackage> pkgImplClass) {
		Class<? extends EPackage> pkgInterClass = null;
		for (int j = 0; j < pkgImplClass.getInterfaces().length && pkgInterClass == null; j++) {
			Class<?> inter = pkgImplClass.getInterfaces()[j];
			if (EPackage.class.isAssignableFrom(inter)) {
				pkgInterClass = (Class<? extends EPackage>) inter;
			}
		}
		return pkgInterClass;
	}

	protected String packageNameFromFqn(String classFqn) {
		return packageName(classFqn);
	}

	private String packageName(String classFqn) {
		char sep = '.';
		String fqn = classFqn;
		String pkgFqn = null;
		String className = null;
		int idx = classFqn.lastIndexOf(sep);
		while(pkgFqn == null && idx > 0) {
			className = fqn.substring(idx + 1);
			fqn = fqn.substring(0, idx);
			String first = className.substring(0, 1);
			if(first.toLowerCase().equals(first)) {
				pkgFqn = fqn  + sep + className;
			}
			idx = fqn.lastIndexOf(sep);
		}
		return pkgFqn;
	}

	protected String packageNameFromPath(String path) {
		if(path.endsWith(".class")) {
			path = path.substring(0, path.length() - 6);
		}
		String fqn = path.replace('/', '.');
		String pkgFqn = packageName(fqn);
		return pkgFqn;
	}

}
