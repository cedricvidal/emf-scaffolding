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

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.EmfscaffoldingdslPackage;
import org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.Setter;
import org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.UpdateStatement;
import org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.Variable;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Update Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.impl.UpdateStatementImpl#getVarRef <em>Var Ref</em>}</li>
 *   <li>{@link org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.impl.UpdateStatementImpl#getSetters <em>Setters</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UpdateStatementImpl extends StatementImpl implements UpdateStatement
{
  /**
   * The cached value of the '{@link #getVarRef() <em>Var Ref</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVarRef()
   * @generated
   * @ordered
   */
  protected Variable varRef;

  /**
   * The cached value of the '{@link #getSetters() <em>Setters</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSetters()
   * @generated
   * @ordered
   */
  protected EList<Setter> setters;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected UpdateStatementImpl()
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
    return EmfscaffoldingdslPackage.Literals.UPDATE_STATEMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Variable getVarRef()
  {
    if (varRef != null && varRef.eIsProxy())
    {
      InternalEObject oldVarRef = (InternalEObject)varRef;
      varRef = (Variable)eResolveProxy(oldVarRef);
      if (varRef != oldVarRef)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, EmfscaffoldingdslPackage.UPDATE_STATEMENT__VAR_REF, oldVarRef, varRef));
      }
    }
    return varRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Variable basicGetVarRef()
  {
    return varRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVarRef(Variable newVarRef)
  {
    Variable oldVarRef = varRef;
    varRef = newVarRef;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EmfscaffoldingdslPackage.UPDATE_STATEMENT__VAR_REF, oldVarRef, varRef));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Setter> getSetters()
  {
    if (setters == null)
    {
      setters = new EObjectContainmentEList<Setter>(Setter.class, this, EmfscaffoldingdslPackage.UPDATE_STATEMENT__SETTERS);
    }
    return setters;
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
      case EmfscaffoldingdslPackage.UPDATE_STATEMENT__SETTERS:
        return ((InternalEList<?>)getSetters()).basicRemove(otherEnd, msgs);
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
      case EmfscaffoldingdslPackage.UPDATE_STATEMENT__VAR_REF:
        if (resolve) return getVarRef();
        return basicGetVarRef();
      case EmfscaffoldingdslPackage.UPDATE_STATEMENT__SETTERS:
        return getSetters();
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
      case EmfscaffoldingdslPackage.UPDATE_STATEMENT__VAR_REF:
        setVarRef((Variable)newValue);
        return;
      case EmfscaffoldingdslPackage.UPDATE_STATEMENT__SETTERS:
        getSetters().clear();
        getSetters().addAll((Collection<? extends Setter>)newValue);
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
      case EmfscaffoldingdslPackage.UPDATE_STATEMENT__VAR_REF:
        setVarRef((Variable)null);
        return;
      case EmfscaffoldingdslPackage.UPDATE_STATEMENT__SETTERS:
        getSetters().clear();
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
      case EmfscaffoldingdslPackage.UPDATE_STATEMENT__VAR_REF:
        return varRef != null;
      case EmfscaffoldingdslPackage.UPDATE_STATEMENT__SETTERS:
        return setters != null && !setters.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //UpdateStatementImpl
