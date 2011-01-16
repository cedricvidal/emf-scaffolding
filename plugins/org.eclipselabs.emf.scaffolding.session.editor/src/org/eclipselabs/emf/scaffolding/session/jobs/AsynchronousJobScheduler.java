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
package org.eclipselabs.emf.scaffolding.session.jobs;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.jobs.Job;

public class AsynchronousJobScheduler implements IJobScheduler {
	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipselabs.emf.scaffolding.session.emfscaffoldingsession.presentation
	 * .IJobScheduler#schedule(org.eclipse.core.runtime.jobs.Job)
	 */
	@Override
	public void schedule(final JobDelegate jobDelegate) {
		new Job(jobDelegate.getName()) {

			@Override
			protected IStatus run(IProgressMonitor monitor) {
				return jobDelegate.run(monitor);
			}

		}.schedule();
	}
}
