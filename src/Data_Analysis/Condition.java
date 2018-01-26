/**
 */
package Data_Analysis;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Data_Analysis.Condition#getName <em>Name</em>}</li>
 *   <li>{@link Data_Analysis.Condition#getExpressions <em>Expressions</em>}</li>
 *   <li>{@link Data_Analysis.Condition#getValueConditions <em>Value Conditions</em>}</li>
 * </ul>
 *
 * @see Data_Analysis.Data_AnalysisPackage#getCondition()
 * @model annotation="gmf.node label='name'"
 * @generated
 */
public interface Condition extends EObject {
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
	 * @see Data_Analysis.Data_AnalysisPackage#getCondition_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link Data_Analysis.Condition#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Expressions</b></em>' containment reference list.
	 * The list contents are of type {@link Data_Analysis.LogicalExp}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expressions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expressions</em>' containment reference list.
	 * @see Data_Analysis.Data_AnalysisPackage#getCondition_Expressions()
	 * @model containment="true"
	 * @generated
	 */
	EList<LogicalExp> getExpressions();

	/**
	 * Returns the value of the '<em><b>Value Conditions</b></em>' containment reference list.
	 * The list contents are of type {@link Data_Analysis.ValueCondition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value Conditions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Conditions</em>' containment reference list.
	 * @see Data_Analysis.Data_AnalysisPackage#getCondition_ValueConditions()
	 * @model containment="true"
	 * @generated
	 */
	EList<ValueCondition> getValueConditions();

} // Condition
