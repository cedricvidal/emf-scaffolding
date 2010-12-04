/**
 * <copyright>
 * </copyright>
 *

 */
package org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Selector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.Selector#getSymbol <em>Symbol</em>}</li>
 *   <li>{@link org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.Selector#getSegment <em>Segment</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.EmfscaffoldingdslPackage#getSelector()
 * @model
 * @generated
 */
public interface Selector extends Expression
{
  /**
   * Returns the value of the '<em><b>Symbol</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Symbol</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Symbol</em>' containment reference.
   * @see #setSymbol(SymbolRef)
   * @see org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.EmfscaffoldingdslPackage#getSelector_Symbol()
   * @model containment="true"
   * @generated
   */
  SymbolRef getSymbol();

  /**
   * Sets the value of the '{@link org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.Selector#getSymbol <em>Symbol</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Symbol</em>' containment reference.
   * @see #getSymbol()
   * @generated
   */
  void setSymbol(SymbolRef value);

  /**
   * Returns the value of the '<em><b>Segment</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Segment</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Segment</em>' containment reference.
   * @see #setSegment(SelectorSegment)
   * @see org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.EmfscaffoldingdslPackage#getSelector_Segment()
   * @model containment="true"
   * @generated
   */
  SelectorSegment getSegment();

  /**
   * Sets the value of the '{@link org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.Selector#getSegment <em>Segment</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Segment</em>' containment reference.
   * @see #getSegment()
   * @generated
   */
  void setSegment(SelectorSegment value);

} // Selector
