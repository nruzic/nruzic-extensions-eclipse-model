/**
 */
package com.github.nruzic.commons.model.profile.devices;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.uml2.uml.Actor;
import org.eclipse.uml2.uml.Component;
import org.eclipse.uml2.uml.Node;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>device</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.github.nruzic.commons.model.profile.devices.device#getBase_Actor <em>Base Actor</em>}</li>
 *   <li>{@link com.github.nruzic.commons.model.profile.devices.device#getBase_Component <em>Base Component</em>}</li>
 *   <li>{@link com.github.nruzic.commons.model.profile.devices.device#getBase_Node <em>Base Node</em>}</li>
 * </ul>
 *
 * @see com.github.nruzic.commons.model.profile.devices.DevicesPackage#getdevice()
 * @model
 * @generated
 */
public interface device extends EObject
{
    /**
     * Returns the value of the '<em><b>Base Actor</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Base Actor</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Base Actor</em>' reference.
     * @see #setBase_Actor(Actor)
     * @see com.github.nruzic.commons.model.profile.devices.DevicesPackage#getdevice_Base_Actor()
     * @model required="true" ordered="false"
     * @generated
     */
    Actor getBase_Actor();

    /**
     * Sets the value of the '{@link com.github.nruzic.commons.model.profile.devices.device#getBase_Actor <em>Base Actor</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Base Actor</em>' reference.
     * @see #getBase_Actor()
     * @generated
     */
    void setBase_Actor(Actor value);

    /**
     * Returns the value of the '<em><b>Base Component</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Base Component</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Base Component</em>' reference.
     * @see #setBase_Component(Component)
     * @see com.github.nruzic.commons.model.profile.devices.DevicesPackage#getdevice_Base_Component()
     * @model required="true" ordered="false"
     * @generated
     */
    Component getBase_Component();

    /**
     * Sets the value of the '{@link com.github.nruzic.commons.model.profile.devices.device#getBase_Component <em>Base Component</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Base Component</em>' reference.
     * @see #getBase_Component()
     * @generated
     */
    void setBase_Component(Component value);

    /**
     * Returns the value of the '<em><b>Base Node</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Base Node</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Base Node</em>' reference.
     * @see #setBase_Node(Node)
     * @see com.github.nruzic.commons.model.profile.devices.DevicesPackage#getdevice_Base_Node()
     * @model required="true" ordered="false"
     * @generated
     */
    Node getBase_Node();

    /**
     * Sets the value of the '{@link com.github.nruzic.commons.model.profile.devices.device#getBase_Node <em>Base Node</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Base Node</em>' reference.
     * @see #getBase_Node()
     * @generated
     */
    void setBase_Node(Node value);

} // device
