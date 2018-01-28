/**
 */
package Data_Analysis;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Edge</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Data_Analysis.Edge#getName <em>Name</em>}</li>
 *   <li>{@link Data_Analysis.Edge#getToNode <em>To Node</em>}</li>
 *   <li>{@link Data_Analysis.Edge#getWidth <em>Width</em>}</li>
 * </ul>
 *
 * @see Data_Analysis.Data_AnalysisPackage#getEdge()
 * @model annotation="gmf.node label='name'"
 * @generated
 */
public interface Edge extends GraphElement {
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
	 * @see Data_Analysis.Data_AnalysisPackage#getEdge_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link Data_Analysis.Edge#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>To Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To Node</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To Node</em>' reference.
	 * @see #setToNode(Node)
	 * @see Data_Analysis.Data_AnalysisPackage#getEdge_ToNode()
	 * @model required="true"
	 *        annotation="gmf.link target.decoration='arrow' style='dot' color='127,127,127'"
	 * @generated
	 */
	Node getToNode();

	/**
	 * Sets the value of the '{@link Data_Analysis.Edge#getToNode <em>To Node</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To Node</em>' reference.
	 * @see #getToNode()
	 * @generated
	 */
	void setToNode(Node value);

	/**
	 * Returns the value of the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Width</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Width</em>' attribute.
	 * @see #setWidth(int)
	 * @see Data_Analysis.Data_AnalysisPackage#getEdge_Width()
	 * @model
	 * @generated
	 */
	int getWidth();

	/**
	 * Sets the value of the '{@link Data_Analysis.Edge#getWidth <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Width</em>' attribute.
	 * @see #getWidth()
	 * @generated
	 */
	void setWidth(int value);

} // Edge
