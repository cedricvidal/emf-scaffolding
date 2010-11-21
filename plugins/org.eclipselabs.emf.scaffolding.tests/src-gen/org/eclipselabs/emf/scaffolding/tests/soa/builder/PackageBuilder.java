package org.eclipselabs.emf.scaffolding.tests.soa.builder;

import org.eclipselabs.emf.scaffolding.tests.soa.Package;

public class PackageBuilder extends org.eclipselabs.emf.scaffolding.tests.soa.builder.NamespaceBuilder
{

	public PackageBuilder() {
	}
	
	public PackageBuilder(java.lang.String	name) {
		end().setName(name);
	}

	protected Package create() {
		return org.eclipselabs.emf.scaffolding.tests.soa.SoaFactory.eINSTANCE.createPackage();
	}

	public PackageBuilder withName(java.lang.String value) {
		end().setName(value);
		return this;
	}

	public PackageBuilder withNamespace(NamespaceBuilder builder) {
		end().setNamespace(builder.end());
		return this;
	}

	public PackageBuilder addElements(ElementBuilder builder) {
		end().getElements().add(builder.end());
		return this;
	}

	public Package end() {
		return (Package) current;
	}

}
