/**
 */
package Data_Analysis;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Integration Task</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Data_Analysis.DataIntegrationTask#getJoinAttributes <em>Join Attributes</em>}</li>
 *   <li>{@link Data_Analysis.DataIntegrationTask#getOutAttributes <em>Out Attributes</em>}</li>
 * </ul>
 *
 * @see Data_Analysis.Data_AnalysisPackage#getDataIntegrationTask()
 * @model
 * @generated
 */
public interface DataIntegrationTask extends Task {
	/**
	 * Returns the value of the '<em><b>Join Attributes</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Join Attributes</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Join Attributes</em>' reference.
	 * @see #setJoinAttributes(DataSchema)
	 * @see Data_Analysis.Data_AnalysisPackage#getDataIntegrationTask_JoinAttributes()
	 * @model required="true"
	 *        annotation="gmf.link target.decoration='arrow' style='dot' color='127,127,127'"
	 * @generated
	 */
	DataSchema getJoinAttributes();

	/**
	 * Sets the value of the '{@link Data_Analysis.DataIntegrationTask#getJoinAttributes <em>Join Attributes</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Join Attributes</em>' reference.
	 * @see #getJoinAttributes()
	 * @generated
	 */
	void setJoinAttributes(DataSchema value);

	/**
	 * Returns the value of the '<em><b>Out Attributes</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Out Attributes</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Out Attributes</em>' reference.
	 * @see #setOutAttributes(DataSchema)
	 * @see Data_Analysis.Data_AnalysisPackage#getDataIntegrationTask_OutAttributes()
	 * @model required="true"
	 *        annotation="gmf.link target.decoration='arrow' style='dot' color='127,127,127'"
	 * @generated
	 */
	DataSchema getOutAttributes();

	/**
	 * Sets the value of the '{@link Data_Analysis.DataIntegrationTask#getOutAttributes <em>Out Attributes</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Out Attributes</em>' reference.
	 * @see #getOutAttributes()
	 * @generated
	 */
	void setOutAttributes(DataSchema value);

} // DataIntegrationTask
