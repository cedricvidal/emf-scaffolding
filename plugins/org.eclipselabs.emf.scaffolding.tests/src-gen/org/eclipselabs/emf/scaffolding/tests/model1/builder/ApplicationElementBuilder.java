package org.eclipselabs.emf.scaffolding.tests.model1.builder;

import org.eclipselabs.emf.scaffolding.tests.model1.ApplicationElement;

public abstract class ApplicationElementBuilder extends AbstractModel1Builder
{


	public ApplicationElementBuilder withApplication(ApplicationBuilder builder) {
		end().setApplication(builder.end());
		return this;
	}

	public ApplicationElement end() {
		return (ApplicationElement) current;
	}

}
