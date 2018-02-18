/**
 */
package Data_Analysis.impl;

import Data_Analysis.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Data_AnalysisFactoryImpl extends EFactoryImpl implements Data_AnalysisFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Data_AnalysisFactory init() {
		try {
			Data_AnalysisFactory theData_AnalysisFactory = (Data_AnalysisFactory)EPackage.Registry.INSTANCE.getEFactory(Data_AnalysisPackage.eNS_URI);
			if (theData_AnalysisFactory != null) {
				return theData_AnalysisFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Data_AnalysisFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Data_AnalysisFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case Data_AnalysisPackage.PIPELINE: return createPipeline();
			case Data_AnalysisPackage.DATA_COLLECTION_TASK: return createDataCollectionTask();
			case Data_AnalysisPackage.DATA_INTEGRATION_TASK: return createDataIntegrationTask();
			case Data_AnalysisPackage.DATA_CLEANING: return createDataCleaning();
			case Data_AnalysisPackage.DATA_ANALYSIS_TASK: return createDataAnalysisTask();
			case Data_AnalysisPackage.DATA_SCHEMA: return createDataSchema();
			case Data_AnalysisPackage.ATTRIBUTE_SCHEMA: return createAttributeSchema();
			case Data_AnalysisPackage.FILE: return createFile();
			case Data_AnalysisPackage.DATABASE: return createDatabase();
			case Data_AnalysisPackage.REST_SERVICE: return createRestService();
			case Data_AnalysisPackage.REMOVE_NULL: return createRemoveNull();
			case Data_AnalysisPackage.FORMAT_DATA: return createFormatData();
			case Data_AnalysisPackage.CUSTOM: return createCustom();
			case Data_AnalysisPackage.DATA_VISUALIZATION_TASK: return createDataVisualizationTask();
			case Data_AnalysisPackage.EXPORT_DATA_TASK: return createExportDataTask();
			case Data_AnalysisPackage.DATA_FLOW: return createDataFlow();
			case Data_AnalysisPackage.CONDITION: return createCondition();
			case Data_AnalysisPackage.NOT_EX: return createNotEx();
			case Data_AnalysisPackage.OR_EXP: return createOrExp();
			case Data_AnalysisPackage.AND_EXP: return createAndExp();
			case Data_AnalysisPackage.VALUE_CONDITION: return createValueCondition();
			case Data_AnalysisPackage.LT: return createLt();
			case Data_AnalysisPackage.LTE: return createLte();
			case Data_AnalysisPackage.GT: return createGt();
			case Data_AnalysisPackage.GTE: return createGte();
			case Data_AnalysisPackage.LOGICAL_EXP: return createLogicalExp();
			case Data_AnalysisPackage.CATEGORY: return createCategory();
			case Data_AnalysisPackage.DESCRIPTION: return createDescription();
			case Data_AnalysisPackage.PREDICTION: return createPrediction();
			case Data_AnalysisPackage.CLUSTERING: return createClustering();
			case Data_AnalysisPackage.CLASSIFICATION: return createClassification();
			case Data_AnalysisPackage.GRAPH: return createGraph();
			case Data_AnalysisPackage.GRAPH_ELEMENT: return createGraphElement();
			case Data_AnalysisPackage.NODE: return createNode();
			case Data_AnalysisPackage.EDGE: return createEdge();
			case Data_AnalysisPackage.TABLE: return createTable();
			case Data_AnalysisPackage.ANALYSIS: return createAnalysis();
			case Data_AnalysisPackage.GRAPHIC_ELEMENT: return createGraphicElement();
			case Data_AnalysisPackage.DIAGRAM: return createDiagram();
			case Data_AnalysisPackage.COLLECTION_SCHEMA: return createCollectionSchema();
			case Data_AnalysisPackage.ATTRIBUTE: return createAttribute();
			case Data_AnalysisPackage.ROW: return createRow();
			case Data_AnalysisPackage.CELL: return createCell();
			case Data_AnalysisPackage.DOCUMENT: return createDocument();
			case Data_AnalysisPackage.CLUSTER: return createCluster();
			case Data_AnalysisPackage.DATA_POINT: return createDataPoint();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case Data_AnalysisPackage.CATEGORY_TYPE:
				return createCategoryTypeFromString(eDataType, initialValue);
			case Data_AnalysisPackage.FORMAT_TYPE:
				return createFormatTypeFromString(eDataType, initialValue);
			case Data_AnalysisPackage.ATTRIBUTE_TYPE:
				return createAttributeTypeFromString(eDataType, initialValue);
			case Data_AnalysisPackage.CUSTOM_ACTION:
				return createCustomActionFromString(eDataType, initialValue);
			case Data_AnalysisPackage.FORMAT_OPERATION:
				return createFormatOperationFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case Data_AnalysisPackage.CATEGORY_TYPE:
				return convertCategoryTypeToString(eDataType, instanceValue);
			case Data_AnalysisPackage.FORMAT_TYPE:
				return convertFormatTypeToString(eDataType, instanceValue);
			case Data_AnalysisPackage.ATTRIBUTE_TYPE:
				return convertAttributeTypeToString(eDataType, instanceValue);
			case Data_AnalysisPackage.CUSTOM_ACTION:
				return convertCustomActionToString(eDataType, instanceValue);
			case Data_AnalysisPackage.FORMAT_OPERATION:
				return convertFormatOperationToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pipeline createPipeline() {
		PipelineImpl pipeline = new PipelineImpl();
		return pipeline;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataCollectionTask createDataCollectionTask() {
		DataCollectionTaskImpl dataCollectionTask = new DataCollectionTaskImpl();
		return dataCollectionTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataIntegrationTask createDataIntegrationTask() {
		DataIntegrationTaskImpl dataIntegrationTask = new DataIntegrationTaskImpl();
		return dataIntegrationTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataCleaning createDataCleaning() {
		DataCleaningImpl dataCleaning = new DataCleaningImpl();
		return dataCleaning;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataAnalysisTask createDataAnalysisTask() {
		DataAnalysisTaskImpl dataAnalysisTask = new DataAnalysisTaskImpl();
		return dataAnalysisTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataSchema createDataSchema() {
		DataSchemaImpl dataSchema = new DataSchemaImpl();
		return dataSchema;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeSchema createAttributeSchema() {
		AttributeSchemaImpl attributeSchema = new AttributeSchemaImpl();
		return attributeSchema;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public File createFile() {
		FileImpl file = new FileImpl();
		return file;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Database createDatabase() {
		DatabaseImpl database = new DatabaseImpl();
		return database;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RestService createRestService() {
		RestServiceImpl restService = new RestServiceImpl();
		return restService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RemoveNull createRemoveNull() {
		RemoveNullImpl removeNull = new RemoveNullImpl();
		return removeNull;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FormatData createFormatData() {
		FormatDataImpl formatData = new FormatDataImpl();
		return formatData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Custom createCustom() {
		CustomImpl custom = new CustomImpl();
		return custom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataVisualizationTask createDataVisualizationTask() {
		DataVisualizationTaskImpl dataVisualizationTask = new DataVisualizationTaskImpl();
		return dataVisualizationTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExportDataTask createExportDataTask() {
		ExportDataTaskImpl exportDataTask = new ExportDataTaskImpl();
		return exportDataTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataFlow createDataFlow() {
		DataFlowImpl dataFlow = new DataFlowImpl();
		return dataFlow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Condition createCondition() {
		ConditionImpl condition = new ConditionImpl();
		return condition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotEx createNotEx() {
		NotExImpl notEx = new NotExImpl();
		return notEx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrExp createOrExp() {
		OrExpImpl orExp = new OrExpImpl();
		return orExp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AndExp createAndExp() {
		AndExpImpl andExp = new AndExpImpl();
		return andExp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueCondition createValueCondition() {
		ValueConditionImpl valueCondition = new ValueConditionImpl();
		return valueCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Lt createLt() {
		LtImpl lt = new LtImpl();
		return lt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Lte createLte() {
		LteImpl lte = new LteImpl();
		return lte;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Gt createGt() {
		GtImpl gt = new GtImpl();
		return gt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Gte createGte() {
		GteImpl gte = new GteImpl();
		return gte;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogicalExp createLogicalExp() {
		LogicalExpImpl logicalExp = new LogicalExpImpl();
		return logicalExp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Category createCategory() {
		CategoryImpl category = new CategoryImpl();
		return category;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Description createDescription() {
		DescriptionImpl description = new DescriptionImpl();
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Prediction createPrediction() {
		PredictionImpl prediction = new PredictionImpl();
		return prediction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Clustering createClustering() {
		ClusteringImpl clustering = new ClusteringImpl();
		return clustering;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Classification createClassification() {
		ClassificationImpl classification = new ClassificationImpl();
		return classification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Graph createGraph() {
		GraphImpl graph = new GraphImpl();
		return graph;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GraphElement createGraphElement() {
		GraphElementImpl graphElement = new GraphElementImpl();
		return graphElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node createNode() {
		NodeImpl node = new NodeImpl();
		return node;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Edge createEdge() {
		EdgeImpl edge = new EdgeImpl();
		return edge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Table createTable() {
		TableImpl table = new TableImpl();
		return table;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Analysis createAnalysis() {
		AnalysisImpl analysis = new AnalysisImpl();
		return analysis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GraphicElement createGraphicElement() {
		GraphicElementImpl graphicElement = new GraphicElementImpl();
		return graphicElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Diagram createDiagram() {
		DiagramImpl diagram = new DiagramImpl();
		return diagram;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CollectionSchema createCollectionSchema() {
		CollectionSchemaImpl collectionSchema = new CollectionSchemaImpl();
		return collectionSchema;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute createAttribute() {
		AttributeImpl attribute = new AttributeImpl();
		return attribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Row createRow() {
		RowImpl row = new RowImpl();
		return row;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cell createCell() {
		CellImpl cell = new CellImpl();
		return cell;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Document createDocument() {
		DocumentImpl document = new DocumentImpl();
		return document;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cluster createCluster() {
		ClusterImpl cluster = new ClusterImpl();
		return cluster;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataPoint createDataPoint() {
		DataPointImpl dataPoint = new DataPointImpl();
		return dataPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CategoryType createCategoryTypeFromString(EDataType eDataType, String initialValue) {
		CategoryType result = CategoryType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCategoryTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FormatType createFormatTypeFromString(EDataType eDataType, String initialValue) {
		FormatType result = FormatType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFormatTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeType createAttributeTypeFromString(EDataType eDataType, String initialValue) {
		AttributeType result = AttributeType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAttributeTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CustomAction createCustomActionFromString(EDataType eDataType, String initialValue) {
		CustomAction result = CustomAction.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCustomActionToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FormatOperation createFormatOperationFromString(EDataType eDataType, String initialValue) {
		FormatOperation result = FormatOperation.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFormatOperationToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Data_AnalysisPackage getData_AnalysisPackage() {
		return (Data_AnalysisPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Data_AnalysisPackage getPackage() {
		return Data_AnalysisPackage.eINSTANCE;
	}

} //Data_AnalysisFactoryImpl
