/**
 */
package Data_Analysis;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Collection Schema</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Data_Analysis.CollectionSchema#getAttributes <em>Attributes</em>}</li>
 * </ul>
 *
 * @see Data_Analysis.Data_AnalysisPackage#getCollectionSchema()
 * @model
 * @generated
 */
public interface CollectionSchema extends EObject {
	/**
	 * Returns the value of the '<em><b>Attributes</b></em>' containment reference list.
	 * The list contents are of type {@link Data_Analysis.AttributeSchema}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attributes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attributes</em>' containment reference list.
	 * @see Data_Analysis.Data_AnalysisPackage#getCollectionSchema_Attributes()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<AttributeSchema> getAttributes();

} // CollectionSchema
