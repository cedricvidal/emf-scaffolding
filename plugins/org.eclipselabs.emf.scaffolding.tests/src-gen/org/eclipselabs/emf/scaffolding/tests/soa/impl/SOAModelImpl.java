/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipselabs.emf.scaffolding.tests.soa.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipselabs.emf.scaffolding.tests.soa.SOAModel;
import org.eclipselabs.emf.scaffolding.tests.soa.SoaPackage;
import org.eclipselabs.emf.scaffolding.tests.soa.Type;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>SOA Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipselabs.emf.scaffolding.tests.soa.impl.SOAModelImpl#getDefaultIdentifierType <em>Default Identifier Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SOAModelImpl extends NamespaceImpl implements SOAModel {
	/**
	 * The cached value of the '{@link #getDefaultIdentifierType() <em>Default Identifier Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultIdentifierType()
	 * @generated
	 * @ordered
	 */
	protected Type defaultIdentifierType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SOAModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SoaPackage.Literals.SOA_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type getDefaultIdentifierType() {
		if (defaultIdentifierType != null && defaultIdentifierType.eIsProxy()) {
			InternalEObject oldDefaultIdentifierType = (InternalEObject)defaultIdentifierType;
			defaultIdentifierType = (Type)eResolveProxy(oldDefaultIdentifierType);
			if (defaultIdentifierType != oldDefaultIdentifierType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SoaPackage.SOA_MODEL__DEFAULT_IDENTIFIER_TYPE, oldDefaultIdentifierType, defaultIdentifierType));
			}
		}
		return defaultIdentifierType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type basicGetDefaultIdentifierType() {
		return defaultIdentifierType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultIdentifierType(Type newDefaultIdentifierType) {
		Type oldDefaultIdentifierType = defaultIdentifierType;
		defaultIdentifierType = newDefaultIdentifierType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SoaPackage.SOA_MODEL__DEFAULT_IDENTIFIER_TYPE, oldDefaultIdentifierType, defaultIdentifierType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SoaPackage.SOA_MODEL__DEFAULT_IDENTIFIER_TYPE:
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
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SoaPackage.SOA_MODEL__DEFAULT_IDENTIFIER_TYPE:
				setDefaultIdentifierType((Type)newValue);
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
			case SoaPackage.SOA_MODEL__DEFAULT_IDENTIFIER_TYPE:
				setDefaultIdentifierType((Type)null);
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
			case SoaPackage.SOA_MODEL__DEFAULT_IDENTIFIER_TYPE:
				return defaultIdentifierType != null;
		}
		return super.eIsSet(featureID);
	}

} //SOAModelImpl
