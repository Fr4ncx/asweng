/**
 */
package Data_Analysis;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Row</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Data_Analysis.Row#getRowIndex <em>Row Index</em>}</li>
 *   <li>{@link Data_Analysis.Row#getCells <em>Cells</em>}</li>
 * </ul>
 *
 * @see Data_Analysis.Data_AnalysisPackage#getRow()
 * @model annotation="gmf.node label='rowIndex'"
 * @generated
 */
public interface Row extends EObject {
	/**
	 * Returns the value of the '<em><b>Row Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Row Index</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Row Index</em>' attribute.
	 * @see #setRowIndex(String)
	 * @see Data_Analysis.Data_AnalysisPackage#getRow_RowIndex()
	 * @model
	 * @generated
	 */
	String getRowIndex();

	/**
	 * Sets the value of the '{@link Data_Analysis.Row#getRowIndex <em>Row Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Row Index</em>' attribute.
	 * @see #getRowIndex()
	 * @generated
	 */
	void setRowIndex(String value);

	/**
	 * Returns the value of the '<em><b>Cells</b></em>' containment reference list.
	 * The list contents are of type {@link Data_Analysis.Cell}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cells</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cells</em>' containment reference list.
	 * @see Data_Analysis.Data_AnalysisPackage#getRow_Cells()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Cell> getCells();

} // Row
