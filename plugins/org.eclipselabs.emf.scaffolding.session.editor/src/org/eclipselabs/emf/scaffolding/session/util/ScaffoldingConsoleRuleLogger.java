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
package org.eclipselabs.emf.scaffolding.session.util;

import org.eclipse.ui.console.MessageConsoleStream;
import org.eclipselabs.emf.scaffolding.runtime.Logger.ILogger;

public class ScaffoldingConsoleRuleLogger implements ILogger {
	private MessageConsoleStream ouput = null;

	public ScaffoldingConsoleRuleLogger(MessageConsoleStream ouput) {
		super();
		this.ouput = ouput;
	}

	@Override
	public void log(Object message) {
		if(message != null) {
			ouput.println(message.toString());
		}
	}

}
