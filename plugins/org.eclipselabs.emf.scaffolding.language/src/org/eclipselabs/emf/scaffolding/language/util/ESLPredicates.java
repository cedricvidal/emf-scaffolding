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
package org.eclipselabs.emf.scaffolding.language.util;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import com.google.common.base.Predicate;
import com.google.common.base.Predicates;

public class ESLPredicates {

	public static Predicate<EClass> isSubTypeOf(final EClass type) {
		return (type == null) ? Predicates.<EClass> isNull() : new Predicate<EClass>() {
			public boolean apply(EClass eclass) {
				return type.isSuperTypeOf(eclass);
			}
		};
	}

	public static Predicate<EObject> isInstanceOf(final EClass type) {
		return (type == null) ? Predicates.<EObject> isNull() : new Predicate<EObject>() {
			public boolean apply(EObject eobject) {
				return type.isSuperTypeOf(eobject.eClass());
			}
		};
	}

	public static <T> Predicate<T> isInstanceOf(final Class<?> type) {
		return (type == null) ? Predicates.<T> isNull() : new Predicate<T>() {
			public boolean apply(T object) {
				return type.isInstance(object);
			}
		};
	}

}
