package org.eclipselabs.emf.scaffolding.tests.soa.builder;

import org.eclipselabs.emf.scaffolding.tests.soa.DAO;

public class DAOBuilder extends org.eclipselabs.emf.scaffolding.tests.soa.builder.ComponentBuilder
{

	public DAOBuilder() {
	}
	
	public DAOBuilder(java.lang.String	name) {
		end().setName(name);
	}

	protected DAO create() {
		return org.eclipselabs.emf.scaffolding.tests.soa.SoaFactory.eINSTANCE.createDAO();
	}

	public DAOBuilder withName(java.lang.String value) {
		end().setName(value);
		return this;
	}

	public DAOBuilder withNamespace(NamespaceBuilder builder) {
		end().setNamespace(builder.end());
		return this;
	}

	public DAOBuilder addElements(ElementBuilder builder) {
		end().getElements().add(builder.end());
		return this;
	}

	public DAOBuilder addInputs(SlotBuilder builder) {
		end().getInputs().add(builder.end());
		return this;
	}

	public DAOBuilder addOutputs(SlotBuilder builder) {
		end().getOutputs().add(builder.end());
		return this;
	}

	public DAOBuilder withEntity(EntityBuilder builder) {
		end().setEntity(builder.end());
		return this;
	}

	public DAO end() {
		return (DAO) current;
	}

}
