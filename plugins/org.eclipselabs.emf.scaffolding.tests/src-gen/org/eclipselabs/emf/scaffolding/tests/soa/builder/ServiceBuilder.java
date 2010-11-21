package org.eclipselabs.emf.scaffolding.tests.soa.builder;

import org.eclipselabs.emf.scaffolding.tests.soa.Service;

public class ServiceBuilder extends org.eclipselabs.emf.scaffolding.tests.soa.builder.ElementBuilder
{

	public ServiceBuilder() {
	}
	
	public ServiceBuilder(java.lang.String	name) {
		end().setName(name);
	}

	protected Service create() {
		return org.eclipselabs.emf.scaffolding.tests.soa.SoaFactory.eINSTANCE.createService();
	}

	public ServiceBuilder withName(java.lang.String value) {
		end().setName(value);
		return this;
	}

	public ServiceBuilder withNamespace(NamespaceBuilder builder) {
		end().setNamespace(builder.end());
		return this;
	}

	public ServiceBuilder addMethods(MethodBuilder builder) {
		end().getMethods().add(builder.end());
		return this;
	}

	public Service end() {
		return (Service) current;
	}

}
