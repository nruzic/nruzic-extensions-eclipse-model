/**
 */
package com.github.nruzic.commons.model.profile.devices.impl;

import com.github.nruzic.commons.model.profile.devices.DevicesPackage;
import com.github.nruzic.commons.model.profile.devices.device;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.uml2.uml.Actor;
import org.eclipse.uml2.uml.Component;
import org.eclipse.uml2.uml.Node;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>device</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.github.nruzic.commons.model.profile.devices.impl.deviceImpl#getBase_Actor <em>Base Actor</em>}</li>
 *   <li>{@link com.github.nruzic.commons.model.profile.devices.impl.deviceImpl#getBase_Component <em>Base Component</em>}</li>
 *   <li>{@link com.github.nruzic.commons.model.profile.devices.impl.deviceImpl#getBase_Node <em>Base Node</em>}</li>
 * </ul>
 *
 * @generated
 */
public class deviceImpl extends MinimalEObjectImpl.Container implements device {
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
	 * The cached value of the '{@link #getBase_Node() <em>Base Node</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_Node()
	 * @generated
	 * @ordered
	 */
	protected Node base_Node;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected deviceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DevicesPackage.Literals.DEVICE;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DevicesPackage.DEVICE__BASE_ACTOR, oldBase_Actor, base_Actor));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DevicesPackage.DEVICE__BASE_ACTOR, oldBase_Actor, base_Actor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Component getBase_Component() {
		if (base_Component != null && base_Component.eIsProxy()) {
			InternalEObject oldBase_Component = (InternalEObject)base_Component;
			base_Component = (Component)eResolveProxy(oldBase_Component);
			if (base_Component != oldBase_Component) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DevicesPackage.DEVICE__BASE_COMPONENT, oldBase_Component, base_Component));
			}
		}
		return base_Component;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Component basicGetBase_Component() {
		return base_Component;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase_Component(Component newBase_Component) {
		Component oldBase_Component = base_Component;
		base_Component = newBase_Component;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DevicesPackage.DEVICE__BASE_COMPONENT, oldBase_Component, base_Component));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node getBase_Node() {
		if (base_Node != null && base_Node.eIsProxy()) {
			InternalEObject oldBase_Node = (InternalEObject)base_Node;
			base_Node = (Node)eResolveProxy(oldBase_Node);
			if (base_Node != oldBase_Node) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DevicesPackage.DEVICE__BASE_NODE, oldBase_Node, base_Node));
			}
		}
		return base_Node;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node basicGetBase_Node() {
		return base_Node;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase_Node(Node newBase_Node) {
		Node oldBase_Node = base_Node;
		base_Node = newBase_Node;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DevicesPackage.DEVICE__BASE_NODE, oldBase_Node, base_Node));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DevicesPackage.DEVICE__BASE_ACTOR:
				if (resolve) return getBase_Actor();
				return basicGetBase_Actor();
			case DevicesPackage.DEVICE__BASE_COMPONENT:
				if (resolve) return getBase_Component();
				return basicGetBase_Component();
			case DevicesPackage.DEVICE__BASE_NODE:
				if (resolve) return getBase_Node();
				return basicGetBase_Node();
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
			case DevicesPackage.DEVICE__BASE_ACTOR:
				setBase_Actor((Actor)newValue);
				return;
			case DevicesPackage.DEVICE__BASE_COMPONENT:
				setBase_Component((Component)newValue);
				return;
			case DevicesPackage.DEVICE__BASE_NODE:
				setBase_Node((Node)newValue);
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
			case DevicesPackage.DEVICE__BASE_ACTOR:
				setBase_Actor((Actor)null);
				return;
			case DevicesPackage.DEVICE__BASE_COMPONENT:
				setBase_Component((Component)null);
				return;
			case DevicesPackage.DEVICE__BASE_NODE:
				setBase_Node((Node)null);
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
			case DevicesPackage.DEVICE__BASE_ACTOR:
				return base_Actor != null;
			case DevicesPackage.DEVICE__BASE_COMPONENT:
				return base_Component != null;
			case DevicesPackage.DEVICE__BASE_NODE:
				return base_Node != null;
		}
		return super.eIsSet(featureID);
	}

} //deviceImpl
