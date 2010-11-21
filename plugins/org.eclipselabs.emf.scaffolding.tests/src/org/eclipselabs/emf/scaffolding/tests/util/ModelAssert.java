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
package org.eclipselabs.emf.scaffolding.tests.util;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.compare.diff.metamodel.AttributeChange;
import org.eclipse.emf.compare.diff.metamodel.DiffElement;
import org.eclipse.emf.compare.diff.metamodel.DiffModel;
import org.eclipse.emf.compare.diff.metamodel.ModelElementChangeRightTarget;
import org.eclipse.emf.compare.diff.metamodel.util.DiffSwitch;
import org.eclipse.emf.compare.match.metamodel.MatchModel;
import org.eclipse.emf.compare.match.service.MatchService;
import org.eclipse.emf.ecore.EObject;

public class ModelAssert {

	public static void assertMatch(EObject expected, EObject pkg)
			throws InterruptedException, AssertionError {
		Map options = new HashMap();
		MatchModel match = MatchService.doContentMatch(pkg, expected, options);
//		DiffModel diff = DiffService.doDiff(match);

		//System.out.println("MatchModel :\n"); //$NON-NLS-1$
		// System.out.println(ModelUtils.serialize(match));
		//System.out.println("DiffModel :\n"); //$NON-NLS-1$
		// System.out.println(ModelUtils.serialize(diff));

		// displayMatch(match, System.out);
		// displayDiff(diff, System.out);

		if (match.getUnmatchedElements().size() != 0) {
			throw new AssertionError(matchMessage(match));
		}
	}

	protected static String matchMessage(MatchModel match) {
		ByteArrayOutputStream out = new ByteArrayOutputStream();
		new MatchReport(new PrintStream(out)).display(match);
		return out.toString();
	}

	protected static void displayDiff(EObject diff, final PrintStream out) {
		new DiffSwitch<Void>() {
			public Void caseDiffModel(DiffModel e) {
				for (DiffElement diffElement : e.getDifferences()) {
					displayDiff(diffElement, out);
				}
				return null;
			};

			public Void caseAttributeChange(AttributeChange e) {
				out.println(e.getAttribute());
				return null;
			};

			@Override
			public Void caseModelElementChangeRightTarget(
					ModelElementChangeRightTarget e) {
				out.println(e.getKind() + " " + e.getRightElement() + " to "
						+ e.getLeftParent());
				return null;
			}
		}.doSwitch(diff);
	}


}
