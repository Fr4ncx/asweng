/**
 */
package Data_Analysis.impl;

import Data_Analysis.Data_AnalysisPackage;
import Data_Analysis.Diagram;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Diagram</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Data_Analysis.impl.DiagramImpl#getXAttribute <em>XAttribute</em>}</li>
 *   <li>{@link Data_Analysis.impl.DiagramImpl#getYAttribute <em>YAttribute</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DiagramImpl extends EObjectImpl implements Diagram {
	/**
	 * The default value of the '{@link #getXAttribute() <em>XAttribute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXAttribute()
	 * @generated
	 * @ordered
	 */
	protected static final short XATTRIBUTE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getXAttribute() <em>XAttribute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXAttribute()
	 * @generated
	 * @ordered
	 */
	protected short xAttribute = XATTRIBUTE_EDEFAULT;

	/**
	 * The default value of the '{@link #getYAttribute() <em>YAttribute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYAttribute()
	 * @generated
	 * @ordered
	 */
	protected static final String YATTRIBUTE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getYAttribute() <em>YAttribute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYAttribute()
	 * @generated
	 * @ordered
	 */
	protected String yAttribute = YATTRIBUTE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DiagramImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Data_AnalysisPackage.Literals.DIAGRAM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public short getXAttribute() {
		return xAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXAttribute(short newXAttribute) {
		short oldXAttribute = xAttribute;
		xAttribute = newXAttribute;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Data_AnalysisPackage.DIAGRAM__XATTRIBUTE, oldXAttribute, xAttribute));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getYAttribute() {
		return yAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setYAttribute(String newYAttribute) {
		String oldYAttribute = yAttribute;
		yAttribute = newYAttribute;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Data_AnalysisPackage.DIAGRAM__YATTRIBUTE, oldYAttribute, yAttribute));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Data_AnalysisPackage.DIAGRAM__XATTRIBUTE:
				return getXAttribute();
			case Data_AnalysisPackage.DIAGRAM__YATTRIBUTE:
				return getYAttribute();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Data_AnalysisPackage.DIAGRAM__XATTRIBUTE:
				setXAttribute((Short)newValue);
				return;
			case Data_AnalysisPackage.DIAGRAM__YATTRIBUTE:
				setYAttribute((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case Data_AnalysisPackage.DIAGRAM__XATTRIBUTE:
				setXAttribute(XATTRIBUTE_EDEFAULT);
				return;
			case Data_AnalysisPackage.DIAGRAM__YATTRIBUTE:
				setYAttribute(YATTRIBUTE_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case Data_AnalysisPackage.DIAGRAM__XATTRIBUTE:
				return xAttribute != XATTRIBUTE_EDEFAULT;
			case Data_AnalysisPackage.DIAGRAM__YATTRIBUTE:
				return YATTRIBUTE_EDEFAULT == null ? yAttribute != null : !YATTRIBUTE_EDEFAULT.equals(yAttribute);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (xAttribute: ");
		result.append(xAttribute);
		result.append(", yAttribute: ");
		result.append(yAttribute);
		result.append(')');
		return result.toString();
	}

} //DiagramImpl
