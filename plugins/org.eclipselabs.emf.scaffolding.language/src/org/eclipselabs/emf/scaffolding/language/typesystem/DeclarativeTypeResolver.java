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
package org.eclipselabs.emf.scaffolding.language.typesystem;

import java.util.Collections;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.xtext.util.PolymorphicDispatcher;
import org.eclipse.xtext.util.PolymorphicDispatcher.ErrorHandler;

/**
 * @author cvidal
 *
 */
public class DeclarativeTypeResolver implements TypeResolver {

	private final PolymorphicDispatcher<EClass> typeDispatcher = new PolymorphicDispatcher<EClass>(
			"type", 1, 1, Collections.singletonList(this),
			new ErrorHandler<EClass>() {
				public EClass handle(Object[] params, Throwable e) {
					throw new RuntimeException(e);
				}
			});

	@Override
	public EClass getType(Object element) {
		EClass type = typeDispatcher.invoke(element);
		if (type != null) {
			return type;
		}
		return null;
	}

}
