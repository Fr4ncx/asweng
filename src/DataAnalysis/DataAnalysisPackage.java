/**
 */
package DataAnalysis;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import DataAnalysis.impl.DataAnalysisPackageImpl;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see DataAnalysis.DataAnalysisFactory
 * @model kind="package"
 * @generated
 */
public interface DataAnalysisPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "DataAnalysis";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/dataAnalysis";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "DataAnalysis";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DataAnalysisPackage eINSTANCE = DataAnalysisPackageImpl.init();

	/**
	 * The meta object id for the '{@link DataAnalysis.impl.ModelImpl <em>Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DataAnalysis.impl.ModelImpl
	 * @see DataAnalysis.impl.DataAnalysisPackageImpl#getModel()
	 * @generated
	 */
	int MODEL = 0;

	/**
	 * The feature id for the '<em><b>Pipelines</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__PIPELINES = 0;

	/**
	 * The number of structural features of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link DataAnalysis.impl.PipelineImpl <em>Pipeline</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DataAnalysis.impl.PipelineImpl
	 * @see DataAnalysis.impl.DataAnalysisPackageImpl#getPipeline()
	 * @generated
	 */
	int PIPELINE = 1;

	/**
	 * The feature id for the '<em><b>Tasks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIPELINE__TASKS = 0;

	/**
	 * The number of structural features of the '<em>Pipeline</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIPELINE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link DataAnalysis.impl.TaskImpl <em>Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DataAnalysis.impl.TaskImpl
	 * @see DataAnalysis.impl.DataAnalysisPackageImpl#getTask()
	 * @generated
	 */
	int TASK = 2;

	/**
	 * The number of structural features of the '<em>Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link DataAnalysis.impl.DataCollectionImpl <em>Data Collection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DataAnalysis.impl.DataCollectionImpl
	 * @see DataAnalysis.impl.DataAnalysisPackageImpl#getDataCollection()
	 * @generated
	 */
	int DATA_COLLECTION = 3;

	/**
	 * The feature id for the '<em><b>Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_COLLECTION__FORMAT = TASK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Endpoint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_COLLECTION__ENDPOINT = TASK_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Conditions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_COLLECTION__CONDITIONS = TASK_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Schema</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_COLLECTION__SCHEMA = TASK_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_COLLECTION__SOURCE = TASK_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Data Collection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_COLLECTION_FEATURE_COUNT = TASK_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link DataAnalysis.impl.DataIntegrationImpl <em>Data Integration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DataAnalysis.impl.DataIntegrationImpl
	 * @see DataAnalysis.impl.DataAnalysisPackageImpl#getDataIntegration()
	 * @generated
	 */
	int DATA_INTEGRATION = 4;

	/**
	 * The feature id for the '<em><b>Sources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_INTEGRATION__SOURCES = TASK_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Data Integration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_INTEGRATION_FEATURE_COUNT = TASK_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link DataAnalysis.impl.DataCleaningImpl <em>Data Cleaning</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DataAnalysis.impl.DataCleaningImpl
	 * @see DataAnalysis.impl.DataAnalysisPackageImpl#getDataCleaning()
	 * @generated
	 */
	int DATA_CLEANING = 5;

	/**
	 * The feature id for the '<em><b>Operations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CLEANING__OPERATIONS = TASK_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Data Cleaning</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CLEANING_FEATURE_COUNT = TASK_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link DataAnalysis.impl.DataAnalysisImpl <em>Data Analysis</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DataAnalysis.impl.DataAnalysisImpl
	 * @see DataAnalysis.impl.DataAnalysisPackageImpl#getDataAnalysis()
	 * @generated
	 */
	int DATA_ANALYSIS = 6;

	/**
	 * The number of structural features of the '<em>Data Analysis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ANALYSIS_FEATURE_COUNT = TASK_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link DataAnalysis.impl.CollectionSchemaImpl <em>Collection Schema</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DataAnalysis.impl.CollectionSchemaImpl
	 * @see DataAnalysis.impl.DataAnalysisPackageImpl#getCollectionSchema()
	 * @generated
	 */
	int COLLECTION_SCHEMA = 7;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_SCHEMA__ATTRIBUTES = 0;

	/**
	 * The number of structural features of the '<em>Collection Schema</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_SCHEMA_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link DataAnalysis.impl.AttributeSchemaImpl <em>Attribute Schema</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DataAnalysis.impl.AttributeSchemaImpl
	 * @see DataAnalysis.impl.DataAnalysisPackageImpl#getAttributeSchema()
	 * @generated
	 */
	int ATTRIBUTE_SCHEMA = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_SCHEMA__NAME = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_SCHEMA__TYPE = 1;

	/**
	 * The number of structural features of the '<em>Attribute Schema</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_SCHEMA_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link DataAnalysis.impl.SourceImpl <em>Source</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DataAnalysis.impl.SourceImpl
	 * @see DataAnalysis.impl.DataAnalysisPackageImpl#getSource()
	 * @generated
	 */
	int SOURCE = 9;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE__URL = 0;

	/**
	 * The number of structural features of the '<em>Source</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link DataAnalysis.impl.FileImpl <em>File</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DataAnalysis.impl.FileImpl
	 * @see DataAnalysis.impl.DataAnalysisPackageImpl#getFile()
	 * @generated
	 */
	int FILE = 10;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__URL = SOURCE__URL;

	/**
	 * The number of structural features of the '<em>File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_FEATURE_COUNT = SOURCE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link DataAnalysis.impl.DatabaseImpl <em>Database</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DataAnalysis.impl.DatabaseImpl
	 * @see DataAnalysis.impl.DataAnalysisPackageImpl#getDatabase()
	 * @generated
	 */
	int DATABASE = 11;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE__URL = SOURCE__URL;

	/**
	 * The feature id for the '<em><b>Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE__PORT = SOURCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>User</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE__USER = SOURCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Pwd</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE__PWD = SOURCE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Database</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_FEATURE_COUNT = SOURCE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link DataAnalysis.impl.RestServiceImpl <em>Rest Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DataAnalysis.impl.RestServiceImpl
	 * @see DataAnalysis.impl.DataAnalysisPackageImpl#getRestService()
	 * @generated
	 */
	int REST_SERVICE = 12;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REST_SERVICE__URL = SOURCE__URL;

	/**
	 * The feature id for the '<em><b>User</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REST_SERVICE__USER = SOURCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Pwd</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REST_SERVICE__PWD = SOURCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Rest Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REST_SERVICE_FEATURE_COUNT = SOURCE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link DataAnalysis.impl.OperationImpl <em>Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DataAnalysis.impl.OperationImpl
	 * @see DataAnalysis.impl.DataAnalysisPackageImpl#getOperation()
	 * @generated
	 */
	int OPERATION = 13;

	/**
	 * The number of structural features of the '<em>Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link DataAnalysis.impl.RemoveNullImpl <em>Remove Null</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DataAnalysis.impl.RemoveNullImpl
	 * @see DataAnalysis.impl.DataAnalysisPackageImpl#getRemoveNull()
	 * @generated
	 */
	int REMOVE_NULL = 14;

	/**
	 * The number of structural features of the '<em>Remove Null</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_NULL_FEATURE_COUNT = OPERATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link DataAnalysis.impl.FormatDataImpl <em>Format Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DataAnalysis.impl.FormatDataImpl
	 * @see DataAnalysis.impl.DataAnalysisPackageImpl#getFormatData()
	 * @generated
	 */
	int FORMAT_DATA = 15;

	/**
	 * The number of structural features of the '<em>Format Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMAT_DATA_FEATURE_COUNT = OPERATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link DataAnalysis.impl.CustomImpl <em>Custom</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DataAnalysis.impl.CustomImpl
	 * @see DataAnalysis.impl.DataAnalysisPackageImpl#getCustom()
	 * @generated
	 */
	int CUSTOM = 16;

	/**
	 * The feature id for the '<em><b>Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM__ACTION = OPERATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Custom</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_FEATURE_COUNT = OPERATION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link DataAnalysis.impl.DataVisualizationImpl <em>Data Visualization</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DataAnalysis.impl.DataVisualizationImpl
	 * @see DataAnalysis.impl.DataAnalysisPackageImpl#getDataVisualization()
	 * @generated
	 */
	int DATA_VISUALIZATION = 17;

	/**
	 * The number of structural features of the '<em>Data Visualization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_VISUALIZATION_FEATURE_COUNT = TASK_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link DataAnalysis.impl.ExportDataImpl <em>Export Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DataAnalysis.impl.ExportDataImpl
	 * @see DataAnalysis.impl.DataAnalysisPackageImpl#getExportData()
	 * @generated
	 */
	int EXPORT_DATA = 18;

	/**
	 * The feature id for the '<em><b>Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPORT_DATA__FORMAT = TASK_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Export Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPORT_DATA_FEATURE_COUNT = TASK_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link DataAnalysis.CategoryType <em>Category Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DataAnalysis.CategoryType
	 * @see DataAnalysis.impl.DataAnalysisPackageImpl#getCategoryType()
	 * @generated
	 */
	int CATEGORY_TYPE = 19;

	/**
	 * The meta object id for the '{@link DataAnalysis.FormatType <em>Format Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DataAnalysis.FormatType
	 * @see DataAnalysis.impl.DataAnalysisPackageImpl#getFormatType()
	 * @generated
	 */
	int FORMAT_TYPE = 20;

	/**
	 * The meta object id for the '{@link DataAnalysis.AttributeType <em>Attribute Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DataAnalysis.AttributeType
	 * @see DataAnalysis.impl.DataAnalysisPackageImpl#getAttributeType()
	 * @generated
	 */
	int ATTRIBUTE_TYPE = 21;

	/**
	 * The meta object id for the '{@link DataAnalysis.CustomAction <em>Custom Action</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DataAnalysis.CustomAction
	 * @see DataAnalysis.impl.DataAnalysisPackageImpl#getCustomAction()
	 * @generated
	 */
	int CUSTOM_ACTION = 22;


	/**
	 * Returns the meta object for class '{@link DataAnalysis.Model <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model</em>'.
	 * @see DataAnalysis.Model
	 * @generated
	 */
	EClass getModel();

	/**
	 * Returns the meta object for the containment reference list '{@link DataAnalysis.Model#getPipelines <em>Pipelines</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pipelines</em>'.
	 * @see DataAnalysis.Model#getPipelines()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_Pipelines();

	/**
	 * Returns the meta object for class '{@link DataAnalysis.Pipeline <em>Pipeline</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pipeline</em>'.
	 * @see DataAnalysis.Pipeline
	 * @generated
	 */
	EClass getPipeline();

	/**
	 * Returns the meta object for the containment reference list '{@link DataAnalysis.Pipeline#getTasks <em>Tasks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tasks</em>'.
	 * @see DataAnalysis.Pipeline#getTasks()
	 * @see #getPipeline()
	 * @generated
	 */
	EReference getPipeline_Tasks();

	/**
	 * Returns the meta object for class '{@link DataAnalysis.Task <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task</em>'.
	 * @see DataAnalysis.Task
	 * @generated
	 */
	EClass getTask();

	/**
	 * Returns the meta object for class '{@link DataAnalysis.DataCollection <em>Data Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Collection</em>'.
	 * @see DataAnalysis.DataCollection
	 * @generated
	 */
	EClass getDataCollection();

	/**
	 * Returns the meta object for the containment reference '{@link DataAnalysis.DataCollection#getSchema <em>Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Schema</em>'.
	 * @see DataAnalysis.DataCollection#getSchema()
	 * @see #getDataCollection()
	 * @generated
	 */
	EReference getDataCollection_Schema();

	/**
	 * Returns the meta object for the containment reference '{@link DataAnalysis.DataCollection#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Source</em>'.
	 * @see DataAnalysis.DataCollection#getSource()
	 * @see #getDataCollection()
	 * @generated
	 */
	EReference getDataCollection_Source();

	/**
	 * Returns the meta object for the attribute '{@link DataAnalysis.DataCollection#getFormat <em>Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Format</em>'.
	 * @see DataAnalysis.DataCollection#getFormat()
	 * @see #getDataCollection()
	 * @generated
	 */
	EAttribute getDataCollection_Format();

	/**
	 * Returns the meta object for the attribute '{@link DataAnalysis.DataCollection#getEndpoint <em>Endpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Endpoint</em>'.
	 * @see DataAnalysis.DataCollection#getEndpoint()
	 * @see #getDataCollection()
	 * @generated
	 */
	EAttribute getDataCollection_Endpoint();

	/**
	 * Returns the meta object for the attribute '{@link DataAnalysis.DataCollection#getConditions <em>Conditions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Conditions</em>'.
	 * @see DataAnalysis.DataCollection#getConditions()
	 * @see #getDataCollection()
	 * @generated
	 */
	EAttribute getDataCollection_Conditions();

	/**
	 * Returns the meta object for class '{@link DataAnalysis.DataIntegration <em>Data Integration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Integration</em>'.
	 * @see DataAnalysis.DataIntegration
	 * @generated
	 */
	EClass getDataIntegration();

	/**
	 * Returns the meta object for the containment reference list '{@link DataAnalysis.DataIntegration#getSources <em>Sources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sources</em>'.
	 * @see DataAnalysis.DataIntegration#getSources()
	 * @see #getDataIntegration()
	 * @generated
	 */
	EReference getDataIntegration_Sources();

	/**
	 * Returns the meta object for class '{@link DataAnalysis.DataCleaning <em>Data Cleaning</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Cleaning</em>'.
	 * @see DataAnalysis.DataCleaning
	 * @generated
	 */
	EClass getDataCleaning();

	/**
	 * Returns the meta object for the containment reference list '{@link DataAnalysis.DataCleaning#getOperations <em>Operations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Operations</em>'.
	 * @see DataAnalysis.DataCleaning#getOperations()
	 * @see #getDataCleaning()
	 * @generated
	 */
	EReference getDataCleaning_Operations();

	/**
	 * Returns the meta object for class '{@link DataAnalysis.DataAnalysis <em>Data Analysis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Analysis</em>'.
	 * @see DataAnalysis.DataAnalysis
	 * @generated
	 */
	EClass getDataAnalysis();

	/**
	 * Returns the meta object for class '{@link DataAnalysis.CollectionSchema <em>Collection Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Collection Schema</em>'.
	 * @see DataAnalysis.CollectionSchema
	 * @generated
	 */
	EClass getCollectionSchema();

	/**
	 * Returns the meta object for the containment reference list '{@link DataAnalysis.CollectionSchema#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attributes</em>'.
	 * @see DataAnalysis.CollectionSchema#getAttributes()
	 * @see #getCollectionSchema()
	 * @generated
	 */
	EReference getCollectionSchema_Attributes();

	/**
	 * Returns the meta object for class '{@link DataAnalysis.AttributeSchema <em>Attribute Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute Schema</em>'.
	 * @see DataAnalysis.AttributeSchema
	 * @generated
	 */
	EClass getAttributeSchema();

	/**
	 * Returns the meta object for the attribute '{@link DataAnalysis.AttributeSchema#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see DataAnalysis.AttributeSchema#getName()
	 * @see #getAttributeSchema()
	 * @generated
	 */
	EAttribute getAttributeSchema_Name();

	/**
	 * Returns the meta object for the attribute '{@link DataAnalysis.AttributeSchema#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see DataAnalysis.AttributeSchema#getType()
	 * @see #getAttributeSchema()
	 * @generated
	 */
	EAttribute getAttributeSchema_Type();

	/**
	 * Returns the meta object for class '{@link DataAnalysis.Source <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Source</em>'.
	 * @see DataAnalysis.Source
	 * @generated
	 */
	EClass getSource();

	/**
	 * Returns the meta object for the attribute '{@link DataAnalysis.Source#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Url</em>'.
	 * @see DataAnalysis.Source#getUrl()
	 * @see #getSource()
	 * @generated
	 */
	EAttribute getSource_Url();

	/**
	 * Returns the meta object for class '{@link DataAnalysis.File <em>File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>File</em>'.
	 * @see DataAnalysis.File
	 * @generated
	 */
	EClass getFile();

	/**
	 * Returns the meta object for class '{@link DataAnalysis.Database <em>Database</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Database</em>'.
	 * @see DataAnalysis.Database
	 * @generated
	 */
	EClass getDatabase();

	/**
	 * Returns the meta object for the attribute '{@link DataAnalysis.Database#getPort <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Port</em>'.
	 * @see DataAnalysis.Database#getPort()
	 * @see #getDatabase()
	 * @generated
	 */
	EAttribute getDatabase_Port();

	/**
	 * Returns the meta object for the attribute '{@link DataAnalysis.Database#getUser <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User</em>'.
	 * @see DataAnalysis.Database#getUser()
	 * @see #getDatabase()
	 * @generated
	 */
	EAttribute getDatabase_User();

	/**
	 * Returns the meta object for the attribute '{@link DataAnalysis.Database#getPwd <em>Pwd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pwd</em>'.
	 * @see DataAnalysis.Database#getPwd()
	 * @see #getDatabase()
	 * @generated
	 */
	EAttribute getDatabase_Pwd();

	/**
	 * Returns the meta object for class '{@link DataAnalysis.RestService <em>Rest Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rest Service</em>'.
	 * @see DataAnalysis.RestService
	 * @generated
	 */
	EClass getRestService();

	/**
	 * Returns the meta object for the attribute '{@link DataAnalysis.RestService#getUser <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User</em>'.
	 * @see DataAnalysis.RestService#getUser()
	 * @see #getRestService()
	 * @generated
	 */
	EAttribute getRestService_User();

	/**
	 * Returns the meta object for the attribute '{@link DataAnalysis.RestService#getPwd <em>Pwd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pwd</em>'.
	 * @see DataAnalysis.RestService#getPwd()
	 * @see #getRestService()
	 * @generated
	 */
	EAttribute getRestService_Pwd();

	/**
	 * Returns the meta object for class '{@link DataAnalysis.Operation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operation</em>'.
	 * @see DataAnalysis.Operation
	 * @generated
	 */
	EClass getOperation();

	/**
	 * Returns the meta object for class '{@link DataAnalysis.RemoveNull <em>Remove Null</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Remove Null</em>'.
	 * @see DataAnalysis.RemoveNull
	 * @generated
	 */
	EClass getRemoveNull();

	/**
	 * Returns the meta object for class '{@link DataAnalysis.FormatData <em>Format Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Format Data</em>'.
	 * @see DataAnalysis.FormatData
	 * @generated
	 */
	EClass getFormatData();

	/**
	 * Returns the meta object for class '{@link DataAnalysis.Custom <em>Custom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Custom</em>'.
	 * @see DataAnalysis.Custom
	 * @generated
	 */
	EClass getCustom();

	/**
	 * Returns the meta object for the attribute '{@link DataAnalysis.Custom#getAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Action</em>'.
	 * @see DataAnalysis.Custom#getAction()
	 * @see #getCustom()
	 * @generated
	 */
	EAttribute getCustom_Action();

	/**
	 * Returns the meta object for class '{@link DataAnalysis.DataVisualization <em>Data Visualization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Visualization</em>'.
	 * @see DataAnalysis.DataVisualization
	 * @generated
	 */
	EClass getDataVisualization();

	/**
	 * Returns the meta object for class '{@link DataAnalysis.ExportData <em>Export Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Export Data</em>'.
	 * @see DataAnalysis.ExportData
	 * @generated
	 */
	EClass getExportData();

	/**
	 * Returns the meta object for the attribute '{@link DataAnalysis.ExportData#getFormat <em>Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Format</em>'.
	 * @see DataAnalysis.ExportData#getFormat()
	 * @see #getExportData()
	 * @generated
	 */
	EAttribute getExportData_Format();

	/**
	 * Returns the meta object for enum '{@link DataAnalysis.CategoryType <em>Category Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Category Type</em>'.
	 * @see DataAnalysis.CategoryType
	 * @generated
	 */
	EEnum getCategoryType();

	/**
	 * Returns the meta object for enum '{@link DataAnalysis.FormatType <em>Format Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Format Type</em>'.
	 * @see DataAnalysis.FormatType
	 * @generated
	 */
	EEnum getFormatType();

	/**
	 * Returns the meta object for enum '{@link DataAnalysis.AttributeType <em>Attribute Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Attribute Type</em>'.
	 * @see DataAnalysis.AttributeType
	 * @generated
	 */
	EEnum getAttributeType();

	/**
	 * Returns the meta object for enum '{@link DataAnalysis.CustomAction <em>Custom Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Custom Action</em>'.
	 * @see DataAnalysis.CustomAction
	 * @generated
	 */
	EEnum getCustomAction();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DataAnalysisFactory getDataAnalysisFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link DataAnalysis.impl.ModelImpl <em>Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DataAnalysis.impl.ModelImpl
		 * @see DataAnalysis.impl.DataAnalysisPackageImpl#getModel()
		 * @generated
		 */
		EClass MODEL = eINSTANCE.getModel();

		/**
		 * The meta object literal for the '<em><b>Pipelines</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__PIPELINES = eINSTANCE.getModel_Pipelines();

		/**
		 * The meta object literal for the '{@link DataAnalysis.impl.PipelineImpl <em>Pipeline</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DataAnalysis.impl.PipelineImpl
		 * @see DataAnalysis.impl.DataAnalysisPackageImpl#getPipeline()
		 * @generated
		 */
		EClass PIPELINE = eINSTANCE.getPipeline();

		/**
		 * The meta object literal for the '<em><b>Tasks</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PIPELINE__TASKS = eINSTANCE.getPipeline_Tasks();

		/**
		 * The meta object literal for the '{@link DataAnalysis.impl.TaskImpl <em>Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DataAnalysis.impl.TaskImpl
		 * @see DataAnalysis.impl.DataAnalysisPackageImpl#getTask()
		 * @generated
		 */
		EClass TASK = eINSTANCE.getTask();

		/**
		 * The meta object literal for the '{@link DataAnalysis.impl.DataCollectionImpl <em>Data Collection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DataAnalysis.impl.DataCollectionImpl
		 * @see DataAnalysis.impl.DataAnalysisPackageImpl#getDataCollection()
		 * @generated
		 */
		EClass DATA_COLLECTION = eINSTANCE.getDataCollection();

		/**
		 * The meta object literal for the '<em><b>Schema</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_COLLECTION__SCHEMA = eINSTANCE.getDataCollection_Schema();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_COLLECTION__SOURCE = eINSTANCE.getDataCollection_Source();

		/**
		 * The meta object literal for the '<em><b>Format</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_COLLECTION__FORMAT = eINSTANCE.getDataCollection_Format();

		/**
		 * The meta object literal for the '<em><b>Endpoint</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_COLLECTION__ENDPOINT = eINSTANCE.getDataCollection_Endpoint();

		/**
		 * The meta object literal for the '<em><b>Conditions</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_COLLECTION__CONDITIONS = eINSTANCE.getDataCollection_Conditions();

		/**
		 * The meta object literal for the '{@link DataAnalysis.impl.DataIntegrationImpl <em>Data Integration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DataAnalysis.impl.DataIntegrationImpl
		 * @see DataAnalysis.impl.DataAnalysisPackageImpl#getDataIntegration()
		 * @generated
		 */
		EClass DATA_INTEGRATION = eINSTANCE.getDataIntegration();

		/**
		 * The meta object literal for the '<em><b>Sources</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_INTEGRATION__SOURCES = eINSTANCE.getDataIntegration_Sources();

		/**
		 * The meta object literal for the '{@link DataAnalysis.impl.DataCleaningImpl <em>Data Cleaning</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DataAnalysis.impl.DataCleaningImpl
		 * @see DataAnalysis.impl.DataAnalysisPackageImpl#getDataCleaning()
		 * @generated
		 */
		EClass DATA_CLEANING = eINSTANCE.getDataCleaning();

		/**
		 * The meta object literal for the '<em><b>Operations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_CLEANING__OPERATIONS = eINSTANCE.getDataCleaning_Operations();

		/**
		 * The meta object literal for the '{@link DataAnalysis.impl.DataAnalysisImpl <em>Data Analysis</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DataAnalysis.impl.DataAnalysisImpl
		 * @see DataAnalysis.impl.DataAnalysisPackageImpl#getDataAnalysis()
		 * @generated
		 */
		EClass DATA_ANALYSIS = eINSTANCE.getDataAnalysis();

		/**
		 * The meta object literal for the '{@link DataAnalysis.impl.CollectionSchemaImpl <em>Collection Schema</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DataAnalysis.impl.CollectionSchemaImpl
		 * @see DataAnalysis.impl.DataAnalysisPackageImpl#getCollectionSchema()
		 * @generated
		 */
		EClass COLLECTION_SCHEMA = eINSTANCE.getCollectionSchema();

		/**
		 * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLLECTION_SCHEMA__ATTRIBUTES = eINSTANCE.getCollectionSchema_Attributes();

		/**
		 * The meta object literal for the '{@link DataAnalysis.impl.AttributeSchemaImpl <em>Attribute Schema</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DataAnalysis.impl.AttributeSchemaImpl
		 * @see DataAnalysis.impl.DataAnalysisPackageImpl#getAttributeSchema()
		 * @generated
		 */
		EClass ATTRIBUTE_SCHEMA = eINSTANCE.getAttributeSchema();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE_SCHEMA__NAME = eINSTANCE.getAttributeSchema_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE_SCHEMA__TYPE = eINSTANCE.getAttributeSchema_Type();

		/**
		 * The meta object literal for the '{@link DataAnalysis.impl.SourceImpl <em>Source</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DataAnalysis.impl.SourceImpl
		 * @see DataAnalysis.impl.DataAnalysisPackageImpl#getSource()
		 * @generated
		 */
		EClass SOURCE = eINSTANCE.getSource();

		/**
		 * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOURCE__URL = eINSTANCE.getSource_Url();

		/**
		 * The meta object literal for the '{@link DataAnalysis.impl.FileImpl <em>File</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DataAnalysis.impl.FileImpl
		 * @see DataAnalysis.impl.DataAnalysisPackageImpl#getFile()
		 * @generated
		 */
		EClass FILE = eINSTANCE.getFile();

		/**
		 * The meta object literal for the '{@link DataAnalysis.impl.DatabaseImpl <em>Database</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DataAnalysis.impl.DatabaseImpl
		 * @see DataAnalysis.impl.DataAnalysisPackageImpl#getDatabase()
		 * @generated
		 */
		EClass DATABASE = eINSTANCE.getDatabase();

		/**
		 * The meta object literal for the '<em><b>Port</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATABASE__PORT = eINSTANCE.getDatabase_Port();

		/**
		 * The meta object literal for the '<em><b>User</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATABASE__USER = eINSTANCE.getDatabase_User();

		/**
		 * The meta object literal for the '<em><b>Pwd</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATABASE__PWD = eINSTANCE.getDatabase_Pwd();

		/**
		 * The meta object literal for the '{@link DataAnalysis.impl.RestServiceImpl <em>Rest Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DataAnalysis.impl.RestServiceImpl
		 * @see DataAnalysis.impl.DataAnalysisPackageImpl#getRestService()
		 * @generated
		 */
		EClass REST_SERVICE = eINSTANCE.getRestService();

		/**
		 * The meta object literal for the '<em><b>User</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REST_SERVICE__USER = eINSTANCE.getRestService_User();

		/**
		 * The meta object literal for the '<em><b>Pwd</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REST_SERVICE__PWD = eINSTANCE.getRestService_Pwd();

		/**
		 * The meta object literal for the '{@link DataAnalysis.impl.OperationImpl <em>Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DataAnalysis.impl.OperationImpl
		 * @see DataAnalysis.impl.DataAnalysisPackageImpl#getOperation()
		 * @generated
		 */
		EClass OPERATION = eINSTANCE.getOperation();

		/**
		 * The meta object literal for the '{@link DataAnalysis.impl.RemoveNullImpl <em>Remove Null</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DataAnalysis.impl.RemoveNullImpl
		 * @see DataAnalysis.impl.DataAnalysisPackageImpl#getRemoveNull()
		 * @generated
		 */
		EClass REMOVE_NULL = eINSTANCE.getRemoveNull();

		/**
		 * The meta object literal for the '{@link DataAnalysis.impl.FormatDataImpl <em>Format Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DataAnalysis.impl.FormatDataImpl
		 * @see DataAnalysis.impl.DataAnalysisPackageImpl#getFormatData()
		 * @generated
		 */
		EClass FORMAT_DATA = eINSTANCE.getFormatData();

		/**
		 * The meta object literal for the '{@link DataAnalysis.impl.CustomImpl <em>Custom</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DataAnalysis.impl.CustomImpl
		 * @see DataAnalysis.impl.DataAnalysisPackageImpl#getCustom()
		 * @generated
		 */
		EClass CUSTOM = eINSTANCE.getCustom();

		/**
		 * The meta object literal for the '<em><b>Action</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOM__ACTION = eINSTANCE.getCustom_Action();

		/**
		 * The meta object literal for the '{@link DataAnalysis.impl.DataVisualizationImpl <em>Data Visualization</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DataAnalysis.impl.DataVisualizationImpl
		 * @see DataAnalysis.impl.DataAnalysisPackageImpl#getDataVisualization()
		 * @generated
		 */
		EClass DATA_VISUALIZATION = eINSTANCE.getDataVisualization();

		/**
		 * The meta object literal for the '{@link DataAnalysis.impl.ExportDataImpl <em>Export Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DataAnalysis.impl.ExportDataImpl
		 * @see DataAnalysis.impl.DataAnalysisPackageImpl#getExportData()
		 * @generated
		 */
		EClass EXPORT_DATA = eINSTANCE.getExportData();

		/**
		 * The meta object literal for the '<em><b>Format</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXPORT_DATA__FORMAT = eINSTANCE.getExportData_Format();

		/**
		 * The meta object literal for the '{@link DataAnalysis.CategoryType <em>Category Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DataAnalysis.CategoryType
		 * @see DataAnalysis.impl.DataAnalysisPackageImpl#getCategoryType()
		 * @generated
		 */
		EEnum CATEGORY_TYPE = eINSTANCE.getCategoryType();

		/**
		 * The meta object literal for the '{@link DataAnalysis.FormatType <em>Format Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DataAnalysis.FormatType
		 * @see DataAnalysis.impl.DataAnalysisPackageImpl#getFormatType()
		 * @generated
		 */
		EEnum FORMAT_TYPE = eINSTANCE.getFormatType();

		/**
		 * The meta object literal for the '{@link DataAnalysis.AttributeType <em>Attribute Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DataAnalysis.AttributeType
		 * @see DataAnalysis.impl.DataAnalysisPackageImpl#getAttributeType()
		 * @generated
		 */
		EEnum ATTRIBUTE_TYPE = eINSTANCE.getAttributeType();

		/**
		 * The meta object literal for the '{@link DataAnalysis.CustomAction <em>Custom Action</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DataAnalysis.CustomAction
		 * @see DataAnalysis.impl.DataAnalysisPackageImpl#getCustomAction()
		 * @generated
		 */
		EEnum CUSTOM_ACTION = eINSTANCE.getCustomAction();

	}

} //DataAnalysisPackage
