package org.eclipselabs.emf.scaffolding.tests.soa.builder;

public abstract class SoaBuilders {

	public static EntityBuilder buildEntity() {
		return new EntityBuilder();
	}
	
	public static EntityBuilder buildEntity(java.lang.String	name) {
		return new EntityBuilder(name);
	}


	public static DAOBuilder buildDAO() {
		return new DAOBuilder();
	}
	
	public static DAOBuilder buildDAO(java.lang.String	name) {
		return new DAOBuilder(name);
	}


	public static MethodBuilder buildMethod() {
		return new MethodBuilder();
	}
	
	public static MethodBuilder buildMethod(java.lang.String	name) {
		return new MethodBuilder(name);
	}


	public static PackageBuilder buildPackage() {
		return new PackageBuilder();
	}
	
	public static PackageBuilder buildPackage(java.lang.String	name) {
		return new PackageBuilder(name);
	}


	public static ServiceBuilder buildService() {
		return new ServiceBuilder();
	}
	
	public static ServiceBuilder buildService(java.lang.String	name) {
		return new ServiceBuilder(name);
	}


	public static ComponentBuilder buildComponent() {
		return new ComponentBuilder();
	}
	
	public static ComponentBuilder buildComponent(java.lang.String	name) {
		return new ComponentBuilder(name);
	}


	public static SlotBuilder buildSlot() {
		return new SlotBuilder();
	}
	
	public static SlotBuilder buildSlot(java.lang.String	name) {
		return new SlotBuilder(name);
	}


	public static LinkBuilder buildLink() {
		return new LinkBuilder();
	}
	
	public static LinkBuilder buildLink(java.lang.String	name) {
		return new LinkBuilder(name);
	}


}
