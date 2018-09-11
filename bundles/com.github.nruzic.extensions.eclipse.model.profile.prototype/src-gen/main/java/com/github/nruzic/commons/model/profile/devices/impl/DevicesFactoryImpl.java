/**
 */
package com.github.nruzic.commons.model.profile.devices.impl;

import com.github.nruzic.commons.model.profile.devices.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DevicesFactoryImpl extends EFactoryImpl implements DevicesFactory
{
    /**
     * Creates the default factory implementation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static DevicesFactory init()
    {
        try
        {
            DevicesFactory theDevicesFactory = (DevicesFactory)EPackage.Registry.INSTANCE.getEFactory(DevicesPackage.eNS_URI);
            if (theDevicesFactory != null)
            {
                return theDevicesFactory;
            }
        }
        catch (Exception exception)
        {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new DevicesFactoryImpl();
    }

    /**
     * Creates an instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DevicesFactoryImpl()
    {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EObject create(EClass eClass)
    {
        switch (eClass.getClassifierID())
        {
            case DevicesPackage.DEVICE: return createdevice();
            case DevicesPackage.CAR: return createcar();
            case DevicesPackage.PHONE: return createphone();
            default:
                throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public device createdevice()
    {
        deviceImpl device = new deviceImpl();
        return device;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public car createcar()
    {
        carImpl car = new carImpl();
        return car;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public phone createphone()
    {
        phoneImpl phone = new phoneImpl();
        return phone;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DevicesPackage getDevicesPackage()
    {
        return (DevicesPackage)getEPackage();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @deprecated
     * @generated
     */
    @Deprecated
    public static DevicesPackage getPackage()
    {
        return DevicesPackage.eINSTANCE;
    }

} //DevicesFactoryImpl
