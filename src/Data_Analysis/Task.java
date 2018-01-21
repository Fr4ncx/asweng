/**
 */
package Data_Analysis;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Task</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Data_Analysis.Task#getToFlow <em>To Flow</em>}</li>
 *   <li>{@link Data_Analysis.Task#getExecutionTimestamp <em>Execution Timestamp</em>}</li>
 *   <li>{@link Data_Analysis.Task#isIsExecuted <em>Is Executed</em>}</li>
 * </ul>
 *
 * @see Data_Analysis.Data_AnalysisPackage#getTask()
 * @model abstract="true"
 * @generated
 */
public interface Task extends EObject {
	/**
	 * Returns the value of the '<em><b>To Flow</b></em>' reference list.
	 * The list contents are of type {@link Data_Analysis.DataFlow}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To Flow</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To Flow</em>' reference list.
	 * @see Data_Analysis.Data_AnalysisPackage#getTask_ToFlow()
	 * @model
	 * @generated
	 */
	EList<DataFlow> getToFlow();

	/**
	 * Returns the value of the '<em><b>Execution Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Execution Timestamp</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Execution Timestamp</em>' attribute.
	 * @see #setExecutionTimestamp(long)
	 * @see Data_Analysis.Data_AnalysisPackage#getTask_ExecutionTimestamp()
	 * @model
	 * @generated
	 */
	long getExecutionTimestamp();

	/**
	 * Sets the value of the '{@link Data_Analysis.Task#getExecutionTimestamp <em>Execution Timestamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Execution Timestamp</em>' attribute.
	 * @see #getExecutionTimestamp()
	 * @generated
	 */
	void setExecutionTimestamp(long value);

	/**
	 * Returns the value of the '<em><b>Is Executed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Executed</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Executed</em>' attribute.
	 * @see #setIsExecuted(boolean)
	 * @see Data_Analysis.Data_AnalysisPackage#getTask_IsExecuted()
	 * @model
	 * @generated
	 */
	boolean isIsExecuted();

	/**
	 * Sets the value of the '{@link Data_Analysis.Task#isIsExecuted <em>Is Executed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Executed</em>' attribute.
	 * @see #isIsExecuted()
	 * @generated
	 */
	void setIsExecuted(boolean value);

} // Task
