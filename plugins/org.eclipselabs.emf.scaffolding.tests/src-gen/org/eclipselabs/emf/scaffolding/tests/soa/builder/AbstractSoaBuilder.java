package org.eclipselabs.emf.scaffolding.tests.soa.builder;

import org.eclipse.emf.ecore.EObject;

public abstract class AbstractSoaBuilder {

	protected EObject current = create();

	protected abstract EObject create();

	public EObject end() {
		return current;
	}

}
