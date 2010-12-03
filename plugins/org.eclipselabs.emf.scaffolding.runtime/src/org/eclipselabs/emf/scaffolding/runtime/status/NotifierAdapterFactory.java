package org.eclipselabs.emf.scaffolding.runtime.status;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.common.notify.impl.NotifierImpl;
import org.eclipse.emf.common.util.EList;

public class NotifierAdapterFactory extends AdapterFactoryImpl implements Notifier {

	private Notifier notifier = new NotifierImpl();

	public EList<Adapter> eAdapters() {
		return notifier.eAdapters();
	}

	public boolean eDeliver() {
		return notifier.eDeliver();
	}

	public void eNotify(Notification notification) {
		notifier.eNotify(notification);
	}

	public void eSetDeliver(boolean deliver) {
		notifier.eSetDeliver(deliver);
	}
}
