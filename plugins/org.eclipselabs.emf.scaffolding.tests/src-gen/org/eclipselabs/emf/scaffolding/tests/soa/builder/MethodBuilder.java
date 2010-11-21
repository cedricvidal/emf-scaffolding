package org.eclipselabs.emf.scaffolding.tests.soa.builder;

import org.eclipselabs.emf.scaffolding.tests.soa.Method;

public class MethodBuilder extends org.eclipselabs.emf.scaffolding.tests.soa.builder.HasNameBuilder
{

	public MethodBuilder() {
	}
	
	public MethodBuilder(java.lang.String	name) {
		end().setName(name);
	}

	protected Method create() {
		return org.eclipselabs.emf.scaffolding.tests.soa.SoaFactory.eINSTANCE.createMethod();
	}

	public MethodBuilder withName(java.lang.String value) {
		end().setName(value);
		return this;
	}

	public Method end() {
		return (Method) current;
	}

}
