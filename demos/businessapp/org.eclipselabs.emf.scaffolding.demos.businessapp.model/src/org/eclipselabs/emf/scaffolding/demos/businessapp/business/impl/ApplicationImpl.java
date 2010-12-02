/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipselabs.emf.scaffolding.demos.businessapp.business.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipselabs.emf.scaffolding.demos.businessapp.business.Application;
import org.eclipselabs.emf.scaffolding.demos.businessapp.business.BusinessPackage;
import org.eclipselabs.emf.scaffolding.demos.businessapp.business.Element;
import org.eclipselabs.emf.scaffolding.demos.businessapp.business.PrimitiveType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Application</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipselabs.emf.scaffolding.demos.businessapp.business.impl.ApplicationImpl#getElement <em>Element</em>}</li>
 *   <li>{@link org.eclipselabs.emf.scaffolding.demos.businessapp.business.impl.ApplicationImpl#getDefaultIdentifierType <em>Default Identifier Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ApplicationImpl extends EObjectImpl implements Application {
	/**
	 * The cached value of the '{@link #getElement() <em>Element</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElement()
	 * @generated
	 * @ordered
	 */
	protected EList<Element> element;

	/**
	 * The cached value of the '{@link #getDefaultIdentifierType() <em>Default Identifier Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultIdentifierType()
	 * @generated
	 * @ordered
	 */
	protected PrimitiveType defaultIdentifierType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ApplicationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BusinessPackage.Literals.APPLICATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Element> getElement() {
		if (element == null) {
			element = new EObjectContainmentWithInverseEList<Element>(Element.class, this, BusinessPackage.APPLICATION__ELEMENT, BusinessPackage.ELEMENT__APPLICATION);
		}
		return element;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrimitiveType getDefaultIdentifierType() {
		if (defaultIdentifierType != null && defaultIdentifierType.eIsProxy()) {
			InternalEObject oldDefaultIdentifierType = (InternalEObject)defaultIdentifierType;
			defaultIdentifierType = (PrimitiveType)eResolveProxy(oldDefaultIdentifierType);
			if (defaultIdentifierType != oldDefaultIdentifierType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BusinessPackage.APPLICATION__DEFAULT_IDENTIFIER_TYPE, oldDefaultIdentifierType, defaultIdentifierType));
			}
		}
		return defaultIdentifierType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrimitiveType basicGetDefaultIdentifierType() {
		return defaultIdentifierType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultIdentifierType(PrimitiveType newDefaultIdentifierType) {
		PrimitiveType oldDefaultIdentifierType = defaultIdentifierType;
		defaultIdentifierType = newDefaultIdentifierType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BusinessPackage.APPLICATION__DEFAULT_IDENTIFIER_TYPE, oldDefaultIdentifierType, defaultIdentifierType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BusinessPackage.APPLICATION__ELEMENT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getElement()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BusinessPackage.APPLICATION__ELEMENT:
				return ((InternalEList<?>)getElement()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BusinessPackage.APPLICATION__ELEMENT:
				return getElement();
			case BusinessPackage.APPLICATION__DEFAULT_IDENTIFIER_TYPE:
				if (resolve) return getDefaultIdentifierType();
				return basicGetDefaultIdentifierType();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case BusinessPackage.APPLICATION__ELEMENT:
				getElement().clear();
				getElement().addAll((Collection<? extends Element>)newValue);
				return;
			case BusinessPackage.APPLICATION__DEFAULT_IDENTIFIER_TYPE:
				setDefaultIdentifierType((PrimitiveType)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case BusinessPackage.APPLICATION__ELEMENT:
				getElement().clear();
				return;
			case BusinessPackage.APPLICATION__DEFAULT_IDENTIFIER_TYPE:
				setDefaultIdentifierType((PrimitiveType)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case BusinessPackage.APPLICATION__ELEMENT:
				return element != null && !element.isEmpty();
			case BusinessPackage.APPLICATION__DEFAULT_IDENTIFIER_TYPE:
				return defaultIdentifierType != null;
		}
		return super.eIsSet(featureID);
	}

} //ApplicationImpl
