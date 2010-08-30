/**
 * <copyright>
 * </copyright>
 *
 */
package org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.EmfscaffoldingdslPackage;
import org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.Scaffold;
import org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.Scaffolding;
import org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.ScaffoldingElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Scaffolding</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.impl.ScaffoldingImpl#getScaffold <em>Scaffold</em>}</li>
 *   <li>{@link org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.impl.ScaffoldingImpl#getElements <em>Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ScaffoldingImpl extends MinimalEObjectImpl.Container implements Scaffolding
{
  /**
   * The cached value of the '{@link #getScaffold() <em>Scaffold</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getScaffold()
   * @generated
   * @ordered
   */
  protected Scaffold scaffold;

  /**
   * The cached value of the '{@link #getElements() <em>Elements</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getElements()
   * @generated
   * @ordered
   */
  protected EList<ScaffoldingElement> elements;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ScaffoldingImpl()
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
    return EmfscaffoldingdslPackage.Literals.SCAFFOLDING;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Scaffold getScaffold()
  {
    return scaffold;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetScaffold(Scaffold newScaffold, NotificationChain msgs)
  {
    Scaffold oldScaffold = scaffold;
    scaffold = newScaffold;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EmfscaffoldingdslPackage.SCAFFOLDING__SCAFFOLD, oldScaffold, newScaffold);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setScaffold(Scaffold newScaffold)
  {
    if (newScaffold != scaffold)
    {
      NotificationChain msgs = null;
      if (scaffold != null)
        msgs = ((InternalEObject)scaffold).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EmfscaffoldingdslPackage.SCAFFOLDING__SCAFFOLD, null, msgs);
      if (newScaffold != null)
        msgs = ((InternalEObject)newScaffold).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EmfscaffoldingdslPackage.SCAFFOLDING__SCAFFOLD, null, msgs);
      msgs = basicSetScaffold(newScaffold, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EmfscaffoldingdslPackage.SCAFFOLDING__SCAFFOLD, newScaffold, newScaffold));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ScaffoldingElement> getElements()
  {
    if (elements == null)
    {
      elements = new EObjectContainmentEList<ScaffoldingElement>(ScaffoldingElement.class, this, EmfscaffoldingdslPackage.SCAFFOLDING__ELEMENTS);
    }
    return elements;
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
      case EmfscaffoldingdslPackage.SCAFFOLDING__SCAFFOLD:
        return basicSetScaffold(null, msgs);
      case EmfscaffoldingdslPackage.SCAFFOLDING__ELEMENTS:
        return ((InternalEList<?>)getElements()).basicRemove(otherEnd, msgs);
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
      case EmfscaffoldingdslPackage.SCAFFOLDING__SCAFFOLD:
        return getScaffold();
      case EmfscaffoldingdslPackage.SCAFFOLDING__ELEMENTS:
        return getElements();
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
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case EmfscaffoldingdslPackage.SCAFFOLDING__SCAFFOLD:
        setScaffold((Scaffold)newValue);
        return;
      case EmfscaffoldingdslPackage.SCAFFOLDING__ELEMENTS:
        getElements().clear();
        getElements().addAll((Collection<? extends ScaffoldingElement>)newValue);
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
      case EmfscaffoldingdslPackage.SCAFFOLDING__SCAFFOLD:
        setScaffold((Scaffold)null);
        return;
      case EmfscaffoldingdslPackage.SCAFFOLDING__ELEMENTS:
        getElements().clear();
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
      case EmfscaffoldingdslPackage.SCAFFOLDING__SCAFFOLD:
        return scaffold != null;
      case EmfscaffoldingdslPackage.SCAFFOLDING__ELEMENTS:
        return elements != null && !elements.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ScaffoldingImpl
