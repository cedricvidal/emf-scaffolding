package org.eclipselabs.emf.scaffolding.demos.businessapp.scaffolding;

import java.io.InputStream;

public class BusinessScaffolding {
	public static InputStream getRules() {
		return BusinessScaffolding.class.getResourceAsStream("crud.drl");
	}
}
