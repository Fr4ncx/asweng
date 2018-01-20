/**
 */
package DataAnalysis.impl;

import DataAnalysis.*;

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
public class DataAnalysisFactoryImpl extends EFactoryImpl implements DataAnalysisFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DataAnalysisFactory init() {
		try {
			DataAnalysisFactory theDataAnalysisFactory = (DataAnalysisFactory)EPackage.Registry.INSTANCE.getEFactory(DataAnalysisPackage.eNS_URI);
			if (theDataAnalysisFactory != null) {
				return theDataAnalysisFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new DataAnalysisFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataAnalysisFactoryImpl() {
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
			case DataAnalysisPackage.MODEL: return createModel();
			case DataAnalysisPackage.PIPELINE: return createPipeline();
			case DataAnalysisPackage.DATA_COLLECTION: return createDataCollection();
			case DataAnalysisPackage.DATA_INTEGRATION: return createDataIntegration();
			case DataAnalysisPackage.DATA_CLEANING: return createDataCleaning();
			case DataAnalysisPackage.DATA_ANALYSIS: return createDataAnalysis();
			case DataAnalysisPackage.COLLECTION_SCHEMA: return createCollectionSchema();
			case DataAnalysisPackage.ATTRIBUTE_SCHEMA: return createAttributeSchema();
			case DataAnalysisPackage.FILE: return createFile();
			case DataAnalysisPackage.DATABASE: return createDatabase();
			case DataAnalysisPackage.REST_SERVICE: return createRestService();
			case DataAnalysisPackage.REMOVE_NULL: return createRemoveNull();
			case DataAnalysisPackage.FORMAT_DATA: return createFormatData();
			case DataAnalysisPackage.CUSTOM: return createCustom();
			case DataAnalysisPackage.DATA_VISUALIZATION: return createDataVisualization();
			case DataAnalysisPackage.EXPORT_DATA: return createExportData();
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
			case DataAnalysisPackage.CATEGORY_TYPE:
				return createCategoryTypeFromString(eDataType, initialValue);
			case DataAnalysisPackage.FORMAT_TYPE:
				return createFormatTypeFromString(eDataType, initialValue);
			case DataAnalysisPackage.ATTRIBUTE_TYPE:
				return createAttributeTypeFromString(eDataType, initialValue);
			case DataAnalysisPackage.CUSTOM_ACTION:
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
			case DataAnalysisPackage.CATEGORY_TYPE:
				return convertCategoryTypeToString(eDataType, instanceValue);
			case DataAnalysisPackage.FORMAT_TYPE:
				return convertFormatTypeToString(eDataType, instanceValue);
			case DataAnalysisPackage.ATTRIBUTE_TYPE:
				return convertAttributeTypeToString(eDataType, instanceValue);
			case DataAnalysisPackage.CUSTOM_ACTION:
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
	public Model createModel() {
		ModelImpl model = new ModelImpl();
		return model;
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
	public DataAnalysisPackage getDataAnalysisPackage() {
		return (DataAnalysisPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static DataAnalysisPackage getPackage() {
		return DataAnalysisPackage.eINSTANCE;
	}

} //DataAnalysisFactoryImpl
