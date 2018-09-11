/**
 */
package com.github.nruzic.commons.model.profile.applications;

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
 * @see com.github.nruzic.commons.model.profile.applications.ApplicationsFactory
 * @model kind="package"
 * @generated
 */
public interface ApplicationsPackage extends EPackage
{
    /**
     * The package name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNAME = "applications";

    /**
     * The package namespace URI.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_URI = "http:///com/github/nruzic/commons/model/profile/applications.ecore";

    /**
     * The package namespace name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_PREFIX = "com.github.nruzic.commons.model.profile.applications";

    /**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    ApplicationsPackage eINSTANCE = com.github.nruzic.commons.model.profile.applications.impl.ApplicationsPackageImpl.init();

    /**
     * The meta object id for the '{@link com.github.nruzic.commons.model.profile.applications.impl.applicationImpl <em>application</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.github.nruzic.commons.model.profile.applications.impl.applicationImpl
     * @see com.github.nruzic.commons.model.profile.applications.impl.ApplicationsPackageImpl#getapplication()
     * @generated
     */
    int APPLICATION = 0;

    /**
     * The feature id for the '<em><b>Base Actor</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int APPLICATION__BASE_ACTOR = 0;

    /**
     * The feature id for the '<em><b>Base Component</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int APPLICATION__BASE_COMPONENT = 1;

    /**
     * The number of structural features of the '<em>application</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int APPLICATION_FEATURE_COUNT = 2;

    /**
     * The number of operations of the '<em>application</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int APPLICATION_OPERATION_COUNT = 0;


    /**
     * Returns the meta object for class '{@link com.github.nruzic.commons.model.profile.applications.application <em>application</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>application</em>'.
     * @see com.github.nruzic.commons.model.profile.applications.application
     * @generated
     */
    EClass getapplication();

    /**
     * Returns the meta object for the reference '{@link com.github.nruzic.commons.model.profile.applications.application#getBase_Actor <em>Base Actor</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Base Actor</em>'.
     * @see com.github.nruzic.commons.model.profile.applications.application#getBase_Actor()
     * @see #getapplication()
     * @generated
     */
    EReference getapplication_Base_Actor();

    /**
     * Returns the meta object for the reference '{@link com.github.nruzic.commons.model.profile.applications.application#getBase_Component <em>Base Component</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Base Component</em>'.
     * @see com.github.nruzic.commons.model.profile.applications.application#getBase_Component()
     * @see #getapplication()
     * @generated
     */
    EReference getapplication_Base_Component();

    /**
     * Returns the factory that creates the instances of the model.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the factory that creates the instances of the model.
     * @generated
     */
    ApplicationsFactory getApplicationsFactory();

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
         * The meta object literal for the '{@link com.github.nruzic.commons.model.profile.applications.impl.applicationImpl <em>application</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see com.github.nruzic.commons.model.profile.applications.impl.applicationImpl
         * @see com.github.nruzic.commons.model.profile.applications.impl.ApplicationsPackageImpl#getapplication()
         * @generated
         */
        EClass APPLICATION = eINSTANCE.getapplication();

        /**
         * The meta object literal for the '<em><b>Base Actor</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference APPLICATION__BASE_ACTOR = eINSTANCE.getapplication_Base_Actor();

        /**
         * The meta object literal for the '<em><b>Base Component</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference APPLICATION__BASE_COMPONENT = eINSTANCE.getapplication_Base_Component();

    }

} //ApplicationsPackage
