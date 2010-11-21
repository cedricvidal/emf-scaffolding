package org.eclipselabs.emf.scaffolding.tests.soa.builder;

import org.eclipselabs.emf.scaffolding.tests.soa.Entity;

public class EntityBuilder extends org.eclipselabs.emf.scaffolding.tests.soa.builder.ElementBuilder
{

	public EntityBuilder() {
	}
	
	public EntityBuilder(java.lang.String	name) {
		end().setName(name);
	}

	protected Entity create() {
		return org.eclipselabs.emf.scaffolding.tests.soa.SoaFactory.eINSTANCE.createEntity();
	}

	public EntityBuilder withName(java.lang.String value) {
		end().setName(value);
		return this;
	}

	public EntityBuilder withNamespace(NamespaceBuilder builder) {
		end().setNamespace(builder.end());
		return this;
	}

	public Entity end() {
		return (Entity) current;
	}

}
