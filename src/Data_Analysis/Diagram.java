/**
 */
package Data_Analysis;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Diagram</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Data_Analysis.Diagram#getXAttribute <em>XAttribute</em>}</li>
 *   <li>{@link Data_Analysis.Diagram#getYAttribute <em>YAttribute</em>}</li>
 * </ul>
 *
 * @see Data_Analysis.Data_AnalysisPackage#getDiagram()
 * @model
 * @generated
 */
public interface Diagram extends EObject {
	/**
	 * Returns the value of the '<em><b>XAttribute</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>XAttribute</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XAttribute</em>' attribute.
	 * @see #setXAttribute(short)
	 * @see Data_Analysis.Data_AnalysisPackage#getDiagram_XAttribute()
	 * @model
	 * @generated
	 */
	short getXAttribute();

	/**
	 * Sets the value of the '{@link Data_Analysis.Diagram#getXAttribute <em>XAttribute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>XAttribute</em>' attribute.
	 * @see #getXAttribute()
	 * @generated
	 */
	void setXAttribute(short value);

	/**
	 * Returns the value of the '<em><b>YAttribute</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>YAttribute</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>YAttribute</em>' attribute.
	 * @see #setYAttribute(String)
	 * @see Data_Analysis.Data_AnalysisPackage#getDiagram_YAttribute()
	 * @model
	 * @generated
	 */
	String getYAttribute();

	/**
	 * Sets the value of the '{@link Data_Analysis.Diagram#getYAttribute <em>YAttribute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>YAttribute</em>' attribute.
	 * @see #getYAttribute()
	 * @generated
	 */
	void setYAttribute(String value);

} // Diagram
