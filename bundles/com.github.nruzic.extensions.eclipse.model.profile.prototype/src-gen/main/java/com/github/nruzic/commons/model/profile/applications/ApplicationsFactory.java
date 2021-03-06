/**
 */
package com.github.nruzic.commons.model.profile.applications;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see com.github.nruzic.commons.model.profile.applications.ApplicationsPackage
 * @generated
 */
public interface ApplicationsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ApplicationsFactory eINSTANCE = com.github.nruzic.commons.model.profile.applications.impl.ApplicationsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>application</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>application</em>'.
	 * @generated
	 */
	application createapplication();

	/**
	 * Returns a new object of class '<em>thickclientapplication</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>thickclientapplication</em>'.
	 * @generated
	 */
	thickclientapplication createthickclientapplication();

	/**
	 * Returns a new object of class '<em>thinclientapplication</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>thinclientapplication</em>'.
	 * @generated
	 */
	thinclientapplication createthinclientapplication();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ApplicationsPackage getApplicationsPackage();

} //ApplicationsFactory
