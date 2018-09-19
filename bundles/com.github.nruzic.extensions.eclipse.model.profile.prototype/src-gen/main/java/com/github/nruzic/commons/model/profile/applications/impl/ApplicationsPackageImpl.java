/**
 */
package com.github.nruzic.commons.model.profile.applications.impl;

import com.github.nruzic.commons.model.profile.applications.ApplicationsFactory;
import com.github.nruzic.commons.model.profile.applications.ApplicationsPackage;
import com.github.nruzic.commons.model.profile.applications.application;
import com.github.nruzic.commons.model.profile.applications.thickclientapplication;
import com.github.nruzic.commons.model.profile.applications.thinclientapplication;

import com.github.nruzic.commons.model.profile.devices.DevicesPackage;

import com.github.nruzic.commons.model.profile.devices.impl.DevicesPackageImpl;

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
public class ApplicationsPackageImpl extends EPackageImpl implements ApplicationsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass applicationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass thickclientapplicationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass thinclientapplicationEClass = null;

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
	 * @see com.github.nruzic.commons.model.profile.applications.ApplicationsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ApplicationsPackageImpl() {
		super(eNS_URI, ApplicationsFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ApplicationsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ApplicationsPackage init() {
		if (isInited) return (ApplicationsPackage)EPackage.Registry.INSTANCE.getEPackage(ApplicationsPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredApplicationsPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		ApplicationsPackageImpl theApplicationsPackage = registeredApplicationsPackage instanceof ApplicationsPackageImpl ? (ApplicationsPackageImpl)registeredApplicationsPackage : new ApplicationsPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		EcorePackage.eINSTANCE.eClass();
		TypesPackage.eINSTANCE.eClass();
		UMLPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(GeneralPackage.eNS_URI);
		GeneralPackageImpl theGeneralPackage = (GeneralPackageImpl)(registeredPackage instanceof GeneralPackageImpl ? registeredPackage : GeneralPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(DevicesPackage.eNS_URI);
		DevicesPackageImpl theDevicesPackage = (DevicesPackageImpl)(registeredPackage instanceof DevicesPackageImpl ? registeredPackage : DevicesPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(TestPackage.eNS_URI);
		TestPackageImpl theTestPackage = (TestPackageImpl)(registeredPackage instanceof TestPackageImpl ? registeredPackage : TestPackage.eINSTANCE);

		// Create package meta-data objects
		theApplicationsPackage.createPackageContents();
		theGeneralPackage.createPackageContents();
		theDevicesPackage.createPackageContents();
		theTestPackage.createPackageContents();

		// Initialize created meta-data
		theApplicationsPackage.initializePackageContents();
		theGeneralPackage.initializePackageContents();
		theDevicesPackage.initializePackageContents();
		theTestPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theApplicationsPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ApplicationsPackage.eNS_URI, theApplicationsPackage);
		return theApplicationsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getapplication() {
		return applicationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getthickclientapplication() {
		return thickclientapplicationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getthickclientapplication_Base_Actor() {
		return (EReference)thickclientapplicationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getthinclientapplication() {
		return thinclientapplicationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getthinclientapplication_Base_Component() {
		return (EReference)thinclientapplicationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApplicationsFactory getApplicationsFactory() {
		return (ApplicationsFactory)getEFactoryInstance();
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
		applicationEClass = createEClass(APPLICATION);

		thickclientapplicationEClass = createEClass(THICKCLIENTAPPLICATION);
		createEReference(thickclientapplicationEClass, THICKCLIENTAPPLICATION__BASE_ACTOR);

		thinclientapplicationEClass = createEClass(THINCLIENTAPPLICATION);
		createEReference(thinclientapplicationEClass, THINCLIENTAPPLICATION__BASE_COMPONENT);
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
		applicationEClass.getESuperTypes().add(this.getthickclientapplication());
		applicationEClass.getESuperTypes().add(this.getthinclientapplication());

		// Initialize classes, features, and operations; add parameters
		initEClass(applicationEClass, application.class, "application", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(thickclientapplicationEClass, thickclientapplication.class, "thickclientapplication", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getthickclientapplication_Base_Actor(), theUMLPackage.getActor(), null, "base_Actor", null, 1, 1, thickclientapplication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(thinclientapplicationEClass, thinclientapplication.class, "thinclientapplication", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getthinclientapplication_Base_Component(), theUMLPackage.getComponent(), null, "base_Component", null, 1, 1, thinclientapplication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/uml2/2.0.0/UML
		createUMLAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/uml2/2.0.0/UML</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createUMLAnnotations() {
		String source = "http://www.eclipse.org/uml2/2.0.0/UML";
		addAnnotation
		  (thickclientapplicationEClass,
		   source,
		   new String[] {
			   "originalName", "thick-client-application"
		   });
		addAnnotation
		  (thinclientapplicationEClass,
		   source,
		   new String[] {
			   "originalName", "thin-client-application"
		   });
	}

} //ApplicationsPackageImpl
