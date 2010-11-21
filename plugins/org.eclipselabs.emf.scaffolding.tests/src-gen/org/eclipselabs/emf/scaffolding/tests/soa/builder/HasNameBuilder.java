package org.eclipselabs.emf.scaffolding.tests.soa.builder;

import org.eclipselabs.emf.scaffolding.tests.soa.HasName;

public abstract class HasNameBuilder extends AbstractSoaBuilder
{

	public HasNameBuilder withName(java.lang.String value) {
		end().setName(value);
		return this;
	}

	public HasName end() {
		return (HasName) current;
	}

}
