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

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import org.eclipse.core.resources.IResource;
import org.eclipse.emf.ecore.resource.Resource.Factory;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.ui.dnd.EditingDomainViewerDropAdapter;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.ui.ide.ResourceUtil;
import org.eclipse.ui.part.ResourceTransfer;

public class EMFScaffoldingSessionEditingDomainViewerDropAdapter extends
		EditingDomainViewerDropAdapter {

	public EMFScaffoldingSessionEditingDomainViewerDropAdapter(
			EditingDomain domain, Viewer viewer) {
		super(domain, viewer);
	}

	@Override
	protected Collection<?> extractDragSource(Object object) {
		List<IResource> res = new ArrayList<IResource>();
		if(object instanceof IResource[]) {
			for (IResource iResource : (IResource[])object) {
				res.add(iResource);
			}
			return res;
		}

		return super.extractDragSource(object);
	}
}
