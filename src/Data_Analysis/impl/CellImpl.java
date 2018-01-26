/**
 */
package Data_Analysis.impl;

import Data_Analysis.Cell;
import Data_Analysis.Data_AnalysisPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cell</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Data_Analysis.impl.CellImpl#getCellIndex <em>Cell Index</em>}</li>
 *   <li>{@link Data_Analysis.impl.CellImpl#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CellImpl extends EObjectImpl implements Cell {
	/**
	 * The default value of the '{@link #getCellIndex() <em>Cell Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCellIndex()
	 * @generated
	 * @ordered
	 */
	protected static final String CELL_INDEX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCellIndex() <em>Cell Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCellIndex()
	 * @generated
	 * @ordered
	 */
	protected String cellIndex = CELL_INDEX_EDEFAULT;

	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final String VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected String value = VALUE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CellImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Data_AnalysisPackage.Literals.CELL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCellIndex() {
		return cellIndex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCellIndex(String newCellIndex) {
		String oldCellIndex = cellIndex;
		cellIndex = newCellIndex;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Data_AnalysisPackage.CELL__CELL_INDEX, oldCellIndex, cellIndex));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(String newValue) {
		String oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Data_AnalysisPackage.CELL__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Data_AnalysisPackage.CELL__CELL_INDEX:
				return getCellIndex();
			case Data_AnalysisPackage.CELL__VALUE:
				return getValue();
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
			case Data_AnalysisPackage.CELL__CELL_INDEX:
				setCellIndex((String)newValue);
				return;
			case Data_AnalysisPackage.CELL__VALUE:
				setValue((String)newValue);
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
			case Data_AnalysisPackage.CELL__CELL_INDEX:
				setCellIndex(CELL_INDEX_EDEFAULT);
				return;
			case Data_AnalysisPackage.CELL__VALUE:
				setValue(VALUE_EDEFAULT);
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
			case Data_AnalysisPackage.CELL__CELL_INDEX:
				return CELL_INDEX_EDEFAULT == null ? cellIndex != null : !CELL_INDEX_EDEFAULT.equals(cellIndex);
			case Data_AnalysisPackage.CELL__VALUE:
				return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
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
		result.append(" (cellIndex: ");
		result.append(cellIndex);
		result.append(", value: ");
		result.append(value);
		result.append(')');
		return result.toString();
	}

} //CellImpl
