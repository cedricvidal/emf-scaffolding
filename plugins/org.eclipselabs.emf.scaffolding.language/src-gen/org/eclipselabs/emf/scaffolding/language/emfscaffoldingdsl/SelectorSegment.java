/**
 * <copyright>
 * </copyright>
 *

 */
package org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Selector Segment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.SelectorSegment#getAttributeRef <em>Attribute Ref</em>}</li>
 *   <li>{@link org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.SelectorSegment#getNext <em>Next</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.EmfscaffoldingdslPackage#getSelectorSegment()
 * @model
 * @generated
 */
public interface SelectorSegment extends EObject
{
  /**
   * Returns the value of the '<em><b>Attribute Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Attribute Ref</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Attribute Ref</em>' reference.
   * @see #setAttributeRef(EStructuralFeature)
   * @see org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.EmfscaffoldingdslPackage#getSelectorSegment_AttributeRef()
   * @model
   * @generated
   */
  EStructuralFeature getAttributeRef();

  /**
   * Sets the value of the '{@link org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.SelectorSegment#getAttributeRef <em>Attribute Ref</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Attribute Ref</em>' reference.
   * @see #getAttributeRef()
   * @generated
   */
  void setAttributeRef(EStructuralFeature value);

  /**
   * Returns the value of the '<em><b>Next</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Next</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Next</em>' containment reference.
   * @see #setNext(SelectorSegment)
   * @see org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.EmfscaffoldingdslPackage#getSelectorSegment_Next()
   * @model containment="true"
   * @generated
   */
  SelectorSegment getNext();

  /**
   * Sets the value of the '{@link org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.SelectorSegment#getNext <em>Next</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Next</em>' containment reference.
   * @see #getNext()
   * @generated
   */
  void setNext(SelectorSegment value);

} // SelectorSegment
