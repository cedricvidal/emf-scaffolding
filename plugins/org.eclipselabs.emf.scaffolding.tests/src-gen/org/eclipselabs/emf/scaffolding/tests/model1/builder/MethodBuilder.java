package org.eclipselabs.emf.scaffolding.tests.model1.builder;

import org.eclipselabs.emf.scaffolding.tests.model1.Method;

public class MethodBuilder extends AbstractModel1Builder
{

	public MethodBuilder() {
	}
	
	public MethodBuilder(java.lang.String	name) {
		end().setName(name);
	}

	protected Method create() {
		return org.eclipselabs.emf.scaffolding.tests.model1.Model1Factory.eINSTANCE.createMethod();
	}

	public MethodBuilder withName(java.lang.String value) {
		end().setName(value);
		return this;
	}

	public Method end() {
		return (Method) current;
	}

}
