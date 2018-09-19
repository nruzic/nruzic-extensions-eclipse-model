/**
 */
package com.github.nruzic.commons.model.profile.devices;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see com.github.nruzic.commons.model.profile.devices.DevicesPackage
 * @generated
 */
public interface DevicesFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DevicesFactory eINSTANCE = com.github.nruzic.commons.model.profile.devices.impl.DevicesFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>device</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>device</em>'.
	 * @generated
	 */
	device createdevice();

	/**
	 * Returns a new object of class '<em>car</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>car</em>'.
	 * @generated
	 */
	car createcar();

	/**
	 * Returns a new object of class '<em>phone</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>phone</em>'.
	 * @generated
	 */
	phone createphone();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	DevicesPackage getDevicesPackage();

} //DevicesFactory
