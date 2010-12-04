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
 * A representation of the model object '<em><b>Method</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipselabs.emf.scaffolding.tests.soa.Method#getParameters <em>Parameters</em>}</li>
 *   <li>{@link org.eclipselabs.emf.scaffolding.tests.soa.Method#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipselabs.emf.scaffolding.tests.soa.SoaPackage#getMethod()
 * @model
 * @generated
 */
public interface Method extends HasName {

	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipselabs.emf.scaffolding.tests.soa.Parameter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameters</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' containment reference list.
	 * @see org.eclipselabs.emf.scaffolding.tests.soa.SoaPackage#getMethod_Parameters()
	 * @model containment="true"
	 * @generated
	 */
	EList<Parameter> getParameters();

	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(Type)
	 * @see org.eclipselabs.emf.scaffolding.tests.soa.SoaPackage#getMethod_Type()
	 * @model
	 * @generated
	 */
	Type getType();

	/**
	 * Sets the value of the '{@link org.eclipselabs.emf.scaffolding.tests.soa.Method#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(Type value);
} // Method
