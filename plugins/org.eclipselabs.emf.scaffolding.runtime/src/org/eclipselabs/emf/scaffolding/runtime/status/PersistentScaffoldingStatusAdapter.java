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

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipselabs.emf.scaffolding.runtime.status.scaffoldingStatusCache.ScaffoldingStatusCache;


/**
 * Persistent scaffolding status
 */
public class PersistentScaffoldingStatusAdapter extends ScaffoldingStatusAdapter {

	private ScaffoldingStatusCache cache;

	public PersistentScaffoldingStatusAdapter(ScaffoldingStatusAdapterFactory scaffoldAdapterFactory, ScaffoldingStatusCache cache) {
		super(scaffoldAdapterFactory);
		this.cache = cache;
	}

	public boolean isScaffolded() {
		boolean value = cache.getElements().contains(getTargetElement());
		return value;
	}

	public void setScaffolded(boolean scaffolded) {
		doSetScaffolded(scaffolded);
	}

	protected void doSetScaffolded(boolean scaffolded) {
		boolean oldValue = isScaffolded();
		EObject targetObject = getTargetElement();
		if(scaffolded) {
			cache.getElements().add(targetObject);
		} else {
			cache.getElements().remove(targetObject);
		}
		if(oldValue != scaffolded) {
			this.scaffoldAdapterFactory
					.eNotify(new ScaffoldingStatusChangedNotification(
							targetObject, Notification.SET, oldValue,
							scaffolded));
		}
	}

	protected EObject getTargetElement() {
		return (EObject)getTarget();
	}

	@Override
	protected void setTarget(EObject target) {
		super.setTarget(target);

		// When attaching the adapter to the target element, if target element
		// is currently being scaffolded and the target element is not stored as
		// scaffolded in the store then mark it as scaffolded
		if(ScaffoldingContext.isScaffolding() && !isScaffolded()) {
			doSetScaffolded(true);
		}

	}

}
