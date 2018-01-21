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
			case Data_AnalysisPackage.DATA_COLLECTION: return createDataCollection();
			case Data_AnalysisPackage.DATA_INTEGRATION: return createDataIntegration();
			case Data_AnalysisPackage.DATA_CLEANING: return createDataCleaning();
			case Data_AnalysisPackage.DATA_ANALYSIS: return createDataAnalysis();
			case Data_AnalysisPackage.COLLECTION_SCHEMA: return createCollectionSchema();
			case Data_AnalysisPackage.ATTRIBUTE_SCHEMA: return createAttributeSchema();
			case Data_AnalysisPackage.FILE: return createFile();
			case Data_AnalysisPackage.DATABASE: return createDatabase();
			case Data_AnalysisPackage.REST_SERVICE: return createRestService();
			case Data_AnalysisPackage.REMOVE_NULL: return createRemoveNull();
			case Data_AnalysisPackage.FORMAT_DATA: return createFormatData();
			case Data_AnalysisPackage.CUSTOM: return createCustom();
			case Data_AnalysisPackage.DATA_VISUALIZATION: return createDataVisualization();
			case Data_AnalysisPackage.EXPORT_DATA: return createExportData();
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
	public DataCollection createDataCollection() {
		DataCollectionImpl dataCollection = new DataCollectionImpl();
		return dataCollection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataIntegration createDataIntegration() {
		DataIntegrationImpl dataIntegration = new DataIntegrationImpl();
		return dataIntegration;
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
	public DataAnalysis createDataAnalysis() {
		DataAnalysisImpl dataAnalysis = new DataAnalysisImpl();
		return dataAnalysis;
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
	public DataVisualization createDataVisualization() {
		DataVisualizationImpl dataVisualization = new DataVisualizationImpl();
		return dataVisualization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExportData createExportData() {
		ExportDataImpl exportData = new ExportDataImpl();
		return exportData;
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
