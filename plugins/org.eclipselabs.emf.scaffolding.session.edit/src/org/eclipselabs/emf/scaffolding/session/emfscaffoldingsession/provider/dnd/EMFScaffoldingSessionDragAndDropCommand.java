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
package org.eclipselabs.emf.scaffolding.session.emfscaffoldingsession.provider.dnd;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.core.resources.IResource;
import org.eclipse.emf.common.command.IdentityCommand;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.command.DragAndDropCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipselabs.emf.scaffolding.session.emfscaffoldingsession.EMFScaffoldingSessionFactory;
import org.eclipselabs.emf.scaffolding.session.emfscaffoldingsession.EMFScaffoldingSessionPackage;
import org.eclipselabs.emf.scaffolding.session.emfscaffoldingsession.Input;
import org.eclipselabs.emf.scaffolding.session.emfscaffoldingsession.ScaffoldingSession;
import org.eclipselabs.emf.scaffolding.session.emfscaffoldingsession.provider.util.EMFScaffoldingSessionEditUtil;

public class EMFScaffoldingSessionDragAndDropCommand extends DragAndDropCommand {

	public EMFScaffoldingSessionDragAndDropCommand(EditingDomain domain,
			Object owner, float location, int operations, int operation,
			Collection<?> collection) {
		super(domain, owner, location, operations, operation, collection);
	}

	public EMFScaffoldingSessionDragAndDropCommand(EditingDomain domain,
			Object owner, float location, int operations, int operation,
			Collection<?> collection, boolean optimize) {
		super(domain, owner, location, operations, operation, collection, optimize);
	}

	@Override
	protected boolean prepareDropLinkOn() {
		super.prepareDropLinkOn();

		if(!dropCommand.canExecute() && owner instanceof ScaffoldingSession) {
			dragCommand.dispose();
			dragCommand = IdentityCommand.INSTANCE;

		    List<Input> inputs = new ArrayList<Input>();
			for (Object object : collection) {
				if (object instanceof IResource) {
					IResource iresource = (IResource) object;
					Input input = EMFScaffoldingSessionFactory.eINSTANCE.createInput();
					Resource resource = EMFScaffoldingSessionEditUtil.resource(iresource, ((EObject)owner).eResource().getResourceSet());
					EObject element = resource.getContents().get(0);
					input.setModel(element);
					inputs.add(input);
				}
			}

			dropCommand.dispose();
			dropCommand = AddCommand.create(domain, owner, EMFScaffoldingSessionPackage.Literals.SCAFFOLDING_SESSION__INPUTS, inputs);

		}

	    boolean result = dropCommand.canExecute();
	    return result;
	}

}
