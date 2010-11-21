package org.eclipselabs.emf.scaffolding.tests.soa.builder;

import org.eclipselabs.emf.scaffolding.tests.soa.Element;

public abstract class ElementBuilder extends org.eclipselabs.emf.scaffolding.tests.soa.builder.HasNameBuilder
{

	public ElementBuilder withName(java.lang.String value) {
		end().setName(value);
		return this;
	}

	public ElementBuilder withNamespace(NamespaceBuilder builder) {
		end().setNamespace(builder.end());
		return this;
	}

	public Element end() {
		return (Element) current;
	}

}
