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
package org.eclipselabs.emf.scaffolding.runtime.status.scaffoldingStatusCache;

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
 * @see org.eclipselabs.emf.scaffolding.runtime.status.scaffoldingStatusCache.ScaffoldingStatusCacheFactory
 * @model kind="package"
 * @generated
 */
public interface ScaffoldingStatusCachePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "scaffoldingStatusCache";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipselabs.org/emf/scaffolding/StatusCache/1.0.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "cache";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ScaffoldingStatusCachePackage eINSTANCE = org.eclipselabs.emf.scaffolding.runtime.status.scaffoldingStatusCache.impl.ScaffoldingStatusCachePackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipselabs.emf.scaffolding.runtime.status.scaffoldingStatusCache.impl.ScaffoldingStatusCacheImpl <em>Scaffolding Status Cache</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipselabs.emf.scaffolding.runtime.status.scaffoldingStatusCache.impl.ScaffoldingStatusCacheImpl
	 * @see org.eclipselabs.emf.scaffolding.runtime.status.scaffoldingStatusCache.impl.ScaffoldingStatusCachePackageImpl#getScaffoldingStatusCache()
	 * @generated
	 */
	int SCAFFOLDING_STATUS_CACHE = 0;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCAFFOLDING_STATUS_CACHE__ELEMENTS = 0;

	/**
	 * The number of structural features of the '<em>Scaffolding Status Cache</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCAFFOLDING_STATUS_CACHE_FEATURE_COUNT = 1;

	/**
	 * Returns the meta object for class '{@link org.eclipselabs.emf.scaffolding.runtime.status.scaffoldingStatusCache.ScaffoldingStatusCache <em>Scaffolding Status Cache</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scaffolding Status Cache</em>'.
	 * @see org.eclipselabs.emf.scaffolding.runtime.status.scaffoldingStatusCache.ScaffoldingStatusCache
	 * @generated
	 */
	EClass getScaffoldingStatusCache();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipselabs.emf.scaffolding.runtime.status.scaffoldingStatusCache.ScaffoldingStatusCache#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Elements</em>'.
	 * @see org.eclipselabs.emf.scaffolding.runtime.status.scaffoldingStatusCache.ScaffoldingStatusCache#getElements()
	 * @see #getScaffoldingStatusCache()
	 * @generated
	 */
	EReference getScaffoldingStatusCache_Elements();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ScaffoldingStatusCacheFactory getScaffoldingStatusCacheFactory();

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
		 * The meta object literal for the '{@link org.eclipselabs.emf.scaffolding.runtime.status.scaffoldingStatusCache.impl.ScaffoldingStatusCacheImpl <em>Scaffolding Status Cache</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipselabs.emf.scaffolding.runtime.status.scaffoldingStatusCache.impl.ScaffoldingStatusCacheImpl
		 * @see org.eclipselabs.emf.scaffolding.runtime.status.scaffoldingStatusCache.impl.ScaffoldingStatusCachePackageImpl#getScaffoldingStatusCache()
		 * @generated
		 */
		EClass SCAFFOLDING_STATUS_CACHE = eINSTANCE.getScaffoldingStatusCache();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCAFFOLDING_STATUS_CACHE__ELEMENTS = eINSTANCE.getScaffoldingStatusCache_Elements();

	}

} //ScaffoldingStatusCachePackage
