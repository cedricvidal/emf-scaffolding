/*******************************************************************************
 * Copyright (c) 2010 Contributors - see below
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Cedric Vidal - initial API and implementation
 *
 *******************************************************************************/
package org.eclipselabs.emf.scaffolding.session.util;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.change.ChangeDescription;
import org.eclipse.emf.ecore.change.util.ChangeRecorder;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipselabs.emf.scaffolding.runtime.ScaffoldingExecutionEnvironment;
import org.eclipselabs.emf.scaffolding.runtime.internal.engine.FactPublisher;
import org.eclipselabs.emf.scaffolding.runtime.status.ScaffoldingStatusAdapterFactory;

/**
 * Removes scaffolded elements from a model and records them in a
 * {@link ChangeDescription}. Calling the {@link ChangeDescription#apply()}
 * method will insert back scaffolded elements into the model.
 * 
 * Makes sure the {@link FactPublisher} is not registered when calling this
 * method as it might break everything.
 * 
 * @author cvidal
 * 
 */
public class ScaffoldingStatusPruner {

	/**
	 * @param model
	 *            the model to remove scaffolded elements from
	 * @return the scaffolded elements as a {@link ChangeDescription} relative
	 *         to the model
	 */
	public ChangeDescription prune(EObject model) {

		FactPublisher factPublisher = ScaffoldingExecutionEnvironment
				.getFactPublisher(model);
		if (factPublisher != null && factPublisher.isImmediateFire()) {
			throw new IllegalStateException(
					"FactPublisher immediateFire cannot be activated while pruning scaffolded elements");
		}

		ChangeRecorder changeRecorder = new ChangeRecorder(model);
		for (TreeIterator<EObject> i = EcoreUtil.getAllContents(model, true); i
				.hasNext();) {
			EObject element = (EObject) i.next();
			if (ScaffoldingStatusAdapterFactory.isScaffolded(element)) {

				// skip child elements
				i.prune();

				// remove current element
				EcoreUtil.remove(element);
			}
		}
		;
		ChangeDescription endRecording = changeRecorder.endRecording();
		return endRecording;
	}

}
