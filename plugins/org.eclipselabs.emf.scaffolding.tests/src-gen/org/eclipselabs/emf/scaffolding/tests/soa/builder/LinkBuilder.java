package org.eclipselabs.emf.scaffolding.tests.soa.builder;

import org.eclipselabs.emf.scaffolding.tests.soa.Link;

public class LinkBuilder extends org.eclipselabs.emf.scaffolding.tests.soa.builder.ElementBuilder
{

	public LinkBuilder() {
	}
	
	public LinkBuilder(java.lang.String	name) {
		end().setName(name);
	}

	protected Link create() {
		return org.eclipselabs.emf.scaffolding.tests.soa.SoaFactory.eINSTANCE.createLink();
	}

	public LinkBuilder withName(java.lang.String value) {
		end().setName(value);
		return this;
	}

	public LinkBuilder withNamespace(NamespaceBuilder builder) {
		end().setNamespace(builder.end());
		return this;
	}

	public LinkBuilder withInput(SlotBuilder builder) {
		end().setInput(builder.end());
		return this;
	}

	public LinkBuilder withOutput(SlotBuilder builder) {
		end().setOutput(builder.end());
		return this;
	}

	public Link end() {
		return (Link) current;
	}

}
