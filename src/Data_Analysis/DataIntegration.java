/**
 */
package Data_Analysis;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Integration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Data_Analysis.DataIntegration#getJoinAttributes <em>Join Attributes</em>}</li>
 *   <li>{@link Data_Analysis.DataIntegration#getOutAttributes <em>Out Attributes</em>}</li>
 * </ul>
 *
 * @see Data_Analysis.Data_AnalysisPackage#getDataIntegration()
 * @model
 * @generated
 */
public interface DataIntegration extends Task {
	/**
	 * Returns the value of the '<em><b>Join Attributes</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Join Attributes</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Join Attributes</em>' reference.
	 * @see #setJoinAttributes(CollectionSchema)
	 * @see Data_Analysis.Data_AnalysisPackage#getDataIntegration_JoinAttributes()
	 * @model required="true"
	 * @generated
	 */
	CollectionSchema getJoinAttributes();

	/**
	 * Sets the value of the '{@link Data_Analysis.DataIntegration#getJoinAttributes <em>Join Attributes</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Join Attributes</em>' reference.
	 * @see #getJoinAttributes()
	 * @generated
	 */
	void setJoinAttributes(CollectionSchema value);

	/**
	 * Returns the value of the '<em><b>Out Attributes</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Out Attributes</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Out Attributes</em>' reference.
	 * @see #setOutAttributes(CollectionSchema)
	 * @see Data_Analysis.Data_AnalysisPackage#getDataIntegration_OutAttributes()
	 * @model required="true"
	 * @generated
	 */
	CollectionSchema getOutAttributes();

	/**
	 * Sets the value of the '{@link Data_Analysis.DataIntegration#getOutAttributes <em>Out Attributes</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Out Attributes</em>' reference.
	 * @see #getOutAttributes()
	 * @generated
	 */
	void setOutAttributes(CollectionSchema value);

} // DataIntegration
