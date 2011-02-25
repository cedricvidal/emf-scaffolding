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
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipselabs.emf.scaffolding.runtime.status.ScaffoldingStatusAdapterFactory;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class EMFScaffoldingSessionListenerTest {

	EMFScaffoldingSessionListener emfScaffoldingSessionListener;

	@Mock ScaffoldingStatusAdapterFactory scaffoldingStatusAdapterFactory = null;
	@Mock AdapterFactoryEditingDomain editingDomain = null;

	@Before
	public void setup() {
		emfScaffoldingSessionListener = new EMFScaffoldingSessionListener(editingDomain, scaffoldingStatusAdapterFactory);
	}

	@Test
	public void fileWithDrlExtensionMapsToDrlResourceType() {
		assertEquals(ResourceType.DRL, emfScaffoldingSessionListener.getResourceType("test.drl"));
	}

	@Test
	public void fileWithDrfExtensionMapsToDrfResourceType() {
		assertEquals(ResourceType.DRF, emfScaffoldingSessionListener.getResourceType("test.rf"));
	}

	@Test
	public void fileWithXcsExtensionMapsToChangesetResourceType() {
		assertEquals(ResourceType.CHANGE_SET, emfScaffoldingSessionListener.getResourceType("test.xcs"));
	}

	@Test
	public void fileWithDummyExtensionMapsToDrlResourceType() {
		assertEquals(ResourceType.DRL, emfScaffoldingSessionListener.getResourceType("test.xxxx"));
	}

	@Test
	public void fileWithNoExtensionMapsToDrlResourceType() {
		assertEquals(ResourceType.DRL, emfScaffoldingSessionListener.getResourceType("test"));
	}

}
