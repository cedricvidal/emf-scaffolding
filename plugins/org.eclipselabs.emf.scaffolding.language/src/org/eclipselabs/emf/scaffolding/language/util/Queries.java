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

public class Queries {

	public static Iterable<EObject> ancestors(final EObject object) {
		return new Iterable<EObject>() {

			@Override
			public Iterator<EObject> iterator() {
				return new ContainerIterator(object);
			}
		};
	}

	public static class ContainerIterator implements Iterator<EObject> {

		private EObject object;

		public ContainerIterator(EObject object) {
			super();
			this.object = object;
		}

		@Override
		public boolean hasNext() {
			return object.eContainer() != null;
		}

		@Override
		public EObject next() {
			object = object.eContainer();
			return object;
		}

		@Override
		public void remove() {
			throw new UnsupportedOperationException();
		}

	}
}
