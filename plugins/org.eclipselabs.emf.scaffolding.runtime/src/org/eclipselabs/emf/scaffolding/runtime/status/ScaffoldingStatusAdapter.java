package org.eclipselabs.emf.scaffolding.runtime.status;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EContentAdapter;


/**
 * XXX IChangeNotifier: implement interface ?
 */
public class ScaffoldingStatusAdapter extends EContentAdapter implements ScaffoldingStatus {

	private ScaffoldingStatusAdapterFactory scaffoldAdapterFactory;

	public ScaffoldingStatusAdapterFactory getScaffoldAdapterFactory() {
		return scaffoldAdapterFactory;
	}

	public void setScaffoldAdapterFactory(
			ScaffoldingStatusAdapterFactory scaffoldAdapterFactory) {
		this.scaffoldAdapterFactory = scaffoldAdapterFactory;
	}

	public ScaffoldingStatusAdapter(ScaffoldingStatusAdapterFactory scaffoldAdapterFactory) {
		super();
		this.scaffoldAdapterFactory = scaffoldAdapterFactory;
	}

	public ScaffoldingStatusAdapter(ScaffoldingStatusAdapterFactory scaffoldAdapterFactory, boolean scaffolded) {
		this(scaffoldAdapterFactory);
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

	@Override
	public boolean isAdapterForType(Object type) {
		return ScaffoldingStatus.class == type;
	}

	/**
	 * Adds adapter to child content
	 * 
	 * @see org.eclipse.emf.ecore.util.EContentAdapter#addAdapter(org.eclipse.emf.common.notify.Notifier)
	 */
	@Override
	protected void addAdapter(Notifier notifier) {
		ScaffoldingStatusAdapter scaffold = (ScaffoldingStatusAdapter) scaffoldAdapterFactory
				.adapt(notifier);
	}

	/**
	 * Removal containment notification. Notifier is a containee and is removed from this.
	 * @see org.eclipse.emf.ecore.util.EContentAdapter#removeAdapter(org.eclipse.emf.common.notify.Notifier)
	 */
	@Override
	protected void removeAdapter(Notifier notifier) {
		// As this adapter has one instance per notifier, we can't rely on super
		// implementation
		scaffoldAdapterFactory.unadapt(notifier);
	}

}
