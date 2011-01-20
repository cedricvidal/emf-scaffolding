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
package org.eclipselabs.emf.scaffolding.runtime.internal.engine;

import org.drools.runtime.StatefulKnowledgeSession;
import org.drools.runtime.rule.FactHandle;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.util.EContentAdapter;
import org.eclipselabs.emf.scaffolding.runtime.ScaffoldingExecutionEnvironment;
import org.eclipselabs.emf.scaffolding.runtime.status.ScaffoldingContext;
import org.eclipselabs.emf.scaffolding.runtime.status.ScaffoldingStatus;
import org.eclipselabs.emf.scaffolding.runtime.status.ScaffoldingStatusAdapterFactory;
import org.eclipselabs.emf.scaffolding.runtime.status.ScaffoldingStatusChangedNotification;
import org.eclipselabs.emf.scaffolding.runtime.takeover.TakeoverNotification;

public class FactPublisher extends EContentAdapter {

	private StatefulKnowledgeSession statefulKnowledgeSession;

	public void setStatefulKnowledgeSession(StatefulKnowledgeSession statefulKnowledgeSession) {
		this.statefulKnowledgeSession = statefulKnowledgeSession;
		// use EMF transaction to fire rule
	}

	public FactPublisher() {
		super();
	}

	private boolean immediateFire = true;
	private ScaffoldingExecutionEnvironment scaffoldingExecutionEnvironment;

	public boolean isImmediateFire() {
		return immediateFire;
	}

	public void setImmediateFire(boolean immediateFire) {
		this.immediateFire = immediateFire;
	}

	@Override
	public void notifyChanged(Notification notification) {

		Object notifier = notification.getNotifier();

		// If the user modifies a scaffolded element, he takes ownership
		if(!ScaffoldingContext.isScaffolding()) {
			if(isValueChange(notification)) {
				if (notification.getNewValue() != null && notification.getNewValue() instanceof EObject) {
					Object referenced = notification.getNewValue();
					takeover((EObject) referenced);
				}
				takeover((EObject) notifier);
			}
		}

		super.notifyChanged(notification);

		if(isValueChange(notification)) {
			insertOrUpdate(notifier);

			// Avoid nested firing
			if (immediateFire) {
				if (!ScaffoldingContext.isScaffolding()) {
					ScaffoldingContext.inScaffoldingSession(new Runnable() {
						@Override
						public void run() {
							statefulKnowledgeSession.fireAllRules();
						}
					});
				} else {
					System.out.println("Already firing rules");
				}
			}
		}
	}

	protected boolean isValueChange(Notification notification) {
		int t = notification.getEventType();
		return t == Notification.ADD
			|| t == Notification.ADD_MANY
			|| t == Notification.SET
			|| t == Notification.UNSET
			|| t == Notification.REMOVE
			|| t == Notification.REMOVE_MANY
			|| t == Notification.MOVE
			;
	}

	private void takeover(EObject notifier) {
		ScaffoldingStatus status = ScaffoldingStatusAdapterFactory.getScaffoldingStatus(notifier);
		if (status != null && status.isScaffolded()) {
			System.out.println("Taking over " + notifier);
			status.setScaffolded(false);

			if(scaffoldingExecutionEnvironment != null) {
				scaffoldingExecutionEnvironment.eNotify(new TakeoverNotification(
						notifier));
			}

		}
	}

	private void insertOrUpdate(Object object) {
		FactHandle factHandle = statefulKnowledgeSession.getFactHandle(object);
		if (factHandle == null) {
//			if(!ScaffoldingContext.isScaffolding()) {
				statefulKnowledgeSession.insert(object);
//			}
		} else {
			statefulKnowledgeSession.update(factHandle, object);
		}
	}

	/**
	 * When an eobject is configured with this adapter, it should be inserted into working memory
	 * 
	 * @see org.eclipse.emf.ecore.util.EContentAdapter#setTarget(org.eclipse.emf.ecore.EObject)
	 */
	@Override
	protected void setTarget(EObject target) {
		super.setTarget(target);
		insertOrUpdate(target);
	}

	/**
	 * Important for <code>EcoreUtil.getExistingAdapter(object, FactPublisher.class)</code> to work
	 * 
	 * @see org.eclipse.emf.common.notify.impl.AdapterImpl#isAdapterForType(java.lang.Object)
	 */
	@Override
	public boolean isAdapterForType(Object type) {
		return FactPublisher.class == type;
	}

	@Override
	protected void unsetTarget(EObject target) {
		FactHandle factHandle = statefulKnowledgeSession.getFactHandle(target);
		if (factHandle != null) {
			statefulKnowledgeSession.retract(factHandle);
		}
	}

	public void setScaffoldingExecutionEnvironment(
			ScaffoldingExecutionEnvironment scaffoldingExecutionEnvironment) {
		this.scaffoldingExecutionEnvironment = scaffoldingExecutionEnvironment;
	}

}
