/*******************************************************************************
 * Copyright (c) 2010 Contributors - see below
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Cedric Vidal - initial API and implementation
 *     Jerome Benois - Rewrite compiler and runtime based on new Drools Knowledge API
 *******************************************************************************/
package org.eclipselabs.emf.scaffolding.runtime.status;

public class ScaffoldingContext {

	private static ThreadLocal<Boolean> threadLocal = new ThreadLocal<Boolean>();

	public static boolean isScaffolding() {
		Boolean scaffolding = threadLocal.get();
		return scaffolding == null ? false : scaffolding;
	}

	public static void stop() {
		threadLocal.remove();
	}

	public static void start() {
		threadLocal.set(true);
	}

	public static void inScaffoldingSession(Runnable runnable) {
		boolean wasScaffolding = ScaffoldingContext.isScaffolding();
		try {
			ScaffoldingContext.start();
			runnable.run();
		} finally {
			if (!wasScaffolding) {
				ScaffoldingContext.stop();
			}
		}
	}
}
