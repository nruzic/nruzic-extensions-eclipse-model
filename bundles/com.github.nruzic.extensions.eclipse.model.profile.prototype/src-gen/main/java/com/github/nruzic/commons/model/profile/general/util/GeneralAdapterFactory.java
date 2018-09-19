/**
 */
package com.github.nruzic.commons.model.profile.general.util;

import com.github.nruzic.commons.model.profile.general.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see com.github.nruzic.commons.model.profile.general.GeneralPackage
 * @generated
 */
public class GeneralAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static GeneralPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneralAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = GeneralPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GeneralSwitch<Adapter> modelSwitch =
		new GeneralSwitch<Adapter>() {
			@Override
			public Adapter casesubsystem(subsystem object) {
				return createsubsystemAdapter();
			}
			@Override
			public Adapter caseexternal(external object) {
				return createexternalAdapter();
			}
			@Override
			public Adapter caseinternal(internal object) {
				return createinternalAdapter();
			}
			@Override
			public Adapter casedatabase(database object) {
				return createdatabaseAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link com.github.nruzic.commons.model.profile.general.subsystem <em>subsystem</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.github.nruzic.commons.model.profile.general.subsystem
	 * @generated
	 */
	public Adapter createsubsystemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.github.nruzic.commons.model.profile.general.external <em>external</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.github.nruzic.commons.model.profile.general.external
	 * @generated
	 */
	public Adapter createexternalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.github.nruzic.commons.model.profile.general.internal <em>internal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.github.nruzic.commons.model.profile.general.internal
	 * @generated
	 */
	public Adapter createinternalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.github.nruzic.commons.model.profile.general.database <em>database</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.github.nruzic.commons.model.profile.general.database
	 * @generated
	 */
	public Adapter createdatabaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //GeneralAdapterFactory
