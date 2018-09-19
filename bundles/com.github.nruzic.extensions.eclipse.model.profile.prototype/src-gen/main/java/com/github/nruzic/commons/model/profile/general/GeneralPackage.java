/**
 */
package com.github.nruzic.commons.model.profile.general;

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
 * @see com.github.nruzic.commons.model.profile.general.GeneralFactory
 * @model kind="package"
 * @generated
 */
public interface GeneralPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "general";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///com/github/nruzic/commons/model/profile/general.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "com.github.nruzic.commons.model.profile.general";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GeneralPackage eINSTANCE = com.github.nruzic.commons.model.profile.general.impl.GeneralPackageImpl.init();

	/**
	 * The meta object id for the '{@link com.github.nruzic.commons.model.profile.general.impl.subsystemImpl <em>subsystem</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.nruzic.commons.model.profile.general.impl.subsystemImpl
	 * @see com.github.nruzic.commons.model.profile.general.impl.GeneralPackageImpl#getsubsystem()
	 * @generated
	 */
	int SUBSYSTEM = 0;

	/**
	 * The feature id for the '<em><b>Base Package</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSYSTEM__BASE_PACKAGE = 0;

	/**
	 * The feature id for the '<em><b>Base Actor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSYSTEM__BASE_ACTOR = 1;

	/**
	 * The feature id for the '<em><b>Base Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSYSTEM__BASE_COMPONENT = 2;

	/**
	 * The number of structural features of the '<em>subsystem</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSYSTEM_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>subsystem</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSYSTEM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.github.nruzic.commons.model.profile.general.impl.externalImpl <em>external</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.nruzic.commons.model.profile.general.impl.externalImpl
	 * @see com.github.nruzic.commons.model.profile.general.impl.GeneralPackageImpl#getexternal()
	 * @generated
	 */
	int EXTERNAL = 1;

	/**
	 * The feature id for the '<em><b>Base Actor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL__BASE_ACTOR = 0;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL__BASE_CLASS = 1;

	/**
	 * The feature id for the '<em><b>Base Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL__BASE_COMPONENT = 2;

	/**
	 * The feature id for the '<em><b>Base Execution Environment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL__BASE_EXECUTION_ENVIRONMENT = 3;

	/**
	 * The feature id for the '<em><b>Base Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL__BASE_MODEL = 4;

	/**
	 * The feature id for the '<em><b>Base Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL__BASE_NODE = 5;

	/**
	 * The feature id for the '<em><b>Base Package</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL__BASE_PACKAGE = 6;

	/**
	 * The number of structural features of the '<em>external</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>external</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.github.nruzic.commons.model.profile.general.impl.internalImpl <em>internal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.nruzic.commons.model.profile.general.impl.internalImpl
	 * @see com.github.nruzic.commons.model.profile.general.impl.GeneralPackageImpl#getinternal()
	 * @generated
	 */
	int INTERNAL = 2;

	/**
	 * The feature id for the '<em><b>Base Actor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL__BASE_ACTOR = 0;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL__BASE_CLASS = 1;

	/**
	 * The feature id for the '<em><b>Base Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL__BASE_COMPONENT = 2;

	/**
	 * The feature id for the '<em><b>Base Execution Environment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL__BASE_EXECUTION_ENVIRONMENT = 3;

	/**
	 * The feature id for the '<em><b>Base Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL__BASE_MODEL = 4;

	/**
	 * The feature id for the '<em><b>Base Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL__BASE_NODE = 5;

	/**
	 * The feature id for the '<em><b>Base Package</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL__BASE_PACKAGE = 6;

	/**
	 * The number of structural features of the '<em>internal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>internal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.github.nruzic.commons.model.profile.general.impl.databaseImpl <em>database</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.nruzic.commons.model.profile.general.impl.databaseImpl
	 * @see com.github.nruzic.commons.model.profile.general.impl.GeneralPackageImpl#getdatabase()
	 * @generated
	 */
	int DATABASE = 3;

	/**
	 * The feature id for the '<em><b>Base Actor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE__BASE_ACTOR = 0;

	/**
	 * The feature id for the '<em><b>Base Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE__BASE_COMPONENT = 1;

	/**
	 * The feature id for the '<em><b>Base Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE__BASE_NODE = 2;

	/**
	 * The feature id for the '<em><b>Base Package</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE__BASE_PACKAGE = 3;

	/**
	 * The number of structural features of the '<em>database</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>database</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link com.github.nruzic.commons.model.profile.general.subsystem <em>subsystem</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>subsystem</em>'.
	 * @see com.github.nruzic.commons.model.profile.general.subsystem
	 * @generated
	 */
	EClass getsubsystem();

	/**
	 * Returns the meta object for the reference '{@link com.github.nruzic.commons.model.profile.general.subsystem#getBase_Package <em>Base Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Package</em>'.
	 * @see com.github.nruzic.commons.model.profile.general.subsystem#getBase_Package()
	 * @see #getsubsystem()
	 * @generated
	 */
	EReference getsubsystem_Base_Package();

	/**
	 * Returns the meta object for the reference '{@link com.github.nruzic.commons.model.profile.general.subsystem#getBase_Actor <em>Base Actor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Actor</em>'.
	 * @see com.github.nruzic.commons.model.profile.general.subsystem#getBase_Actor()
	 * @see #getsubsystem()
	 * @generated
	 */
	EReference getsubsystem_Base_Actor();

	/**
	 * Returns the meta object for the reference '{@link com.github.nruzic.commons.model.profile.general.subsystem#getBase_Component <em>Base Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Component</em>'.
	 * @see com.github.nruzic.commons.model.profile.general.subsystem#getBase_Component()
	 * @see #getsubsystem()
	 * @generated
	 */
	EReference getsubsystem_Base_Component();

	/**
	 * Returns the meta object for class '{@link com.github.nruzic.commons.model.profile.general.external <em>external</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>external</em>'.
	 * @see com.github.nruzic.commons.model.profile.general.external
	 * @generated
	 */
	EClass getexternal();

	/**
	 * Returns the meta object for the reference '{@link com.github.nruzic.commons.model.profile.general.external#getBase_Actor <em>Base Actor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Actor</em>'.
	 * @see com.github.nruzic.commons.model.profile.general.external#getBase_Actor()
	 * @see #getexternal()
	 * @generated
	 */
	EReference getexternal_Base_Actor();

	/**
	 * Returns the meta object for the reference '{@link com.github.nruzic.commons.model.profile.general.external#getBase_Class <em>Base Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Class</em>'.
	 * @see com.github.nruzic.commons.model.profile.general.external#getBase_Class()
	 * @see #getexternal()
	 * @generated
	 */
	EReference getexternal_Base_Class();

	/**
	 * Returns the meta object for the reference '{@link com.github.nruzic.commons.model.profile.general.external#getBase_Component <em>Base Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Component</em>'.
	 * @see com.github.nruzic.commons.model.profile.general.external#getBase_Component()
	 * @see #getexternal()
	 * @generated
	 */
	EReference getexternal_Base_Component();

	/**
	 * Returns the meta object for the reference '{@link com.github.nruzic.commons.model.profile.general.external#getBase_ExecutionEnvironment <em>Base Execution Environment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Execution Environment</em>'.
	 * @see com.github.nruzic.commons.model.profile.general.external#getBase_ExecutionEnvironment()
	 * @see #getexternal()
	 * @generated
	 */
	EReference getexternal_Base_ExecutionEnvironment();

	/**
	 * Returns the meta object for the reference '{@link com.github.nruzic.commons.model.profile.general.external#getBase_Model <em>Base Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Model</em>'.
	 * @see com.github.nruzic.commons.model.profile.general.external#getBase_Model()
	 * @see #getexternal()
	 * @generated
	 */
	EReference getexternal_Base_Model();

	/**
	 * Returns the meta object for the reference '{@link com.github.nruzic.commons.model.profile.general.external#getBase_Node <em>Base Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Node</em>'.
	 * @see com.github.nruzic.commons.model.profile.general.external#getBase_Node()
	 * @see #getexternal()
	 * @generated
	 */
	EReference getexternal_Base_Node();

	/**
	 * Returns the meta object for the reference '{@link com.github.nruzic.commons.model.profile.general.external#getBase_Package <em>Base Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Package</em>'.
	 * @see com.github.nruzic.commons.model.profile.general.external#getBase_Package()
	 * @see #getexternal()
	 * @generated
	 */
	EReference getexternal_Base_Package();

	/**
	 * Returns the meta object for class '{@link com.github.nruzic.commons.model.profile.general.internal <em>internal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>internal</em>'.
	 * @see com.github.nruzic.commons.model.profile.general.internal
	 * @generated
	 */
	EClass getinternal();

	/**
	 * Returns the meta object for the reference '{@link com.github.nruzic.commons.model.profile.general.internal#getBase_Actor <em>Base Actor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Actor</em>'.
	 * @see com.github.nruzic.commons.model.profile.general.internal#getBase_Actor()
	 * @see #getinternal()
	 * @generated
	 */
	EReference getinternal_Base_Actor();

	/**
	 * Returns the meta object for the reference '{@link com.github.nruzic.commons.model.profile.general.internal#getBase_Class <em>Base Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Class</em>'.
	 * @see com.github.nruzic.commons.model.profile.general.internal#getBase_Class()
	 * @see #getinternal()
	 * @generated
	 */
	EReference getinternal_Base_Class();

	/**
	 * Returns the meta object for the reference '{@link com.github.nruzic.commons.model.profile.general.internal#getBase_Component <em>Base Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Component</em>'.
	 * @see com.github.nruzic.commons.model.profile.general.internal#getBase_Component()
	 * @see #getinternal()
	 * @generated
	 */
	EReference getinternal_Base_Component();

	/**
	 * Returns the meta object for the reference '{@link com.github.nruzic.commons.model.profile.general.internal#getBase_ExecutionEnvironment <em>Base Execution Environment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Execution Environment</em>'.
	 * @see com.github.nruzic.commons.model.profile.general.internal#getBase_ExecutionEnvironment()
	 * @see #getinternal()
	 * @generated
	 */
	EReference getinternal_Base_ExecutionEnvironment();

	/**
	 * Returns the meta object for the reference '{@link com.github.nruzic.commons.model.profile.general.internal#getBase_Model <em>Base Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Model</em>'.
	 * @see com.github.nruzic.commons.model.profile.general.internal#getBase_Model()
	 * @see #getinternal()
	 * @generated
	 */
	EReference getinternal_Base_Model();

	/**
	 * Returns the meta object for the reference '{@link com.github.nruzic.commons.model.profile.general.internal#getBase_Node <em>Base Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Node</em>'.
	 * @see com.github.nruzic.commons.model.profile.general.internal#getBase_Node()
	 * @see #getinternal()
	 * @generated
	 */
	EReference getinternal_Base_Node();

	/**
	 * Returns the meta object for the reference '{@link com.github.nruzic.commons.model.profile.general.internal#getBase_Package <em>Base Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Package</em>'.
	 * @see com.github.nruzic.commons.model.profile.general.internal#getBase_Package()
	 * @see #getinternal()
	 * @generated
	 */
	EReference getinternal_Base_Package();

	/**
	 * Returns the meta object for class '{@link com.github.nruzic.commons.model.profile.general.database <em>database</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>database</em>'.
	 * @see com.github.nruzic.commons.model.profile.general.database
	 * @generated
	 */
	EClass getdatabase();

	/**
	 * Returns the meta object for the reference '{@link com.github.nruzic.commons.model.profile.general.database#getBase_Actor <em>Base Actor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Actor</em>'.
	 * @see com.github.nruzic.commons.model.profile.general.database#getBase_Actor()
	 * @see #getdatabase()
	 * @generated
	 */
	EReference getdatabase_Base_Actor();

	/**
	 * Returns the meta object for the reference '{@link com.github.nruzic.commons.model.profile.general.database#getBase_Component <em>Base Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Component</em>'.
	 * @see com.github.nruzic.commons.model.profile.general.database#getBase_Component()
	 * @see #getdatabase()
	 * @generated
	 */
	EReference getdatabase_Base_Component();

	/**
	 * Returns the meta object for the reference '{@link com.github.nruzic.commons.model.profile.general.database#getBase_Node <em>Base Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Node</em>'.
	 * @see com.github.nruzic.commons.model.profile.general.database#getBase_Node()
	 * @see #getdatabase()
	 * @generated
	 */
	EReference getdatabase_Base_Node();

	/**
	 * Returns the meta object for the reference '{@link com.github.nruzic.commons.model.profile.general.database#getBase_Package <em>Base Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Package</em>'.
	 * @see com.github.nruzic.commons.model.profile.general.database#getBase_Package()
	 * @see #getdatabase()
	 * @generated
	 */
	EReference getdatabase_Base_Package();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	GeneralFactory getGeneralFactory();

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
		 * The meta object literal for the '{@link com.github.nruzic.commons.model.profile.general.impl.subsystemImpl <em>subsystem</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.nruzic.commons.model.profile.general.impl.subsystemImpl
		 * @see com.github.nruzic.commons.model.profile.general.impl.GeneralPackageImpl#getsubsystem()
		 * @generated
		 */
		EClass SUBSYSTEM = eINSTANCE.getsubsystem();

		/**
		 * The meta object literal for the '<em><b>Base Package</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBSYSTEM__BASE_PACKAGE = eINSTANCE.getsubsystem_Base_Package();

		/**
		 * The meta object literal for the '<em><b>Base Actor</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBSYSTEM__BASE_ACTOR = eINSTANCE.getsubsystem_Base_Actor();

		/**
		 * The meta object literal for the '<em><b>Base Component</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBSYSTEM__BASE_COMPONENT = eINSTANCE.getsubsystem_Base_Component();

		/**
		 * The meta object literal for the '{@link com.github.nruzic.commons.model.profile.general.impl.externalImpl <em>external</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.nruzic.commons.model.profile.general.impl.externalImpl
		 * @see com.github.nruzic.commons.model.profile.general.impl.GeneralPackageImpl#getexternal()
		 * @generated
		 */
		EClass EXTERNAL = eINSTANCE.getexternal();

		/**
		 * The meta object literal for the '<em><b>Base Actor</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTERNAL__BASE_ACTOR = eINSTANCE.getexternal_Base_Actor();

		/**
		 * The meta object literal for the '<em><b>Base Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTERNAL__BASE_CLASS = eINSTANCE.getexternal_Base_Class();

		/**
		 * The meta object literal for the '<em><b>Base Component</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTERNAL__BASE_COMPONENT = eINSTANCE.getexternal_Base_Component();

		/**
		 * The meta object literal for the '<em><b>Base Execution Environment</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTERNAL__BASE_EXECUTION_ENVIRONMENT = eINSTANCE.getexternal_Base_ExecutionEnvironment();

		/**
		 * The meta object literal for the '<em><b>Base Model</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTERNAL__BASE_MODEL = eINSTANCE.getexternal_Base_Model();

		/**
		 * The meta object literal for the '<em><b>Base Node</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTERNAL__BASE_NODE = eINSTANCE.getexternal_Base_Node();

		/**
		 * The meta object literal for the '<em><b>Base Package</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTERNAL__BASE_PACKAGE = eINSTANCE.getexternal_Base_Package();

		/**
		 * The meta object literal for the '{@link com.github.nruzic.commons.model.profile.general.impl.internalImpl <em>internal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.nruzic.commons.model.profile.general.impl.internalImpl
		 * @see com.github.nruzic.commons.model.profile.general.impl.GeneralPackageImpl#getinternal()
		 * @generated
		 */
		EClass INTERNAL = eINSTANCE.getinternal();

		/**
		 * The meta object literal for the '<em><b>Base Actor</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERNAL__BASE_ACTOR = eINSTANCE.getinternal_Base_Actor();

		/**
		 * The meta object literal for the '<em><b>Base Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERNAL__BASE_CLASS = eINSTANCE.getinternal_Base_Class();

		/**
		 * The meta object literal for the '<em><b>Base Component</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERNAL__BASE_COMPONENT = eINSTANCE.getinternal_Base_Component();

		/**
		 * The meta object literal for the '<em><b>Base Execution Environment</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERNAL__BASE_EXECUTION_ENVIRONMENT = eINSTANCE.getinternal_Base_ExecutionEnvironment();

		/**
		 * The meta object literal for the '<em><b>Base Model</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERNAL__BASE_MODEL = eINSTANCE.getinternal_Base_Model();

		/**
		 * The meta object literal for the '<em><b>Base Node</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERNAL__BASE_NODE = eINSTANCE.getinternal_Base_Node();

		/**
		 * The meta object literal for the '<em><b>Base Package</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERNAL__BASE_PACKAGE = eINSTANCE.getinternal_Base_Package();

		/**
		 * The meta object literal for the '{@link com.github.nruzic.commons.model.profile.general.impl.databaseImpl <em>database</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.nruzic.commons.model.profile.general.impl.databaseImpl
		 * @see com.github.nruzic.commons.model.profile.general.impl.GeneralPackageImpl#getdatabase()
		 * @generated
		 */
		EClass DATABASE = eINSTANCE.getdatabase();

		/**
		 * The meta object literal for the '<em><b>Base Actor</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATABASE__BASE_ACTOR = eINSTANCE.getdatabase_Base_Actor();

		/**
		 * The meta object literal for the '<em><b>Base Component</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATABASE__BASE_COMPONENT = eINSTANCE.getdatabase_Base_Component();

		/**
		 * The meta object literal for the '<em><b>Base Node</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATABASE__BASE_NODE = eINSTANCE.getdatabase_Base_Node();

		/**
		 * The meta object literal for the '<em><b>Base Package</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATABASE__BASE_PACKAGE = eINSTANCE.getdatabase_Base_Package();

	}

} //GeneralPackage
