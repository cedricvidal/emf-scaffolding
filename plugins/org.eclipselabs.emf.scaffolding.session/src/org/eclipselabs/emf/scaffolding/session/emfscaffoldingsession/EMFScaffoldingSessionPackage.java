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

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.eclipselabs.emf.scaffolding.session.emfscaffoldingsession.EMFScaffoldingSessionFactory
 * @model kind="package"
 * @generated
 */
public interface EMFScaffoldingSessionPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "emfscaffoldingsession";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipselabs.org/emf/scaffolding/session/1.0.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "emfscaffoldingsession";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EMFScaffoldingSessionPackage eINSTANCE = org.eclipselabs.emf.scaffolding.session.emfscaffoldingsession.impl.EMFScaffoldingSessionPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipselabs.emf.scaffolding.session.emfscaffoldingsession.impl.ScaffoldingSessionImpl <em>Scaffolding Session</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipselabs.emf.scaffolding.session.emfscaffoldingsession.impl.ScaffoldingSessionImpl
	 * @see org.eclipselabs.emf.scaffolding.session.emfscaffoldingsession.impl.EMFScaffoldingSessionPackageImpl#getScaffoldingSession()
	 * @generated
	 */
	int SCAFFOLDING_SESSION = 0;

	/**
	 * The feature id for the '<em><b>Scaffolding File</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCAFFOLDING_SESSION__SCAFFOLDING_FILE = 0;

	/**
	 * The feature id for the '<em><b>Inputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCAFFOLDING_SESSION__INPUTS = 1;

	/**
	 * The feature id for the '<em><b>Trash</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCAFFOLDING_SESSION__TRASH = 2;

	/**
	 * The feature id for the '<em><b>Outputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCAFFOLDING_SESSION__OUTPUTS = 3;

	/**
	 * The number of structural features of the '<em>Scaffolding Session</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCAFFOLDING_SESSION_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.eclipselabs.emf.scaffolding.session.emfscaffoldingsession.impl.ScaffoldingFileImpl <em>Scaffolding File</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipselabs.emf.scaffolding.session.emfscaffoldingsession.impl.ScaffoldingFileImpl
	 * @see org.eclipselabs.emf.scaffolding.session.emfscaffoldingsession.impl.EMFScaffoldingSessionPackageImpl#getScaffoldingFile()
	 * @generated
	 */
	int SCAFFOLDING_FILE = 1;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCAFFOLDING_FILE__PATH = 0;

	/**
	 * The number of structural features of the '<em>Scaffolding File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCAFFOLDING_FILE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipselabs.emf.scaffolding.session.emfscaffoldingsession.impl.InputImpl <em>Input</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipselabs.emf.scaffolding.session.emfscaffoldingsession.impl.InputImpl
	 * @see org.eclipselabs.emf.scaffolding.session.emfscaffoldingsession.impl.EMFScaffoldingSessionPackageImpl#getInput()
	 * @generated
	 */
	int INPUT = 2;

	/**
	 * The feature id for the '<em><b>Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__MODEL = 0;

	/**
	 * The number of structural features of the '<em>Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipselabs.emf.scaffolding.session.emfscaffoldingsession.impl.TrashImpl <em>Trash</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipselabs.emf.scaffolding.session.emfscaffoldingsession.impl.TrashImpl
	 * @see org.eclipselabs.emf.scaffolding.session.emfscaffoldingsession.impl.EMFScaffoldingSessionPackageImpl#getTrash()
	 * @generated
	 */
	int TRASH = 3;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRASH__ELEMENTS = 0;

	/**
	 * The number of structural features of the '<em>Trash</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRASH_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipselabs.emf.scaffolding.session.emfscaffoldingsession.impl.OutputImpl <em>Output</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipselabs.emf.scaffolding.session.emfscaffoldingsession.impl.OutputImpl
	 * @see org.eclipselabs.emf.scaffolding.session.emfscaffoldingsession.impl.EMFScaffoldingSessionPackageImpl#getOutput()
	 * @generated
	 */
	int OUTPUT = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT__ELEMENTS = 1;

	/**
	 * The number of structural features of the '<em>Output</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_FEATURE_COUNT = 2;


	/**
	 * Returns the meta object for class '{@link org.eclipselabs.emf.scaffolding.session.emfscaffoldingsession.ScaffoldingSession <em>Scaffolding Session</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scaffolding Session</em>'.
	 * @see org.eclipselabs.emf.scaffolding.session.emfscaffoldingsession.ScaffoldingSession
	 * @generated
	 */
	EClass getScaffoldingSession();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipselabs.emf.scaffolding.session.emfscaffoldingsession.ScaffoldingSession#getScaffoldingFile <em>Scaffolding File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Scaffolding File</em>'.
	 * @see org.eclipselabs.emf.scaffolding.session.emfscaffoldingsession.ScaffoldingSession#getScaffoldingFile()
	 * @see #getScaffoldingSession()
	 * @generated
	 */
	EReference getScaffoldingSession_ScaffoldingFile();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipselabs.emf.scaffolding.session.emfscaffoldingsession.ScaffoldingSession#getInputs <em>Inputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Inputs</em>'.
	 * @see org.eclipselabs.emf.scaffolding.session.emfscaffoldingsession.ScaffoldingSession#getInputs()
	 * @see #getScaffoldingSession()
	 * @generated
	 */
	EReference getScaffoldingSession_Inputs();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipselabs.emf.scaffolding.session.emfscaffoldingsession.ScaffoldingSession#getTrash <em>Trash</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Trash</em>'.
	 * @see org.eclipselabs.emf.scaffolding.session.emfscaffoldingsession.ScaffoldingSession#getTrash()
	 * @see #getScaffoldingSession()
	 * @generated
	 */
	EReference getScaffoldingSession_Trash();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipselabs.emf.scaffolding.session.emfscaffoldingsession.ScaffoldingSession#getOutputs <em>Outputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Outputs</em>'.
	 * @see org.eclipselabs.emf.scaffolding.session.emfscaffoldingsession.ScaffoldingSession#getOutputs()
	 * @see #getScaffoldingSession()
	 * @generated
	 */
	EReference getScaffoldingSession_Outputs();

	/**
	 * Returns the meta object for class '{@link org.eclipselabs.emf.scaffolding.session.emfscaffoldingsession.ScaffoldingFile <em>Scaffolding File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scaffolding File</em>'.
	 * @see org.eclipselabs.emf.scaffolding.session.emfscaffoldingsession.ScaffoldingFile
	 * @generated
	 */
	EClass getScaffoldingFile();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipselabs.emf.scaffolding.session.emfscaffoldingsession.ScaffoldingFile#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path</em>'.
	 * @see org.eclipselabs.emf.scaffolding.session.emfscaffoldingsession.ScaffoldingFile#getPath()
	 * @see #getScaffoldingFile()
	 * @generated
	 */
	EAttribute getScaffoldingFile_Path();

	/**
	 * Returns the meta object for class '{@link org.eclipselabs.emf.scaffolding.session.emfscaffoldingsession.Input <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input</em>'.
	 * @see org.eclipselabs.emf.scaffolding.session.emfscaffoldingsession.Input
	 * @generated
	 */
	EClass getInput();

	/**
	 * Returns the meta object for the reference '{@link org.eclipselabs.emf.scaffolding.session.emfscaffoldingsession.Input#getModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Model</em>'.
	 * @see org.eclipselabs.emf.scaffolding.session.emfscaffoldingsession.Input#getModel()
	 * @see #getInput()
	 * @generated
	 */
	EReference getInput_Model();

	/**
	 * Returns the meta object for class '{@link org.eclipselabs.emf.scaffolding.session.emfscaffoldingsession.Trash <em>Trash</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trash</em>'.
	 * @see org.eclipselabs.emf.scaffolding.session.emfscaffoldingsession.Trash
	 * @generated
	 */
	EClass getTrash();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipselabs.emf.scaffolding.session.emfscaffoldingsession.Trash#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see org.eclipselabs.emf.scaffolding.session.emfscaffoldingsession.Trash#getElements()
	 * @see #getTrash()
	 * @generated
	 */
	EReference getTrash_Elements();

	/**
	 * Returns the meta object for class '{@link org.eclipselabs.emf.scaffolding.session.emfscaffoldingsession.Output <em>Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Output</em>'.
	 * @see org.eclipselabs.emf.scaffolding.session.emfscaffoldingsession.Output
	 * @generated
	 */
	EClass getOutput();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipselabs.emf.scaffolding.session.emfscaffoldingsession.Output#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipselabs.emf.scaffolding.session.emfscaffoldingsession.Output#getName()
	 * @see #getOutput()
	 * @generated
	 */
	EAttribute getOutput_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipselabs.emf.scaffolding.session.emfscaffoldingsession.Output#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see org.eclipselabs.emf.scaffolding.session.emfscaffoldingsession.Output#getElements()
	 * @see #getOutput()
	 * @generated
	 */
	EReference getOutput_Elements();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	EMFScaffoldingSessionFactory getEMFScaffoldingSessionFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.eclipselabs.emf.scaffolding.session.emfscaffoldingsession.impl.ScaffoldingSessionImpl <em>Scaffolding Session</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipselabs.emf.scaffolding.session.emfscaffoldingsession.impl.ScaffoldingSessionImpl
		 * @see org.eclipselabs.emf.scaffolding.session.emfscaffoldingsession.impl.EMFScaffoldingSessionPackageImpl#getScaffoldingSession()
		 * @generated
		 */
		EClass SCAFFOLDING_SESSION = eINSTANCE.getScaffoldingSession();

		/**
		 * The meta object literal for the '<em><b>Scaffolding File</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCAFFOLDING_SESSION__SCAFFOLDING_FILE = eINSTANCE.getScaffoldingSession_ScaffoldingFile();

		/**
		 * The meta object literal for the '<em><b>Inputs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCAFFOLDING_SESSION__INPUTS = eINSTANCE.getScaffoldingSession_Inputs();

		/**
		 * The meta object literal for the '<em><b>Trash</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCAFFOLDING_SESSION__TRASH = eINSTANCE.getScaffoldingSession_Trash();

		/**
		 * The meta object literal for the '<em><b>Outputs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCAFFOLDING_SESSION__OUTPUTS = eINSTANCE.getScaffoldingSession_Outputs();

		/**
		 * The meta object literal for the '{@link org.eclipselabs.emf.scaffolding.session.emfscaffoldingsession.impl.ScaffoldingFileImpl <em>Scaffolding File</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipselabs.emf.scaffolding.session.emfscaffoldingsession.impl.ScaffoldingFileImpl
		 * @see org.eclipselabs.emf.scaffolding.session.emfscaffoldingsession.impl.EMFScaffoldingSessionPackageImpl#getScaffoldingFile()
		 * @generated
		 */
		EClass SCAFFOLDING_FILE = eINSTANCE.getScaffoldingFile();

		/**
		 * The meta object literal for the '<em><b>Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCAFFOLDING_FILE__PATH = eINSTANCE.getScaffoldingFile_Path();

		/**
		 * The meta object literal for the '{@link org.eclipselabs.emf.scaffolding.session.emfscaffoldingsession.impl.InputImpl <em>Input</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipselabs.emf.scaffolding.session.emfscaffoldingsession.impl.InputImpl
		 * @see org.eclipselabs.emf.scaffolding.session.emfscaffoldingsession.impl.EMFScaffoldingSessionPackageImpl#getInput()
		 * @generated
		 */
		EClass INPUT = eINSTANCE.getInput();

		/**
		 * The meta object literal for the '<em><b>Model</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INPUT__MODEL = eINSTANCE.getInput_Model();

		/**
		 * The meta object literal for the '{@link org.eclipselabs.emf.scaffolding.session.emfscaffoldingsession.impl.TrashImpl <em>Trash</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipselabs.emf.scaffolding.session.emfscaffoldingsession.impl.TrashImpl
		 * @see org.eclipselabs.emf.scaffolding.session.emfscaffoldingsession.impl.EMFScaffoldingSessionPackageImpl#getTrash()
		 * @generated
		 */
		EClass TRASH = eINSTANCE.getTrash();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRASH__ELEMENTS = eINSTANCE.getTrash_Elements();

		/**
		 * The meta object literal for the '{@link org.eclipselabs.emf.scaffolding.session.emfscaffoldingsession.impl.OutputImpl <em>Output</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipselabs.emf.scaffolding.session.emfscaffoldingsession.impl.OutputImpl
		 * @see org.eclipselabs.emf.scaffolding.session.emfscaffoldingsession.impl.EMFScaffoldingSessionPackageImpl#getOutput()
		 * @generated
		 */
		EClass OUTPUT = eINSTANCE.getOutput();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OUTPUT__NAME = eINSTANCE.getOutput_Name();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OUTPUT__ELEMENTS = eINSTANCE.getOutput_Elements();

	}

} //EMFScaffoldingSessionPackage
