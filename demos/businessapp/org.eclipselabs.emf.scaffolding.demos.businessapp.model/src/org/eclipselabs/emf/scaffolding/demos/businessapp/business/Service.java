/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipselabs.emf.scaffolding.demos.businessapp.business;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipselabs.emf.scaffolding.demos.businessapp.business.Service#getDependency <em>Dependency</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipselabs.emf.scaffolding.demos.businessapp.business.BusinessPackage#getService()
 * @model
 * @generated
 */
public interface Service extends Component {
	/**
	 * Returns the value of the '<em><b>Dependency</b></em>' reference list.
	 * The list contents are of type {@link org.eclipselabs.emf.scaffolding.demos.businessapp.business.Component}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dependency</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dependency</em>' reference list.
	 * @see org.eclipselabs.emf.scaffolding.demos.businessapp.business.BusinessPackage#getService_Dependency()
	 * @model
	 * @generated
	 */
	EList<Component> getDependency();

} // Service
