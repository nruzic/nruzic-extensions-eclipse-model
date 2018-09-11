/**
 */
package com.github.nruzic.commons.model.profile.test;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see com.github.nruzic.commons.model.profile.test.TestPackage
 * @generated
 */
public interface TestFactory extends EFactory
{
    /**
     * The singleton instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    TestFactory eINSTANCE = com.github.nruzic.commons.model.profile.test.impl.TestFactoryImpl.init();

    /**
     * Returns a new object of class '<em>test</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>test</em>'.
     * @generated
     */
    test createtest();

    /**
     * Returns the package supported by this factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the package supported by this factory.
     * @generated
     */
    TestPackage getTestPackage();

} //TestFactory
