/**
 */
package Data_Analysis;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Clustering</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Data_Analysis.Clustering#getK <em>K</em>}</li>
 *   <li>{@link Data_Analysis.Clustering#getInputAttributes <em>Input Attributes</em>}</li>
 *   <li>{@link Data_Analysis.Clustering#getClusters <em>Clusters</em>}</li>
 * </ul>
 *
 * @see Data_Analysis.Data_AnalysisPackage#getClustering()
 * @model
 * @generated
 */
public interface Clustering extends Category {
	/**
	 * Returns the value of the '<em><b>K</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>K</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>K</em>' attribute.
	 * @see #setK(int)
	 * @see Data_Analysis.Data_AnalysisPackage#getClustering_K()
	 * @model
	 * @generated
	 */
	int getK();

	/**
	 * Sets the value of the '{@link Data_Analysis.Clustering#getK <em>K</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>K</em>' attribute.
	 * @see #getK()
	 * @generated
	 */
	void setK(int value);

	/**
	 * Returns the value of the '<em><b>Input Attributes</b></em>' reference list.
	 * The list contents are of type {@link Data_Analysis.AttributeSchema}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input Attributes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Attributes</em>' reference list.
	 * @see Data_Analysis.Data_AnalysisPackage#getClustering_InputAttributes()
	 * @model required="true"
	 *        annotation="gmf.link target.decoration='arrow' style='dot' color='127,127,127'"
	 * @generated
	 */
	EList<AttributeSchema> getInputAttributes();

	/**
	 * Returns the value of the '<em><b>Clusters</b></em>' reference list.
	 * The list contents are of type {@link Data_Analysis.Cluster}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Clusters</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Clusters</em>' reference list.
	 * @see Data_Analysis.Data_AnalysisPackage#getClustering_Clusters()
	 * @model annotation="gmf.link target.decoration='arrow' style='dot' color='127,127,127'"
	 * @generated
	 */
	EList<Cluster> getClusters();

} // Clustering
