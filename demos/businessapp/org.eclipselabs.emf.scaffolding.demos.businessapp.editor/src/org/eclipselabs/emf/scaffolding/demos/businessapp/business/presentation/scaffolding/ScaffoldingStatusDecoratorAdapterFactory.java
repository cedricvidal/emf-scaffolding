package org.eclipselabs.emf.scaffolding.demos.businessapp.business.presentation.scaffolding;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.edit.provider.DecoratorAdapterFactory;
import org.eclipse.emf.edit.provider.IItemColorProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemProviderDecorator;
import org.eclipse.swt.widgets.Display;

public abstract class ScaffoldingStatusDecoratorAdapterFactory extends DecoratorAdapterFactory {

	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	public ScaffoldingStatusDecoratorAdapterFactory(
			AdapterFactory decoratedAdapterFactory) {
		super(decoratedAdapterFactory);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemColorProvider.class);
	}

	@Override
	protected IItemProviderDecorator createItemProviderDecorator(Object target,
			Object Type) {
		return new ScaffoldingStatusItemProviderDecorator(this);
	}

	public abstract Display getDisplay();

	@Override
	public boolean isFactoryForType(Object type) {

		// Supports same non type objects as decorated factory plus supportedTypes
		if (!(type instanceof Class)) {
			return super.isFactoryForType(type);
		}
		return supportedTypes.contains(type);
	}

}
