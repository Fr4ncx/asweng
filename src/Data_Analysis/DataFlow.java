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
 *   <li>{@link Data_Analysis.DataFlow#getName <em>Name</em>}</li>
 *   <li>{@link Data_Analysis.DataFlow#getToTask <em>To Task</em>}</li>
 *   <li>{@link Data_Analysis.DataFlow#getCollection <em>Collection</em>}</li>
 * </ul>
 *
 * @see Data_Analysis.Data_AnalysisPackage#getDataFlow()
 * @model annotation="gmf.node label='name'"
 * @generated
 */
public interface DataFlow extends EObject {
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
	 * @see Data_Analysis.Data_AnalysisPackage#getDataFlow_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link Data_Analysis.DataFlow#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>To Task</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To Task</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To Task</em>' reference.
	 * @see #setToTask(Task)
	 * @see Data_Analysis.Data_AnalysisPackage#getDataFlow_ToTask()
	 * @model
	 * @generated
	 */
	Task getToTask();

	/**
	 * Sets the value of the '{@link Data_Analysis.DataFlow#getToTask <em>To Task</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To Task</em>' reference.
	 * @see #getToTask()
	 * @generated
	 */
	void setToTask(Task value);

	/**
	 * Returns the value of the '<em><b>Collection</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Collection</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Collection</em>' containment reference.
	 * @see #setCollection(CollectionSchema)
	 * @see Data_Analysis.Data_AnalysisPackage#getDataFlow_Collection()
	 * @model containment="true" required="true"
	 * @generated
	 */
	CollectionSchema getCollection();

	/**
	 * Sets the value of the '{@link Data_Analysis.DataFlow#getCollection <em>Collection</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Collection</em>' containment reference.
	 * @see #getCollection()
	 * @generated
	 */
	void setCollection(CollectionSchema value);

} // DataFlow
