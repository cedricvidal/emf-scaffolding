/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipselabs.emf.scaffolding.tests.soa;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipselabs.emf.scaffolding.tests.soa.Attribute#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipselabs.emf.scaffolding.tests.soa.SoaPackage#getAttribute()
 * @model
 * @generated
 */
public interface Attribute extends HasName {
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
	 * @see org.eclipselabs.emf.scaffolding.tests.soa.SoaPackage#getAttribute_Type()
	 * @model
	 * @generated
	 */
	Type getType();

	/**
	 * Sets the value of the '{@link org.eclipselabs.emf.scaffolding.tests.soa.Attribute#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(Type value);

} // Attribute
