/**
 * <copyright>
 * </copyright>
 *

 */
package org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.EmfscaffoldingdslPackage;
import org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.SelectorSegment;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Selector Segment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.impl.SelectorSegmentImpl#getAttributeRef <em>Attribute Ref</em>}</li>
 *   <li>{@link org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.impl.SelectorSegmentImpl#getNext <em>Next</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SelectorSegmentImpl extends MinimalEObjectImpl.Container implements SelectorSegment
{
  /**
   * The cached value of the '{@link #getAttributeRef() <em>Attribute Ref</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAttributeRef()
   * @generated
   * @ordered
   */
  protected EStructuralFeature attributeRef;

  /**
   * The cached value of the '{@link #getNext() <em>Next</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNext()
   * @generated
   * @ordered
   */
  protected SelectorSegment next;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SelectorSegmentImpl()
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
    return EmfscaffoldingdslPackage.Literals.SELECTOR_SEGMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EStructuralFeature getAttributeRef()
  {
    if (attributeRef != null && attributeRef.eIsProxy())
    {
      InternalEObject oldAttributeRef = (InternalEObject)attributeRef;
      attributeRef = (EStructuralFeature)eResolveProxy(oldAttributeRef);
      if (attributeRef != oldAttributeRef)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, EmfscaffoldingdslPackage.SELECTOR_SEGMENT__ATTRIBUTE_REF, oldAttributeRef, attributeRef));
      }
    }
    return attributeRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EStructuralFeature basicGetAttributeRef()
  {
    return attributeRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAttributeRef(EStructuralFeature newAttributeRef)
  {
    EStructuralFeature oldAttributeRef = attributeRef;
    attributeRef = newAttributeRef;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EmfscaffoldingdslPackage.SELECTOR_SEGMENT__ATTRIBUTE_REF, oldAttributeRef, attributeRef));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SelectorSegment getNext()
  {
    return next;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetNext(SelectorSegment newNext, NotificationChain msgs)
  {
    SelectorSegment oldNext = next;
    next = newNext;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EmfscaffoldingdslPackage.SELECTOR_SEGMENT__NEXT, oldNext, newNext);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNext(SelectorSegment newNext)
  {
    if (newNext != next)
    {
      NotificationChain msgs = null;
      if (next != null)
        msgs = ((InternalEObject)next).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EmfscaffoldingdslPackage.SELECTOR_SEGMENT__NEXT, null, msgs);
      if (newNext != null)
        msgs = ((InternalEObject)newNext).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EmfscaffoldingdslPackage.SELECTOR_SEGMENT__NEXT, null, msgs);
      msgs = basicSetNext(newNext, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EmfscaffoldingdslPackage.SELECTOR_SEGMENT__NEXT, newNext, newNext));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case EmfscaffoldingdslPackage.SELECTOR_SEGMENT__NEXT:
        return basicSetNext(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case EmfscaffoldingdslPackage.SELECTOR_SEGMENT__ATTRIBUTE_REF:
        if (resolve) return getAttributeRef();
        return basicGetAttributeRef();
      case EmfscaffoldingdslPackage.SELECTOR_SEGMENT__NEXT:
        return getNext();
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
      case EmfscaffoldingdslPackage.SELECTOR_SEGMENT__ATTRIBUTE_REF:
        setAttributeRef((EStructuralFeature)newValue);
        return;
      case EmfscaffoldingdslPackage.SELECTOR_SEGMENT__NEXT:
        setNext((SelectorSegment)newValue);
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
      case EmfscaffoldingdslPackage.SELECTOR_SEGMENT__ATTRIBUTE_REF:
        setAttributeRef((EStructuralFeature)null);
        return;
      case EmfscaffoldingdslPackage.SELECTOR_SEGMENT__NEXT:
        setNext((SelectorSegment)null);
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
      case EmfscaffoldingdslPackage.SELECTOR_SEGMENT__ATTRIBUTE_REF:
        return attributeRef != null;
      case EmfscaffoldingdslPackage.SELECTOR_SEGMENT__NEXT:
        return next != null;
    }
    return super.eIsSet(featureID);
  }

} //SelectorSegmentImpl
