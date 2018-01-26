/**
 */
package Data_Analysis;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Visualization</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Data_Analysis.DataVisualization#getName <em>Name</em>}</li>
 *   <li>{@link Data_Analysis.DataVisualization#getVisualElements <em>Visual Elements</em>}</li>
 *   <li>{@link Data_Analysis.DataVisualization#getTables <em>Tables</em>}</li>
 * </ul>
 *
 * @see Data_Analysis.Data_AnalysisPackage#getDataVisualization()
 * @model annotation="gmf.node label='name'"
 * @generated
 */
public interface DataVisualization extends Task {
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
	 * @see Data_Analysis.Data_AnalysisPackage#getDataVisualization_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link Data_Analysis.DataVisualization#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

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
	 * @see Data_Analysis.Data_AnalysisPackage#getDataVisualization_VisualElements()
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
	 * @see Data_Analysis.Data_AnalysisPackage#getDataVisualization_Tables()
	 * @model containment="true"
	 * @generated
	 */
	EList<Table> getTables();

} // DataVisualization
