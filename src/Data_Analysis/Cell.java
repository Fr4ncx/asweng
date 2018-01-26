/**
 */
package Data_Analysis;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cell</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Data_Analysis.Cell#getCellIndex <em>Cell Index</em>}</li>
 *   <li>{@link Data_Analysis.Cell#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see Data_Analysis.Data_AnalysisPackage#getCell()
 * @model annotation="gmf.node label='cellIndex'"
 * @generated
 */
public interface Cell extends EObject {
	/**
	 * Returns the value of the '<em><b>Cell Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cell Index</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cell Index</em>' attribute.
	 * @see #setCellIndex(String)
	 * @see Data_Analysis.Data_AnalysisPackage#getCell_CellIndex()
	 * @model
	 * @generated
	 */
	String getCellIndex();

	/**
	 * Sets the value of the '{@link Data_Analysis.Cell#getCellIndex <em>Cell Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cell Index</em>' attribute.
	 * @see #getCellIndex()
	 * @generated
	 */
	void setCellIndex(String value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see Data_Analysis.Data_AnalysisPackage#getCell_Value()
	 * @model
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link Data_Analysis.Cell#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

} // Cell
