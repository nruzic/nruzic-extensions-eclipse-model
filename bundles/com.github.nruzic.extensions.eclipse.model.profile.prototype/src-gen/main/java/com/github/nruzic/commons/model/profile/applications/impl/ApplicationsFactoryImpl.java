/**
 */
package com.github.nruzic.commons.model.profile.applications.impl;

import com.github.nruzic.commons.model.profile.applications.*;

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
public class ApplicationsFactoryImpl extends EFactoryImpl implements ApplicationsFactory
{
    /**
     * Creates the default factory implementation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static ApplicationsFactory init()
    {
        try
        {
            ApplicationsFactory theApplicationsFactory = (ApplicationsFactory)EPackage.Registry.INSTANCE.getEFactory(ApplicationsPackage.eNS_URI);
            if (theApplicationsFactory != null)
            {
                return theApplicationsFactory;
            }
        }
        catch (Exception exception)
        {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new ApplicationsFactoryImpl();
    }

    /**
     * Creates an instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ApplicationsFactoryImpl()
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
            case ApplicationsPackage.APPLICATION: return createapplication();
            default:
                throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public application createapplication()
    {
        applicationImpl application = new applicationImpl();
        return application;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ApplicationsPackage getApplicationsPackage()
    {
        return (ApplicationsPackage)getEPackage();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @deprecated
     * @generated
     */
    @Deprecated
    public static ApplicationsPackage getPackage()
    {
        return ApplicationsPackage.eINSTANCE;
    }

} //ApplicationsFactoryImpl
