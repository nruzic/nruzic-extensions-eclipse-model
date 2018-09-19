/**
 */
package com.github.nruzic.commons.model.profile.devices.impl;

import com.github.nruzic.commons.model.profile.applications.ApplicationsPackage;

import com.github.nruzic.commons.model.profile.applications.impl.ApplicationsPackageImpl;

import com.github.nruzic.commons.model.profile.devices.DevicesFactory;
import com.github.nruzic.commons.model.profile.devices.DevicesPackage;
import com.github.nruzic.commons.model.profile.devices.car;
import com.github.nruzic.commons.model.profile.devices.device;
import com.github.nruzic.commons.model.profile.devices.phone;

import com.github.nruzic.commons.model.profile.general.GeneralPackage;

import com.github.nruzic.commons.model.profile.general.impl.GeneralPackageImpl;

import com.github.nruzic.commons.model.profile.test.TestPackage;

import com.github.nruzic.commons.model.profile.test.impl.TestPackageImpl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.uml2.types.TypesPackage;

import org.eclipse.uml2.uml.UMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DevicesPackageImpl extends EPackageImpl implements DevicesPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deviceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass carEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass phoneEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see com.github.nruzic.commons.model.profile.devices.DevicesPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private DevicesPackageImpl() {
		super(eNS_URI, DevicesFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link DevicesPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static DevicesPackage init() {
		if (isInited) return (DevicesPackage)EPackage.Registry.INSTANCE.getEPackage(DevicesPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredDevicesPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		DevicesPackageImpl theDevicesPackage = registeredDevicesPackage instanceof DevicesPackageImpl ? (DevicesPackageImpl)registeredDevicesPackage : new DevicesPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		EcorePackage.eINSTANCE.eClass();
		TypesPackage.eINSTANCE.eClass();
		UMLPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(GeneralPackage.eNS_URI);
		GeneralPackageImpl theGeneralPackage = (GeneralPackageImpl)(registeredPackage instanceof GeneralPackageImpl ? registeredPackage : GeneralPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ApplicationsPackage.eNS_URI);
		ApplicationsPackageImpl theApplicationsPackage = (ApplicationsPackageImpl)(registeredPackage instanceof ApplicationsPackageImpl ? registeredPackage : ApplicationsPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(TestPackage.eNS_URI);
		TestPackageImpl theTestPackage = (TestPackageImpl)(registeredPackage instanceof TestPackageImpl ? registeredPackage : TestPackage.eINSTANCE);

		// Create package meta-data objects
		theDevicesPackage.createPackageContents();
		theGeneralPackage.createPackageContents();
		theApplicationsPackage.createPackageContents();
		theTestPackage.createPackageContents();

		// Initialize created meta-data
		theDevicesPackage.initializePackageContents();
		theGeneralPackage.initializePackageContents();
		theApplicationsPackage.initializePackageContents();
		theTestPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theDevicesPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(DevicesPackage.eNS_URI, theDevicesPackage);
		return theDevicesPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getdevice() {
		return deviceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getdevice_Base_Actor() {
		return (EReference)deviceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getdevice_Base_Component() {
		return (EReference)deviceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getdevice_Base_Node() {
		return (EReference)deviceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getcar() {
		return carEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getphone() {
		return phoneEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DevicesFactory getDevicesFactory() {
		return (DevicesFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		deviceEClass = createEClass(DEVICE);
		createEReference(deviceEClass, DEVICE__BASE_ACTOR);
		createEReference(deviceEClass, DEVICE__BASE_COMPONENT);
		createEReference(deviceEClass, DEVICE__BASE_NODE);

		carEClass = createEClass(CAR);

		phoneEClass = createEClass(PHONE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		UMLPackage theUMLPackage = (UMLPackage)EPackage.Registry.INSTANCE.getEPackage(UMLPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		carEClass.getESuperTypes().add(this.getdevice());
		phoneEClass.getESuperTypes().add(this.getdevice());

		// Initialize classes, features, and operations; add parameters
		initEClass(deviceEClass, device.class, "device", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getdevice_Base_Actor(), theUMLPackage.getActor(), null, "base_Actor", null, 1, 1, device.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getdevice_Base_Component(), theUMLPackage.getComponent(), null, "base_Component", null, 1, 1, device.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getdevice_Base_Node(), theUMLPackage.getNode(), null, "base_Node", null, 1, 1, device.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(carEClass, car.class, "car", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(phoneEClass, phone.class, "phone", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //DevicesPackageImpl
