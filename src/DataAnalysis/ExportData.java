/**
 */
package DataAnalysis;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Export Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link DataAnalysis.ExportData#getFormat <em>Format</em>}</li>
 * </ul>
 *
 * @see DataAnalysis.DataAnalysisPackage#getExportData()
 * @model
 * @generated
 */
public interface ExportData extends Task {
	/**
	 * Returns the value of the '<em><b>Format</b></em>' attribute.
	 * The literals are from the enumeration {@link DataAnalysis.FormatType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Format</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Format</em>' attribute.
	 * @see DataAnalysis.FormatType
	 * @see #setFormat(FormatType)
	 * @see DataAnalysis.DataAnalysisPackage#getExportData_Format()
	 * @model
	 * @generated
	 */
	FormatType getFormat();

	/**
	 * Sets the value of the '{@link DataAnalysis.ExportData#getFormat <em>Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Format</em>' attribute.
	 * @see DataAnalysis.FormatType
	 * @see #getFormat()
	 * @generated
	 */
	void setFormat(FormatType value);

} // ExportData
