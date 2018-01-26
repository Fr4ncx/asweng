/**
 */
package Data_Analysis.impl;

import Data_Analysis.Cell;
import Data_Analysis.Data_AnalysisPackage;
import Data_Analysis.Row;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Row</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Data_Analysis.impl.RowImpl#getRowIndex <em>Row Index</em>}</li>
 *   <li>{@link Data_Analysis.impl.RowImpl#getCells <em>Cells</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RowImpl extends EObjectImpl implements Row {
	/**
	 * The default value of the '{@link #getRowIndex() <em>Row Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRowIndex()
	 * @generated
	 * @ordered
	 */
	protected static final String ROW_INDEX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRowIndex() <em>Row Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRowIndex()
	 * @generated
	 * @ordered
	 */
	protected String rowIndex = ROW_INDEX_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCells() <em>Cells</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCells()
	 * @generated
	 * @ordered
	 */
	protected EList<Cell> cells;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RowImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Data_AnalysisPackage.Literals.ROW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRowIndex() {
		return rowIndex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRowIndex(String newRowIndex) {
		String oldRowIndex = rowIndex;
		rowIndex = newRowIndex;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Data_AnalysisPackage.ROW__ROW_INDEX, oldRowIndex, rowIndex));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Cell> getCells() {
		if (cells == null) {
			cells = new EObjectContainmentEList<Cell>(Cell.class, this, Data_AnalysisPackage.ROW__CELLS);
		}
		return cells;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Data_AnalysisPackage.ROW__CELLS:
				return ((InternalEList<?>)getCells()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Data_AnalysisPackage.ROW__ROW_INDEX:
				return getRowIndex();
			case Data_AnalysisPackage.ROW__CELLS:
				return getCells();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Data_AnalysisPackage.ROW__ROW_INDEX:
				setRowIndex((String)newValue);
				return;
			case Data_AnalysisPackage.ROW__CELLS:
				getCells().clear();
				getCells().addAll((Collection<? extends Cell>)newValue);
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
			case Data_AnalysisPackage.ROW__ROW_INDEX:
				setRowIndex(ROW_INDEX_EDEFAULT);
				return;
			case Data_AnalysisPackage.ROW__CELLS:
				getCells().clear();
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
			case Data_AnalysisPackage.ROW__ROW_INDEX:
				return ROW_INDEX_EDEFAULT == null ? rowIndex != null : !ROW_INDEX_EDEFAULT.equals(rowIndex);
			case Data_AnalysisPackage.ROW__CELLS:
				return cells != null && !cells.isEmpty();
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
		result.append(" (rowIndex: ");
		result.append(rowIndex);
		result.append(')');
		return result.toString();
	}

} //RowImpl
