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

import org.eclipse.core.runtime.NullProgressMonitor;

public class SynchronousJobScheduler implements IJobScheduler {
	/* (non-Javadoc)
	 * @see org.eclipselabs.emf.scaffolding.session.emfscaffoldingsession.presentation.IJobScheduler#schedule(org.eclipse.core.runtime.jobs.Job)
	 */
	@Override
	public void schedule(JobDelegate jobDelegate) {
		jobDelegate.run(new NullProgressMonitor());
	}
}
