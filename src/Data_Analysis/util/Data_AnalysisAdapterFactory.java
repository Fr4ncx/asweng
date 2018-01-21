/**
 */
package Data_Analysis.util;

import Data_Analysis.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see Data_Analysis.Data_AnalysisPackage
 * @generated
 */
public class Data_AnalysisAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Data_AnalysisPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Data_AnalysisAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = Data_AnalysisPackage.eINSTANCE;
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
	protected Data_AnalysisSwitch<Adapter> modelSwitch =
		new Data_AnalysisSwitch<Adapter>() {
			@Override
			public Adapter casePipeline(Pipeline object) {
				return createPipelineAdapter();
			}
			@Override
			public Adapter caseTask(Task object) {
				return createTaskAdapter();
			}
			@Override
			public Adapter caseDataCollection(DataCollection object) {
				return createDataCollectionAdapter();
			}
			@Override
			public Adapter caseDataIntegration(DataIntegration object) {
				return createDataIntegrationAdapter();
			}
			@Override
			public Adapter caseDataCleaning(DataCleaning object) {
				return createDataCleaningAdapter();
			}
			@Override
			public Adapter caseDataAnalysis(DataAnalysis object) {
				return createDataAnalysisAdapter();
			}
			@Override
			public Adapter caseCollectionSchema(CollectionSchema object) {
				return createCollectionSchemaAdapter();
			}
			@Override
			public Adapter caseAttributeSchema(AttributeSchema object) {
				return createAttributeSchemaAdapter();
			}
			@Override
			public Adapter caseSource(Source object) {
				return createSourceAdapter();
			}
			@Override
			public Adapter caseFile(File object) {
				return createFileAdapter();
			}
			@Override
			public Adapter caseDatabase(Database object) {
				return createDatabaseAdapter();
			}
			@Override
			public Adapter caseRestService(RestService object) {
				return createRestServiceAdapter();
			}
			@Override
			public Adapter caseOperation(Operation object) {
				return createOperationAdapter();
			}
			@Override
			public Adapter caseRemoveNull(RemoveNull object) {
				return createRemoveNullAdapter();
			}
			@Override
			public Adapter caseFormatData(FormatData object) {
				return createFormatDataAdapter();
			}
			@Override
			public Adapter caseCustom(Custom object) {
				return createCustomAdapter();
			}
			@Override
			public Adapter caseDataVisualization(DataVisualization object) {
				return createDataVisualizationAdapter();
			}
			@Override
			public Adapter caseExportData(ExportData object) {
				return createExportDataAdapter();
			}
			@Override
			public Adapter caseDataFlow(DataFlow object) {
				return createDataFlowAdapter();
			}
			@Override
			public Adapter caseCondition(Condition object) {
				return createConditionAdapter();
			}
			@Override
			public Adapter caseNotEx(NotEx object) {
				return createNotExAdapter();
			}
			@Override
			public Adapter caseOrExp(OrExp object) {
				return createOrExpAdapter();
			}
			@Override
			public Adapter caseAndExp(AndExp object) {
				return createAndExpAdapter();
			}
			@Override
			public Adapter caseValueCondition(ValueCondition object) {
				return createValueConditionAdapter();
			}
			@Override
			public Adapter caseLt(Lt object) {
				return createLtAdapter();
			}
			@Override
			public Adapter caseLte(Lte object) {
				return createLteAdapter();
			}
			@Override
			public Adapter caseGt(Gt object) {
				return createGtAdapter();
			}
			@Override
			public Adapter caseGte(Gte object) {
				return createGteAdapter();
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
	 * Creates a new adapter for an object of class '{@link Data_Analysis.Pipeline <em>Pipeline</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Data_Analysis.Pipeline
	 * @generated
	 */
	public Adapter createPipelineAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Data_Analysis.Task <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Data_Analysis.Task
	 * @generated
	 */
	public Adapter createTaskAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Data_Analysis.DataCollection <em>Data Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Data_Analysis.DataCollection
	 * @generated
	 */
	public Adapter createDataCollectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Data_Analysis.DataIntegration <em>Data Integration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Data_Analysis.DataIntegration
	 * @generated
	 */
	public Adapter createDataIntegrationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Data_Analysis.DataCleaning <em>Data Cleaning</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Data_Analysis.DataCleaning
	 * @generated
	 */
	public Adapter createDataCleaningAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Data_Analysis.DataAnalysis <em>Data Analysis</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Data_Analysis.DataAnalysis
	 * @generated
	 */
	public Adapter createDataAnalysisAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Data_Analysis.CollectionSchema <em>Collection Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Data_Analysis.CollectionSchema
	 * @generated
	 */
	public Adapter createCollectionSchemaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Data_Analysis.AttributeSchema <em>Attribute Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Data_Analysis.AttributeSchema
	 * @generated
	 */
	public Adapter createAttributeSchemaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Data_Analysis.Source <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Data_Analysis.Source
	 * @generated
	 */
	public Adapter createSourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Data_Analysis.File <em>File</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Data_Analysis.File
	 * @generated
	 */
	public Adapter createFileAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Data_Analysis.Database <em>Database</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Data_Analysis.Database
	 * @generated
	 */
	public Adapter createDatabaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Data_Analysis.RestService <em>Rest Service</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Data_Analysis.RestService
	 * @generated
	 */
	public Adapter createRestServiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Data_Analysis.Operation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Data_Analysis.Operation
	 * @generated
	 */
	public Adapter createOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Data_Analysis.RemoveNull <em>Remove Null</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Data_Analysis.RemoveNull
	 * @generated
	 */
	public Adapter createRemoveNullAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Data_Analysis.FormatData <em>Format Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Data_Analysis.FormatData
	 * @generated
	 */
	public Adapter createFormatDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Data_Analysis.Custom <em>Custom</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Data_Analysis.Custom
	 * @generated
	 */
	public Adapter createCustomAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Data_Analysis.DataVisualization <em>Data Visualization</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Data_Analysis.DataVisualization
	 * @generated
	 */
	public Adapter createDataVisualizationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Data_Analysis.ExportData <em>Export Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Data_Analysis.ExportData
	 * @generated
	 */
	public Adapter createExportDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Data_Analysis.DataFlow <em>Data Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Data_Analysis.DataFlow
	 * @generated
	 */
	public Adapter createDataFlowAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Data_Analysis.Condition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Data_Analysis.Condition
	 * @generated
	 */
	public Adapter createConditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Data_Analysis.NotEx <em>Not Ex</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Data_Analysis.NotEx
	 * @generated
	 */
	public Adapter createNotExAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Data_Analysis.OrExp <em>Or Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Data_Analysis.OrExp
	 * @generated
	 */
	public Adapter createOrExpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Data_Analysis.AndExp <em>And Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Data_Analysis.AndExp
	 * @generated
	 */
	public Adapter createAndExpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Data_Analysis.ValueCondition <em>Value Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Data_Analysis.ValueCondition
	 * @generated
	 */
	public Adapter createValueConditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Data_Analysis.Lt <em>Lt</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Data_Analysis.Lt
	 * @generated
	 */
	public Adapter createLtAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Data_Analysis.Lte <em>Lte</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Data_Analysis.Lte
	 * @generated
	 */
	public Adapter createLteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Data_Analysis.Gt <em>Gt</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Data_Analysis.Gt
	 * @generated
	 */
	public Adapter createGtAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Data_Analysis.Gte <em>Gte</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Data_Analysis.Gte
	 * @generated
	 */
	public Adapter createGteAdapter() {
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

} //Data_AnalysisAdapterFactory
