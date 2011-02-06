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
package org.eclipselabs.emf.scaffolding.session.emfscaffoldingsession.presentation;

import static org.junit.Assert.*;

import org.drools.builder.ResourceType;
import org.junit.Test;

public class EMFScaffoldingSessionListenerTest {

	@Test
	public void fileWithDrlExtensionMapsToDrlResourceType() {
		EMFScaffoldingSessionListener emfScaffoldingSessionListener = new EMFScaffoldingSessionListener(null);
		assertEquals(ResourceType.DRL, emfScaffoldingSessionListener.getResourceType("test.drl"));
	}

	@Test
	public void fileWithDrfExtensionMapsToDrfResourceType() {
		EMFScaffoldingSessionListener emfScaffoldingSessionListener = new EMFScaffoldingSessionListener(null);
		assertEquals(ResourceType.DRF, emfScaffoldingSessionListener.getResourceType("test.rf"));
	}

	@Test
	public void fileWithXcsExtensionMapsToChangesetResourceType() {
		EMFScaffoldingSessionListener emfScaffoldingSessionListener = new EMFScaffoldingSessionListener(null);
		assertEquals(ResourceType.CHANGE_SET, emfScaffoldingSessionListener.getResourceType("test.xcs"));
	}

	@Test
	public void fileWithDummyExtensionMapsToDrlResourceType() {
		EMFScaffoldingSessionListener emfScaffoldingSessionListener = new EMFScaffoldingSessionListener(null);
		assertEquals(ResourceType.DRL, emfScaffoldingSessionListener.getResourceType("test.xxxx"));
	}

	@Test
	public void fileWithNoExtensionMapsToDrlResourceType() {
		EMFScaffoldingSessionListener emfScaffoldingSessionListener = new EMFScaffoldingSessionListener(null);
		assertEquals(ResourceType.DRL, emfScaffoldingSessionListener.getResourceType("test"));
	}

}
