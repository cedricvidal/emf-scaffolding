package org.eclipselabs.emf.scaffolding.tests.model1.builder;

import org.eclipse.emf.ecore.EObject;

public abstract class AbstractModel1Builder {

	protected EObject current = create();

	protected abstract EObject create();

	public EObject end() {
		return current;
	}

}
