package org.eclipselabs.emf.scaffolding.tests.soa.builder;

import org.eclipselabs.emf.scaffolding.tests.soa.Slot;

public class SlotBuilder extends org.eclipselabs.emf.scaffolding.tests.soa.builder.HasNameBuilder
{

	public SlotBuilder() {
	}
	
	public SlotBuilder(java.lang.String	name) {
		end().setName(name);
	}

	protected Slot create() {
		return org.eclipselabs.emf.scaffolding.tests.soa.SoaFactory.eINSTANCE.createSlot();
	}

	public SlotBuilder withName(java.lang.String value) {
		end().setName(value);
		return this;
	}

	public SlotBuilder withImplements(ServiceBuilder builder) {
		end().setImplements(builder.end());
		return this;
	}

	public Slot end() {
		return (Slot) current;
	}

}
