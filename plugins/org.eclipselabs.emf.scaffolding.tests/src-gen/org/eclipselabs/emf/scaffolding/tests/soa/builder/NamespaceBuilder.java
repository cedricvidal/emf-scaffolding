package org.eclipselabs.emf.scaffolding.tests.soa.builder;

import org.eclipselabs.emf.scaffolding.tests.soa.Namespace;

public abstract class NamespaceBuilder extends org.eclipselabs.emf.scaffolding.tests.soa.builder.ElementBuilder
{

	public NamespaceBuilder withName(java.lang.String value) {
		end().setName(value);
		return this;
	}

	public NamespaceBuilder withNamespace(NamespaceBuilder builder) {
		end().setNamespace(builder.end());
		return this;
	}

	public NamespaceBuilder addElements(ElementBuilder builder) {
		end().getElements().add(builder.end());
		return this;
	}

	public Namespace end() {
		return (Namespace) current;
	}

}
