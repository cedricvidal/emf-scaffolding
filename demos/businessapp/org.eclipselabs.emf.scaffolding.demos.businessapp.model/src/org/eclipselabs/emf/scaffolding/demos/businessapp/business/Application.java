/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipselabs.emf.scaffolding.demos.businessapp.business;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Application</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipselabs.emf.scaffolding.demos.businessapp.business.Application#getElement <em>Element</em>}</li>
 *   <li>{@link org.eclipselabs.emf.scaffolding.demos.businessapp.business.Application#getDefaultIdentifierType <em>Default Identifier Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipselabs.emf.scaffolding.demos.businessapp.business.BusinessPackage#getApplication()
 * @model
 * @generated
 */
public interface Application extends EObject {
	/**
	 * Returns the value of the '<em><b>Element</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipselabs.emf.scaffolding.demos.businessapp.business.Element}.
	 * It is bidirectional and its opposite is '{@link org.eclipselabs.emf.scaffolding.demos.businessapp.business.Element#getApplication <em>Application</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Element</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element</em>' containment reference list.
	 * @see org.eclipselabs.emf.scaffolding.demos.businessapp.business.BusinessPackage#getApplication_Element()
	 * @see org.eclipselabs.emf.scaffolding.demos.businessapp.business.Element#getApplication
	 * @model opposite="application" containment="true"
	 * @generated
	 */
	EList<Element> getElement();

	/**
	 * Returns the value of the '<em><b>Default Identifier Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Identifier Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Identifier Type</em>' reference.
	 * @see #setDefaultIdentifierType(PrimitiveType)
	 * @see org.eclipselabs.emf.scaffolding.demos.businessapp.business.BusinessPackage#getApplication_DefaultIdentifierType()
	 * @model required="true"
	 * @generated
	 */
	PrimitiveType getDefaultIdentifierType();

	/**
	 * Sets the value of the '{@link org.eclipselabs.emf.scaffolding.demos.businessapp.business.Application#getDefaultIdentifierType <em>Default Identifier Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Identifier Type</em>' reference.
	 * @see #getDefaultIdentifierType()
	 * @generated
	 */
	void setDefaultIdentifierType(PrimitiveType value);

} // Application
