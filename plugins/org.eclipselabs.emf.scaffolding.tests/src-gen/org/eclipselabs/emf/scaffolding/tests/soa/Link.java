/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipselabs.emf.scaffolding.tests.soa;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipselabs.emf.scaffolding.tests.soa.Link#getInput <em>Input</em>}</li>
 *   <li>{@link org.eclipselabs.emf.scaffolding.tests.soa.Link#getOutput <em>Output</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipselabs.emf.scaffolding.tests.soa.SoaPackage#getLink()
 * @model
 * @generated
 */
public interface Link extends Element {
	/**
	 * Returns the value of the '<em><b>Input</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input</em>' reference.
	 * @see #setInput(Slot)
	 * @see org.eclipselabs.emf.scaffolding.tests.soa.SoaPackage#getLink_Input()
	 * @model
	 * @generated
	 */
	Slot getInput();

	/**
	 * Sets the value of the '{@link org.eclipselabs.emf.scaffolding.tests.soa.Link#getInput <em>Input</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input</em>' reference.
	 * @see #getInput()
	 * @generated
	 */
	void setInput(Slot value);

	/**
	 * Returns the value of the '<em><b>Output</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output</em>' reference.
	 * @see #setOutput(Slot)
	 * @see org.eclipselabs.emf.scaffolding.tests.soa.SoaPackage#getLink_Output()
	 * @model
	 * @generated
	 */
	Slot getOutput();

	/**
	 * Sets the value of the '{@link org.eclipselabs.emf.scaffolding.tests.soa.Link#getOutput <em>Output</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output</em>' reference.
	 * @see #getOutput()
	 * @generated
	 */
	void setOutput(Slot value);

} // Link
