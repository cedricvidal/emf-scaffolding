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

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;

public class ScaffoldingStatusAdapterFactory extends NotifierAdapterFactory {

//	public static final ScaffoldAdapterFactory INSTANCE = new ScaffoldAdapterFactory();

	@Override
	protected ScaffoldingStatusAdapter createAdapter(Notifier target) {
		boolean scaffolding = ScaffoldingContext.isScaffolding();
		ScaffoldingStatusAdapter scaffoldAdapter = new ScaffoldingStatusAdapter(this, scaffolding);
		return scaffoldAdapter;
	}

	@Override
	public boolean isFactoryForType(Object type) {
		return ScaffoldingStatus.class == type;
	}

	public ScaffoldingStatus adapt(Object object) {
		return (ScaffoldingStatus) adapt(object, ScaffoldingStatus.class);
	}

	public static ScaffoldingStatus getScaffoldingStatus(Object object) {
		if (object instanceof EObject) {
			EObject eobject = (EObject) object;
			return adapt(eobject);
		}
		throw new IllegalArgumentException("Cannot adapt non eobject " + object + " to " + ScaffoldingStatus.class);
	}

	public static boolean isScaffolded(EObject object) {
		ScaffoldingStatus scaffold = (ScaffoldingStatus) EcoreUtil.getExistingAdapter(object, ScaffoldingStatus.class);
		boolean isScaffolded = scaffold != null && scaffold.isScaffolded();
		return isScaffolded;
	}

	public static ScaffoldingStatus adapt(EObject object) {
		return (ScaffoldingStatus) EcoreUtil.getRegisteredAdapter(object, ScaffoldingStatus.class);
	}

	/**
	 * Only associate the adapter if the notifier doesn't already have a ScaffoldAdapter
	 * @see org.eclipse.emf.common.notify.impl.AdapterFactoryImpl#associate(org.eclipse.emf.common.notify.Adapter, org.eclipse.emf.common.notify.Notifier)
	 */
	@Override
	protected void associate(Adapter adapter, Notifier target) {
		if (EcoreUtil.getExistingAdapter(target, ScaffoldingStatus.class) == null) {
			super.associate(adapter, target);
		}
	}

	public void unadapt(Notifier notifier) {
		Adapter containeeAdapter = EcoreUtil.getExistingAdapter(notifier, ScaffoldingStatus.class);
		notifier.eAdapters().remove(containeeAdapter);
	}

}
