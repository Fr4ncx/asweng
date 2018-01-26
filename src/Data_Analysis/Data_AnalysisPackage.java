/**
 */
package Data_Analysis;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
 * @see Data_Analysis.Data_AnalysisFactory
 * @model kind="package"
 * @generated
 */
public interface Data_AnalysisPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Data_Analysis";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/data_Analysis";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "Data_Analysis";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Data_AnalysisPackage eINSTANCE = Data_Analysis.impl.Data_AnalysisPackageImpl.init();

	/**
	 * The meta object id for the '{@link Data_Analysis.impl.PipelineImpl <em>Pipeline</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Data_Analysis.impl.PipelineImpl
	 * @see Data_Analysis.impl.Data_AnalysisPackageImpl#getPipeline()
	 * @generated
	 */
	int PIPELINE = 0;

	/**
	 * The feature id for the '<em><b>Tasks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIPELINE__TASKS = 0;

	/**
	 * The feature id for the '<em><b>Flows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIPELINE__FLOWS = 1;

	/**
	 * The feature id for the '<em><b>Schemas</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIPELINE__SCHEMAS = 2;

	/**
	 * The feature id for the '<em><b>Conditions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIPELINE__CONDITIONS = 3;

	/**
	 * The number of structural features of the '<em>Pipeline</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIPELINE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link Data_Analysis.impl.TaskImpl <em>Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Data_Analysis.impl.TaskImpl
	 * @see Data_Analysis.impl.Data_AnalysisPackageImpl#getTask()
	 * @generated
	 */
	int TASK = 1;

	/**
	 * The feature id for the '<em><b>To Flow</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__TO_FLOW = 0;

	/**
	 * The feature id for the '<em><b>Execution Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__EXECUTION_TIMESTAMP = 1;

	/**
	 * The feature id for the '<em><b>Is Executed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__IS_EXECUTED = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__NAME = 3;

	/**
	 * The number of structural features of the '<em>Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link Data_Analysis.impl.DataCollectionTaskImpl <em>Data Collection Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Data_Analysis.impl.DataCollectionTaskImpl
	 * @see Data_Analysis.impl.Data_AnalysisPackageImpl#getDataCollectionTask()
	 * @generated
	 */
	int DATA_COLLECTION_TASK = 2;

	/**
	 * The feature id for the '<em><b>To Flow</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_COLLECTION_TASK__TO_FLOW = TASK__TO_FLOW;

	/**
	 * The feature id for the '<em><b>Execution Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_COLLECTION_TASK__EXECUTION_TIMESTAMP = TASK__EXECUTION_TIMESTAMP;

	/**
	 * The feature id for the '<em><b>Is Executed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_COLLECTION_TASK__IS_EXECUTED = TASK__IS_EXECUTED;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_COLLECTION_TASK__NAME = TASK__NAME;

	/**
	 * The feature id for the '<em><b>Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_COLLECTION_TASK__FORMAT = TASK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Endpoint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_COLLECTION_TASK__ENDPOINT = TASK_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_COLLECTION_TASK__SOURCE = TASK_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Input Schema</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_COLLECTION_TASK__INPUT_SCHEMA = TASK_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_COLLECTION_TASK__CONDITION = TASK_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Data Collection Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_COLLECTION_TASK_FEATURE_COUNT = TASK_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link Data_Analysis.impl.DataIntegrationTaskImpl <em>Data Integration Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Data_Analysis.impl.DataIntegrationTaskImpl
	 * @see Data_Analysis.impl.Data_AnalysisPackageImpl#getDataIntegrationTask()
	 * @generated
	 */
	int DATA_INTEGRATION_TASK = 3;

	/**
	 * The feature id for the '<em><b>To Flow</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_INTEGRATION_TASK__TO_FLOW = TASK__TO_FLOW;

	/**
	 * The feature id for the '<em><b>Execution Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_INTEGRATION_TASK__EXECUTION_TIMESTAMP = TASK__EXECUTION_TIMESTAMP;

	/**
	 * The feature id for the '<em><b>Is Executed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_INTEGRATION_TASK__IS_EXECUTED = TASK__IS_EXECUTED;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_INTEGRATION_TASK__NAME = TASK__NAME;

	/**
	 * The feature id for the '<em><b>Join Attributes</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_INTEGRATION_TASK__JOIN_ATTRIBUTES = TASK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Out Attributes</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_INTEGRATION_TASK__OUT_ATTRIBUTES = TASK_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Data Integration Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_INTEGRATION_TASK_FEATURE_COUNT = TASK_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link Data_Analysis.impl.DataCleaningImpl <em>Data Cleaning</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Data_Analysis.impl.DataCleaningImpl
	 * @see Data_Analysis.impl.Data_AnalysisPackageImpl#getDataCleaning()
	 * @generated
	 */
	int DATA_CLEANING = 4;

	/**
	 * The feature id for the '<em><b>To Flow</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CLEANING__TO_FLOW = TASK__TO_FLOW;

	/**
	 * The feature id for the '<em><b>Execution Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CLEANING__EXECUTION_TIMESTAMP = TASK__EXECUTION_TIMESTAMP;

	/**
	 * The feature id for the '<em><b>Is Executed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CLEANING__IS_EXECUTED = TASK__IS_EXECUTED;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CLEANING__NAME = TASK__NAME;

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
	 * The meta object id for the '{@link Data_Analysis.impl.DataAnalysisTaskImpl <em>Data Analysis Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Data_Analysis.impl.DataAnalysisTaskImpl
	 * @see Data_Analysis.impl.Data_AnalysisPackageImpl#getDataAnalysisTask()
	 * @generated
	 */
	int DATA_ANALYSIS_TASK = 5;

	/**
	 * The feature id for the '<em><b>To Flow</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ANALYSIS_TASK__TO_FLOW = TASK__TO_FLOW;

	/**
	 * The feature id for the '<em><b>Execution Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ANALYSIS_TASK__EXECUTION_TIMESTAMP = TASK__EXECUTION_TIMESTAMP;

	/**
	 * The feature id for the '<em><b>Is Executed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ANALYSIS_TASK__IS_EXECUTED = TASK__IS_EXECUTED;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ANALYSIS_TASK__NAME = TASK__NAME;

	/**
	 * The feature id for the '<em><b>Category</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ANALYSIS_TASK__CATEGORY = TASK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Analysis</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ANALYSIS_TASK__ANALYSIS = TASK_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Data Analysis Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ANALYSIS_TASK_FEATURE_COUNT = TASK_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link Data_Analysis.impl.DataSchemaImpl <em>Data Schema</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Data_Analysis.impl.DataSchemaImpl
	 * @see Data_Analysis.impl.Data_AnalysisPackageImpl#getDataSchema()
	 * @generated
	 */
	int DATA_SCHEMA = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SCHEMA__NAME = 0;

	/**
	 * The feature id for the '<em><b>Schema Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SCHEMA__SCHEMA_ATTRIBUTES = 1;

	/**
	 * The number of structural features of the '<em>Data Schema</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SCHEMA_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link Data_Analysis.impl.AttributeSchemaImpl <em>Attribute Schema</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Data_Analysis.impl.AttributeSchemaImpl
	 * @see Data_Analysis.impl.Data_AnalysisPackageImpl#getAttributeSchema()
	 * @generated
	 */
	int ATTRIBUTE_SCHEMA = 7;

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
	 * The meta object id for the '{@link Data_Analysis.impl.SourceImpl <em>Source</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Data_Analysis.impl.SourceImpl
	 * @see Data_Analysis.impl.Data_AnalysisPackageImpl#getSource()
	 * @generated
	 */
	int SOURCE = 8;

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
	 * The meta object id for the '{@link Data_Analysis.impl.FileImpl <em>File</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Data_Analysis.impl.FileImpl
	 * @see Data_Analysis.impl.Data_AnalysisPackageImpl#getFile()
	 * @generated
	 */
	int FILE = 9;

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
	 * The meta object id for the '{@link Data_Analysis.impl.DatabaseImpl <em>Database</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Data_Analysis.impl.DatabaseImpl
	 * @see Data_Analysis.impl.Data_AnalysisPackageImpl#getDatabase()
	 * @generated
	 */
	int DATABASE = 10;

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
	 * The meta object id for the '{@link Data_Analysis.impl.RestServiceImpl <em>Rest Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Data_Analysis.impl.RestServiceImpl
	 * @see Data_Analysis.impl.Data_AnalysisPackageImpl#getRestService()
	 * @generated
	 */
	int REST_SERVICE = 11;

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
	 * The meta object id for the '{@link Data_Analysis.impl.OperationImpl <em>Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Data_Analysis.impl.OperationImpl
	 * @see Data_Analysis.impl.Data_AnalysisPackageImpl#getOperation()
	 * @generated
	 */
	int OPERATION = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__NAME = 0;

	/**
	 * The number of structural features of the '<em>Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link Data_Analysis.impl.RemoveNullImpl <em>Remove Null</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Data_Analysis.impl.RemoveNullImpl
	 * @see Data_Analysis.impl.Data_AnalysisPackageImpl#getRemoveNull()
	 * @generated
	 */
	int REMOVE_NULL = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_NULL__NAME = OPERATION__NAME;

	/**
	 * The number of structural features of the '<em>Remove Null</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_NULL_FEATURE_COUNT = OPERATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link Data_Analysis.impl.FormatDataImpl <em>Format Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Data_Analysis.impl.FormatDataImpl
	 * @see Data_Analysis.impl.Data_AnalysisPackageImpl#getFormatData()
	 * @generated
	 */
	int FORMAT_DATA = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMAT_DATA__NAME = OPERATION__NAME;

	/**
	 * The number of structural features of the '<em>Format Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMAT_DATA_FEATURE_COUNT = OPERATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link Data_Analysis.impl.CustomImpl <em>Custom</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Data_Analysis.impl.CustomImpl
	 * @see Data_Analysis.impl.Data_AnalysisPackageImpl#getCustom()
	 * @generated
	 */
	int CUSTOM = 15;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM__NAME = OPERATION__NAME;

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
	 * The meta object id for the '{@link Data_Analysis.impl.DataVisualizationTaskImpl <em>Data Visualization Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Data_Analysis.impl.DataVisualizationTaskImpl
	 * @see Data_Analysis.impl.Data_AnalysisPackageImpl#getDataVisualizationTask()
	 * @generated
	 */
	int DATA_VISUALIZATION_TASK = 16;

	/**
	 * The feature id for the '<em><b>To Flow</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_VISUALIZATION_TASK__TO_FLOW = TASK__TO_FLOW;

	/**
	 * The feature id for the '<em><b>Execution Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_VISUALIZATION_TASK__EXECUTION_TIMESTAMP = TASK__EXECUTION_TIMESTAMP;

	/**
	 * The feature id for the '<em><b>Is Executed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_VISUALIZATION_TASK__IS_EXECUTED = TASK__IS_EXECUTED;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_VISUALIZATION_TASK__NAME = TASK__NAME;

	/**
	 * The feature id for the '<em><b>Visual Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_VISUALIZATION_TASK__VISUAL_ELEMENTS = TASK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Tables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_VISUALIZATION_TASK__TABLES = TASK_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Data Visualization Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_VISUALIZATION_TASK_FEATURE_COUNT = TASK_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link Data_Analysis.impl.ExportDataTaskImpl <em>Export Data Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Data_Analysis.impl.ExportDataTaskImpl
	 * @see Data_Analysis.impl.Data_AnalysisPackageImpl#getExportDataTask()
	 * @generated
	 */
	int EXPORT_DATA_TASK = 17;

	/**
	 * The feature id for the '<em><b>To Flow</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPORT_DATA_TASK__TO_FLOW = TASK__TO_FLOW;

	/**
	 * The feature id for the '<em><b>Execution Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPORT_DATA_TASK__EXECUTION_TIMESTAMP = TASK__EXECUTION_TIMESTAMP;

	/**
	 * The feature id for the '<em><b>Is Executed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPORT_DATA_TASK__IS_EXECUTED = TASK__IS_EXECUTED;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPORT_DATA_TASK__NAME = TASK__NAME;

	/**
	 * The feature id for the '<em><b>Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPORT_DATA_TASK__FORMAT = TASK_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Export Data Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPORT_DATA_TASK_FEATURE_COUNT = TASK_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link Data_Analysis.impl.DataFlowImpl <em>Data Flow</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Data_Analysis.impl.DataFlowImpl
	 * @see Data_Analysis.impl.Data_AnalysisPackageImpl#getDataFlow()
	 * @generated
	 */
	int DATA_FLOW = 18;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FLOW__NAME = 0;

	/**
	 * The feature id for the '<em><b>To Task</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FLOW__TO_TASK = 1;

	/**
	 * The feature id for the '<em><b>Collection</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FLOW__COLLECTION = 2;

	/**
	 * The number of structural features of the '<em>Data Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FLOW_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link Data_Analysis.impl.ConditionImpl <em>Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Data_Analysis.impl.ConditionImpl
	 * @see Data_Analysis.impl.Data_AnalysisPackageImpl#getCondition()
	 * @generated
	 */
	int CONDITION = 19;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Expressions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__EXPRESSIONS = 1;

	/**
	 * The feature id for the '<em><b>Value Conditions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__VALUE_CONDITIONS = 2;

	/**
	 * The number of structural features of the '<em>Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link Data_Analysis.impl.LogicalExpImpl <em>Logical Exp</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Data_Analysis.impl.LogicalExpImpl
	 * @see Data_Analysis.impl.Data_AnalysisPackageImpl#getLogicalExp()
	 * @generated
	 */
	int LOGICAL_EXP = 28;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_EXP__NAME = 0;

	/**
	 * The feature id for the '<em><b>Valueconditions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_EXP__VALUECONDITIONS = 1;

	/**
	 * The number of structural features of the '<em>Logical Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_EXP_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link Data_Analysis.impl.NotExImpl <em>Not Ex</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Data_Analysis.impl.NotExImpl
	 * @see Data_Analysis.impl.Data_AnalysisPackageImpl#getNotEx()
	 * @generated
	 */
	int NOT_EX = 20;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_EX__NAME = LOGICAL_EXP__NAME;

	/**
	 * The feature id for the '<em><b>Valueconditions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_EX__VALUECONDITIONS = LOGICAL_EXP__VALUECONDITIONS;

	/**
	 * The number of structural features of the '<em>Not Ex</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_EX_FEATURE_COUNT = LOGICAL_EXP_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link Data_Analysis.impl.OrExpImpl <em>Or Exp</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Data_Analysis.impl.OrExpImpl
	 * @see Data_Analysis.impl.Data_AnalysisPackageImpl#getOrExp()
	 * @generated
	 */
	int OR_EXP = 21;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_EXP__NAME = LOGICAL_EXP__NAME;

	/**
	 * The feature id for the '<em><b>Valueconditions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_EXP__VALUECONDITIONS = LOGICAL_EXP__VALUECONDITIONS;

	/**
	 * The number of structural features of the '<em>Or Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_EXP_FEATURE_COUNT = LOGICAL_EXP_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link Data_Analysis.impl.AndExpImpl <em>And Exp</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Data_Analysis.impl.AndExpImpl
	 * @see Data_Analysis.impl.Data_AnalysisPackageImpl#getAndExp()
	 * @generated
	 */
	int AND_EXP = 22;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_EXP__NAME = LOGICAL_EXP__NAME;

	/**
	 * The feature id for the '<em><b>Valueconditions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_EXP__VALUECONDITIONS = LOGICAL_EXP__VALUECONDITIONS;

	/**
	 * The number of structural features of the '<em>And Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_EXP_FEATURE_COUNT = LOGICAL_EXP_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link Data_Analysis.impl.ValueConditionImpl <em>Value Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Data_Analysis.impl.ValueConditionImpl
	 * @see Data_Analysis.impl.Data_AnalysisPackageImpl#getValueCondition()
	 * @generated
	 */
	int VALUE_CONDITION = 23;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_CONDITION__ATTRIBUTE = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_CONDITION__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Value Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_CONDITION_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link Data_Analysis.impl.LtImpl <em>Lt</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Data_Analysis.impl.LtImpl
	 * @see Data_Analysis.impl.Data_AnalysisPackageImpl#getLt()
	 * @generated
	 */
	int LT = 24;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LT__ATTRIBUTE = VALUE_CONDITION__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LT__VALUE = VALUE_CONDITION__VALUE;

	/**
	 * The number of structural features of the '<em>Lt</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LT_FEATURE_COUNT = VALUE_CONDITION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link Data_Analysis.impl.LteImpl <em>Lte</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Data_Analysis.impl.LteImpl
	 * @see Data_Analysis.impl.Data_AnalysisPackageImpl#getLte()
	 * @generated
	 */
	int LTE = 25;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LTE__ATTRIBUTE = VALUE_CONDITION__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LTE__VALUE = VALUE_CONDITION__VALUE;

	/**
	 * The number of structural features of the '<em>Lte</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LTE_FEATURE_COUNT = VALUE_CONDITION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link Data_Analysis.impl.GtImpl <em>Gt</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Data_Analysis.impl.GtImpl
	 * @see Data_Analysis.impl.Data_AnalysisPackageImpl#getGt()
	 * @generated
	 */
	int GT = 26;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GT__ATTRIBUTE = VALUE_CONDITION__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GT__VALUE = VALUE_CONDITION__VALUE;

	/**
	 * The number of structural features of the '<em>Gt</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GT_FEATURE_COUNT = VALUE_CONDITION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link Data_Analysis.impl.GteImpl <em>Gte</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Data_Analysis.impl.GteImpl
	 * @see Data_Analysis.impl.Data_AnalysisPackageImpl#getGte()
	 * @generated
	 */
	int GTE = 27;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GTE__ATTRIBUTE = VALUE_CONDITION__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GTE__VALUE = VALUE_CONDITION__VALUE;

	/**
	 * The number of structural features of the '<em>Gte</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GTE_FEATURE_COUNT = VALUE_CONDITION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link Data_Analysis.impl.CategoryImpl <em>Category</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Data_Analysis.impl.CategoryImpl
	 * @see Data_Analysis.impl.Data_AnalysisPackageImpl#getCategory()
	 * @generated
	 */
	int CATEGORY = 29;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY__NAME = 0;

	/**
	 * The number of structural features of the '<em>Category</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link Data_Analysis.impl.DescriptionImpl <em>Description</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Data_Analysis.impl.DescriptionImpl
	 * @see Data_Analysis.impl.Data_AnalysisPackageImpl#getDescription()
	 * @generated
	 */
	int DESCRIPTION = 30;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION__NAME = CATEGORY__NAME;

	/**
	 * The number of structural features of the '<em>Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION_FEATURE_COUNT = CATEGORY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link Data_Analysis.impl.PredictionImpl <em>Prediction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Data_Analysis.impl.PredictionImpl
	 * @see Data_Analysis.impl.Data_AnalysisPackageImpl#getPrediction()
	 * @generated
	 */
	int PREDICTION = 31;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICTION__NAME = CATEGORY__NAME;

	/**
	 * The number of structural features of the '<em>Prediction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICTION_FEATURE_COUNT = CATEGORY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link Data_Analysis.impl.ClusteringImpl <em>Clustering</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Data_Analysis.impl.ClusteringImpl
	 * @see Data_Analysis.impl.Data_AnalysisPackageImpl#getClustering()
	 * @generated
	 */
	int CLUSTERING = 32;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLUSTERING__NAME = CATEGORY__NAME;

	/**
	 * The number of structural features of the '<em>Clustering</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLUSTERING_FEATURE_COUNT = CATEGORY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link Data_Analysis.impl.ClassificationImpl <em>Classification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Data_Analysis.impl.ClassificationImpl
	 * @see Data_Analysis.impl.Data_AnalysisPackageImpl#getClassification()
	 * @generated
	 */
	int CLASSIFICATION = 33;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION__NAME = CATEGORY__NAME;

	/**
	 * The number of structural features of the '<em>Classification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION_FEATURE_COUNT = CATEGORY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link Data_Analysis.impl.GraphicElementImpl <em>Graphic Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Data_Analysis.impl.GraphicElementImpl
	 * @see Data_Analysis.impl.Data_AnalysisPackageImpl#getGraphicElement()
	 * @generated
	 */
	int GRAPHIC_ELEMENT = 40;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHIC_ELEMENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Graphic Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHIC_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link Data_Analysis.impl.GraphImpl <em>Graph</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Data_Analysis.impl.GraphImpl
	 * @see Data_Analysis.impl.Data_AnalysisPackageImpl#getGraph()
	 * @generated
	 */
	int GRAPH = 34;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH__NAME = GRAPHIC_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH__ELEMENTS = GRAPHIC_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Graph</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH_FEATURE_COUNT = GRAPHIC_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link Data_Analysis.impl.GraphElementImpl <em>Graph Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Data_Analysis.impl.GraphElementImpl
	 * @see Data_Analysis.impl.Data_AnalysisPackageImpl#getGraphElement()
	 * @generated
	 */
	int GRAPH_ELEMENT = 35;

	/**
	 * The number of structural features of the '<em>Graph Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH_ELEMENT_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link Data_Analysis.impl.NodeImpl <em>Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Data_Analysis.impl.NodeImpl
	 * @see Data_Analysis.impl.Data_AnalysisPackageImpl#getNode()
	 * @generated
	 */
	int NODE = 36;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__NAME = GRAPH_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__WIDTH = GRAPH_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__HEIGHT = GRAPH_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__X = GRAPH_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__Y = GRAPH_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_FEATURE_COUNT = GRAPH_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link Data_Analysis.impl.EdgeImpl <em>Edge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Data_Analysis.impl.EdgeImpl
	 * @see Data_Analysis.impl.Data_AnalysisPackageImpl#getEdge()
	 * @generated
	 */
	int EDGE = 37;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE__NAME = GRAPH_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE__SOURCE = GRAPH_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE__TARGET = GRAPH_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE__WIDTH = GRAPH_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Edge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_FEATURE_COUNT = GRAPH_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link Data_Analysis.impl.TableImpl <em>Table</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Data_Analysis.impl.TableImpl
	 * @see Data_Analysis.impl.Data_AnalysisPackageImpl#getTable()
	 * @generated
	 */
	int TABLE = 38;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Rows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__ROWS = 1;

	/**
	 * The number of structural features of the '<em>Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link Data_Analysis.impl.AnalysisImpl <em>Analysis</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Data_Analysis.impl.AnalysisImpl
	 * @see Data_Analysis.impl.Data_AnalysisPackageImpl#getAnalysis()
	 * @generated
	 */
	int ANALYSIS = 39;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS__NAME = 0;

	/**
	 * The number of structural features of the '<em>Analysis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link Data_Analysis.impl.DiagramImpl <em>Diagram</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Data_Analysis.impl.DiagramImpl
	 * @see Data_Analysis.impl.Data_AnalysisPackageImpl#getDiagram()
	 * @generated
	 */
	int DIAGRAM = 41;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM__NAME = GRAPHIC_ELEMENT__NAME;

	/**
	 * The number of structural features of the '<em>Diagram</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_FEATURE_COUNT = GRAPHIC_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link Data_Analysis.impl.CollectionSchemaImpl <em>Collection Schema</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Data_Analysis.impl.CollectionSchemaImpl
	 * @see Data_Analysis.impl.Data_AnalysisPackageImpl#getCollectionSchema()
	 * @generated
	 */
	int COLLECTION_SCHEMA = 42;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_SCHEMA__NAME = 0;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_SCHEMA__ATTRIBUTES = 1;

	/**
	 * The number of structural features of the '<em>Collection Schema</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_SCHEMA_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link Data_Analysis.impl.AttributeImpl <em>Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Data_Analysis.impl.AttributeImpl
	 * @see Data_Analysis.impl.Data_AnalysisPackageImpl#getAttribute()
	 * @generated
	 */
	int ATTRIBUTE = 43;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__TYPE = 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__VALUE = 2;

	/**
	 * The number of structural features of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link Data_Analysis.impl.RowImpl <em>Row</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Data_Analysis.impl.RowImpl
	 * @see Data_Analysis.impl.Data_AnalysisPackageImpl#getRow()
	 * @generated
	 */
	int ROW = 44;

	/**
	 * The feature id for the '<em><b>Row Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROW__ROW_INDEX = 0;

	/**
	 * The feature id for the '<em><b>Cells</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROW__CELLS = 1;

	/**
	 * The number of structural features of the '<em>Row</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROW_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link Data_Analysis.impl.CellImpl <em>Cell</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Data_Analysis.impl.CellImpl
	 * @see Data_Analysis.impl.Data_AnalysisPackageImpl#getCell()
	 * @generated
	 */
	int CELL = 45;

	/**
	 * The feature id for the '<em><b>Cell Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CELL__CELL_INDEX = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CELL__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Cell</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CELL_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link Data_Analysis.CategoryType <em>Category Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Data_Analysis.CategoryType
	 * @see Data_Analysis.impl.Data_AnalysisPackageImpl#getCategoryType()
	 * @generated
	 */
	int CATEGORY_TYPE = 46;

	/**
	 * The meta object id for the '{@link Data_Analysis.FormatType <em>Format Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Data_Analysis.FormatType
	 * @see Data_Analysis.impl.Data_AnalysisPackageImpl#getFormatType()
	 * @generated
	 */
	int FORMAT_TYPE = 47;

	/**
	 * The meta object id for the '{@link Data_Analysis.AttributeType <em>Attribute Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Data_Analysis.AttributeType
	 * @see Data_Analysis.impl.Data_AnalysisPackageImpl#getAttributeType()
	 * @generated
	 */
	int ATTRIBUTE_TYPE = 48;

	/**
	 * The meta object id for the '{@link Data_Analysis.CustomAction <em>Custom Action</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Data_Analysis.CustomAction
	 * @see Data_Analysis.impl.Data_AnalysisPackageImpl#getCustomAction()
	 * @generated
	 */
	int CUSTOM_ACTION = 49;


	/**
	 * Returns the meta object for class '{@link Data_Analysis.Pipeline <em>Pipeline</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pipeline</em>'.
	 * @see Data_Analysis.Pipeline
	 * @generated
	 */
	EClass getPipeline();

	/**
	 * Returns the meta object for the containment reference list '{@link Data_Analysis.Pipeline#getTasks <em>Tasks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tasks</em>'.
	 * @see Data_Analysis.Pipeline#getTasks()
	 * @see #getPipeline()
	 * @generated
	 */
	EReference getPipeline_Tasks();

	/**
	 * Returns the meta object for the containment reference list '{@link Data_Analysis.Pipeline#getFlows <em>Flows</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Flows</em>'.
	 * @see Data_Analysis.Pipeline#getFlows()
	 * @see #getPipeline()
	 * @generated
	 */
	EReference getPipeline_Flows();

	/**
	 * Returns the meta object for the containment reference list '{@link Data_Analysis.Pipeline#getSchemas <em>Schemas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Schemas</em>'.
	 * @see Data_Analysis.Pipeline#getSchemas()
	 * @see #getPipeline()
	 * @generated
	 */
	EReference getPipeline_Schemas();

	/**
	 * Returns the meta object for the containment reference list '{@link Data_Analysis.Pipeline#getConditions <em>Conditions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Conditions</em>'.
	 * @see Data_Analysis.Pipeline#getConditions()
	 * @see #getPipeline()
	 * @generated
	 */
	EReference getPipeline_Conditions();

	/**
	 * Returns the meta object for class '{@link Data_Analysis.Task <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task</em>'.
	 * @see Data_Analysis.Task
	 * @generated
	 */
	EClass getTask();

	/**
	 * Returns the meta object for the reference '{@link Data_Analysis.Task#getToFlow <em>To Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To Flow</em>'.
	 * @see Data_Analysis.Task#getToFlow()
	 * @see #getTask()
	 * @generated
	 */
	EReference getTask_ToFlow();

	/**
	 * Returns the meta object for the attribute '{@link Data_Analysis.Task#getExecutionTimestamp <em>Execution Timestamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Execution Timestamp</em>'.
	 * @see Data_Analysis.Task#getExecutionTimestamp()
	 * @see #getTask()
	 * @generated
	 */
	EAttribute getTask_ExecutionTimestamp();

	/**
	 * Returns the meta object for the attribute '{@link Data_Analysis.Task#isIsExecuted <em>Is Executed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Executed</em>'.
	 * @see Data_Analysis.Task#isIsExecuted()
	 * @see #getTask()
	 * @generated
	 */
	EAttribute getTask_IsExecuted();

	/**
	 * Returns the meta object for the attribute '{@link Data_Analysis.Task#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Data_Analysis.Task#getName()
	 * @see #getTask()
	 * @generated
	 */
	EAttribute getTask_Name();

	/**
	 * Returns the meta object for class '{@link Data_Analysis.DataCollectionTask <em>Data Collection Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Collection Task</em>'.
	 * @see Data_Analysis.DataCollectionTask
	 * @generated
	 */
	EClass getDataCollectionTask();

	/**
	 * Returns the meta object for the attribute '{@link Data_Analysis.DataCollectionTask#getFormat <em>Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Format</em>'.
	 * @see Data_Analysis.DataCollectionTask#getFormat()
	 * @see #getDataCollectionTask()
	 * @generated
	 */
	EAttribute getDataCollectionTask_Format();

	/**
	 * Returns the meta object for the attribute '{@link Data_Analysis.DataCollectionTask#getEndpoint <em>Endpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Endpoint</em>'.
	 * @see Data_Analysis.DataCollectionTask#getEndpoint()
	 * @see #getDataCollectionTask()
	 * @generated
	 */
	EAttribute getDataCollectionTask_Endpoint();

	/**
	 * Returns the meta object for the containment reference '{@link Data_Analysis.DataCollectionTask#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Source</em>'.
	 * @see Data_Analysis.DataCollectionTask#getSource()
	 * @see #getDataCollectionTask()
	 * @generated
	 */
	EReference getDataCollectionTask_Source();

	/**
	 * Returns the meta object for the containment reference '{@link Data_Analysis.DataCollectionTask#getInputSchema <em>Input Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Input Schema</em>'.
	 * @see Data_Analysis.DataCollectionTask#getInputSchema()
	 * @see #getDataCollectionTask()
	 * @generated
	 */
	EReference getDataCollectionTask_InputSchema();

	/**
	 * Returns the meta object for the reference '{@link Data_Analysis.DataCollectionTask#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Condition</em>'.
	 * @see Data_Analysis.DataCollectionTask#getCondition()
	 * @see #getDataCollectionTask()
	 * @generated
	 */
	EReference getDataCollectionTask_Condition();

	/**
	 * Returns the meta object for class '{@link Data_Analysis.DataIntegrationTask <em>Data Integration Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Integration Task</em>'.
	 * @see Data_Analysis.DataIntegrationTask
	 * @generated
	 */
	EClass getDataIntegrationTask();

	/**
	 * Returns the meta object for the reference '{@link Data_Analysis.DataIntegrationTask#getJoinAttributes <em>Join Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Join Attributes</em>'.
	 * @see Data_Analysis.DataIntegrationTask#getJoinAttributes()
	 * @see #getDataIntegrationTask()
	 * @generated
	 */
	EReference getDataIntegrationTask_JoinAttributes();

	/**
	 * Returns the meta object for the reference '{@link Data_Analysis.DataIntegrationTask#getOutAttributes <em>Out Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Out Attributes</em>'.
	 * @see Data_Analysis.DataIntegrationTask#getOutAttributes()
	 * @see #getDataIntegrationTask()
	 * @generated
	 */
	EReference getDataIntegrationTask_OutAttributes();

	/**
	 * Returns the meta object for class '{@link Data_Analysis.DataCleaning <em>Data Cleaning</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Cleaning</em>'.
	 * @see Data_Analysis.DataCleaning
	 * @generated
	 */
	EClass getDataCleaning();

	/**
	 * Returns the meta object for the containment reference list '{@link Data_Analysis.DataCleaning#getOperations <em>Operations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Operations</em>'.
	 * @see Data_Analysis.DataCleaning#getOperations()
	 * @see #getDataCleaning()
	 * @generated
	 */
	EReference getDataCleaning_Operations();

	/**
	 * Returns the meta object for class '{@link Data_Analysis.DataAnalysisTask <em>Data Analysis Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Analysis Task</em>'.
	 * @see Data_Analysis.DataAnalysisTask
	 * @generated
	 */
	EClass getDataAnalysisTask();

	/**
	 * Returns the meta object for the containment reference '{@link Data_Analysis.DataAnalysisTask#getCategory <em>Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Category</em>'.
	 * @see Data_Analysis.DataAnalysisTask#getCategory()
	 * @see #getDataAnalysisTask()
	 * @generated
	 */
	EReference getDataAnalysisTask_Category();

	/**
	 * Returns the meta object for the containment reference list '{@link Data_Analysis.DataAnalysisTask#getAnalysis <em>Analysis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Analysis</em>'.
	 * @see Data_Analysis.DataAnalysisTask#getAnalysis()
	 * @see #getDataAnalysisTask()
	 * @generated
	 */
	EReference getDataAnalysisTask_Analysis();

	/**
	 * Returns the meta object for class '{@link Data_Analysis.DataSchema <em>Data Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Schema</em>'.
	 * @see Data_Analysis.DataSchema
	 * @generated
	 */
	EClass getDataSchema();

	/**
	 * Returns the meta object for the attribute '{@link Data_Analysis.DataSchema#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Data_Analysis.DataSchema#getName()
	 * @see #getDataSchema()
	 * @generated
	 */
	EAttribute getDataSchema_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link Data_Analysis.DataSchema#getSchemaAttributes <em>Schema Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Schema Attributes</em>'.
	 * @see Data_Analysis.DataSchema#getSchemaAttributes()
	 * @see #getDataSchema()
	 * @generated
	 */
	EReference getDataSchema_SchemaAttributes();

	/**
	 * Returns the meta object for class '{@link Data_Analysis.AttributeSchema <em>Attribute Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute Schema</em>'.
	 * @see Data_Analysis.AttributeSchema
	 * @generated
	 */
	EClass getAttributeSchema();

	/**
	 * Returns the meta object for the attribute '{@link Data_Analysis.AttributeSchema#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Data_Analysis.AttributeSchema#getName()
	 * @see #getAttributeSchema()
	 * @generated
	 */
	EAttribute getAttributeSchema_Name();

	/**
	 * Returns the meta object for the attribute '{@link Data_Analysis.AttributeSchema#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see Data_Analysis.AttributeSchema#getType()
	 * @see #getAttributeSchema()
	 * @generated
	 */
	EAttribute getAttributeSchema_Type();

	/**
	 * Returns the meta object for class '{@link Data_Analysis.Source <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Source</em>'.
	 * @see Data_Analysis.Source
	 * @generated
	 */
	EClass getSource();

	/**
	 * Returns the meta object for the attribute '{@link Data_Analysis.Source#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Url</em>'.
	 * @see Data_Analysis.Source#getUrl()
	 * @see #getSource()
	 * @generated
	 */
	EAttribute getSource_Url();

	/**
	 * Returns the meta object for class '{@link Data_Analysis.File <em>File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>File</em>'.
	 * @see Data_Analysis.File
	 * @generated
	 */
	EClass getFile();

	/**
	 * Returns the meta object for class '{@link Data_Analysis.Database <em>Database</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Database</em>'.
	 * @see Data_Analysis.Database
	 * @generated
	 */
	EClass getDatabase();

	/**
	 * Returns the meta object for the attribute '{@link Data_Analysis.Database#getPort <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Port</em>'.
	 * @see Data_Analysis.Database#getPort()
	 * @see #getDatabase()
	 * @generated
	 */
	EAttribute getDatabase_Port();

	/**
	 * Returns the meta object for the attribute '{@link Data_Analysis.Database#getUser <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User</em>'.
	 * @see Data_Analysis.Database#getUser()
	 * @see #getDatabase()
	 * @generated
	 */
	EAttribute getDatabase_User();

	/**
	 * Returns the meta object for the attribute '{@link Data_Analysis.Database#getPwd <em>Pwd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pwd</em>'.
	 * @see Data_Analysis.Database#getPwd()
	 * @see #getDatabase()
	 * @generated
	 */
	EAttribute getDatabase_Pwd();

	/**
	 * Returns the meta object for class '{@link Data_Analysis.RestService <em>Rest Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rest Service</em>'.
	 * @see Data_Analysis.RestService
	 * @generated
	 */
	EClass getRestService();

	/**
	 * Returns the meta object for the attribute '{@link Data_Analysis.RestService#getUser <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User</em>'.
	 * @see Data_Analysis.RestService#getUser()
	 * @see #getRestService()
	 * @generated
	 */
	EAttribute getRestService_User();

	/**
	 * Returns the meta object for the attribute '{@link Data_Analysis.RestService#getPwd <em>Pwd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pwd</em>'.
	 * @see Data_Analysis.RestService#getPwd()
	 * @see #getRestService()
	 * @generated
	 */
	EAttribute getRestService_Pwd();

	/**
	 * Returns the meta object for class '{@link Data_Analysis.Operation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operation</em>'.
	 * @see Data_Analysis.Operation
	 * @generated
	 */
	EClass getOperation();

	/**
	 * Returns the meta object for the attribute '{@link Data_Analysis.Operation#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Data_Analysis.Operation#getName()
	 * @see #getOperation()
	 * @generated
	 */
	EAttribute getOperation_Name();

	/**
	 * Returns the meta object for class '{@link Data_Analysis.RemoveNull <em>Remove Null</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Remove Null</em>'.
	 * @see Data_Analysis.RemoveNull
	 * @generated
	 */
	EClass getRemoveNull();

	/**
	 * Returns the meta object for class '{@link Data_Analysis.FormatData <em>Format Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Format Data</em>'.
	 * @see Data_Analysis.FormatData
	 * @generated
	 */
	EClass getFormatData();

	/**
	 * Returns the meta object for class '{@link Data_Analysis.Custom <em>Custom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Custom</em>'.
	 * @see Data_Analysis.Custom
	 * @generated
	 */
	EClass getCustom();

	/**
	 * Returns the meta object for the attribute '{@link Data_Analysis.Custom#getAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Action</em>'.
	 * @see Data_Analysis.Custom#getAction()
	 * @see #getCustom()
	 * @generated
	 */
	EAttribute getCustom_Action();

	/**
	 * Returns the meta object for class '{@link Data_Analysis.DataVisualizationTask <em>Data Visualization Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Visualization Task</em>'.
	 * @see Data_Analysis.DataVisualizationTask
	 * @generated
	 */
	EClass getDataVisualizationTask();

	/**
	 * Returns the meta object for the containment reference list '{@link Data_Analysis.DataVisualizationTask#getVisualElements <em>Visual Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Visual Elements</em>'.
	 * @see Data_Analysis.DataVisualizationTask#getVisualElements()
	 * @see #getDataVisualizationTask()
	 * @generated
	 */
	EReference getDataVisualizationTask_VisualElements();

	/**
	 * Returns the meta object for the containment reference list '{@link Data_Analysis.DataVisualizationTask#getTables <em>Tables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tables</em>'.
	 * @see Data_Analysis.DataVisualizationTask#getTables()
	 * @see #getDataVisualizationTask()
	 * @generated
	 */
	EReference getDataVisualizationTask_Tables();

	/**
	 * Returns the meta object for class '{@link Data_Analysis.ExportDataTask <em>Export Data Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Export Data Task</em>'.
	 * @see Data_Analysis.ExportDataTask
	 * @generated
	 */
	EClass getExportDataTask();

	/**
	 * Returns the meta object for the attribute '{@link Data_Analysis.ExportDataTask#getFormat <em>Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Format</em>'.
	 * @see Data_Analysis.ExportDataTask#getFormat()
	 * @see #getExportDataTask()
	 * @generated
	 */
	EAttribute getExportDataTask_Format();

	/**
	 * Returns the meta object for class '{@link Data_Analysis.DataFlow <em>Data Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Flow</em>'.
	 * @see Data_Analysis.DataFlow
	 * @generated
	 */
	EClass getDataFlow();

	/**
	 * Returns the meta object for the attribute '{@link Data_Analysis.DataFlow#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Data_Analysis.DataFlow#getName()
	 * @see #getDataFlow()
	 * @generated
	 */
	EAttribute getDataFlow_Name();

	/**
	 * Returns the meta object for the reference '{@link Data_Analysis.DataFlow#getToTask <em>To Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To Task</em>'.
	 * @see Data_Analysis.DataFlow#getToTask()
	 * @see #getDataFlow()
	 * @generated
	 */
	EReference getDataFlow_ToTask();

	/**
	 * Returns the meta object for the containment reference '{@link Data_Analysis.DataFlow#getCollection <em>Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Collection</em>'.
	 * @see Data_Analysis.DataFlow#getCollection()
	 * @see #getDataFlow()
	 * @generated
	 */
	EReference getDataFlow_Collection();

	/**
	 * Returns the meta object for class '{@link Data_Analysis.Condition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Condition</em>'.
	 * @see Data_Analysis.Condition
	 * @generated
	 */
	EClass getCondition();

	/**
	 * Returns the meta object for the attribute '{@link Data_Analysis.Condition#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Data_Analysis.Condition#getName()
	 * @see #getCondition()
	 * @generated
	 */
	EAttribute getCondition_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link Data_Analysis.Condition#getExpressions <em>Expressions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Expressions</em>'.
	 * @see Data_Analysis.Condition#getExpressions()
	 * @see #getCondition()
	 * @generated
	 */
	EReference getCondition_Expressions();

	/**
	 * Returns the meta object for the containment reference list '{@link Data_Analysis.Condition#getValueConditions <em>Value Conditions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Value Conditions</em>'.
	 * @see Data_Analysis.Condition#getValueConditions()
	 * @see #getCondition()
	 * @generated
	 */
	EReference getCondition_ValueConditions();

	/**
	 * Returns the meta object for class '{@link Data_Analysis.NotEx <em>Not Ex</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Not Ex</em>'.
	 * @see Data_Analysis.NotEx
	 * @generated
	 */
	EClass getNotEx();

	/**
	 * Returns the meta object for class '{@link Data_Analysis.OrExp <em>Or Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Or Exp</em>'.
	 * @see Data_Analysis.OrExp
	 * @generated
	 */
	EClass getOrExp();

	/**
	 * Returns the meta object for class '{@link Data_Analysis.AndExp <em>And Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>And Exp</em>'.
	 * @see Data_Analysis.AndExp
	 * @generated
	 */
	EClass getAndExp();

	/**
	 * Returns the meta object for class '{@link Data_Analysis.ValueCondition <em>Value Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value Condition</em>'.
	 * @see Data_Analysis.ValueCondition
	 * @generated
	 */
	EClass getValueCondition();

	/**
	 * Returns the meta object for the attribute '{@link Data_Analysis.ValueCondition#getAttribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attribute</em>'.
	 * @see Data_Analysis.ValueCondition#getAttribute()
	 * @see #getValueCondition()
	 * @generated
	 */
	EAttribute getValueCondition_Attribute();

	/**
	 * Returns the meta object for the attribute '{@link Data_Analysis.ValueCondition#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see Data_Analysis.ValueCondition#getValue()
	 * @see #getValueCondition()
	 * @generated
	 */
	EAttribute getValueCondition_Value();

	/**
	 * Returns the meta object for class '{@link Data_Analysis.Lt <em>Lt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lt</em>'.
	 * @see Data_Analysis.Lt
	 * @generated
	 */
	EClass getLt();

	/**
	 * Returns the meta object for class '{@link Data_Analysis.Lte <em>Lte</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lte</em>'.
	 * @see Data_Analysis.Lte
	 * @generated
	 */
	EClass getLte();

	/**
	 * Returns the meta object for class '{@link Data_Analysis.Gt <em>Gt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gt</em>'.
	 * @see Data_Analysis.Gt
	 * @generated
	 */
	EClass getGt();

	/**
	 * Returns the meta object for class '{@link Data_Analysis.Gte <em>Gte</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gte</em>'.
	 * @see Data_Analysis.Gte
	 * @generated
	 */
	EClass getGte();

	/**
	 * Returns the meta object for class '{@link Data_Analysis.LogicalExp <em>Logical Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Logical Exp</em>'.
	 * @see Data_Analysis.LogicalExp
	 * @generated
	 */
	EClass getLogicalExp();

	/**
	 * Returns the meta object for the attribute '{@link Data_Analysis.LogicalExp#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Data_Analysis.LogicalExp#getName()
	 * @see #getLogicalExp()
	 * @generated
	 */
	EAttribute getLogicalExp_Name();

	/**
	 * Returns the meta object for the reference list '{@link Data_Analysis.LogicalExp#getValueconditions <em>Valueconditions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Valueconditions</em>'.
	 * @see Data_Analysis.LogicalExp#getValueconditions()
	 * @see #getLogicalExp()
	 * @generated
	 */
	EReference getLogicalExp_Valueconditions();

	/**
	 * Returns the meta object for class '{@link Data_Analysis.Category <em>Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Category</em>'.
	 * @see Data_Analysis.Category
	 * @generated
	 */
	EClass getCategory();

	/**
	 * Returns the meta object for the attribute '{@link Data_Analysis.Category#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Data_Analysis.Category#getName()
	 * @see #getCategory()
	 * @generated
	 */
	EAttribute getCategory_Name();

	/**
	 * Returns the meta object for class '{@link Data_Analysis.Description <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Description</em>'.
	 * @see Data_Analysis.Description
	 * @generated
	 */
	EClass getDescription();

	/**
	 * Returns the meta object for class '{@link Data_Analysis.Prediction <em>Prediction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Prediction</em>'.
	 * @see Data_Analysis.Prediction
	 * @generated
	 */
	EClass getPrediction();

	/**
	 * Returns the meta object for class '{@link Data_Analysis.Clustering <em>Clustering</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Clustering</em>'.
	 * @see Data_Analysis.Clustering
	 * @generated
	 */
	EClass getClustering();

	/**
	 * Returns the meta object for class '{@link Data_Analysis.Classification <em>Classification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Classification</em>'.
	 * @see Data_Analysis.Classification
	 * @generated
	 */
	EClass getClassification();

	/**
	 * Returns the meta object for class '{@link Data_Analysis.Graph <em>Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Graph</em>'.
	 * @see Data_Analysis.Graph
	 * @generated
	 */
	EClass getGraph();

	/**
	 * Returns the meta object for the containment reference list '{@link Data_Analysis.Graph#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see Data_Analysis.Graph#getElements()
	 * @see #getGraph()
	 * @generated
	 */
	EReference getGraph_Elements();

	/**
	 * Returns the meta object for class '{@link Data_Analysis.GraphElement <em>Graph Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Graph Element</em>'.
	 * @see Data_Analysis.GraphElement
	 * @generated
	 */
	EClass getGraphElement();

	/**
	 * Returns the meta object for class '{@link Data_Analysis.Node <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node</em>'.
	 * @see Data_Analysis.Node
	 * @generated
	 */
	EClass getNode();

	/**
	 * Returns the meta object for the attribute '{@link Data_Analysis.Node#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Data_Analysis.Node#getName()
	 * @see #getNode()
	 * @generated
	 */
	EAttribute getNode_Name();

	/**
	 * Returns the meta object for the attribute '{@link Data_Analysis.Node#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see Data_Analysis.Node#getWidth()
	 * @see #getNode()
	 * @generated
	 */
	EAttribute getNode_Width();

	/**
	 * Returns the meta object for the attribute '{@link Data_Analysis.Node#getHeight <em>Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Height</em>'.
	 * @see Data_Analysis.Node#getHeight()
	 * @see #getNode()
	 * @generated
	 */
	EAttribute getNode_Height();

	/**
	 * Returns the meta object for the attribute '{@link Data_Analysis.Node#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see Data_Analysis.Node#getX()
	 * @see #getNode()
	 * @generated
	 */
	EAttribute getNode_X();

	/**
	 * Returns the meta object for the attribute '{@link Data_Analysis.Node#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see Data_Analysis.Node#getY()
	 * @see #getNode()
	 * @generated
	 */
	EAttribute getNode_Y();

	/**
	 * Returns the meta object for class '{@link Data_Analysis.Edge <em>Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Edge</em>'.
	 * @see Data_Analysis.Edge
	 * @generated
	 */
	EClass getEdge();

	/**
	 * Returns the meta object for the attribute '{@link Data_Analysis.Edge#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Data_Analysis.Edge#getName()
	 * @see #getEdge()
	 * @generated
	 */
	EAttribute getEdge_Name();

	/**
	 * Returns the meta object for the reference '{@link Data_Analysis.Edge#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see Data_Analysis.Edge#getSource()
	 * @see #getEdge()
	 * @generated
	 */
	EReference getEdge_Source();

	/**
	 * Returns the meta object for the reference '{@link Data_Analysis.Edge#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see Data_Analysis.Edge#getTarget()
	 * @see #getEdge()
	 * @generated
	 */
	EReference getEdge_Target();

	/**
	 * Returns the meta object for the attribute '{@link Data_Analysis.Edge#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see Data_Analysis.Edge#getWidth()
	 * @see #getEdge()
	 * @generated
	 */
	EAttribute getEdge_Width();

	/**
	 * Returns the meta object for class '{@link Data_Analysis.Table <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Table</em>'.
	 * @see Data_Analysis.Table
	 * @generated
	 */
	EClass getTable();

	/**
	 * Returns the meta object for the attribute '{@link Data_Analysis.Table#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Data_Analysis.Table#getName()
	 * @see #getTable()
	 * @generated
	 */
	EAttribute getTable_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link Data_Analysis.Table#getRows <em>Rows</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rows</em>'.
	 * @see Data_Analysis.Table#getRows()
	 * @see #getTable()
	 * @generated
	 */
	EReference getTable_Rows();

	/**
	 * Returns the meta object for class '{@link Data_Analysis.Analysis <em>Analysis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Analysis</em>'.
	 * @see Data_Analysis.Analysis
	 * @generated
	 */
	EClass getAnalysis();

	/**
	 * Returns the meta object for the attribute '{@link Data_Analysis.Analysis#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Data_Analysis.Analysis#getName()
	 * @see #getAnalysis()
	 * @generated
	 */
	EAttribute getAnalysis_Name();

	/**
	 * Returns the meta object for class '{@link Data_Analysis.GraphicElement <em>Graphic Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Graphic Element</em>'.
	 * @see Data_Analysis.GraphicElement
	 * @generated
	 */
	EClass getGraphicElement();

	/**
	 * Returns the meta object for the attribute '{@link Data_Analysis.GraphicElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Data_Analysis.GraphicElement#getName()
	 * @see #getGraphicElement()
	 * @generated
	 */
	EAttribute getGraphicElement_Name();

	/**
	 * Returns the meta object for class '{@link Data_Analysis.Diagram <em>Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diagram</em>'.
	 * @see Data_Analysis.Diagram
	 * @generated
	 */
	EClass getDiagram();

	/**
	 * Returns the meta object for class '{@link Data_Analysis.CollectionSchema <em>Collection Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Collection Schema</em>'.
	 * @see Data_Analysis.CollectionSchema
	 * @generated
	 */
	EClass getCollectionSchema();

	/**
	 * Returns the meta object for the attribute '{@link Data_Analysis.CollectionSchema#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Data_Analysis.CollectionSchema#getName()
	 * @see #getCollectionSchema()
	 * @generated
	 */
	EAttribute getCollectionSchema_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link Data_Analysis.CollectionSchema#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attributes</em>'.
	 * @see Data_Analysis.CollectionSchema#getAttributes()
	 * @see #getCollectionSchema()
	 * @generated
	 */
	EReference getCollectionSchema_Attributes();

	/**
	 * Returns the meta object for class '{@link Data_Analysis.Attribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute</em>'.
	 * @see Data_Analysis.Attribute
	 * @generated
	 */
	EClass getAttribute();

	/**
	 * Returns the meta object for the attribute '{@link Data_Analysis.Attribute#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Data_Analysis.Attribute#getName()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Name();

	/**
	 * Returns the meta object for the attribute '{@link Data_Analysis.Attribute#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see Data_Analysis.Attribute#getType()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Type();

	/**
	 * Returns the meta object for the attribute '{@link Data_Analysis.Attribute#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see Data_Analysis.Attribute#getValue()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Value();

	/**
	 * Returns the meta object for class '{@link Data_Analysis.Row <em>Row</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Row</em>'.
	 * @see Data_Analysis.Row
	 * @generated
	 */
	EClass getRow();

	/**
	 * Returns the meta object for the attribute '{@link Data_Analysis.Row#getRowIndex <em>Row Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Row Index</em>'.
	 * @see Data_Analysis.Row#getRowIndex()
	 * @see #getRow()
	 * @generated
	 */
	EAttribute getRow_RowIndex();

	/**
	 * Returns the meta object for the containment reference list '{@link Data_Analysis.Row#getCells <em>Cells</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cells</em>'.
	 * @see Data_Analysis.Row#getCells()
	 * @see #getRow()
	 * @generated
	 */
	EReference getRow_Cells();

	/**
	 * Returns the meta object for class '{@link Data_Analysis.Cell <em>Cell</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cell</em>'.
	 * @see Data_Analysis.Cell
	 * @generated
	 */
	EClass getCell();

	/**
	 * Returns the meta object for the attribute '{@link Data_Analysis.Cell#getCellIndex <em>Cell Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cell Index</em>'.
	 * @see Data_Analysis.Cell#getCellIndex()
	 * @see #getCell()
	 * @generated
	 */
	EAttribute getCell_CellIndex();

	/**
	 * Returns the meta object for the attribute '{@link Data_Analysis.Cell#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see Data_Analysis.Cell#getValue()
	 * @see #getCell()
	 * @generated
	 */
	EAttribute getCell_Value();

	/**
	 * Returns the meta object for enum '{@link Data_Analysis.CategoryType <em>Category Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Category Type</em>'.
	 * @see Data_Analysis.CategoryType
	 * @generated
	 */
	EEnum getCategoryType();

	/**
	 * Returns the meta object for enum '{@link Data_Analysis.FormatType <em>Format Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Format Type</em>'.
	 * @see Data_Analysis.FormatType
	 * @generated
	 */
	EEnum getFormatType();

	/**
	 * Returns the meta object for enum '{@link Data_Analysis.AttributeType <em>Attribute Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Attribute Type</em>'.
	 * @see Data_Analysis.AttributeType
	 * @generated
	 */
	EEnum getAttributeType();

	/**
	 * Returns the meta object for enum '{@link Data_Analysis.CustomAction <em>Custom Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Custom Action</em>'.
	 * @see Data_Analysis.CustomAction
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
	Data_AnalysisFactory getData_AnalysisFactory();

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
		 * The meta object literal for the '{@link Data_Analysis.impl.PipelineImpl <em>Pipeline</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Data_Analysis.impl.PipelineImpl
		 * @see Data_Analysis.impl.Data_AnalysisPackageImpl#getPipeline()
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
		 * The meta object literal for the '<em><b>Flows</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PIPELINE__FLOWS = eINSTANCE.getPipeline_Flows();

		/**
		 * The meta object literal for the '<em><b>Schemas</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PIPELINE__SCHEMAS = eINSTANCE.getPipeline_Schemas();

		/**
		 * The meta object literal for the '<em><b>Conditions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PIPELINE__CONDITIONS = eINSTANCE.getPipeline_Conditions();

		/**
		 * The meta object literal for the '{@link Data_Analysis.impl.TaskImpl <em>Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Data_Analysis.impl.TaskImpl
		 * @see Data_Analysis.impl.Data_AnalysisPackageImpl#getTask()
		 * @generated
		 */
		EClass TASK = eINSTANCE.getTask();

		/**
		 * The meta object literal for the '<em><b>To Flow</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK__TO_FLOW = eINSTANCE.getTask_ToFlow();

		/**
		 * The meta object literal for the '<em><b>Execution Timestamp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK__EXECUTION_TIMESTAMP = eINSTANCE.getTask_ExecutionTimestamp();

		/**
		 * The meta object literal for the '<em><b>Is Executed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK__IS_EXECUTED = eINSTANCE.getTask_IsExecuted();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK__NAME = eINSTANCE.getTask_Name();

		/**
		 * The meta object literal for the '{@link Data_Analysis.impl.DataCollectionTaskImpl <em>Data Collection Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Data_Analysis.impl.DataCollectionTaskImpl
		 * @see Data_Analysis.impl.Data_AnalysisPackageImpl#getDataCollectionTask()
		 * @generated
		 */
		EClass DATA_COLLECTION_TASK = eINSTANCE.getDataCollectionTask();

		/**
		 * The meta object literal for the '<em><b>Format</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_COLLECTION_TASK__FORMAT = eINSTANCE.getDataCollectionTask_Format();

		/**
		 * The meta object literal for the '<em><b>Endpoint</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_COLLECTION_TASK__ENDPOINT = eINSTANCE.getDataCollectionTask_Endpoint();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_COLLECTION_TASK__SOURCE = eINSTANCE.getDataCollectionTask_Source();

		/**
		 * The meta object literal for the '<em><b>Input Schema</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_COLLECTION_TASK__INPUT_SCHEMA = eINSTANCE.getDataCollectionTask_InputSchema();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_COLLECTION_TASK__CONDITION = eINSTANCE.getDataCollectionTask_Condition();

		/**
		 * The meta object literal for the '{@link Data_Analysis.impl.DataIntegrationTaskImpl <em>Data Integration Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Data_Analysis.impl.DataIntegrationTaskImpl
		 * @see Data_Analysis.impl.Data_AnalysisPackageImpl#getDataIntegrationTask()
		 * @generated
		 */
		EClass DATA_INTEGRATION_TASK = eINSTANCE.getDataIntegrationTask();

		/**
		 * The meta object literal for the '<em><b>Join Attributes</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_INTEGRATION_TASK__JOIN_ATTRIBUTES = eINSTANCE.getDataIntegrationTask_JoinAttributes();

		/**
		 * The meta object literal for the '<em><b>Out Attributes</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_INTEGRATION_TASK__OUT_ATTRIBUTES = eINSTANCE.getDataIntegrationTask_OutAttributes();

		/**
		 * The meta object literal for the '{@link Data_Analysis.impl.DataCleaningImpl <em>Data Cleaning</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Data_Analysis.impl.DataCleaningImpl
		 * @see Data_Analysis.impl.Data_AnalysisPackageImpl#getDataCleaning()
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
		 * The meta object literal for the '{@link Data_Analysis.impl.DataAnalysisTaskImpl <em>Data Analysis Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Data_Analysis.impl.DataAnalysisTaskImpl
		 * @see Data_Analysis.impl.Data_AnalysisPackageImpl#getDataAnalysisTask()
		 * @generated
		 */
		EClass DATA_ANALYSIS_TASK = eINSTANCE.getDataAnalysisTask();

		/**
		 * The meta object literal for the '<em><b>Category</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_ANALYSIS_TASK__CATEGORY = eINSTANCE.getDataAnalysisTask_Category();

		/**
		 * The meta object literal for the '<em><b>Analysis</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_ANALYSIS_TASK__ANALYSIS = eINSTANCE.getDataAnalysisTask_Analysis();

		/**
		 * The meta object literal for the '{@link Data_Analysis.impl.DataSchemaImpl <em>Data Schema</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Data_Analysis.impl.DataSchemaImpl
		 * @see Data_Analysis.impl.Data_AnalysisPackageImpl#getDataSchema()
		 * @generated
		 */
		EClass DATA_SCHEMA = eINSTANCE.getDataSchema();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_SCHEMA__NAME = eINSTANCE.getDataSchema_Name();

		/**
		 * The meta object literal for the '<em><b>Schema Attributes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_SCHEMA__SCHEMA_ATTRIBUTES = eINSTANCE.getDataSchema_SchemaAttributes();

		/**
		 * The meta object literal for the '{@link Data_Analysis.impl.AttributeSchemaImpl <em>Attribute Schema</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Data_Analysis.impl.AttributeSchemaImpl
		 * @see Data_Analysis.impl.Data_AnalysisPackageImpl#getAttributeSchema()
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
		 * The meta object literal for the '{@link Data_Analysis.impl.SourceImpl <em>Source</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Data_Analysis.impl.SourceImpl
		 * @see Data_Analysis.impl.Data_AnalysisPackageImpl#getSource()
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
		 * The meta object literal for the '{@link Data_Analysis.impl.FileImpl <em>File</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Data_Analysis.impl.FileImpl
		 * @see Data_Analysis.impl.Data_AnalysisPackageImpl#getFile()
		 * @generated
		 */
		EClass FILE = eINSTANCE.getFile();

		/**
		 * The meta object literal for the '{@link Data_Analysis.impl.DatabaseImpl <em>Database</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Data_Analysis.impl.DatabaseImpl
		 * @see Data_Analysis.impl.Data_AnalysisPackageImpl#getDatabase()
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
		 * The meta object literal for the '{@link Data_Analysis.impl.RestServiceImpl <em>Rest Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Data_Analysis.impl.RestServiceImpl
		 * @see Data_Analysis.impl.Data_AnalysisPackageImpl#getRestService()
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
		 * The meta object literal for the '{@link Data_Analysis.impl.OperationImpl <em>Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Data_Analysis.impl.OperationImpl
		 * @see Data_Analysis.impl.Data_AnalysisPackageImpl#getOperation()
		 * @generated
		 */
		EClass OPERATION = eINSTANCE.getOperation();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATION__NAME = eINSTANCE.getOperation_Name();

		/**
		 * The meta object literal for the '{@link Data_Analysis.impl.RemoveNullImpl <em>Remove Null</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Data_Analysis.impl.RemoveNullImpl
		 * @see Data_Analysis.impl.Data_AnalysisPackageImpl#getRemoveNull()
		 * @generated
		 */
		EClass REMOVE_NULL = eINSTANCE.getRemoveNull();

		/**
		 * The meta object literal for the '{@link Data_Analysis.impl.FormatDataImpl <em>Format Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Data_Analysis.impl.FormatDataImpl
		 * @see Data_Analysis.impl.Data_AnalysisPackageImpl#getFormatData()
		 * @generated
		 */
		EClass FORMAT_DATA = eINSTANCE.getFormatData();

		/**
		 * The meta object literal for the '{@link Data_Analysis.impl.CustomImpl <em>Custom</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Data_Analysis.impl.CustomImpl
		 * @see Data_Analysis.impl.Data_AnalysisPackageImpl#getCustom()
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
		 * The meta object literal for the '{@link Data_Analysis.impl.DataVisualizationTaskImpl <em>Data Visualization Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Data_Analysis.impl.DataVisualizationTaskImpl
		 * @see Data_Analysis.impl.Data_AnalysisPackageImpl#getDataVisualizationTask()
		 * @generated
		 */
		EClass DATA_VISUALIZATION_TASK = eINSTANCE.getDataVisualizationTask();

		/**
		 * The meta object literal for the '<em><b>Visual Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_VISUALIZATION_TASK__VISUAL_ELEMENTS = eINSTANCE.getDataVisualizationTask_VisualElements();

		/**
		 * The meta object literal for the '<em><b>Tables</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_VISUALIZATION_TASK__TABLES = eINSTANCE.getDataVisualizationTask_Tables();

		/**
		 * The meta object literal for the '{@link Data_Analysis.impl.ExportDataTaskImpl <em>Export Data Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Data_Analysis.impl.ExportDataTaskImpl
		 * @see Data_Analysis.impl.Data_AnalysisPackageImpl#getExportDataTask()
		 * @generated
		 */
		EClass EXPORT_DATA_TASK = eINSTANCE.getExportDataTask();

		/**
		 * The meta object literal for the '<em><b>Format</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXPORT_DATA_TASK__FORMAT = eINSTANCE.getExportDataTask_Format();

		/**
		 * The meta object literal for the '{@link Data_Analysis.impl.DataFlowImpl <em>Data Flow</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Data_Analysis.impl.DataFlowImpl
		 * @see Data_Analysis.impl.Data_AnalysisPackageImpl#getDataFlow()
		 * @generated
		 */
		EClass DATA_FLOW = eINSTANCE.getDataFlow();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_FLOW__NAME = eINSTANCE.getDataFlow_Name();

		/**
		 * The meta object literal for the '<em><b>To Task</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_FLOW__TO_TASK = eINSTANCE.getDataFlow_ToTask();

		/**
		 * The meta object literal for the '<em><b>Collection</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_FLOW__COLLECTION = eINSTANCE.getDataFlow_Collection();

		/**
		 * The meta object literal for the '{@link Data_Analysis.impl.ConditionImpl <em>Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Data_Analysis.impl.ConditionImpl
		 * @see Data_Analysis.impl.Data_AnalysisPackageImpl#getCondition()
		 * @generated
		 */
		EClass CONDITION = eINSTANCE.getCondition();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONDITION__NAME = eINSTANCE.getCondition_Name();

		/**
		 * The meta object literal for the '<em><b>Expressions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITION__EXPRESSIONS = eINSTANCE.getCondition_Expressions();

		/**
		 * The meta object literal for the '<em><b>Value Conditions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITION__VALUE_CONDITIONS = eINSTANCE.getCondition_ValueConditions();

		/**
		 * The meta object literal for the '{@link Data_Analysis.impl.NotExImpl <em>Not Ex</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Data_Analysis.impl.NotExImpl
		 * @see Data_Analysis.impl.Data_AnalysisPackageImpl#getNotEx()
		 * @generated
		 */
		EClass NOT_EX = eINSTANCE.getNotEx();

		/**
		 * The meta object literal for the '{@link Data_Analysis.impl.OrExpImpl <em>Or Exp</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Data_Analysis.impl.OrExpImpl
		 * @see Data_Analysis.impl.Data_AnalysisPackageImpl#getOrExp()
		 * @generated
		 */
		EClass OR_EXP = eINSTANCE.getOrExp();

		/**
		 * The meta object literal for the '{@link Data_Analysis.impl.AndExpImpl <em>And Exp</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Data_Analysis.impl.AndExpImpl
		 * @see Data_Analysis.impl.Data_AnalysisPackageImpl#getAndExp()
		 * @generated
		 */
		EClass AND_EXP = eINSTANCE.getAndExp();

		/**
		 * The meta object literal for the '{@link Data_Analysis.impl.ValueConditionImpl <em>Value Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Data_Analysis.impl.ValueConditionImpl
		 * @see Data_Analysis.impl.Data_AnalysisPackageImpl#getValueCondition()
		 * @generated
		 */
		EClass VALUE_CONDITION = eINSTANCE.getValueCondition();

		/**
		 * The meta object literal for the '<em><b>Attribute</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALUE_CONDITION__ATTRIBUTE = eINSTANCE.getValueCondition_Attribute();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALUE_CONDITION__VALUE = eINSTANCE.getValueCondition_Value();

		/**
		 * The meta object literal for the '{@link Data_Analysis.impl.LtImpl <em>Lt</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Data_Analysis.impl.LtImpl
		 * @see Data_Analysis.impl.Data_AnalysisPackageImpl#getLt()
		 * @generated
		 */
		EClass LT = eINSTANCE.getLt();

		/**
		 * The meta object literal for the '{@link Data_Analysis.impl.LteImpl <em>Lte</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Data_Analysis.impl.LteImpl
		 * @see Data_Analysis.impl.Data_AnalysisPackageImpl#getLte()
		 * @generated
		 */
		EClass LTE = eINSTANCE.getLte();

		/**
		 * The meta object literal for the '{@link Data_Analysis.impl.GtImpl <em>Gt</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Data_Analysis.impl.GtImpl
		 * @see Data_Analysis.impl.Data_AnalysisPackageImpl#getGt()
		 * @generated
		 */
		EClass GT = eINSTANCE.getGt();

		/**
		 * The meta object literal for the '{@link Data_Analysis.impl.GteImpl <em>Gte</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Data_Analysis.impl.GteImpl
		 * @see Data_Analysis.impl.Data_AnalysisPackageImpl#getGte()
		 * @generated
		 */
		EClass GTE = eINSTANCE.getGte();

		/**
		 * The meta object literal for the '{@link Data_Analysis.impl.LogicalExpImpl <em>Logical Exp</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Data_Analysis.impl.LogicalExpImpl
		 * @see Data_Analysis.impl.Data_AnalysisPackageImpl#getLogicalExp()
		 * @generated
		 */
		EClass LOGICAL_EXP = eINSTANCE.getLogicalExp();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOGICAL_EXP__NAME = eINSTANCE.getLogicalExp_Name();

		/**
		 * The meta object literal for the '<em><b>Valueconditions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOGICAL_EXP__VALUECONDITIONS = eINSTANCE.getLogicalExp_Valueconditions();

		/**
		 * The meta object literal for the '{@link Data_Analysis.impl.CategoryImpl <em>Category</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Data_Analysis.impl.CategoryImpl
		 * @see Data_Analysis.impl.Data_AnalysisPackageImpl#getCategory()
		 * @generated
		 */
		EClass CATEGORY = eINSTANCE.getCategory();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CATEGORY__NAME = eINSTANCE.getCategory_Name();

		/**
		 * The meta object literal for the '{@link Data_Analysis.impl.DescriptionImpl <em>Description</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Data_Analysis.impl.DescriptionImpl
		 * @see Data_Analysis.impl.Data_AnalysisPackageImpl#getDescription()
		 * @generated
		 */
		EClass DESCRIPTION = eINSTANCE.getDescription();

		/**
		 * The meta object literal for the '{@link Data_Analysis.impl.PredictionImpl <em>Prediction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Data_Analysis.impl.PredictionImpl
		 * @see Data_Analysis.impl.Data_AnalysisPackageImpl#getPrediction()
		 * @generated
		 */
		EClass PREDICTION = eINSTANCE.getPrediction();

		/**
		 * The meta object literal for the '{@link Data_Analysis.impl.ClusteringImpl <em>Clustering</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Data_Analysis.impl.ClusteringImpl
		 * @see Data_Analysis.impl.Data_AnalysisPackageImpl#getClustering()
		 * @generated
		 */
		EClass CLUSTERING = eINSTANCE.getClustering();

		/**
		 * The meta object literal for the '{@link Data_Analysis.impl.ClassificationImpl <em>Classification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Data_Analysis.impl.ClassificationImpl
		 * @see Data_Analysis.impl.Data_AnalysisPackageImpl#getClassification()
		 * @generated
		 */
		EClass CLASSIFICATION = eINSTANCE.getClassification();

		/**
		 * The meta object literal for the '{@link Data_Analysis.impl.GraphImpl <em>Graph</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Data_Analysis.impl.GraphImpl
		 * @see Data_Analysis.impl.Data_AnalysisPackageImpl#getGraph()
		 * @generated
		 */
		EClass GRAPH = eINSTANCE.getGraph();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRAPH__ELEMENTS = eINSTANCE.getGraph_Elements();

		/**
		 * The meta object literal for the '{@link Data_Analysis.impl.GraphElementImpl <em>Graph Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Data_Analysis.impl.GraphElementImpl
		 * @see Data_Analysis.impl.Data_AnalysisPackageImpl#getGraphElement()
		 * @generated
		 */
		EClass GRAPH_ELEMENT = eINSTANCE.getGraphElement();

		/**
		 * The meta object literal for the '{@link Data_Analysis.impl.NodeImpl <em>Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Data_Analysis.impl.NodeImpl
		 * @see Data_Analysis.impl.Data_AnalysisPackageImpl#getNode()
		 * @generated
		 */
		EClass NODE = eINSTANCE.getNode();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE__NAME = eINSTANCE.getNode_Name();

		/**
		 * The meta object literal for the '<em><b>Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE__WIDTH = eINSTANCE.getNode_Width();

		/**
		 * The meta object literal for the '<em><b>Height</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE__HEIGHT = eINSTANCE.getNode_Height();

		/**
		 * The meta object literal for the '<em><b>X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE__X = eINSTANCE.getNode_X();

		/**
		 * The meta object literal for the '<em><b>Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE__Y = eINSTANCE.getNode_Y();

		/**
		 * The meta object literal for the '{@link Data_Analysis.impl.EdgeImpl <em>Edge</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Data_Analysis.impl.EdgeImpl
		 * @see Data_Analysis.impl.Data_AnalysisPackageImpl#getEdge()
		 * @generated
		 */
		EClass EDGE = eINSTANCE.getEdge();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EDGE__NAME = eINSTANCE.getEdge_Name();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EDGE__SOURCE = eINSTANCE.getEdge_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EDGE__TARGET = eINSTANCE.getEdge_Target();

		/**
		 * The meta object literal for the '<em><b>Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EDGE__WIDTH = eINSTANCE.getEdge_Width();

		/**
		 * The meta object literal for the '{@link Data_Analysis.impl.TableImpl <em>Table</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Data_Analysis.impl.TableImpl
		 * @see Data_Analysis.impl.Data_AnalysisPackageImpl#getTable()
		 * @generated
		 */
		EClass TABLE = eINSTANCE.getTable();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE__NAME = eINSTANCE.getTable_Name();

		/**
		 * The meta object literal for the '<em><b>Rows</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE__ROWS = eINSTANCE.getTable_Rows();

		/**
		 * The meta object literal for the '{@link Data_Analysis.impl.AnalysisImpl <em>Analysis</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Data_Analysis.impl.AnalysisImpl
		 * @see Data_Analysis.impl.Data_AnalysisPackageImpl#getAnalysis()
		 * @generated
		 */
		EClass ANALYSIS = eINSTANCE.getAnalysis();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANALYSIS__NAME = eINSTANCE.getAnalysis_Name();

		/**
		 * The meta object literal for the '{@link Data_Analysis.impl.GraphicElementImpl <em>Graphic Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Data_Analysis.impl.GraphicElementImpl
		 * @see Data_Analysis.impl.Data_AnalysisPackageImpl#getGraphicElement()
		 * @generated
		 */
		EClass GRAPHIC_ELEMENT = eINSTANCE.getGraphicElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRAPHIC_ELEMENT__NAME = eINSTANCE.getGraphicElement_Name();

		/**
		 * The meta object literal for the '{@link Data_Analysis.impl.DiagramImpl <em>Diagram</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Data_Analysis.impl.DiagramImpl
		 * @see Data_Analysis.impl.Data_AnalysisPackageImpl#getDiagram()
		 * @generated
		 */
		EClass DIAGRAM = eINSTANCE.getDiagram();

		/**
		 * The meta object literal for the '{@link Data_Analysis.impl.CollectionSchemaImpl <em>Collection Schema</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Data_Analysis.impl.CollectionSchemaImpl
		 * @see Data_Analysis.impl.Data_AnalysisPackageImpl#getCollectionSchema()
		 * @generated
		 */
		EClass COLLECTION_SCHEMA = eINSTANCE.getCollectionSchema();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLLECTION_SCHEMA__NAME = eINSTANCE.getCollectionSchema_Name();

		/**
		 * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLLECTION_SCHEMA__ATTRIBUTES = eINSTANCE.getCollectionSchema_Attributes();

		/**
		 * The meta object literal for the '{@link Data_Analysis.impl.AttributeImpl <em>Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Data_Analysis.impl.AttributeImpl
		 * @see Data_Analysis.impl.Data_AnalysisPackageImpl#getAttribute()
		 * @generated
		 */
		EClass ATTRIBUTE = eINSTANCE.getAttribute();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__NAME = eINSTANCE.getAttribute_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__TYPE = eINSTANCE.getAttribute_Type();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__VALUE = eINSTANCE.getAttribute_Value();

		/**
		 * The meta object literal for the '{@link Data_Analysis.impl.RowImpl <em>Row</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Data_Analysis.impl.RowImpl
		 * @see Data_Analysis.impl.Data_AnalysisPackageImpl#getRow()
		 * @generated
		 */
		EClass ROW = eINSTANCE.getRow();

		/**
		 * The meta object literal for the '<em><b>Row Index</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROW__ROW_INDEX = eINSTANCE.getRow_RowIndex();

		/**
		 * The meta object literal for the '<em><b>Cells</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROW__CELLS = eINSTANCE.getRow_Cells();

		/**
		 * The meta object literal for the '{@link Data_Analysis.impl.CellImpl <em>Cell</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Data_Analysis.impl.CellImpl
		 * @see Data_Analysis.impl.Data_AnalysisPackageImpl#getCell()
		 * @generated
		 */
		EClass CELL = eINSTANCE.getCell();

		/**
		 * The meta object literal for the '<em><b>Cell Index</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CELL__CELL_INDEX = eINSTANCE.getCell_CellIndex();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CELL__VALUE = eINSTANCE.getCell_Value();

		/**
		 * The meta object literal for the '{@link Data_Analysis.CategoryType <em>Category Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Data_Analysis.CategoryType
		 * @see Data_Analysis.impl.Data_AnalysisPackageImpl#getCategoryType()
		 * @generated
		 */
		EEnum CATEGORY_TYPE = eINSTANCE.getCategoryType();

		/**
		 * The meta object literal for the '{@link Data_Analysis.FormatType <em>Format Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Data_Analysis.FormatType
		 * @see Data_Analysis.impl.Data_AnalysisPackageImpl#getFormatType()
		 * @generated
		 */
		EEnum FORMAT_TYPE = eINSTANCE.getFormatType();

		/**
		 * The meta object literal for the '{@link Data_Analysis.AttributeType <em>Attribute Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Data_Analysis.AttributeType
		 * @see Data_Analysis.impl.Data_AnalysisPackageImpl#getAttributeType()
		 * @generated
		 */
		EEnum ATTRIBUTE_TYPE = eINSTANCE.getAttributeType();

		/**
		 * The meta object literal for the '{@link Data_Analysis.CustomAction <em>Custom Action</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Data_Analysis.CustomAction
		 * @see Data_Analysis.impl.Data_AnalysisPackageImpl#getCustomAction()
		 * @generated
		 */
		EEnum CUSTOM_ACTION = eINSTANCE.getCustomAction();

	}

} //Data_AnalysisPackage
