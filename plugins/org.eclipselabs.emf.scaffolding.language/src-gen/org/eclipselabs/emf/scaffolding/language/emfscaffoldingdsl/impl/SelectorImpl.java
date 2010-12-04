/**
 * <copyright>
 * </copyright>
 *

 */
package org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.EmfscaffoldingdslPackage;
import org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.Selector;
import org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.SelectorSegment;
import org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.SymbolRef;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Selector</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.impl.SelectorImpl#getSymbol <em>Symbol</em>}</li>
 *   <li>{@link org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.impl.SelectorImpl#getSegment <em>Segment</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SelectorImpl extends ExpressionImpl implements Selector
{
  /**
   * The cached value of the '{@link #getSymbol() <em>Symbol</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSymbol()
   * @generated
   * @ordered
   */
  protected SymbolRef symbol;

  /**
   * The cached value of the '{@link #getSegment() <em>Segment</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSegment()
   * @generated
   * @ordered
   */
  protected SelectorSegment segment;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SelectorImpl()
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
    return EmfscaffoldingdslPackage.Literals.SELECTOR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SymbolRef getSymbol()
  {
    return symbol;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSymbol(SymbolRef newSymbol, NotificationChain msgs)
  {
    SymbolRef oldSymbol = symbol;
    symbol = newSymbol;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EmfscaffoldingdslPackage.SELECTOR__SYMBOL, oldSymbol, newSymbol);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSymbol(SymbolRef newSymbol)
  {
    if (newSymbol != symbol)
    {
      NotificationChain msgs = null;
      if (symbol != null)
        msgs = ((InternalEObject)symbol).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EmfscaffoldingdslPackage.SELECTOR__SYMBOL, null, msgs);
      if (newSymbol != null)
        msgs = ((InternalEObject)newSymbol).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EmfscaffoldingdslPackage.SELECTOR__SYMBOL, null, msgs);
      msgs = basicSetSymbol(newSymbol, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EmfscaffoldingdslPackage.SELECTOR__SYMBOL, newSymbol, newSymbol));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SelectorSegment getSegment()
  {
    return segment;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSegment(SelectorSegment newSegment, NotificationChain msgs)
  {
    SelectorSegment oldSegment = segment;
    segment = newSegment;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EmfscaffoldingdslPackage.SELECTOR__SEGMENT, oldSegment, newSegment);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSegment(SelectorSegment newSegment)
  {
    if (newSegment != segment)
    {
      NotificationChain msgs = null;
      if (segment != null)
        msgs = ((InternalEObject)segment).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EmfscaffoldingdslPackage.SELECTOR__SEGMENT, null, msgs);
      if (newSegment != null)
        msgs = ((InternalEObject)newSegment).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EmfscaffoldingdslPackage.SELECTOR__SEGMENT, null, msgs);
      msgs = basicSetSegment(newSegment, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EmfscaffoldingdslPackage.SELECTOR__SEGMENT, newSegment, newSegment));
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
      case EmfscaffoldingdslPackage.SELECTOR__SYMBOL:
        return basicSetSymbol(null, msgs);
      case EmfscaffoldingdslPackage.SELECTOR__SEGMENT:
        return basicSetSegment(null, msgs);
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
      case EmfscaffoldingdslPackage.SELECTOR__SYMBOL:
        return getSymbol();
      case EmfscaffoldingdslPackage.SELECTOR__SEGMENT:
        return getSegment();
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
      case EmfscaffoldingdslPackage.SELECTOR__SYMBOL:
        setSymbol((SymbolRef)newValue);
        return;
      case EmfscaffoldingdslPackage.SELECTOR__SEGMENT:
        setSegment((SelectorSegment)newValue);
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
      case EmfscaffoldingdslPackage.SELECTOR__SYMBOL:
        setSymbol((SymbolRef)null);
        return;
      case EmfscaffoldingdslPackage.SELECTOR__SEGMENT:
        setSegment((SelectorSegment)null);
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
      case EmfscaffoldingdslPackage.SELECTOR__SYMBOL:
        return symbol != null;
      case EmfscaffoldingdslPackage.SELECTOR__SEGMENT:
        return segment != null;
    }
    return super.eIsSet(featureID);
  }

} //SelectorImpl
