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

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.FeatureRef;
import org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.Match;
import org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.Selector;
import org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.SymbolRef;
import org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.Variable;

/**
 * @author cvidal
 *
 */
public class ESLTypeResolver extends DeclarativeTypeResolver {

	EClass type(Selector e) {
		return getType(e.getSymbol());
	}

	EClass type(SymbolRef e) {
		return getType(e.getRef());
	}

	EClass type(FeatureRef e) {
		return getType(e.getFeature());
	}

	EClass type(EStructuralFeature e) {
		EClassifier classifier = e.getEType();
		if (classifier instanceof EClass) {
			return (EClass) classifier;
		}
		return null;
	}

	EClass type(Variable e) {
		return getType(e.eContainer());
	}

	EClass type(Match e) {
		return e.getType();
	}

}
