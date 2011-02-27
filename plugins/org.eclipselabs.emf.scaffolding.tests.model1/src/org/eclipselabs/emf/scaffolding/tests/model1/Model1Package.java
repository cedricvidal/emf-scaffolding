/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipselabs.emf.scaffolding.tests.model1;

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
 * @see org.eclipselabs.emf.scaffolding.tests.model1.Model1Factory
 * @model kind="package"
 * @generated
 */
public interface Model1Package extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "model1";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipselabs.org/emf/scaffolding/tests/model1";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "model1";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Model1Package eINSTANCE = org.eclipselabs.emf.scaffolding.tests.model1.impl.Model1PackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipselabs.emf.scaffolding.tests.model1.impl.ApplicationElementImpl <em>Application Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipselabs.emf.scaffolding.tests.model1.impl.ApplicationElementImpl
	 * @see org.eclipselabs.emf.scaffolding.tests.model1.impl.Model1PackageImpl#getApplicationElement()
	 * @generated
	 */
	int APPLICATION_ELEMENT = 4;

	/**
	 * The feature id for the '<em><b>Application</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_ELEMENT__APPLICATION = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_ELEMENT__NAME = 1;

	/**
	 * The number of structural features of the '<em>Application Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_ELEMENT_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipselabs.emf.scaffolding.tests.model1.impl.EntityImpl <em>Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipselabs.emf.scaffolding.tests.model1.impl.EntityImpl
	 * @see org.eclipselabs.emf.scaffolding.tests.model1.impl.Model1PackageImpl#getEntity()
	 * @generated
	 */
	int ENTITY = 0;

	/**
	 * The feature id for the '<em><b>Application</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__APPLICATION = APPLICATION_ELEMENT__APPLICATION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__NAME = APPLICATION_ELEMENT__NAME;

	/**
	 * The number of structural features of the '<em>Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_FEATURE_COUNT = APPLICATION_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipselabs.emf.scaffolding.tests.model1.impl.ComponentImpl <em>Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipselabs.emf.scaffolding.tests.model1.impl.ComponentImpl
	 * @see org.eclipselabs.emf.scaffolding.tests.model1.impl.Model1PackageImpl#getComponent()
	 * @generated
	 */
	int COMPONENT = 6;

	/**
	 * The feature id for the '<em><b>Application</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__APPLICATION = APPLICATION_ELEMENT__APPLICATION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__NAME = APPLICATION_ELEMENT__NAME;

	/**
	 * The number of structural features of the '<em>Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_FEATURE_COUNT = APPLICATION_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipselabs.emf.scaffolding.tests.model1.impl.DAOImpl <em>DAO</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipselabs.emf.scaffolding.tests.model1.impl.DAOImpl
	 * @see org.eclipselabs.emf.scaffolding.tests.model1.impl.Model1PackageImpl#getDAO()
	 * @generated
	 */
	int DAO = 1;

	/**
	 * The feature id for the '<em><b>Application</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAO__APPLICATION = COMPONENT__APPLICATION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAO__NAME = COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Methods</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAO__METHODS = COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAO__ENTITY = COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>DAO</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAO_FEATURE_COUNT = COMPONENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipselabs.emf.scaffolding.tests.model1.impl.MethodImpl <em>Method</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipselabs.emf.scaffolding.tests.model1.impl.MethodImpl
	 * @see org.eclipselabs.emf.scaffolding.tests.model1.impl.Model1PackageImpl#getMethod()
	 * @generated
	 */
	int METHOD = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__NAME = 0;

	/**
	 * The number of structural features of the '<em>Method</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipselabs.emf.scaffolding.tests.model1.impl.ApplicationImpl <em>Application</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipselabs.emf.scaffolding.tests.model1.impl.ApplicationImpl
	 * @see org.eclipselabs.emf.scaffolding.tests.model1.impl.Model1PackageImpl#getApplication()
	 * @generated
	 */
	int APPLICATION = 3;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__ELEMENTS = 0;

	/**
	 * The number of structural features of the '<em>Application</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipselabs.emf.scaffolding.tests.model1.impl.ServiceImpl <em>Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipselabs.emf.scaffolding.tests.model1.impl.ServiceImpl
	 * @see org.eclipselabs.emf.scaffolding.tests.model1.impl.Model1PackageImpl#getService()
	 * @generated
	 */
	int SERVICE = 5;

	/**
	 * The feature id for the '<em><b>Application</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__APPLICATION = COMPONENT__APPLICATION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__NAME = COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Dependencies</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__DEPENDENCIES = COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_FEATURE_COUNT = COMPONENT_FEATURE_COUNT + 1;


	/**
	 * Returns the meta object for class '{@link org.eclipselabs.emf.scaffolding.tests.model1.Entity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entity</em>'.
	 * @see org.eclipselabs.emf.scaffolding.tests.model1.Entity
	 * @generated
	 */
	EClass getEntity();

	/**
	 * Returns the meta object for class '{@link org.eclipselabs.emf.scaffolding.tests.model1.DAO <em>DAO</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DAO</em>'.
	 * @see org.eclipselabs.emf.scaffolding.tests.model1.DAO
	 * @generated
	 */
	EClass getDAO();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipselabs.emf.scaffolding.tests.model1.DAO#getMethods <em>Methods</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Methods</em>'.
	 * @see org.eclipselabs.emf.scaffolding.tests.model1.DAO#getMethods()
	 * @see #getDAO()
	 * @generated
	 */
	EReference getDAO_Methods();

	/**
	 * Returns the meta object for the reference '{@link org.eclipselabs.emf.scaffolding.tests.model1.DAO#getEntity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Entity</em>'.
	 * @see org.eclipselabs.emf.scaffolding.tests.model1.DAO#getEntity()
	 * @see #getDAO()
	 * @generated
	 */
	EReference getDAO_Entity();

	/**
	 * Returns the meta object for class '{@link org.eclipselabs.emf.scaffolding.tests.model1.Method <em>Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Method</em>'.
	 * @see org.eclipselabs.emf.scaffolding.tests.model1.Method
	 * @generated
	 */
	EClass getMethod();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipselabs.emf.scaffolding.tests.model1.Method#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipselabs.emf.scaffolding.tests.model1.Method#getName()
	 * @see #getMethod()
	 * @generated
	 */
	EAttribute getMethod_Name();

	/**
	 * Returns the meta object for class '{@link org.eclipselabs.emf.scaffolding.tests.model1.Application <em>Application</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Application</em>'.
	 * @see org.eclipselabs.emf.scaffolding.tests.model1.Application
	 * @generated
	 */
	EClass getApplication();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipselabs.emf.scaffolding.tests.model1.Application#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see org.eclipselabs.emf.scaffolding.tests.model1.Application#getElements()
	 * @see #getApplication()
	 * @generated
	 */
	EReference getApplication_Elements();

	/**
	 * Returns the meta object for class '{@link org.eclipselabs.emf.scaffolding.tests.model1.ApplicationElement <em>Application Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Application Element</em>'.
	 * @see org.eclipselabs.emf.scaffolding.tests.model1.ApplicationElement
	 * @generated
	 */
	EClass getApplicationElement();

	/**
	 * Returns the meta object for the container reference '{@link org.eclipselabs.emf.scaffolding.tests.model1.ApplicationElement#getApplication <em>Application</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Application</em>'.
	 * @see org.eclipselabs.emf.scaffolding.tests.model1.ApplicationElement#getApplication()
	 * @see #getApplicationElement()
	 * @generated
	 */
	EReference getApplicationElement_Application();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipselabs.emf.scaffolding.tests.model1.ApplicationElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipselabs.emf.scaffolding.tests.model1.ApplicationElement#getName()
	 * @see #getApplicationElement()
	 * @generated
	 */
	EAttribute getApplicationElement_Name();

	/**
	 * Returns the meta object for class '{@link org.eclipselabs.emf.scaffolding.tests.model1.Service <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service</em>'.
	 * @see org.eclipselabs.emf.scaffolding.tests.model1.Service
	 * @generated
	 */
	EClass getService();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipselabs.emf.scaffolding.tests.model1.Service#getDependencies <em>Dependencies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Dependencies</em>'.
	 * @see org.eclipselabs.emf.scaffolding.tests.model1.Service#getDependencies()
	 * @see #getService()
	 * @generated
	 */
	EReference getService_Dependencies();

	/**
	 * Returns the meta object for class '{@link org.eclipselabs.emf.scaffolding.tests.model1.Component <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component</em>'.
	 * @see org.eclipselabs.emf.scaffolding.tests.model1.Component
	 * @generated
	 */
	EClass getComponent();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Model1Factory getModel1Factory();

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
		 * The meta object literal for the '{@link org.eclipselabs.emf.scaffolding.tests.model1.impl.EntityImpl <em>Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipselabs.emf.scaffolding.tests.model1.impl.EntityImpl
		 * @see org.eclipselabs.emf.scaffolding.tests.model1.impl.Model1PackageImpl#getEntity()
		 * @generated
		 */
		EClass ENTITY = eINSTANCE.getEntity();

		/**
		 * The meta object literal for the '{@link org.eclipselabs.emf.scaffolding.tests.model1.impl.DAOImpl <em>DAO</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipselabs.emf.scaffolding.tests.model1.impl.DAOImpl
		 * @see org.eclipselabs.emf.scaffolding.tests.model1.impl.Model1PackageImpl#getDAO()
		 * @generated
		 */
		EClass DAO = eINSTANCE.getDAO();

		/**
		 * The meta object literal for the '<em><b>Methods</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DAO__METHODS = eINSTANCE.getDAO_Methods();

		/**
		 * The meta object literal for the '<em><b>Entity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DAO__ENTITY = eINSTANCE.getDAO_Entity();

		/**
		 * The meta object literal for the '{@link org.eclipselabs.emf.scaffolding.tests.model1.impl.MethodImpl <em>Method</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipselabs.emf.scaffolding.tests.model1.impl.MethodImpl
		 * @see org.eclipselabs.emf.scaffolding.tests.model1.impl.Model1PackageImpl#getMethod()
		 * @generated
		 */
		EClass METHOD = eINSTANCE.getMethod();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METHOD__NAME = eINSTANCE.getMethod_Name();

		/**
		 * The meta object literal for the '{@link org.eclipselabs.emf.scaffolding.tests.model1.impl.ApplicationImpl <em>Application</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipselabs.emf.scaffolding.tests.model1.impl.ApplicationImpl
		 * @see org.eclipselabs.emf.scaffolding.tests.model1.impl.Model1PackageImpl#getApplication()
		 * @generated
		 */
		EClass APPLICATION = eINSTANCE.getApplication();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPLICATION__ELEMENTS = eINSTANCE.getApplication_Elements();

		/**
		 * The meta object literal for the '{@link org.eclipselabs.emf.scaffolding.tests.model1.impl.ApplicationElementImpl <em>Application Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipselabs.emf.scaffolding.tests.model1.impl.ApplicationElementImpl
		 * @see org.eclipselabs.emf.scaffolding.tests.model1.impl.Model1PackageImpl#getApplicationElement()
		 * @generated
		 */
		EClass APPLICATION_ELEMENT = eINSTANCE.getApplicationElement();

		/**
		 * The meta object literal for the '<em><b>Application</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPLICATION_ELEMENT__APPLICATION = eINSTANCE.getApplicationElement_Application();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APPLICATION_ELEMENT__NAME = eINSTANCE.getApplicationElement_Name();

		/**
		 * The meta object literal for the '{@link org.eclipselabs.emf.scaffolding.tests.model1.impl.ServiceImpl <em>Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipselabs.emf.scaffolding.tests.model1.impl.ServiceImpl
		 * @see org.eclipselabs.emf.scaffolding.tests.model1.impl.Model1PackageImpl#getService()
		 * @generated
		 */
		EClass SERVICE = eINSTANCE.getService();

		/**
		 * The meta object literal for the '<em><b>Dependencies</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE__DEPENDENCIES = eINSTANCE.getService_Dependencies();

		/**
		 * The meta object literal for the '{@link org.eclipselabs.emf.scaffolding.tests.model1.impl.ComponentImpl <em>Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipselabs.emf.scaffolding.tests.model1.impl.ComponentImpl
		 * @see org.eclipselabs.emf.scaffolding.tests.model1.impl.Model1PackageImpl#getComponent()
		 * @generated
		 */
		EClass COMPONENT = eINSTANCE.getComponent();

	}

} //Model1Package
