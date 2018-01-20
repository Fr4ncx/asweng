/**
 */
package DataAnalysis;

import org.eclipse.emf.ecore.EFactory;
import DataAnalysis.impl.DataAnalysisFactoryImpl;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see DataAnalysis.DataAnalysisPackage
 * @generated
 */
public interface DataAnalysisFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	DataAnalysisFactory eINSTANCE = DataAnalysisFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Model</em>'.
	 * @generated
	 */
	Model createModel();

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
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	DataAnalysisPackage getDataAnalysisPackage();

} //DataAnalysisFactory
