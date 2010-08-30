/**
 * <copyright>
 * </copyright>
 *
 */
package org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>When Block</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.WhenBlock#getMatches <em>Matches</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.EmfscaffoldingdslPackage#getWhenBlock()
 * @model
 * @generated
 */
public interface WhenBlock extends EObject
{
  /**
   * Returns the value of the '<em><b>Matches</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.Match}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Matches</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Matches</em>' containment reference list.
   * @see org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.EmfscaffoldingdslPackage#getWhenBlock_Matches()
   * @model containment="true"
   * @generated
   */
  EList<Match> getMatches();

} // WhenBlock
