package org.eclipselabs.emf.scaffolding.tests.util;

import java.io.PrintStream;

import org.eclipse.emf.compare.match.metamodel.MatchModel;
import org.eclipse.emf.compare.match.metamodel.UnmatchElement;
import org.eclipse.emf.compare.match.metamodel.util.MatchSwitch;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

public class MatchReport {

	private PrintStream out;

	public MatchReport(PrintStream out) {
		super();
		this.out = out;
	}

	public void display(EObject match) {
		new MatchSwitch<Void>() {
			@Override
			public Void caseMatchModel(MatchModel e) {
				for (UnmatchElement u : e.getUnmatchedElements()) {
					display(u);
				}
				return null;
			}

			@Override
			public Void caseUnmatchElement(UnmatchElement e) {
				out.println("Missing element " + typedName(e.getElement())
						+ " from " + e.getSide());
				return null;
			}
		}.doSwitch(match);
	}

	protected String typedName(EObject element) {
		return element.eClass().getName() + " '" + name(element) + "'";
	}

	protected String name(EObject element) {
		EStructuralFeature feature = element.eClass().getEStructuralFeature(
				"name");
		if (feature == null) {
			feature = element.eClass().getEStructuralFeatures().get(0);
		}
		if (feature != null) {
			return element.eGet(feature).toString();
		}
		return null;
	}

}
