/**
 */
package Data_Analysis;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Visualization Task</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Data_Analysis.DataVisualizationTask#getVisualElements <em>Visual Elements</em>}</li>
 *   <li>{@link Data_Analysis.DataVisualizationTask#getTables <em>Tables</em>}</li>
 * </ul>
 *
 * @see Data_Analysis.Data_AnalysisPackage#getDataVisualizationTask()
 * @model
 * @generated
 */
public interface DataVisualizationTask extends Task {
	/**
	 * Returns the value of the '<em><b>Visual Elements</b></em>' containment reference list.
	 * The list contents are of type {@link Data_Analysis.GraphicElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Visual Elements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Visual Elements</em>' containment reference list.
	 * @see Data_Analysis.Data_AnalysisPackage#getDataVisualizationTask_VisualElements()
	 * @model containment="true"
	 * @generated
	 */
	EList<GraphicElement> getVisualElements();

	/**
	 * Returns the value of the '<em><b>Tables</b></em>' containment reference list.
	 * The list contents are of type {@link Data_Analysis.Table}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tables</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tables</em>' containment reference list.
	 * @see Data_Analysis.Data_AnalysisPackage#getDataVisualizationTask_Tables()
	 * @model containment="true"
	 * @generated
	 */
	EList<Table> getTables();

} // DataVisualizationTask
