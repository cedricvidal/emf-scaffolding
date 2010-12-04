/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipselabs.emf.scaffolding.tests.soa;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SOA Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipselabs.emf.scaffolding.tests.soa.SOAModel#getDefaultIdentifierType <em>Default Identifier Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipselabs.emf.scaffolding.tests.soa.SoaPackage#getSOAModel()
 * @model
 * @generated
 */
public interface SOAModel extends Namespace {
	/**
	 * Returns the value of the '<em><b>Default Identifier Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Identifier Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Identifier Type</em>' reference.
	 * @see #setDefaultIdentifierType(Type)
	 * @see org.eclipselabs.emf.scaffolding.tests.soa.SoaPackage#getSOAModel_DefaultIdentifierType()
	 * @model
	 * @generated
	 */
	Type getDefaultIdentifierType();

	/**
	 * Sets the value of the '{@link org.eclipselabs.emf.scaffolding.tests.soa.SOAModel#getDefaultIdentifierType <em>Default Identifier Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Identifier Type</em>' reference.
	 * @see #getDefaultIdentifierType()
	 * @generated
	 */
	void setDefaultIdentifierType(Type value);

} // SOAModel
