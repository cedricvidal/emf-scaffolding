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
package org.eclipselabs.emf.scaffolding.session.util;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.provider.ComposedImage;
import org.eclipse.emf.edit.provider.IItemColorProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.ItemProviderDecorator;
import org.eclipse.swt.SWT;
import org.eclipselabs.emf.scaffolding.runtime.status.ScaffoldingStatus;
import org.eclipselabs.emf.scaffolding.runtime.status.ScaffoldingStatusAdapterFactory;
import org.eclipselabs.emf.scaffolding.session.emfscaffoldingsession.presentation.ScaffoldingSessionEditorPlugin;

public class ScaffoldingStatusItemProviderDecorator extends ItemProviderDecorator implements Adapter, IItemLabelProvider, IItemColorProvider {

	public ScaffoldingStatusItemProviderDecorator(ScaffoldingStatusDecoratorAdapterFactory scaffoldDecoratorAdapterFactory) {
		super(scaffoldDecoratorAdapterFactory);
	}

	@Override
	public ScaffoldingStatusDecoratorAdapterFactory getAdapterFactory() {
		return (ScaffoldingStatusDecoratorAdapterFactory) super.getAdapterFactory();
	}

	@Override
	public Object getForeground(Object object) {
		Object color = super.getForeground(object);
		if(isScaffolded(object)) {
			color = getAdapterFactory().getDisplay().getSystemColor(SWT.COLOR_DARK_GRAY);
		}
		return color;
	}

	protected boolean isScaffolded(Object object) {
		boolean scaffolded = false;
		if (object instanceof EObject) {
			EObject eobject = (EObject) object;
			scaffolded = ScaffoldingStatusAdapterFactory.isScaffolded(eobject);
		}
		return scaffolded;
	}

	@Override
	public Object getImage(Object object) {
		Object image = super.getImage(object);
		if(isScaffolded(object)) {
			List<Object> images = new ArrayList<Object>(2);
			images.add(image);
			images.add(ScaffoldingSessionEditorPlugin.INSTANCE.getImage("full/scaffolding/bullet_orange.png"));
			image = new ComposedImage(images);
		}
		return image;
	}

	@Override
	public Notifier getTarget() {
	    return ((Adapter)decoratedItemProvider).getTarget();
	}

	@Override
	public void setTarget(Notifier newTarget) {
	    ((Adapter)decoratedItemProvider).setTarget(newTarget);
	}

}
