/**
 */
package com.github.nruzic.commons.model.profile.general.impl;

import com.github.nruzic.commons.model.profile.applications.ApplicationsPackage;

import com.github.nruzic.commons.model.profile.applications.impl.ApplicationsPackageImpl;

import com.github.nruzic.commons.model.profile.devices.DevicesPackage;

import com.github.nruzic.commons.model.profile.devices.impl.DevicesPackageImpl;

import com.github.nruzic.commons.model.profile.general.GeneralFactory;
import com.github.nruzic.commons.model.profile.general.GeneralPackage;
import com.github.nruzic.commons.model.profile.general.subsystem;

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
public class GeneralPackageImpl extends EPackageImpl implements GeneralPackage
{
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass subsystemEClass = null;

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
     * @see com.github.nruzic.commons.model.profile.general.GeneralPackage#eNS_URI
     * @see #init()
     * @generated
     */
    private GeneralPackageImpl()
    {
        super(eNS_URI, GeneralFactory.eINSTANCE);
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
     * <p>This method is used to initialize {@link GeneralPackage#eINSTANCE} when that field is accessed.
     * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #eNS_URI
     * @see #createPackageContents()
     * @see #initializePackageContents()
     * @generated
     */
    public static GeneralPackage init()
    {
        if (isInited) return (GeneralPackage)EPackage.Registry.INSTANCE.getEPackage(GeneralPackage.eNS_URI);

        // Obtain or create and register package
        GeneralPackageImpl theGeneralPackage = (GeneralPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof GeneralPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new GeneralPackageImpl());

        isInited = true;

        // Initialize simple dependencies
        EcorePackage.eINSTANCE.eClass();
        TypesPackage.eINSTANCE.eClass();
        UMLPackage.eINSTANCE.eClass();

        // Obtain or create and register interdependencies
        ApplicationsPackageImpl theApplicationsPackage = (ApplicationsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ApplicationsPackage.eNS_URI) instanceof ApplicationsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ApplicationsPackage.eNS_URI) : ApplicationsPackage.eINSTANCE);
        DevicesPackageImpl theDevicesPackage = (DevicesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DevicesPackage.eNS_URI) instanceof DevicesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DevicesPackage.eNS_URI) : DevicesPackage.eINSTANCE);
        TestPackageImpl theTestPackage = (TestPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TestPackage.eNS_URI) instanceof TestPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TestPackage.eNS_URI) : TestPackage.eINSTANCE);

        // Create package meta-data objects
        theGeneralPackage.createPackageContents();
        theApplicationsPackage.createPackageContents();
        theDevicesPackage.createPackageContents();
        theTestPackage.createPackageContents();

        // Initialize created meta-data
        theGeneralPackage.initializePackageContents();
        theApplicationsPackage.initializePackageContents();
        theDevicesPackage.initializePackageContents();
        theTestPackage.initializePackageContents();

        // Mark meta-data to indicate it can't be changed
        theGeneralPackage.freeze();

  
        // Update the registry and return the package
        EPackage.Registry.INSTANCE.put(GeneralPackage.eNS_URI, theGeneralPackage);
        return theGeneralPackage;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getsubsystem()
    {
        return subsystemEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getsubsystem_Base_Package()
    {
        return (EReference)subsystemEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public GeneralFactory getGeneralFactory()
    {
        return (GeneralFactory)getEFactoryInstance();
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
        subsystemEClass = createEClass(SUBSYSTEM);
        createEReference(subsystemEClass, SUBSYSTEM__BASE_PACKAGE);
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
        initEClass(subsystemEClass, subsystem.class, "subsystem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getsubsystem_Base_Package(), theUMLPackage.getPackage(), null, "base_Package", null, 1, 1, subsystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

        // Create resource
        createResource(eNS_URI);
    }

} //GeneralPackageImpl