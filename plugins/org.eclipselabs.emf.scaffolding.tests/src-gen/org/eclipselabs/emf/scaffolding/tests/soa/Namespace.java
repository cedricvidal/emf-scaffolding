/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipselabs.emf.scaffolding.tests.soa;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Namespace</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipselabs.emf.scaffolding.tests.soa.Namespace#getElements <em>Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipselabs.emf.scaffolding.tests.soa.SoaPackage#getNamespace()
 * @model abstract="true"
 * @generated
 */
public interface Namespace extends Element {
	/**
	 * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipselabs.emf.scaffolding.tests.soa.Element}.
	 * It is bidirectional and its opposite is '{@link org.eclipselabs.emf.scaffolding.tests.soa.Element#getNamespace <em>Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Elements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements</em>' containment reference list.
	 * @see org.eclipselabs.emf.scaffolding.tests.soa.SoaPackage#getNamespace_Elements()
	 * @see org.eclipselabs.emf.scaffolding.tests.soa.Element#getNamespace
	 * @model opposite="namespace" containment="true"
	 * @generated
	 */
	EList<Element> getElements();

} // Namespace
