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
package org.eclipselabs.emf.scaffolding.session.util;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil.Copier;
import org.eclipselabs.emf.scaffolding.runtime.status.ScaffoldingStatus;
import org.eclipselabs.emf.scaffolding.runtime.status.ScaffoldingStatusAdapterFactory;

/**
 * Creates a copy of a model with all scaffolded elements removed.
 * 
 * @author cvidal
 *
 */
public class ScaffoldingStatusPruneCopier extends Copier {

	@Override
	public EObject copy(EObject model) {
		ScaffoldingStatus adapt = ScaffoldingStatusAdapterFactory.adapt(model);
		EObject copy = null;
		if (adapt == null || !adapt.isScaffolded()) {
			copy = super.copy(model);
		}
		return copy;
	}

	@Override
    public <T> Collection<T> copyAll(Collection<? extends T> eObjects)
    {
      Collection<T> result = new ArrayList<T>(eObjects.size());
      for (Object object : eObjects)
      {
        @SuppressWarnings("unchecked") T t = (T)copy((EObject)object);
        if(t!=null) {
            result.add(t);
        }
      }
      return result;
    }

}
