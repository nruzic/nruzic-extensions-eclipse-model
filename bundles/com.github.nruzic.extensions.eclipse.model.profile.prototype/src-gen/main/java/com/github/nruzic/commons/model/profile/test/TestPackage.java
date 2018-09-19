/**
 */
package com.github.nruzic.commons.model.profile.test;

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
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see com.github.nruzic.commons.model.profile.test.TestFactory
 * @model kind="package"
 * @generated
 */
public interface TestPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "test";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///com/github/nruzic/commons/model/profile/test.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "com.github.nruzic.commons.model.profile.test";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TestPackage eINSTANCE = com.github.nruzic.commons.model.profile.test.impl.TestPackageImpl.init();

	/**
	 * The meta object id for the '{@link com.github.nruzic.commons.model.profile.test.impl.testImpl <em>test</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.nruzic.commons.model.profile.test.impl.testImpl
	 * @see com.github.nruzic.commons.model.profile.test.impl.TestPackageImpl#gettest()
	 * @generated
	 */
	int TEST = 0;

	/**
	 * The feature id for the '<em><b>Base Actor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST__BASE_ACTOR = 0;

	/**
	 * The feature id for the '<em><b>Base Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST__BASE_COMPONENT = 1;

	/**
	 * The feature id for the '<em><b>Base Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST__BASE_NODE = 2;

	/**
	 * The number of structural features of the '<em>test</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>test</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link com.github.nruzic.commons.model.profile.test.test <em>test</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>test</em>'.
	 * @see com.github.nruzic.commons.model.profile.test.test
	 * @generated
	 */
	EClass gettest();

	/**
	 * Returns the meta object for the reference '{@link com.github.nruzic.commons.model.profile.test.test#getBase_Actor <em>Base Actor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Actor</em>'.
	 * @see com.github.nruzic.commons.model.profile.test.test#getBase_Actor()
	 * @see #gettest()
	 * @generated
	 */
	EReference gettest_Base_Actor();

	/**
	 * Returns the meta object for the reference '{@link com.github.nruzic.commons.model.profile.test.test#getBase_Component <em>Base Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Component</em>'.
	 * @see com.github.nruzic.commons.model.profile.test.test#getBase_Component()
	 * @see #gettest()
	 * @generated
	 */
	EReference gettest_Base_Component();

	/**
	 * Returns the meta object for the reference '{@link com.github.nruzic.commons.model.profile.test.test#getBase_Node <em>Base Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Node</em>'.
	 * @see com.github.nruzic.commons.model.profile.test.test#getBase_Node()
	 * @see #gettest()
	 * @generated
	 */
	EReference gettest_Base_Node();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TestFactory getTestFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link com.github.nruzic.commons.model.profile.test.impl.testImpl <em>test</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.nruzic.commons.model.profile.test.impl.testImpl
		 * @see com.github.nruzic.commons.model.profile.test.impl.TestPackageImpl#gettest()
		 * @generated
		 */
		EClass TEST = eINSTANCE.gettest();

		/**
		 * The meta object literal for the '<em><b>Base Actor</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEST__BASE_ACTOR = eINSTANCE.gettest_Base_Actor();

		/**
		 * The meta object literal for the '<em><b>Base Component</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEST__BASE_COMPONENT = eINSTANCE.gettest_Base_Component();

		/**
		 * The meta object literal for the '<em><b>Base Node</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEST__BASE_NODE = eINSTANCE.gettest_Base_Node();

	}

} //TestPackage
