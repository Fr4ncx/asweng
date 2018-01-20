/**
 */
package DataAnalysis;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rest Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link DataAnalysis.RestService#getUser <em>User</em>}</li>
 *   <li>{@link DataAnalysis.RestService#getPwd <em>Pwd</em>}</li>
 * </ul>
 *
 * @see DataAnalysis.DataAnalysisPackage#getRestService()
 * @model
 * @generated
 */
public interface RestService extends Source {
	/**
	 * Returns the value of the '<em><b>User</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>User</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User</em>' attribute.
	 * @see #setUser(String)
	 * @see DataAnalysis.DataAnalysisPackage#getRestService_User()
	 * @model
	 * @generated
	 */
	String getUser();

	/**
	 * Sets the value of the '{@link DataAnalysis.RestService#getUser <em>User</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User</em>' attribute.
	 * @see #getUser()
	 * @generated
	 */
	void setUser(String value);

	/**
	 * Returns the value of the '<em><b>Pwd</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pwd</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pwd</em>' attribute.
	 * @see #setPwd(String)
	 * @see DataAnalysis.DataAnalysisPackage#getRestService_Pwd()
	 * @model
	 * @generated
	 */
	String getPwd();

	/**
	 * Sets the value of the '{@link DataAnalysis.RestService#getPwd <em>Pwd</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pwd</em>' attribute.
	 * @see #getPwd()
	 * @generated
	 */
	void setPwd(String value);

} // RestService
