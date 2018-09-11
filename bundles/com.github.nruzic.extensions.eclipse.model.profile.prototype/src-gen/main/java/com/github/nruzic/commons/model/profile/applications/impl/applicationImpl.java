/**
 */
package com.github.nruzic.commons.model.profile.applications.impl;

import com.github.nruzic.commons.model.profile.applications.ApplicationsPackage;
import com.github.nruzic.commons.model.profile.applications.application;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.uml2.uml.Actor;
import org.eclipse.uml2.uml.Component;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>application</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.github.nruzic.commons.model.profile.applications.impl.applicationImpl#getBase_Actor <em>Base Actor</em>}</li>
 *   <li>{@link com.github.nruzic.commons.model.profile.applications.impl.applicationImpl#getBase_Component <em>Base Component</em>}</li>
 * </ul>
 *
 * @generated
 */
public class applicationImpl extends MinimalEObjectImpl.Container implements application
{
    /**
     * The cached value of the '{@link #getBase_Actor() <em>Base Actor</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBase_Actor()
     * @generated
     * @ordered
     */
    protected Actor base_Actor;

    /**
     * The cached value of the '{@link #getBase_Component() <em>Base Component</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBase_Component()
     * @generated
     * @ordered
     */
    protected Component base_Component;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected applicationImpl()
    {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass()
    {
        return ApplicationsPackage.Literals.APPLICATION;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Actor getBase_Actor()
    {
        if (base_Actor != null && base_Actor.eIsProxy())
        {
            InternalEObject oldBase_Actor = (InternalEObject)base_Actor;
            base_Actor = (Actor)eResolveProxy(oldBase_Actor);
            if (base_Actor != oldBase_Actor)
            {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, ApplicationsPackage.APPLICATION__BASE_ACTOR, oldBase_Actor, base_Actor));
            }
        }
        return base_Actor;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Actor basicGetBase_Actor()
    {
        return base_Actor;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setBase_Actor(Actor newBase_Actor)
    {
        Actor oldBase_Actor = base_Actor;
        base_Actor = newBase_Actor;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ApplicationsPackage.APPLICATION__BASE_ACTOR, oldBase_Actor, base_Actor));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Component getBase_Component()
    {
        if (base_Component != null && base_Component.eIsProxy())
        {
            InternalEObject oldBase_Component = (InternalEObject)base_Component;
            base_Component = (Component)eResolveProxy(oldBase_Component);
            if (base_Component != oldBase_Component)
            {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, ApplicationsPackage.APPLICATION__BASE_COMPONENT, oldBase_Component, base_Component));
            }
        }
        return base_Component;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Component basicGetBase_Component()
    {
        return base_Component;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setBase_Component(Component newBase_Component)
    {
        Component oldBase_Component = base_Component;
        base_Component = newBase_Component;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ApplicationsPackage.APPLICATION__BASE_COMPONENT, oldBase_Component, base_Component));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType)
    {
        switch (featureID)
        {
            case ApplicationsPackage.APPLICATION__BASE_ACTOR:
                if (resolve) return getBase_Actor();
                return basicGetBase_Actor();
            case ApplicationsPackage.APPLICATION__BASE_COMPONENT:
                if (resolve) return getBase_Component();
                return basicGetBase_Component();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eSet(int featureID, Object newValue)
    {
        switch (featureID)
        {
            case ApplicationsPackage.APPLICATION__BASE_ACTOR:
                setBase_Actor((Actor)newValue);
                return;
            case ApplicationsPackage.APPLICATION__BASE_COMPONENT:
                setBase_Component((Component)newValue);
                return;
        }
        super.eSet(featureID, newValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eUnset(int featureID)
    {
        switch (featureID)
        {
            case ApplicationsPackage.APPLICATION__BASE_ACTOR:
                setBase_Actor((Actor)null);
                return;
            case ApplicationsPackage.APPLICATION__BASE_COMPONENT:
                setBase_Component((Component)null);
                return;
        }
        super.eUnset(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean eIsSet(int featureID)
    {
        switch (featureID)
        {
            case ApplicationsPackage.APPLICATION__BASE_ACTOR:
                return base_Actor != null;
            case ApplicationsPackage.APPLICATION__BASE_COMPONENT:
                return base_Component != null;
        }
        return super.eIsSet(featureID);
    }

} //applicationImpl
