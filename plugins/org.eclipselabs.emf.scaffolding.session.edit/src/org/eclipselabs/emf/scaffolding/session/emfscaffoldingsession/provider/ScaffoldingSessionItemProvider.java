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
package org.eclipselabs.emf.scaffolding.session.emfscaffoldingsession.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.core.resources.IResource;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.command.DragAndDropCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.eclipselabs.emf.scaffolding.runtime.status.scaffoldingStatusCache.ScaffoldingStatusCacheFactory;
import org.eclipse.swt.dnd.DND;
import org.eclipselabs.emf.scaffolding.session.emfscaffoldingsession.EMFScaffoldingSessionFactory;
import org.eclipselabs.emf.scaffolding.session.emfscaffoldingsession.EMFScaffoldingSessionPackage;
import org.eclipselabs.emf.scaffolding.session.emfscaffoldingsession.Input;
import org.eclipselabs.emf.scaffolding.session.emfscaffoldingsession.ScaffoldingSession;
import org.eclipselabs.emf.scaffolding.session.emfscaffoldingsession.provider.dnd.EMFScaffoldingSessionDragAndDropCommand;
import org.eclipselabs.emf.scaffolding.session.emfscaffoldingsession.provider.util.EMFScaffoldingSessionEditUtil;

/**
 * This is the item provider adapter for a {@link org.eclipselabs.emf.scaffolding.session.emfscaffoldingsession.ScaffoldingSession} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ScaffoldingSessionItemProvider
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScaffoldingSessionItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

		}
		return itemPropertyDescriptors;
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(EMFScaffoldingSessionPackage.Literals.SCAFFOLDING_SESSION__SCAFFOLDING_FILE);
			childrenFeatures.add(EMFScaffoldingSessionPackage.Literals.SCAFFOLDING_SESSION__INPUTS);
			childrenFeatures.add(EMFScaffoldingSessionPackage.Literals.SCAFFOLDING_SESSION__TRASH);
			childrenFeatures.add(EMFScaffoldingSessionPackage.Literals.SCAFFOLDING_SESSION__OUTPUTS);
			childrenFeatures.add(EMFScaffoldingSessionPackage.Literals.SCAFFOLDING_SESSION__CACHE);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns ScaffoldingSession.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ScaffoldingSession"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_ScaffoldingSession_type");
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(ScaffoldingSession.class)) {
			case EMFScaffoldingSessionPackage.SCAFFOLDING_SESSION__SCAFFOLDING_FILE:
			case EMFScaffoldingSessionPackage.SCAFFOLDING_SESSION__INPUTS:
			case EMFScaffoldingSessionPackage.SCAFFOLDING_SESSION__TRASH:
			case EMFScaffoldingSessionPackage.SCAFFOLDING_SESSION__OUTPUTS:
			case EMFScaffoldingSessionPackage.SCAFFOLDING_SESSION__CACHE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(EMFScaffoldingSessionPackage.Literals.SCAFFOLDING_SESSION__SCAFFOLDING_FILE,
				 EMFScaffoldingSessionFactory.eINSTANCE.createScaffoldingFile()));

		newChildDescriptors.add
			(createChildParameter
				(EMFScaffoldingSessionPackage.Literals.SCAFFOLDING_SESSION__INPUTS,
				 EMFScaffoldingSessionFactory.eINSTANCE.createInput()));

		newChildDescriptors.add
			(createChildParameter
				(EMFScaffoldingSessionPackage.Literals.SCAFFOLDING_SESSION__TRASH,
				 EMFScaffoldingSessionFactory.eINSTANCE.createTrash()));

		newChildDescriptors.add
			(createChildParameter
				(EMFScaffoldingSessionPackage.Literals.SCAFFOLDING_SESSION__OUTPUTS,
				 EMFScaffoldingSessionFactory.eINSTANCE.createOutput()));

		newChildDescriptors.add
			(createChildParameter
				(EMFScaffoldingSessionPackage.Literals.SCAFFOLDING_SESSION__CACHE,
				 ScaffoldingStatusCacheFactory.eINSTANCE.createScaffoldingStatusCache()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return ScaffoldingSessionEditPlugin.INSTANCE;
	}

	@Override
	protected Command createDragAndDropCommand(EditingDomain domain,
			Object owner, float location, int operations, int operation,
			Collection<?> collection) {
	    return new EMFScaffoldingSessionDragAndDropCommand(domain, owner, location, operations, operation, collection);
	}

}
