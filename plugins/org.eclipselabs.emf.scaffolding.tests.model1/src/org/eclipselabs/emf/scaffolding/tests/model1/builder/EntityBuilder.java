package org.eclipselabs.emf.scaffolding.tests.model1.builder;

import org.eclipselabs.emf.scaffolding.tests.model1.Entity;

public class EntityBuilder extends org.eclipselabs.emf.scaffolding.tests.model1.builder.ApplicationElementBuilder
{

	public EntityBuilder() {
	}
	
	public EntityBuilder(java.lang.String	name) {
		end().setName(name);
	}

	protected Entity create() {
		return org.eclipselabs.emf.scaffolding.tests.model1.Model1Factory.eINSTANCE.createEntity();
	}

	public EntityBuilder withName(java.lang.String value) {
		end().setName(value);
		return this;
	}

	public EntityBuilder withApplication(ApplicationBuilder builder) {
		end().setApplication(builder.end());
		return this;
	}

	public Entity end() {
		return (Entity) current;
	}

}
