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
package org.eclipselabs.emf.scaffolding.language.ui.contentassist;

import static org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.EmfscaffoldingdslPackage.Literals.WHEN_BLOCK;
import static org.eclipselabs.emf.scaffolding.language.util.ESLIterators.ancestors;
import static org.eclipselabs.emf.scaffolding.language.util.ESLPredicates.isInstanceOf;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ui.editor.contentassist.ContentAssistContext;
import org.eclipse.xtext.ui.editor.contentassist.ICompletionProposalAcceptor;

import com.google.common.collect.Iterators;

/**
 * see http://www.eclipse.org/Xtext/documentation/latest/xtext.html#contentAssist on how to customize content assistant
 */
public class EMFScaffoldingDSLProposalProvider extends AbstractEMFScaffoldingDSLProposalProvider {

	private static final String KEYWORD_NEW = "new";

	@Override
	public void completeKeyword(Keyword keyword,
			ContentAssistContext contentAssistContext,
			ICompletionProposalAcceptor acceptor) {
		if (KEYWORD_NEW.equals(keyword.getValue())) {
			boolean isInWhenBlock = Iterators.filter(ancestors(contentAssistContext.getCurrentModel()), isInstanceOf(WHEN_BLOCK)).hasNext();
			if (isInWhenBlock) {
				return;
			}
		}
		super.completeKeyword(keyword, contentAssistContext, acceptor);
	}

	@Override
	protected String getDisplayString(EObject element, String qualifiedName,
			String shortName) {
		if (element instanceof EPackage) {
			EPackage pkg = (EPackage) element;
			return pkg.getName() + " - " + pkg.getNsURI();
		}
		if (element instanceof EStructuralFeature) {
			EStructuralFeature feat = (EStructuralFeature) element;
			return feat.getName() + " : " + getLabelProvider().getText(feat.getEType());
		}
		return super.getDisplayString(element, qualifiedName, shortName);
	}

}
