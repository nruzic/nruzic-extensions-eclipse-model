/**
 */
package com.github.nruzic.commons.model.profile.applications.impl;

import com.github.nruzic.commons.model.profile.applications.ApplicationsPackage;
import com.github.nruzic.commons.model.profile.applications.thickclientapplication;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.uml2.uml.Actor;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>thickclientapplication</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.github.nruzic.commons.model.profile.applications.impl.thickclientapplicationImpl#getBase_Actor <em>Base Actor</em>}</li>
 * </ul>
 *
 * @generated
 */
public class thickclientapplicationImpl extends MinimalEObjectImpl.Container implements thickclientapplication {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected thickclientapplicationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApplicationsPackage.Literals.THICKCLIENTAPPLICATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Actor getBase_Actor() {
		if (base_Actor != null && base_Actor.eIsProxy()) {
			InternalEObject oldBase_Actor = (InternalEObject)base_Actor;
			base_Actor = (Actor)eResolveProxy(oldBase_Actor);
			if (base_Actor != oldBase_Actor) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ApplicationsPackage.THICKCLIENTAPPLICATION__BASE_ACTOR, oldBase_Actor, base_Actor));
			}
		}
		return base_Actor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Actor basicGetBase_Actor() {
		return base_Actor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase_Actor(Actor newBase_Actor) {
		Actor oldBase_Actor = base_Actor;
		base_Actor = newBase_Actor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApplicationsPackage.THICKCLIENTAPPLICATION__BASE_ACTOR, oldBase_Actor, base_Actor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ApplicationsPackage.THICKCLIENTAPPLICATION__BASE_ACTOR:
				if (resolve) return getBase_Actor();
				return basicGetBase_Actor();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ApplicationsPackage.THICKCLIENTAPPLICATION__BASE_ACTOR:
				setBase_Actor((Actor)newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
			case ApplicationsPackage.THICKCLIENTAPPLICATION__BASE_ACTOR:
				setBase_Actor((Actor)null);
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ApplicationsPackage.THICKCLIENTAPPLICATION__BASE_ACTOR:
				return base_Actor != null;
		}
		return super.eIsSet(featureID);
	}

} //thickclientapplicationImpl
