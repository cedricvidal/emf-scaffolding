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


/**
 * Transient scaffolding status
 */
public class TransientScaffoldingStatusAdapter extends ScaffoldingStatusAdapter {

	public TransientScaffoldingStatusAdapter(ScaffoldingStatusAdapterFactory scaffoldAdapterFactory) {
		super(scaffoldAdapterFactory);
	}

	public TransientScaffoldingStatusAdapter(ScaffoldingStatusAdapterFactory scaffoldAdapterFactory, boolean scaffolded) {
		super(scaffoldAdapterFactory);
		this.scaffolded = scaffolded;
	}

	private boolean scaffolded;

	public boolean isScaffolded() {
		return scaffolded;
	}

	public void setScaffolded(boolean scaffolded) {
		boolean oldValue = this.scaffolded;
		this.scaffolded = scaffolded;
		EObject targetObject = (EObject) getTarget();
		if(oldValue != scaffolded) {
			this.scaffoldAdapterFactory
					.eNotify(new ScaffoldingStatusChangedNotification(
							targetObject, Notification.SET, oldValue,
							scaffolded));
		}
	}

}
