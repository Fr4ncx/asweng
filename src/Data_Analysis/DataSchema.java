/**
 */
package Data_Analysis;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Schema</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Data_Analysis.DataSchema#getName <em>Name</em>}</li>
 *   <li>{@link Data_Analysis.DataSchema#getSchemaAttributes <em>Schema Attributes</em>}</li>
 * </ul>
 *
 * @see Data_Analysis.Data_AnalysisPackage#getDataSchema()
 * @model annotation="gmf.node label='name'"
 * @generated
 */
public interface DataSchema extends EObject {
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
	 * @see Data_Analysis.Data_AnalysisPackage#getDataSchema_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link Data_Analysis.DataSchema#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Schema Attributes</b></em>' containment reference list.
	 * The list contents are of type {@link Data_Analysis.AttributeSchema}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Schema Attributes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Schema Attributes</em>' containment reference list.
	 * @see Data_Analysis.Data_AnalysisPackage#getDataSchema_SchemaAttributes()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<AttributeSchema> getSchemaAttributes();

} // DataSchema
