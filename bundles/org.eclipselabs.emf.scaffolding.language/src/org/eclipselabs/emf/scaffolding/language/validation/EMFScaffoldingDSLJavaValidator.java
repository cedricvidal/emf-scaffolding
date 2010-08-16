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
package org.eclipselabs.emf.scaffolding.language.validation;

import java.util.Collections;

import org.eclipse.xtext.validation.Check;
import org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.BindingExpression;
import org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.EmfscaffoldingdslPackage;
import org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.FeatureRefLiteral;
import org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.Param;

import com.google.common.collect.Iterators;

public class EMFScaffoldingDSLJavaValidator extends
		AbstractEMFScaffoldingDSLJavaValidator {

	// @Check
	// public void checkGreetingStartsWithCapital(Greeting greeting) {
	// if (!Character.isUpperCase(greeting.getName().charAt(0))) {
	// warning("Name should start with a capital", MyDslPackage.GREETING__NAME);
	// }
	// }

	@Check
	public void checkParamBindingExpressionHasExactlyOneFeatureRefLiteral(
			Param param) {
		BindingExpression exp = param.getProperty();
		if (exp != null) {
			int size = Iterators.size(Iterators.filter(Iterators.concat(
					Collections.singleton(exp).iterator(), exp.eAllContents()),
					FeatureRefLiteral.class));
			if (size != 1) {
				error(
						"Binding param expression must contain exactly one feature reference. It contains "
								+ size,
						EmfscaffoldingdslPackage.PARAM__PROPERTY);
			}
			;
		}
	}
}
