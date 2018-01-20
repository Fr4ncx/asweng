/**
 */
package DataAnalysis;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Custom</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link DataAnalysis.Custom#getAction <em>Action</em>}</li>
 * </ul>
 *
 * @see DataAnalysis.DataAnalysisPackage#getCustom()
 * @model
 * @generated
 */
public interface Custom extends Operation {
	/**
	 * Returns the value of the '<em><b>Action</b></em>' attribute.
	 * The literals are from the enumeration {@link DataAnalysis.CustomAction}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Action</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action</em>' attribute.
	 * @see DataAnalysis.CustomAction
	 * @see #setAction(CustomAction)
	 * @see DataAnalysis.DataAnalysisPackage#getCustom_Action()
	 * @model
	 * @generated
	 */
	CustomAction getAction();

	/**
	 * Sets the value of the '{@link DataAnalysis.Custom#getAction <em>Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action</em>' attribute.
	 * @see DataAnalysis.CustomAction
	 * @see #getAction()
	 * @generated
	 */
	void setAction(CustomAction value);

} // Custom
