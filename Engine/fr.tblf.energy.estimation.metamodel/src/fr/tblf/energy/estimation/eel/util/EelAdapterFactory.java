/**
 */
package fr.tblf.energy.estimation.eel.util;

import fr.tblf.energy.estimation.eel.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see fr.tblf.energy.estimation.eel.EelPackage
 * @generated
 */
public class EelAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static EelPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EelAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = EelPackage.eINSTANCE;
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
	protected EelSwitch<Adapter> modelSwitch =
		new EelSwitch<Adapter>() {
			@Override
			public Adapter casePlatform(Platform object) {
				return createPlatformAdapter();
			}
			@Override
			public Adapter caseVariable(Variable object) {
				return createVariableAdapter();
			}
			@Override
			public Adapter caseMeasure(Measure object) {
				return createMeasureAdapter();
			}
			@Override
			public Adapter caseTypedMeasure(TypedMeasure object) {
				return createTypedMeasureAdapter();
			}
			@Override
			public Adapter caseMeasureValue(MeasureValue object) {
				return createMeasureValueAdapter();
			}
			@Override
			public Adapter caseMeasureOCL(MeasureOCL object) {
				return createMeasureOCLAdapter();
			}
			@Override
			public Adapter caseMeasureAttribute(MeasureAttribute object) {
				return createMeasureAttributeAdapter();
			}
			@Override
			public Adapter caseMeasureCast(MeasureCast object) {
				return createMeasureCastAdapter();
			}
			@Override
			public Adapter caseMeasureOperation(MeasureOperation object) {
				return createMeasureOperationAdapter();
			}
			@Override
			public Adapter caseMeasureProductOperation(MeasureProductOperation object) {
				return createMeasureProductOperationAdapter();
			}
			@Override
			public Adapter caseMeasureSumOperation(MeasureSumOperation object) {
				return createMeasureSumOperationAdapter();
			}
			@Override
			public Adapter caseEnergyComputation(EnergyComputation object) {
				return createEnergyComputationAdapter();
			}
			@Override
			public Adapter casePowerComputation(PowerComputation object) {
				return createPowerComputationAdapter();
			}
			@Override
			public Adapter caseMeasurementUncertainty(MeasurementUncertainty object) {
				return createMeasurementUncertaintyAdapter();
			}
			@Override
			public Adapter caseNormalDistribution(NormalDistribution object) {
				return createNormalDistributionAdapter();
			}
			@Override
			public Adapter caseInterval(Interval object) {
				return createIntervalAdapter();
			}
			@Override
			public Adapter caseMeasurementUncertaintyInformation(MeasurementUncertaintyInformation object) {
				return createMeasurementUncertaintyInformationAdapter();
			}
			@Override
			public Adapter caseSampling(Sampling object) {
				return createSamplingAdapter();
			}
			@Override
			public Adapter caseIntegral(Integral object) {
				return createIntegralAdapter();
			}
			@Override
			public Adapter caseSample(Sample object) {
				return createSampleAdapter();
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
	 * Creates a new adapter for an object of class '{@link fr.tblf.energy.estimation.eel.Platform <em>Platform</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.tblf.energy.estimation.eel.Platform
	 * @generated
	 */
	public Adapter createPlatformAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.tblf.energy.estimation.eel.Variable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.tblf.energy.estimation.eel.Variable
	 * @generated
	 */
	public Adapter createVariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.tblf.energy.estimation.eel.Measure <em>Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.tblf.energy.estimation.eel.Measure
	 * @generated
	 */
	public Adapter createMeasureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.tblf.energy.estimation.eel.TypedMeasure <em>Typed Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.tblf.energy.estimation.eel.TypedMeasure
	 * @generated
	 */
	public Adapter createTypedMeasureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.tblf.energy.estimation.eel.MeasureValue <em>Measure Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.tblf.energy.estimation.eel.MeasureValue
	 * @generated
	 */
	public Adapter createMeasureValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.tblf.energy.estimation.eel.MeasureOCL <em>Measure OCL</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.tblf.energy.estimation.eel.MeasureOCL
	 * @generated
	 */
	public Adapter createMeasureOCLAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.tblf.energy.estimation.eel.MeasureAttribute <em>Measure Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.tblf.energy.estimation.eel.MeasureAttribute
	 * @generated
	 */
	public Adapter createMeasureAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.tblf.energy.estimation.eel.MeasureCast <em>Measure Cast</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.tblf.energy.estimation.eel.MeasureCast
	 * @generated
	 */
	public Adapter createMeasureCastAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.tblf.energy.estimation.eel.MeasureOperation <em>Measure Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.tblf.energy.estimation.eel.MeasureOperation
	 * @generated
	 */
	public Adapter createMeasureOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.tblf.energy.estimation.eel.MeasureProductOperation <em>Measure Product Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.tblf.energy.estimation.eel.MeasureProductOperation
	 * @generated
	 */
	public Adapter createMeasureProductOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.tblf.energy.estimation.eel.MeasureSumOperation <em>Measure Sum Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.tblf.energy.estimation.eel.MeasureSumOperation
	 * @generated
	 */
	public Adapter createMeasureSumOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.tblf.energy.estimation.eel.EnergyComputation <em>Energy Computation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.tblf.energy.estimation.eel.EnergyComputation
	 * @generated
	 */
	public Adapter createEnergyComputationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.tblf.energy.estimation.eel.PowerComputation <em>Power Computation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.tblf.energy.estimation.eel.PowerComputation
	 * @generated
	 */
	public Adapter createPowerComputationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.tblf.energy.estimation.eel.MeasurementUncertainty <em>Measurement Uncertainty</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.tblf.energy.estimation.eel.MeasurementUncertainty
	 * @generated
	 */
	public Adapter createMeasurementUncertaintyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.tblf.energy.estimation.eel.NormalDistribution <em>Normal Distribution</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.tblf.energy.estimation.eel.NormalDistribution
	 * @generated
	 */
	public Adapter createNormalDistributionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.tblf.energy.estimation.eel.Interval <em>Interval</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.tblf.energy.estimation.eel.Interval
	 * @generated
	 */
	public Adapter createIntervalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.tblf.energy.estimation.eel.MeasurementUncertaintyInformation <em>Measurement Uncertainty Information</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.tblf.energy.estimation.eel.MeasurementUncertaintyInformation
	 * @generated
	 */
	public Adapter createMeasurementUncertaintyInformationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.tblf.energy.estimation.eel.Sampling <em>Sampling</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.tblf.energy.estimation.eel.Sampling
	 * @generated
	 */
	public Adapter createSamplingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.tblf.energy.estimation.eel.Integral <em>Integral</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.tblf.energy.estimation.eel.Integral
	 * @generated
	 */
	public Adapter createIntegralAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.tblf.energy.estimation.eel.Sample <em>Sample</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.tblf.energy.estimation.eel.Sample
	 * @generated
	 */
	public Adapter createSampleAdapter() {
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

} //EelAdapterFactory