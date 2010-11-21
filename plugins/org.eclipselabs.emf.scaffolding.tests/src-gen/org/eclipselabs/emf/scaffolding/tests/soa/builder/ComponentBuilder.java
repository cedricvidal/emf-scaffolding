package org.eclipselabs.emf.scaffolding.tests.soa.builder;

import org.eclipselabs.emf.scaffolding.tests.soa.Component;

public class ComponentBuilder extends org.eclipselabs.emf.scaffolding.tests.soa.builder.NamespaceBuilder
{

	public ComponentBuilder() {
	}
	
	public ComponentBuilder(java.lang.String	name) {
		end().setName(name);
	}

	protected Component create() {
		return org.eclipselabs.emf.scaffolding.tests.soa.SoaFactory.eINSTANCE.createComponent();
	}

	public ComponentBuilder withName(java.lang.String value) {
		end().setName(value);
		return this;
	}

	public ComponentBuilder withNamespace(NamespaceBuilder builder) {
		end().setNamespace(builder.end());
		return this;
	}

	public ComponentBuilder addElements(ElementBuilder builder) {
		end().getElements().add(builder.end());
		return this;
	}

	public ComponentBuilder addInputs(SlotBuilder builder) {
		end().getInputs().add(builder.end());
		return this;
	}

	public ComponentBuilder addOutputs(SlotBuilder builder) {
		end().getOutputs().add(builder.end());
		return this;
	}

	public Component end() {
		return (Component) current;
	}

}
