/**
 */
package Data_Analysis;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Flow</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Data_Analysis.DataFlow#getFormat <em>Format</em>}</li>
 *   <li>{@link Data_Analysis.DataFlow#getToTask <em>To Task</em>}</li>
 * </ul>
 *
 * @see Data_Analysis.Data_AnalysisPackage#getDataFlow()
 * @model
 * @generated
 */
public interface DataFlow extends EObject {
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
	 * @see Data_Analysis.Data_AnalysisPackage#getDataFlow_Format()
	 * @model
	 * @generated
	 */
	FormatType getFormat();

	/**
	 * Sets the value of the '{@link Data_Analysis.DataFlow#getFormat <em>Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Format</em>' attribute.
	 * @see Data_Analysis.FormatType
	 * @see #getFormat()
	 * @generated
	 */
	void setFormat(FormatType value);

	/**
	 * Returns the value of the '<em><b>To Task</b></em>' reference list.
	 * The list contents are of type {@link Data_Analysis.Task}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To Task</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To Task</em>' reference list.
	 * @see Data_Analysis.Data_AnalysisPackage#getDataFlow_ToTask()
	 * @model
	 * @generated
	 */
	EList<Task> getToTask();

} // DataFlow
