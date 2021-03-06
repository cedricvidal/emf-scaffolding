/**
 * <copyright>
 * </copyright>
 *

 */
package org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.EmfscaffoldingdslPackage;
import org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.Scaffold;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Scaffold</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.impl.ScaffoldImpl#getRefPackage <em>Ref Package</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ScaffoldImpl extends MinimalEObjectImpl.Container implements Scaffold
{
  /**
   * The cached value of the '{@link #getRefPackage() <em>Ref Package</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRefPackage()
   * @generated
   * @ordered
   */
  protected EPackage refPackage;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ScaffoldImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return EmfscaffoldingdslPackage.Literals.SCAFFOLD;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EPackage getRefPackage()
  {
    if (refPackage != null && refPackage.eIsProxy())
    {
      InternalEObject oldRefPackage = (InternalEObject)refPackage;
      refPackage = (EPackage)eResolveProxy(oldRefPackage);
      if (refPackage != oldRefPackage)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, EmfscaffoldingdslPackage.SCAFFOLD__REF_PACKAGE, oldRefPackage, refPackage));
      }
    }
    return refPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EPackage basicGetRefPackage()
  {
    return refPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRefPackage(EPackage newRefPackage)
  {
    EPackage oldRefPackage = refPackage;
    refPackage = newRefPackage;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EmfscaffoldingdslPackage.SCAFFOLD__REF_PACKAGE, oldRefPackage, refPackage));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case EmfscaffoldingdslPackage.SCAFFOLD__REF_PACKAGE:
        if (resolve) return getRefPackage();
        return basicGetRefPackage();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case EmfscaffoldingdslPackage.SCAFFOLD__REF_PACKAGE:
        setRefPackage((EPackage)newValue);
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
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case EmfscaffoldingdslPackage.SCAFFOLD__REF_PACKAGE:
        setRefPackage((EPackage)null);
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
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case EmfscaffoldingdslPackage.SCAFFOLD__REF_PACKAGE:
        return refPackage != null;
    }
    return super.eIsSet(featureID);
  }

} //ScaffoldImpl
