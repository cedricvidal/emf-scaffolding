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
import java.util.Collection;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.edit.provider.DecoratorAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
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

	  /**
	   * All adapter creation is delegated to this method, which yields decorated item providers.
	   * It hooks up the decorators created by {@link #createItemProviderDecorator} 
	   * to the adapters returned by {@link #decoratedAdapterFactory}.
	   */
	  public Object adapt(Object target, Object type)
	  {
	    Object adapter = decoratedAdapterFactory.adapt(target, type);
	    if (adapter instanceof IChangeNotifier && supportedTypes.contains(type))
	    {
	      IItemProviderDecorator itemProviderDecorator = itemProviderDecorators.get(adapter);
	      if (itemProviderDecorator == null)
	      {
	        itemProviderDecorator = createItemProviderDecorator(target, type);
	        itemProviderDecorators.put(adapter, itemProviderDecorator);
	        itemProviderDecorator.setDecoratedItemProvider((IChangeNotifier)adapter);
	      }

	      return itemProviderDecorator;
	    }

	    return adapter;
	  }

}
