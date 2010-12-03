package org.eclipselabs.emf.scaffolding.demos.businessapp.business.presentation.scaffolding;

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
import org.eclipselabs.emf.scaffolding.demos.businessapp.business.provider.BusinessAppEditPlugin;
import org.eclipselabs.emf.scaffolding.runtime.status.ScaffoldingStatus;
import org.eclipselabs.emf.scaffolding.runtime.status.ScaffoldingStatusAdapterFactory;

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
			ScaffoldingStatus scaffold = ScaffoldingStatusAdapterFactory.adapt(eobject);
			scaffolded = scaffold != null && scaffold.isScaffolded();
		}
		return scaffolded;
	}

	@Override
	public Object getImage(Object object) {
		Object image = super.getImage(object);
		if(isScaffolded(object)) {
			List<Object> images = new ArrayList<Object>(2);
			images.add(image);
			images.add(BusinessAppEditPlugin.INSTANCE.getImage("full/scaffolding/bullet_orange.png"));
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
