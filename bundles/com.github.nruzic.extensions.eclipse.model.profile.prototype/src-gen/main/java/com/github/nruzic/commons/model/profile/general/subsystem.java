/**
 */
package com.github.nruzic.commons.model.profile.general;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>subsystem</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.github.nruzic.commons.model.profile.general.subsystem#getBase_Package <em>Base Package</em>}</li>
 * </ul>
 *
 * @see com.github.nruzic.commons.model.profile.general.GeneralPackage#getsubsystem()
 * @model
 * @generated
 */
public interface subsystem extends EObject
{
    /**
     * Returns the value of the '<em><b>Base Package</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Base Package</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Base Package</em>' reference.
     * @see #setBase_Package(org.eclipse.uml2.uml.Package)
     * @see com.github.nruzic.commons.model.profile.general.GeneralPackage#getsubsystem_Base_Package()
     * @model required="true" ordered="false"
     * @generated
     */
    org.eclipse.uml2.uml.Package getBase_Package();

    /**
     * Sets the value of the '{@link com.github.nruzic.commons.model.profile.general.subsystem#getBase_Package <em>Base Package</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Base Package</em>' reference.
     * @see #getBase_Package()
     * @generated
     */
    void setBase_Package(org.eclipse.uml2.uml.Package value);

} // subsystem
