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
 *   <li>{@link Data_Analysis.DataIntegration#getName <em>Name</em>}</li>
 *   <li>{@link Data_Analysis.DataIntegration#getJoinAttributes <em>Join Attributes</em>}</li>
 *   <li>{@link Data_Analysis.DataIntegration#getOutAttributes <em>Out Attributes</em>}</li>
 * </ul>
 *
 * @see Data_Analysis.Data_AnalysisPackage#getDataIntegration()
 * @model annotation="gmf.node label='name'"
 * @generated
 */
public interface DataIntegration extends Task {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see Data_Analysis.Data_AnalysisPackage#getDataIntegration_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link Data_Analysis.DataIntegration#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

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
	 * @see Data_Analysis.Data_AnalysisPackage#getDataIntegration_JoinAttributes()
	 * @model required="true"
	 * @generated
	 */
	DataSchema getJoinAttributes();

	/**
	 * Sets the value of the '{@link Data_Analysis.DataIntegration#getJoinAttributes <em>Join Attributes</em>}' reference.
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
	 * @see Data_Analysis.Data_AnalysisPackage#getDataIntegration_OutAttributes()
	 * @model required="true"
	 * @generated
	 */
	DataSchema getOutAttributes();

	/**
	 * Sets the value of the '{@link Data_Analysis.DataIntegration#getOutAttributes <em>Out Attributes</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Out Attributes</em>' reference.
	 * @see #getOutAttributes()
	 * @generated
	 */
	void setOutAttributes(DataSchema value);

} // DataIntegration
