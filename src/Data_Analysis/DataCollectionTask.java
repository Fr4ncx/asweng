/**
 */
package Data_Analysis;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Collection Task</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Data_Analysis.DataCollectionTask#getFormat <em>Format</em>}</li>
 *   <li>{@link Data_Analysis.DataCollectionTask#getEndpoint <em>Endpoint</em>}</li>
 *   <li>{@link Data_Analysis.DataCollectionTask#getSource <em>Source</em>}</li>
 *   <li>{@link Data_Analysis.DataCollectionTask#getInputSchema <em>Input Schema</em>}</li>
 *   <li>{@link Data_Analysis.DataCollectionTask#getCondition <em>Condition</em>}</li>
 * </ul>
 *
 * @see Data_Analysis.Data_AnalysisPackage#getDataCollectionTask()
 * @model
 * @generated
 */
public interface DataCollectionTask extends Task {
	/**
	 * Returns the value of the '<em><b>Format</b></em>' attribute.
	 * The literals are from the enumeration {@link Data_Analysis.FormatType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Format</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Format</em>' attribute.
	 * @see Data_Analysis.FormatType
	 * @see #setFormat(FormatType)
	 * @see Data_Analysis.Data_AnalysisPackage#getDataCollectionTask_Format()
	 * @model
	 * @generated
	 */
	FormatType getFormat();

	/**
	 * Sets the value of the '{@link Data_Analysis.DataCollectionTask#getFormat <em>Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Format</em>' attribute.
	 * @see Data_Analysis.FormatType
	 * @see #getFormat()
	 * @generated
	 */
	void setFormat(FormatType value);

	/**
	 * Returns the value of the '<em><b>Endpoint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Endpoint</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Endpoint</em>' attribute.
	 * @see #setEndpoint(String)
	 * @see Data_Analysis.Data_AnalysisPackage#getDataCollectionTask_Endpoint()
	 * @model
	 * @generated
	 */
	String getEndpoint();

	/**
	 * Sets the value of the '{@link Data_Analysis.DataCollectionTask#getEndpoint <em>Endpoint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Endpoint</em>' attribute.
	 * @see #getEndpoint()
	 * @generated
	 */
	void setEndpoint(String value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' containment reference.
	 * @see #setSource(Source)
	 * @see Data_Analysis.Data_AnalysisPackage#getDataCollectionTask_Source()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Source getSource();

	/**
	 * Sets the value of the '{@link Data_Analysis.DataCollectionTask#getSource <em>Source</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' containment reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Source value);

	/**
	 * Returns the value of the '<em><b>Input Schema</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input Schema</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Schema</em>' containment reference.
	 * @see #setInputSchema(DataSchema)
	 * @see Data_Analysis.Data_AnalysisPackage#getDataCollectionTask_InputSchema()
	 * @model containment="true" required="true"
	 * @generated
	 */
	DataSchema getInputSchema();

	/**
	 * Sets the value of the '{@link Data_Analysis.DataCollectionTask#getInputSchema <em>Input Schema</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input Schema</em>' containment reference.
	 * @see #getInputSchema()
	 * @generated
	 */
	void setInputSchema(DataSchema value);

	/**
	 * Returns the value of the '<em><b>Condition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Condition</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition</em>' reference.
	 * @see #setCondition(Condition)
	 * @see Data_Analysis.Data_AnalysisPackage#getDataCollectionTask_Condition()
	 * @model annotation="gmf.link target.decoration='arrow' style='dot' color='127,127,127'"
	 * @generated
	 */
	Condition getCondition();

	/**
	 * Sets the value of the '{@link Data_Analysis.DataCollectionTask#getCondition <em>Condition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' reference.
	 * @see #getCondition()
	 * @generated
	 */
	void setCondition(Condition value);

} // DataCollectionTask
