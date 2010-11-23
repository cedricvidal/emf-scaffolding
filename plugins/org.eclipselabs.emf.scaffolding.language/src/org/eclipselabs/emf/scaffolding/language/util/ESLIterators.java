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

import java.util.Iterator;

import org.eclipse.emf.ecore.EObject;

import com.google.common.collect.AbstractIterator;

public class ESLIterators {

	public static Iterator<EObject> ancestors(final EObject object) {
		return new AbstractIterator<EObject>() {
			private EObject current = null;

			@Override
			protected EObject computeNext() {
				if (current == null) {
					current = object;
				} else {
					current = current.eContainer();
				}
				if (current != null) {
					return current;
				}
				return endOfData();
			}
		};
	}

}
