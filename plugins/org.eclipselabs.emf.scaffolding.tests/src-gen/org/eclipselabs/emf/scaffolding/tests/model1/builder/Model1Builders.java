package org.eclipselabs.emf.scaffolding.tests.model1.builder;

public abstract class Model1Builders {

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


	public static ApplicationBuilder buildApplication() {
		return new ApplicationBuilder();
	}


}
