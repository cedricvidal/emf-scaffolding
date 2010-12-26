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

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipselabs.emf.scaffolding.session.emfscaffoldingsession.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EMFScaffoldingSessionFactoryImpl extends EFactoryImpl implements EMFScaffoldingSessionFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EMFScaffoldingSessionFactory init() {
		try {
			EMFScaffoldingSessionFactory theEMFScaffoldingSessionFactory = (EMFScaffoldingSessionFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.eclipselabs.org/emf/scaffolding/session/1.0.0"); 
			if (theEMFScaffoldingSessionFactory != null) {
				return theEMFScaffoldingSessionFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new EMFScaffoldingSessionFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMFScaffoldingSessionFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case EMFScaffoldingSessionPackage.SCAFFOLDING_SESSION: return createScaffoldingSession();
			case EMFScaffoldingSessionPackage.SCAFFOLDING_FILE: return createScaffoldingFile();
			case EMFScaffoldingSessionPackage.INPUT: return createInput();
			case EMFScaffoldingSessionPackage.TRASH: return createTrash();
			case EMFScaffoldingSessionPackage.OUTPUT: return createOutput();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScaffoldingSession createScaffoldingSession() {
		ScaffoldingSessionImpl scaffoldingSession = new ScaffoldingSessionImpl();
		return scaffoldingSession;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScaffoldingFile createScaffoldingFile() {
		ScaffoldingFileImpl scaffoldingFile = new ScaffoldingFileImpl();
		return scaffoldingFile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Input createInput() {
		InputImpl input = new InputImpl();
		return input;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Trash createTrash() {
		TrashImpl trash = new TrashImpl();
		return trash;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Output createOutput() {
		OutputImpl output = new OutputImpl();
		return output;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMFScaffoldingSessionPackage getEMFScaffoldingSessionPackage() {
		return (EMFScaffoldingSessionPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static EMFScaffoldingSessionPackage getPackage() {
		return EMFScaffoldingSessionPackage.eINSTANCE;
	}

} //EMFScaffoldingSessionFactoryImpl
