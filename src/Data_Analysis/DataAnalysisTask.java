/**
 */
package Data_Analysis;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Analysis Task</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Data_Analysis.DataAnalysisTask#getCategory <em>Category</em>}</li>
 *   <li>{@link Data_Analysis.DataAnalysisTask#getAnalysis <em>Analysis</em>}</li>
 * </ul>
 *
 * @see Data_Analysis.Data_AnalysisPackage#getDataAnalysisTask()
 * @model
 * @generated
 */
public interface DataAnalysisTask extends Task {
	/**
	 * Returns the value of the '<em><b>Category</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Category</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Category</em>' containment reference.
	 * @see #setCategory(Category)
	 * @see Data_Analysis.Data_AnalysisPackage#getDataAnalysisTask_Category()
	 * @model containment="true"
	 * @generated
	 */
	Category getCategory();

	/**
	 * Sets the value of the '{@link Data_Analysis.DataAnalysisTask#getCategory <em>Category</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Category</em>' containment reference.
	 * @see #getCategory()
	 * @generated
	 */
	void setCategory(Category value);

	/**
	 * Returns the value of the '<em><b>Analysis</b></em>' containment reference list.
	 * The list contents are of type {@link Data_Analysis.Analysis}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Analysis</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Analysis</em>' containment reference list.
	 * @see Data_Analysis.Data_AnalysisPackage#getDataAnalysisTask_Analysis()
	 * @model containment="true"
	 * @generated
	 */
	EList<Analysis> getAnalysis();

} // DataAnalysisTask
