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
package org.eclipselabs.emf.scaffolding.tests.status.storage;

import org.drools.runtime.StatefulKnowledgeSession;
import org.eclipselabs.emf.scaffolding.runtime.status.storage.ScaffoldingStatusStorageStrategy;
import org.eclipselabs.emf.scaffolding.runtime.status.storage.TransientStrategy;

public class TransientScaffoldingStatusStrategyTest extends
		AbstractScaffoldingStatusStorageTest {

	@Override
	protected ScaffoldingStatusStorageStrategy createScaffoldingStatusStorageStrategy(StatefulKnowledgeSession ksession) {
		return new TransientStrategy();
	}

	@Override
	protected boolean requiresFiringOnLoad() {
		return true;
	}

}
