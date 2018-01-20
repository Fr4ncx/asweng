/**
 */
package DataAnalysis;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Collection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link DataAnalysis.DataCollection#getFormat <em>Format</em>}</li>
 *   <li>{@link DataAnalysis.DataCollection#getEndpoint <em>Endpoint</em>}</li>
 *   <li>{@link DataAnalysis.DataCollection#getConditions <em>Conditions</em>}</li>
 *   <li>{@link DataAnalysis.DataCollection#getSchema <em>Schema</em>}</li>
 *   <li>{@link DataAnalysis.DataCollection#getSource <em>Source</em>}</li>
 * </ul>
 *
 * @see DataAnalysis.DataAnalysisPackage#getDataCollection()
 * @model
 * @generated
 */
public interface DataCollection extends Task {
	/**
	 * Returns the value of the '<em><b>Schema</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Schema</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Schema</em>' containment reference.
	 * @see #setSchema(CollectionSchema)
	 * @see DataAnalysis.DataAnalysisPackage#getDataCollection_Schema()
	 * @model containment="true" required="true"
	 * @generated
	 */
	CollectionSchema getSchema();

	/**
	 * Sets the value of the '{@link DataAnalysis.DataCollection#getSchema <em>Schema</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Schema</em>' containment reference.
	 * @see #getSchema()
	 * @generated
	 */
	void setSchema(CollectionSchema value);

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
	 * @see DataAnalysis.DataAnalysisPackage#getDataCollection_Source()
	 * @model containment="true"
	 * @generated
	 */
	Source getSource();

	/**
	 * Sets the value of the '{@link DataAnalysis.DataCollection#getSource <em>Source</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' containment reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Source value);

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
	 * @see DataAnalysis.DataAnalysisPackage#getDataCollection_Format()
	 * @model
	 * @generated
	 */
	FormatType getFormat();

	/**
	 * Sets the value of the '{@link DataAnalysis.DataCollection#getFormat <em>Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Format</em>' attribute.
	 * @see DataAnalysis.FormatType
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
	 * @see DataAnalysis.DataAnalysisPackage#getDataCollection_Endpoint()
	 * @model
	 * @generated
	 */
	String getEndpoint();

	/**
	 * Sets the value of the '{@link DataAnalysis.DataCollection#getEndpoint <em>Endpoint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Endpoint</em>' attribute.
	 * @see #getEndpoint()
	 * @generated
	 */
	void setEndpoint(String value);

	/**
	 * Returns the value of the '<em><b>Conditions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Conditions</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conditions</em>' attribute.
	 * @see #setConditions(String)
	 * @see DataAnalysis.DataAnalysisPackage#getDataCollection_Conditions()
	 * @model
	 * @generated
	 */
	String getConditions();

	/**
	 * Sets the value of the '{@link DataAnalysis.DataCollection#getConditions <em>Conditions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Conditions</em>' attribute.
	 * @see #getConditions()
	 * @generated
	 */
	void setConditions(String value);

} // DataCollection
