/*******************************************************************************
 * Copyright (c) 2010 Contributors - see below
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Cedric Vidal - initial API and implementation
 *     Jerome Benois - Rewrite compiler and runtime based on new Drools Knowledge API
 *******************************************************************************/
package org.eclipselabs.emf.scaffolding.session.emfscaffoldingsession;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;
import org.eclipselabs.emf.scaffolding.runtime.status.scaffoldingStatusCache.ScaffoldingStatusCache;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Scaffolding Session</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipselabs.emf.scaffolding.session.emfscaffoldingsession.ScaffoldingSession#getScaffoldingFile <em>Scaffolding File</em>}</li>
 *   <li>{@link org.eclipselabs.emf.scaffolding.session.emfscaffoldingsession.ScaffoldingSession#getInputs <em>Inputs</em>}</li>
 *   <li>{@link org.eclipselabs.emf.scaffolding.session.emfscaffoldingsession.ScaffoldingSession#getTrash <em>Trash</em>}</li>
 *   <li>{@link org.eclipselabs.emf.scaffolding.session.emfscaffoldingsession.ScaffoldingSession#getOutputs <em>Outputs</em>}</li>
 *   <li>{@link org.eclipselabs.emf.scaffolding.session.emfscaffoldingsession.ScaffoldingSession#getCache <em>Cache</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipselabs.emf.scaffolding.session.emfscaffoldingsession.EMFScaffoldingSessionPackage#getScaffoldingSession()
 * @model
 * @generated
 */
public interface ScaffoldingSession extends EObject {
	/**
	 * Returns the value of the '<em><b>Scaffolding File</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scaffolding File</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scaffolding File</em>' containment reference.
	 * @see #setScaffoldingFile(ScaffoldingFile)
	 * @see org.eclipselabs.emf.scaffolding.session.emfscaffoldingsession.EMFScaffoldingSessionPackage#getScaffoldingSession_ScaffoldingFile()
	 * @model containment="true"
	 * @generated
	 */
	ScaffoldingFile getScaffoldingFile();

	/**
	 * Sets the value of the '{@link org.eclipselabs.emf.scaffolding.session.emfscaffoldingsession.ScaffoldingSession#getScaffoldingFile <em>Scaffolding File</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scaffolding File</em>' containment reference.
	 * @see #getScaffoldingFile()
	 * @generated
	 */
	void setScaffoldingFile(ScaffoldingFile value);

	/**
	 * Returns the value of the '<em><b>Inputs</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipselabs.emf.scaffolding.session.emfscaffoldingsession.Input}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inputs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inputs</em>' containment reference list.
	 * @see org.eclipselabs.emf.scaffolding.session.emfscaffoldingsession.EMFScaffoldingSessionPackage#getScaffoldingSession_Inputs()
	 * @model containment="true"
	 * @generated
	 */
	EList<Input> getInputs();

	/**
	 * Returns the value of the '<em><b>Trash</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Trash</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trash</em>' containment reference.
	 * @see #setTrash(Trash)
	 * @see org.eclipselabs.emf.scaffolding.session.emfscaffoldingsession.EMFScaffoldingSessionPackage#getScaffoldingSession_Trash()
	 * @model containment="true"
	 * @generated
	 */
	Trash getTrash();

	/**
	 * Sets the value of the '{@link org.eclipselabs.emf.scaffolding.session.emfscaffoldingsession.ScaffoldingSession#getTrash <em>Trash</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trash</em>' containment reference.
	 * @see #getTrash()
	 * @generated
	 */
	void setTrash(Trash value);

	/**
	 * Returns the value of the '<em><b>Outputs</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipselabs.emf.scaffolding.session.emfscaffoldingsession.Output}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outputs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outputs</em>' containment reference list.
	 * @see org.eclipselabs.emf.scaffolding.session.emfscaffoldingsession.EMFScaffoldingSessionPackage#getScaffoldingSession_Outputs()
	 * @model containment="true"
	 * @generated
	 */
	EList<Output> getOutputs();

	/**
	 * Returns the value of the '<em><b>Cache</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cache</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cache</em>' containment reference.
	 * @see #setCache(ScaffoldingStatusCache)
	 * @see org.eclipselabs.emf.scaffolding.session.emfscaffoldingsession.EMFScaffoldingSessionPackage#getScaffoldingSession_Cache()
	 * @model containment="true"
	 * @generated
	 */
	ScaffoldingStatusCache getCache();

	/**
	 * Sets the value of the '{@link org.eclipselabs.emf.scaffolding.session.emfscaffoldingsession.ScaffoldingSession#getCache <em>Cache</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cache</em>' containment reference.
	 * @see #getCache()
	 * @generated
	 */
	void setCache(ScaffoldingStatusCache value);

} // ScaffoldingSession
