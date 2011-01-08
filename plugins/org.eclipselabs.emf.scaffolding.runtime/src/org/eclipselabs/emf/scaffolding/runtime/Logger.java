/*******************************************************************************
 * Copyright (c) 2010 Contributors - see below
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Cedric Vidal - initial API and implementation
 *
 *******************************************************************************/
package org.eclipselabs.emf.scaffolding.runtime;

import java.util.concurrent.atomic.AtomicReference;

public class Logger {

	public interface ILogger {
		public void log(Object message);
	}

	static class DefaultLogger implements ILogger {

		@Override
		public void log(Object message) {
			System.out.println(message);
		}
		
	}

	private static AtomicReference<ILogger> instance = new AtomicReference<Logger.ILogger>(new DefaultLogger());

	public static void log(Object message) {
		instance.get().log(message);
	}

	public static synchronized void configureLogger(ILogger logger) {
		if(logger == null) {
			throw new IllegalArgumentException("Logger cannot be null");
		}
		instance.set(logger);
	}

}
