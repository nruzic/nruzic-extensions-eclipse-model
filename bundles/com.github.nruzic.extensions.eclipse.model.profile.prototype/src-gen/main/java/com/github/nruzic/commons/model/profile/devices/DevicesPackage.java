/**
 */
package com.github.nruzic.commons.model.profile.devices;

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
 * @see com.github.nruzic.commons.model.profile.devices.DevicesFactory
 * @model kind="package"
 * @generated
 */
public interface DevicesPackage extends EPackage
{
    /**
     * The package name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNAME = "devices";

    /**
     * The package namespace URI.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_URI = "http:///com/github/nruzic/commons/model/profile/devices.ecore";

    /**
     * The package namespace name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_PREFIX = "com.github.nruzic.commons.model.profile.devices";

    /**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    DevicesPackage eINSTANCE = com.github.nruzic.commons.model.profile.devices.impl.DevicesPackageImpl.init();

    /**
     * The meta object id for the '{@link com.github.nruzic.commons.model.profile.devices.impl.deviceImpl <em>device</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.github.nruzic.commons.model.profile.devices.impl.deviceImpl
     * @see com.github.nruzic.commons.model.profile.devices.impl.DevicesPackageImpl#getdevice()
     * @generated
     */
    int DEVICE = 0;

    /**
     * The feature id for the '<em><b>Base Actor</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DEVICE__BASE_ACTOR = 0;

    /**
     * The feature id for the '<em><b>Base Component</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DEVICE__BASE_COMPONENT = 1;

    /**
     * The feature id for the '<em><b>Base Node</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DEVICE__BASE_NODE = 2;

    /**
     * The number of structural features of the '<em>device</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DEVICE_FEATURE_COUNT = 3;

    /**
     * The number of operations of the '<em>device</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DEVICE_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link com.github.nruzic.commons.model.profile.devices.impl.carImpl <em>car</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.github.nruzic.commons.model.profile.devices.impl.carImpl
     * @see com.github.nruzic.commons.model.profile.devices.impl.DevicesPackageImpl#getcar()
     * @generated
     */
    int CAR = 1;

    /**
     * The feature id for the '<em><b>Base Actor</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAR__BASE_ACTOR = DEVICE__BASE_ACTOR;

    /**
     * The feature id for the '<em><b>Base Component</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAR__BASE_COMPONENT = DEVICE__BASE_COMPONENT;

    /**
     * The feature id for the '<em><b>Base Node</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAR__BASE_NODE = DEVICE__BASE_NODE;

    /**
     * The number of structural features of the '<em>car</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAR_FEATURE_COUNT = DEVICE_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>car</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAR_OPERATION_COUNT = DEVICE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link com.github.nruzic.commons.model.profile.devices.impl.phoneImpl <em>phone</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.github.nruzic.commons.model.profile.devices.impl.phoneImpl
     * @see com.github.nruzic.commons.model.profile.devices.impl.DevicesPackageImpl#getphone()
     * @generated
     */
    int PHONE = 2;

    /**
     * The feature id for the '<em><b>Base Actor</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PHONE__BASE_ACTOR = DEVICE__BASE_ACTOR;

    /**
     * The feature id for the '<em><b>Base Component</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PHONE__BASE_COMPONENT = DEVICE__BASE_COMPONENT;

    /**
     * The feature id for the '<em><b>Base Node</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PHONE__BASE_NODE = DEVICE__BASE_NODE;

    /**
     * The number of structural features of the '<em>phone</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PHONE_FEATURE_COUNT = DEVICE_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>phone</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PHONE_OPERATION_COUNT = DEVICE_OPERATION_COUNT + 0;


    /**
     * Returns the meta object for class '{@link com.github.nruzic.commons.model.profile.devices.device <em>device</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>device</em>'.
     * @see com.github.nruzic.commons.model.profile.devices.device
     * @generated
     */
    EClass getdevice();

    /**
     * Returns the meta object for the reference '{@link com.github.nruzic.commons.model.profile.devices.device#getBase_Actor <em>Base Actor</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Base Actor</em>'.
     * @see com.github.nruzic.commons.model.profile.devices.device#getBase_Actor()
     * @see #getdevice()
     * @generated
     */
    EReference getdevice_Base_Actor();

    /**
     * Returns the meta object for the reference '{@link com.github.nruzic.commons.model.profile.devices.device#getBase_Component <em>Base Component</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Base Component</em>'.
     * @see com.github.nruzic.commons.model.profile.devices.device#getBase_Component()
     * @see #getdevice()
     * @generated
     */
    EReference getdevice_Base_Component();

    /**
     * Returns the meta object for the reference '{@link com.github.nruzic.commons.model.profile.devices.device#getBase_Node <em>Base Node</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Base Node</em>'.
     * @see com.github.nruzic.commons.model.profile.devices.device#getBase_Node()
     * @see #getdevice()
     * @generated
     */
    EReference getdevice_Base_Node();

    /**
     * Returns the meta object for class '{@link com.github.nruzic.commons.model.profile.devices.car <em>car</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>car</em>'.
     * @see com.github.nruzic.commons.model.profile.devices.car
     * @generated
     */
    EClass getcar();

    /**
     * Returns the meta object for class '{@link com.github.nruzic.commons.model.profile.devices.phone <em>phone</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>phone</em>'.
     * @see com.github.nruzic.commons.model.profile.devices.phone
     * @generated
     */
    EClass getphone();

    /**
     * Returns the factory that creates the instances of the model.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the factory that creates the instances of the model.
     * @generated
     */
    DevicesFactory getDevicesFactory();

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
         * The meta object literal for the '{@link com.github.nruzic.commons.model.profile.devices.impl.deviceImpl <em>device</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see com.github.nruzic.commons.model.profile.devices.impl.deviceImpl
         * @see com.github.nruzic.commons.model.profile.devices.impl.DevicesPackageImpl#getdevice()
         * @generated
         */
        EClass DEVICE = eINSTANCE.getdevice();

        /**
         * The meta object literal for the '<em><b>Base Actor</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DEVICE__BASE_ACTOR = eINSTANCE.getdevice_Base_Actor();

        /**
         * The meta object literal for the '<em><b>Base Component</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DEVICE__BASE_COMPONENT = eINSTANCE.getdevice_Base_Component();

        /**
         * The meta object literal for the '<em><b>Base Node</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DEVICE__BASE_NODE = eINSTANCE.getdevice_Base_Node();

        /**
         * The meta object literal for the '{@link com.github.nruzic.commons.model.profile.devices.impl.carImpl <em>car</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see com.github.nruzic.commons.model.profile.devices.impl.carImpl
         * @see com.github.nruzic.commons.model.profile.devices.impl.DevicesPackageImpl#getcar()
         * @generated
         */
        EClass CAR = eINSTANCE.getcar();

        /**
         * The meta object literal for the '{@link com.github.nruzic.commons.model.profile.devices.impl.phoneImpl <em>phone</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see com.github.nruzic.commons.model.profile.devices.impl.phoneImpl
         * @see com.github.nruzic.commons.model.profile.devices.impl.DevicesPackageImpl#getphone()
         * @generated
         */
        EClass PHONE = eINSTANCE.getphone();

    }

} //DevicesPackage
