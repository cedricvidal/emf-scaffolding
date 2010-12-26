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
package org.eclipselabs.emf.scaffolding.session.emfscaffoldingsession.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipselabs.emf.scaffolding.session.emfscaffoldingsession.EMFScaffoldingSessionFactory;
import org.eclipselabs.emf.scaffolding.session.emfscaffoldingsession.EMFScaffoldingSessionPackage;
import org.eclipselabs.emf.scaffolding.session.emfscaffoldingsession.Input;
import org.eclipselabs.emf.scaffolding.session.emfscaffoldingsession.Output;
import org.eclipselabs.emf.scaffolding.session.emfscaffoldingsession.ScaffoldingFile;
import org.eclipselabs.emf.scaffolding.session.emfscaffoldingsession.ScaffoldingSession;
import org.eclipselabs.emf.scaffolding.session.emfscaffoldingsession.Trash;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EMFScaffoldingSessionPackageImpl extends EPackageImpl implements EMFScaffoldingSessionPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass scaffoldingSessionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass scaffoldingFileEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inputEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass trashEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass outputEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.eclipselabs.emf.scaffolding.session.emfscaffoldingsession.EMFScaffoldingSessionPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private EMFScaffoldingSessionPackageImpl() {
		super(eNS_URI, EMFScaffoldingSessionFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link EMFScaffoldingSessionPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static EMFScaffoldingSessionPackage init() {
		if (isInited) return (EMFScaffoldingSessionPackage)EPackage.Registry.INSTANCE.getEPackage(EMFScaffoldingSessionPackage.eNS_URI);

		// Obtain or create and register package
		EMFScaffoldingSessionPackageImpl theEMFScaffoldingSessionPackage = (EMFScaffoldingSessionPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof EMFScaffoldingSessionPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new EMFScaffoldingSessionPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theEMFScaffoldingSessionPackage.createPackageContents();

		// Initialize created meta-data
		theEMFScaffoldingSessionPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theEMFScaffoldingSessionPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(EMFScaffoldingSessionPackage.eNS_URI, theEMFScaffoldingSessionPackage);
		return theEMFScaffoldingSessionPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getScaffoldingSession() {
		return scaffoldingSessionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getScaffoldingSession_ScaffoldingFile() {
		return (EReference)scaffoldingSessionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getScaffoldingSession_Inputs() {
		return (EReference)scaffoldingSessionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getScaffoldingSession_Trash() {
		return (EReference)scaffoldingSessionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getScaffoldingSession_Outputs() {
		return (EReference)scaffoldingSessionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getScaffoldingFile() {
		return scaffoldingFileEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getScaffoldingFile_Path() {
		return (EAttribute)scaffoldingFileEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInput() {
		return inputEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInput_Model() {
		return (EReference)inputEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTrash() {
		return trashEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrash_Elements() {
		return (EReference)trashEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOutput() {
		return outputEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOutput_Name() {
		return (EAttribute)outputEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOutput_Elements() {
		return (EReference)outputEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMFScaffoldingSessionFactory getEMFScaffoldingSessionFactory() {
		return (EMFScaffoldingSessionFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		scaffoldingSessionEClass = createEClass(SCAFFOLDING_SESSION);
		createEReference(scaffoldingSessionEClass, SCAFFOLDING_SESSION__SCAFFOLDING_FILE);
		createEReference(scaffoldingSessionEClass, SCAFFOLDING_SESSION__INPUTS);
		createEReference(scaffoldingSessionEClass, SCAFFOLDING_SESSION__TRASH);
		createEReference(scaffoldingSessionEClass, SCAFFOLDING_SESSION__OUTPUTS);

		scaffoldingFileEClass = createEClass(SCAFFOLDING_FILE);
		createEAttribute(scaffoldingFileEClass, SCAFFOLDING_FILE__PATH);

		inputEClass = createEClass(INPUT);
		createEReference(inputEClass, INPUT__MODEL);

		trashEClass = createEClass(TRASH);
		createEReference(trashEClass, TRASH__ELEMENTS);

		outputEClass = createEClass(OUTPUT);
		createEAttribute(outputEClass, OUTPUT__NAME);
		createEReference(outputEClass, OUTPUT__ELEMENTS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes and features; add operations and parameters
		initEClass(scaffoldingSessionEClass, ScaffoldingSession.class, "ScaffoldingSession", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getScaffoldingSession_ScaffoldingFile(), this.getScaffoldingFile(), null, "scaffoldingFile", null, 0, 1, ScaffoldingSession.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getScaffoldingSession_Inputs(), this.getInput(), null, "inputs", null, 0, -1, ScaffoldingSession.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getScaffoldingSession_Trash(), this.getTrash(), null, "trash", null, 0, 1, ScaffoldingSession.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getScaffoldingSession_Outputs(), this.getOutput(), null, "outputs", null, 0, -1, ScaffoldingSession.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(scaffoldingFileEClass, ScaffoldingFile.class, "ScaffoldingFile", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getScaffoldingFile_Path(), ecorePackage.getEString(), "path", null, 0, 1, ScaffoldingFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(inputEClass, Input.class, "Input", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInput_Model(), ecorePackage.getEObject(), null, "model", null, 0, 1, Input.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(trashEClass, Trash.class, "Trash", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTrash_Elements(), ecorePackage.getEObject(), null, "elements", null, 0, -1, Trash.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(outputEClass, Output.class, "Output", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOutput_Name(), ecorePackage.getEString(), "name", null, 0, 1, Output.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOutput_Elements(), ecorePackage.getEObject(), null, "elements", null, 0, -1, Output.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //EMFScaffoldingSessionPackageImpl
