/**
 */
package DataAnalysis;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Cleaning</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link DataAnalysis.DataCleaning#getOperations <em>Operations</em>}</li>
 * </ul>
 *
 * @see DataAnalysis.DataAnalysisPackage#getDataCleaning()
 * @model
 * @generated
 */
public interface DataCleaning extends Task {
	/**
	 * Returns the value of the '<em><b>Operations</b></em>' containment reference list.
	 * The list contents are of type {@link DataAnalysis.Operation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operations</em>' containment reference list.
	 * @see DataAnalysis.DataAnalysisPackage#getDataCleaning_Operations()
	 * @model containment="true"
	 * @generated
	 */
	EList<Operation> getOperations();

} // DataCleaning
