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
