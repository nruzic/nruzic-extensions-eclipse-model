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
public interface GeneralPackage extends EPackage
{
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
     * The number of structural features of the '<em>subsystem</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUBSYSTEM_FEATURE_COUNT = 1;

    /**
     * The number of operations of the '<em>subsystem</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUBSYSTEM_OPERATION_COUNT = 0;


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
    interface Literals
    {
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

    }

} //GeneralPackage
