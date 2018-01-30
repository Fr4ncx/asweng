/**
 */
package Data_Analysis;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Format Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Data_Analysis.FormatData#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see Data_Analysis.Data_AnalysisPackage#getFormatData()
 * @model
 * @generated
 */
public interface FormatData extends Operation {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link Data_Analysis.FormatOperation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see Data_Analysis.FormatOperation
	 * @see #setType(FormatOperation)
	 * @see Data_Analysis.Data_AnalysisPackage#getFormatData_Type()
	 * @model
	 * @generated
	 */
	FormatOperation getType();

	/**
	 * Sets the value of the '{@link Data_Analysis.FormatData#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see Data_Analysis.FormatOperation
	 * @see #getType()
	 * @generated
	 */
	void setType(FormatOperation value);

} // FormatData
