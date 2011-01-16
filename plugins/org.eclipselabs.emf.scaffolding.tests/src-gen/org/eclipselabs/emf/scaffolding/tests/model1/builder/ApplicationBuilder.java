package org.eclipselabs.emf.scaffolding.tests.model1.builder;

import org.eclipselabs.emf.scaffolding.tests.model1.Application;

public class ApplicationBuilder extends AbstractModel1Builder
{

	public ApplicationBuilder() {
	}

	protected Application create() {
		return org.eclipselabs.emf.scaffolding.tests.model1.Model1Factory.eINSTANCE.createApplication();
	}


	public ApplicationBuilder addElements(ApplicationElementBuilder builder) {
		end().getElements().add(builder.end());
		return this;
	}

	public Application end() {
		return (Application) current;
	}

}
