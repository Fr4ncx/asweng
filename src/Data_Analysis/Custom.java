/**
 */
package Data_Analysis;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Custom</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Data_Analysis.Custom#getAction <em>Action</em>}</li>
 * </ul>
 *
 * @see Data_Analysis.Data_AnalysisPackage#getCustom()
 * @model annotation="gmf.node label='action'"
 * @generated
 */
public interface Custom extends Operation {
	/**
	 * Returns the value of the '<em><b>Action</b></em>' attribute.
	 * The literals are from the enumeration {@link Data_Analysis.CustomAction}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Action</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action</em>' attribute.
	 * @see Data_Analysis.CustomAction
	 * @see #setAction(CustomAction)
	 * @see Data_Analysis.Data_AnalysisPackage#getCustom_Action()
	 * @model
	 * @generated
	 */
	CustomAction getAction();

	/**
	 * Sets the value of the '{@link Data_Analysis.Custom#getAction <em>Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action</em>' attribute.
	 * @see Data_Analysis.CustomAction
	 * @see #getAction()
	 * @generated
	 */
	void setAction(CustomAction value);

} // Custom
