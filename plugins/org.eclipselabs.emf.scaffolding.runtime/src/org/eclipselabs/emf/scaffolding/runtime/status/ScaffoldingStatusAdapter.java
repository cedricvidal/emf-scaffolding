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

import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.ecore.util.EContentAdapter;


/**
 * Transient scaffolding status
 * 
 * XXX IChangeNotifier: implement interface ?
 */
public abstract class ScaffoldingStatusAdapter extends EContentAdapter implements ScaffoldingStatus {

	protected ScaffoldingStatusAdapterFactory scaffoldAdapterFactory;

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

	public abstract boolean isScaffolded();

	public abstract void setScaffolded(boolean scaffolded);

	@Override
	public boolean isAdapterForType(Object type) {
		return ScaffoldingStatus.class == type;
	}

	/**
	 * Adds adapter to child content. This is a statefull adapter.
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

	/**
	 * We need to keep track of the target, this behavior from
	 * {@link AdapterImpl} is dropped in {@link EContentAdapter}, we need it
	 * back.
	 * 
	 * @see org.eclipse.emf.ecore.util.EContentAdapter#setTarget(org.eclipse.emf.common.notify.Notifier)
	 */
	@Override
	public void setTarget(Notifier target) {
		super.setTarget(target);

		this.target = target;
	}

}
