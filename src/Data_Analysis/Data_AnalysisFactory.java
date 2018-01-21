/**
 */
package Data_Analysis;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see Data_Analysis.Data_AnalysisPackage
 * @generated
 */
public interface Data_AnalysisFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Data_AnalysisFactory eINSTANCE = Data_Analysis.impl.Data_AnalysisFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Pipeline</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pipeline</em>'.
	 * @generated
	 */
	Pipeline createPipeline();

	/**
	 * Returns a new object of class '<em>Data Collection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Collection</em>'.
	 * @generated
	 */
	DataCollection createDataCollection();

	/**
	 * Returns a new object of class '<em>Data Integration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Integration</em>'.
	 * @generated
	 */
	DataIntegration createDataIntegration();

	/**
	 * Returns a new object of class '<em>Data Cleaning</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Cleaning</em>'.
	 * @generated
	 */
	DataCleaning createDataCleaning();

	/**
	 * Returns a new object of class '<em>Data Analysis</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Analysis</em>'.
	 * @generated
	 */
	DataAnalysis createDataAnalysis();

	/**
	 * Returns a new object of class '<em>Collection Schema</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Collection Schema</em>'.
	 * @generated
	 */
	CollectionSchema createCollectionSchema();

	/**
	 * Returns a new object of class '<em>Attribute Schema</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attribute Schema</em>'.
	 * @generated
	 */
	AttributeSchema createAttributeSchema();

	/**
	 * Returns a new object of class '<em>File</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>File</em>'.
	 * @generated
	 */
	File createFile();

	/**
	 * Returns a new object of class '<em>Database</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Database</em>'.
	 * @generated
	 */
	Database createDatabase();

	/**
	 * Returns a new object of class '<em>Rest Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rest Service</em>'.
	 * @generated
	 */
	RestService createRestService();

	/**
	 * Returns a new object of class '<em>Remove Null</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Remove Null</em>'.
	 * @generated
	 */
	RemoveNull createRemoveNull();

	/**
	 * Returns a new object of class '<em>Format Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Format Data</em>'.
	 * @generated
	 */
	FormatData createFormatData();

	/**
	 * Returns a new object of class '<em>Custom</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Custom</em>'.
	 * @generated
	 */
	Custom createCustom();

	/**
	 * Returns a new object of class '<em>Data Visualization</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Visualization</em>'.
	 * @generated
	 */
	DataVisualization createDataVisualization();

	/**
	 * Returns a new object of class '<em>Export Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Export Data</em>'.
	 * @generated
	 */
	ExportData createExportData();

	/**
	 * Returns a new object of class '<em>Data Flow</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Flow</em>'.
	 * @generated
	 */
	DataFlow createDataFlow();

	/**
	 * Returns a new object of class '<em>Condition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Condition</em>'.
	 * @generated
	 */
	Condition createCondition();

	/**
	 * Returns a new object of class '<em>Not Ex</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Not Ex</em>'.
	 * @generated
	 */
	NotEx createNotEx();

	/**
	 * Returns a new object of class '<em>Or Exp</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Or Exp</em>'.
	 * @generated
	 */
	OrExp createOrExp();

	/**
	 * Returns a new object of class '<em>And Exp</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>And Exp</em>'.
	 * @generated
	 */
	AndExp createAndExp();

	/**
	 * Returns a new object of class '<em>Value Condition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Value Condition</em>'.
	 * @generated
	 */
	ValueCondition createValueCondition();

	/**
	 * Returns a new object of class '<em>Lt</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Lt</em>'.
	 * @generated
	 */
	Lt createLt();

	/**
	 * Returns a new object of class '<em>Lte</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Lte</em>'.
	 * @generated
	 */
	Lte createLte();

	/**
	 * Returns a new object of class '<em>Gt</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gt</em>'.
	 * @generated
	 */
	Gt createGt();

	/**
	 * Returns a new object of class '<em>Gte</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gte</em>'.
	 * @generated
	 */
	Gte createGte();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	Data_AnalysisPackage getData_AnalysisPackage();

} //Data_AnalysisFactory
