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
