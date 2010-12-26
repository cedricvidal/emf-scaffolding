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
import org.eclipse.emf.common.notify.impl.NotificationImpl;
import org.eclipse.emf.ecore.EObject;

public class ScaffoldingStatusChangedNotification extends NotificationImpl
		implements Notification {

	protected EObject notifier;

	public EObject getNotifier() {
		return notifier;
	}

	public ScaffoldingStatusChangedNotification(EObject notifier,
			int eventType, Object oldValue, Object newValue) {
		super(eventType, oldValue, newValue);
		this.notifier = notifier;
	}

}
