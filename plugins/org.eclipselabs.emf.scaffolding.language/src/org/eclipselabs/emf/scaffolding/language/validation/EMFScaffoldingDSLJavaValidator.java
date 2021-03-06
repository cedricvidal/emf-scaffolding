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

import static org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.EmfscaffoldingdslPackage.Literals.WHEN_BLOCK;
import static org.eclipselabs.emf.scaffolding.language.util.ESLIterators.ancestors;
import static org.eclipselabs.emf.scaffolding.language.util.ESLPredicates.isInstanceOf;

import org.eclipse.xtext.validation.Check;
import org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.CreateClass;
import org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.EmfscaffoldingdslPackage;

import com.google.common.collect.Iterators;


public class EMFScaffoldingDSLJavaValidator extends
		AbstractEMFScaffoldingDSLJavaValidator {

	@Check
	public void createClassCannotBeUsedInWhenBlock(CreateClass e) {
		boolean isInWhenBlock = Iterators.filter(ancestors(e), isInstanceOf(WHEN_BLOCK)).hasNext();
		if (isInWhenBlock) {
			error("Keyword 'new' cannot be used in when block", e, EmfscaffoldingdslPackage.CREATE_CLASS);
		}
	}

	//	@Check
//	public void checkParamBindingExpressionHasExactlyOneFeatureRefLiteral(
//			Param param) {
//		Expression exp = param.getProperty();
//		if (exp != null) {
//			int size = Iterators.size(Iterators.filter(
//					Iterators.concat(Collections.singleton(exp).iterator(),
//							exp.eAllContents()), FeatureRefLiteral.class));
//			if (size != 1) {
//				error("Binding param expression must contain exactly one feature reference. It contains "
//						+ size, EmfscaffoldingdslPackage.PARAM__PROPERTY);
//			}
//			;
//		}
//	}
}
