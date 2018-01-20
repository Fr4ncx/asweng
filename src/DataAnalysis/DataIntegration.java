/**
 */
package DataAnalysis;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Integration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link DataAnalysis.DataIntegration#getSources <em>Sources</em>}</li>
 * </ul>
 *
 * @see DataAnalysis.DataAnalysisPackage#getDataIntegration()
 * @model
 * @generated
 */
public interface DataIntegration extends Task {
	/**
	 * Returns the value of the '<em><b>Sources</b></em>' containment reference list.
	 * The list contents are of type {@link DataAnalysis.Source}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sources</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sources</em>' containment reference list.
	 * @see DataAnalysis.DataAnalysisPackage#getDataIntegration_Sources()
	 * @model containment="true"
	 * @generated
	 */
	EList<Source> getSources();

} // DataIntegration
