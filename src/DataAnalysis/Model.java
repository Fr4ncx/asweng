/**
 */
package DataAnalysis;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link DataAnalysis.Model#getPipelines <em>Pipelines</em>}</li>
 * </ul>
 *
 * @see DataAnalysis.DataAnalysisPackage#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject {
	/**
	 * Returns the value of the '<em><b>Pipelines</b></em>' containment reference list.
	 * The list contents are of type {@link DataAnalysis.Pipeline}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pipelines</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pipelines</em>' containment reference list.
	 * @see DataAnalysis.DataAnalysisPackage#getModel_Pipelines()
	 * @model containment="true"
	 * @generated
	 */
	EList<Pipeline> getPipelines();

} // Model
