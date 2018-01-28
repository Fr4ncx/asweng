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
			public Adapter caseDataCollectionTask(DataCollectionTask object) {
				return createDataCollectionTaskAdapter();
			}
			@Override
			public Adapter caseDataIntegrationTask(DataIntegrationTask object) {
				return createDataIntegrationTaskAdapter();
			}
			@Override
			public Adapter caseDataCleaning(DataCleaning object) {
				return createDataCleaningAdapter();
			}
			@Override
			public Adapter caseDataAnalysisTask(DataAnalysisTask object) {
				return createDataAnalysisTaskAdapter();
			}
			@Override
			public Adapter caseDataSchema(DataSchema object) {
				return createDataSchemaAdapter();
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
			public Adapter caseDataVisualizationTask(DataVisualizationTask object) {
				return createDataVisualizationTaskAdapter();
			}
			@Override
			public Adapter caseExportDataTask(ExportDataTask object) {
				return createExportDataTaskAdapter();
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
			public Adapter caseLogicalExp(LogicalExp object) {
				return createLogicalExpAdapter();
			}
			@Override
			public Adapter caseCategory(Category object) {
				return createCategoryAdapter();
			}
			@Override
			public Adapter caseDescription(Description object) {
				return createDescriptionAdapter();
			}
			@Override
			public Adapter casePrediction(Prediction object) {
				return createPredictionAdapter();
			}
			@Override
			public Adapter caseClustering(Clustering object) {
				return createClusteringAdapter();
			}
			@Override
			public Adapter caseClassification(Classification object) {
				return createClassificationAdapter();
			}
			@Override
			public Adapter caseGraph(Graph object) {
				return createGraphAdapter();
			}
			@Override
			public Adapter caseGraphElement(GraphElement object) {
				return createGraphElementAdapter();
			}
			@Override
			public Adapter caseNode(Node object) {
				return createNodeAdapter();
			}
			@Override
			public Adapter caseEdge(Edge object) {
				return createEdgeAdapter();
			}
			@Override
			public Adapter caseTable(Table object) {
				return createTableAdapter();
			}
			@Override
			public Adapter caseAnalysis(Analysis object) {
				return createAnalysisAdapter();
			}
			@Override
			public Adapter caseGraphicElement(GraphicElement object) {
				return createGraphicElementAdapter();
			}
			@Override
			public Adapter caseDiagram(Diagram object) {
				return createDiagramAdapter();
			}
			@Override
			public Adapter caseCollectionSchema(CollectionSchema object) {
				return createCollectionSchemaAdapter();
			}
			@Override
			public Adapter caseAttribute(Attribute object) {
				return createAttributeAdapter();
			}
			@Override
			public Adapter caseRow(Row object) {
				return createRowAdapter();
			}
			@Override
			public Adapter caseCell(Cell object) {
				return createCellAdapter();
			}
			@Override
			public Adapter caseDocument(Document object) {
				return createDocumentAdapter();
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
	 * Creates a new adapter for an object of class '{@link Data_Analysis.DataCollectionTask <em>Data Collection Task</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Data_Analysis.DataCollectionTask
	 * @generated
	 */
	public Adapter createDataCollectionTaskAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Data_Analysis.DataIntegrationTask <em>Data Integration Task</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Data_Analysis.DataIntegrationTask
	 * @generated
	 */
	public Adapter createDataIntegrationTaskAdapter() {
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
	 * Creates a new adapter for an object of class '{@link Data_Analysis.DataAnalysisTask <em>Data Analysis Task</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Data_Analysis.DataAnalysisTask
	 * @generated
	 */
	public Adapter createDataAnalysisTaskAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Data_Analysis.DataSchema <em>Data Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Data_Analysis.DataSchema
	 * @generated
	 */
	public Adapter createDataSchemaAdapter() {
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
	 * Creates a new adapter for an object of class '{@link Data_Analysis.DataVisualizationTask <em>Data Visualization Task</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Data_Analysis.DataVisualizationTask
	 * @generated
	 */
	public Adapter createDataVisualizationTaskAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Data_Analysis.ExportDataTask <em>Export Data Task</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Data_Analysis.ExportDataTask
	 * @generated
	 */
	public Adapter createExportDataTaskAdapter() {
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
	 * Creates a new adapter for an object of class '{@link Data_Analysis.LogicalExp <em>Logical Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Data_Analysis.LogicalExp
	 * @generated
	 */
	public Adapter createLogicalExpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Data_Analysis.Category <em>Category</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Data_Analysis.Category
	 * @generated
	 */
	public Adapter createCategoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Data_Analysis.Description <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Data_Analysis.Description
	 * @generated
	 */
	public Adapter createDescriptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Data_Analysis.Prediction <em>Prediction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Data_Analysis.Prediction
	 * @generated
	 */
	public Adapter createPredictionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Data_Analysis.Clustering <em>Clustering</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Data_Analysis.Clustering
	 * @generated
	 */
	public Adapter createClusteringAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Data_Analysis.Classification <em>Classification</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Data_Analysis.Classification
	 * @generated
	 */
	public Adapter createClassificationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Data_Analysis.Graph <em>Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Data_Analysis.Graph
	 * @generated
	 */
	public Adapter createGraphAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Data_Analysis.GraphElement <em>Graph Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Data_Analysis.GraphElement
	 * @generated
	 */
	public Adapter createGraphElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Data_Analysis.Node <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Data_Analysis.Node
	 * @generated
	 */
	public Adapter createNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Data_Analysis.Edge <em>Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Data_Analysis.Edge
	 * @generated
	 */
	public Adapter createEdgeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Data_Analysis.Table <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Data_Analysis.Table
	 * @generated
	 */
	public Adapter createTableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Data_Analysis.Analysis <em>Analysis</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Data_Analysis.Analysis
	 * @generated
	 */
	public Adapter createAnalysisAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Data_Analysis.GraphicElement <em>Graphic Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Data_Analysis.GraphicElement
	 * @generated
	 */
	public Adapter createGraphicElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Data_Analysis.Diagram <em>Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Data_Analysis.Diagram
	 * @generated
	 */
	public Adapter createDiagramAdapter() {
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
	 * Creates a new adapter for an object of class '{@link Data_Analysis.Attribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Data_Analysis.Attribute
	 * @generated
	 */
	public Adapter createAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Data_Analysis.Row <em>Row</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Data_Analysis.Row
	 * @generated
	 */
	public Adapter createRowAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Data_Analysis.Cell <em>Cell</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Data_Analysis.Cell
	 * @generated
	 */
	public Adapter createCellAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Data_Analysis.Document <em>Document</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Data_Analysis.Document
	 * @generated
	 */
	public Adapter createDocumentAdapter() {
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
