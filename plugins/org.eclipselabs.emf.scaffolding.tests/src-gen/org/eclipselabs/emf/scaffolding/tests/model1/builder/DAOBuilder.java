package org.eclipselabs.emf.scaffolding.tests.model1.builder;

import org.eclipselabs.emf.scaffolding.tests.model1.DAO;

public class DAOBuilder extends org.eclipselabs.emf.scaffolding.tests.model1.builder.ApplicationElementBuilder
{

	public DAOBuilder() {
	}
	
	public DAOBuilder(java.lang.String	name) {
		end().setName(name);
	}

	protected DAO create() {
		return org.eclipselabs.emf.scaffolding.tests.model1.Model1Factory.eINSTANCE.createDAO();
	}

	public DAOBuilder withName(java.lang.String value) {
		end().setName(value);
		return this;
	}

	public DAOBuilder withApplication(ApplicationBuilder builder) {
		end().setApplication(builder.end());
		return this;
	}

	public DAOBuilder addMethods(MethodBuilder builder) {
		end().getMethods().add(builder.end());
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
