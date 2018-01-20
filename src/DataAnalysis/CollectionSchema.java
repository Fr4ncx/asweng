/**
 */
package DataAnalysis;

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
 *   <li>{@link DataAnalysis.CollectionSchema#getAttributes <em>Attributes</em>}</li>
 * </ul>
 *
 * @see DataAnalysis.DataAnalysisPackage#getCollectionSchema()
 * @model
 * @generated
 */
public interface CollectionSchema extends EObject {
	/**
	 * Returns the value of the '<em><b>Attributes</b></em>' containment reference list.
	 * The list contents are of type {@link DataAnalysis.AttributeSchema}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attributes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attributes</em>' containment reference list.
	 * @see DataAnalysis.DataAnalysisPackage#getCollectionSchema_Attributes()
	 * @model containment="true"
	 * @generated
	 */
	EList<AttributeSchema> getAttributes();

} // CollectionSchema
