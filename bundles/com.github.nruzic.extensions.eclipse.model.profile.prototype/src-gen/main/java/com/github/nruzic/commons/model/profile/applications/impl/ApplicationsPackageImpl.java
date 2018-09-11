/**
 */
package com.github.nruzic.commons.model.profile.applications.impl;

import com.github.nruzic.commons.model.profile.applications.ApplicationsFactory;
import com.github.nruzic.commons.model.profile.applications.ApplicationsPackage;
import com.github.nruzic.commons.model.profile.applications.application;

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
public class ApplicationsPackageImpl extends EPackageImpl implements ApplicationsPackage
{
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass applicationEClass = null;

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
    private ApplicationsPackageImpl()
    {
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
    public static ApplicationsPackage init()
    {
        if (isInited) return (ApplicationsPackage)EPackage.Registry.INSTANCE.getEPackage(ApplicationsPackage.eNS_URI);

        // Obtain or create and register package
        ApplicationsPackageImpl theApplicationsPackage = (ApplicationsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ApplicationsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ApplicationsPackageImpl());

        isInited = true;

        // Initialize simple dependencies
        EcorePackage.eINSTANCE.eClass();
        TypesPackage.eINSTANCE.eClass();
        UMLPackage.eINSTANCE.eClass();

        // Obtain or create and register interdependencies
        GeneralPackageImpl theGeneralPackage = (GeneralPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(GeneralPackage.eNS_URI) instanceof GeneralPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(GeneralPackage.eNS_URI) : GeneralPackage.eINSTANCE);
        DevicesPackageImpl theDevicesPackage = (DevicesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DevicesPackage.eNS_URI) instanceof DevicesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DevicesPackage.eNS_URI) : DevicesPackage.eINSTANCE);
        TestPackageImpl theTestPackage = (TestPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TestPackage.eNS_URI) instanceof TestPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TestPackage.eNS_URI) : TestPackage.eINSTANCE);

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
    public EClass getapplication()
    {
        return applicationEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getapplication_Base_Actor()
    {
        return (EReference)applicationEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getapplication_Base_Component()
    {
        return (EReference)applicationEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ApplicationsFactory getApplicationsFactory()
    {
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
    public void createPackageContents()
    {
        if (isCreated) return;
        isCreated = true;

        // Create classes and their features
        applicationEClass = createEClass(APPLICATION);
        createEReference(applicationEClass, APPLICATION__BASE_ACTOR);
        createEReference(applicationEClass, APPLICATION__BASE_COMPONENT);
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
    public void initializePackageContents()
    {
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

        // Initialize classes, features, and operations; add parameters
        initEClass(applicationEClass, application.class, "application", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getapplication_Base_Actor(), theUMLPackage.getActor(), null, "base_Actor", null, 1, 1, application.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
        initEReference(getapplication_Base_Component(), theUMLPackage.getComponent(), null, "base_Component", null, 1, 1, application.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

        // Create resource
        createResource(eNS_URI);
    }

} //ApplicationsPackageImpl
