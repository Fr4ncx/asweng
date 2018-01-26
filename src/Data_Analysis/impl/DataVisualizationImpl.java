/**
 */
package Data_Analysis.impl;

import Data_Analysis.DataVisualization;
import Data_Analysis.Data_AnalysisPackage;
import Data_Analysis.Diagram;
import Data_Analysis.Graph;

import Data_Analysis.GraphicElement;
import Data_Analysis.Table;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Visualization</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Data_Analysis.impl.DataVisualizationImpl#getName <em>Name</em>}</li>
 *   <li>{@link Data_Analysis.impl.DataVisualizationImpl#getVisualElements <em>Visual Elements</em>}</li>
 *   <li>{@link Data_Analysis.impl.DataVisualizationImpl#getTables <em>Tables</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DataVisualizationImpl extends TaskImpl implements DataVisualization {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getVisualElements() <em>Visual Elements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisualElements()
	 * @generated
	 * @ordered
	 */
	protected EList<GraphicElement> visualElements;

	/**
	 * The cached value of the '{@link #getTables() <em>Tables</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTables()
	 * @generated
	 * @ordered
	 */
	protected EList<Table> tables;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataVisualizationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Data_AnalysisPackage.Literals.DATA_VISUALIZATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Data_AnalysisPackage.DATA_VISUALIZATION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GraphicElement> getVisualElements() {
		if (visualElements == null) {
			visualElements = new EObjectContainmentEList<GraphicElement>(GraphicElement.class, this, Data_AnalysisPackage.DATA_VISUALIZATION__VISUAL_ELEMENTS);
		}
		return visualElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Table> getTables() {
		if (tables == null) {
			tables = new EObjectContainmentEList<Table>(Table.class, this, Data_AnalysisPackage.DATA_VISUALIZATION__TABLES);
		}
		return tables;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Data_AnalysisPackage.DATA_VISUALIZATION__VISUAL_ELEMENTS:
				return ((InternalEList<?>)getVisualElements()).basicRemove(otherEnd, msgs);
			case Data_AnalysisPackage.DATA_VISUALIZATION__TABLES:
				return ((InternalEList<?>)getTables()).basicRemove(otherEnd, msgs);
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
			case Data_AnalysisPackage.DATA_VISUALIZATION__NAME:
				return getName();
			case Data_AnalysisPackage.DATA_VISUALIZATION__VISUAL_ELEMENTS:
				return getVisualElements();
			case Data_AnalysisPackage.DATA_VISUALIZATION__TABLES:
				return getTables();
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
			case Data_AnalysisPackage.DATA_VISUALIZATION__NAME:
				setName((String)newValue);
				return;
			case Data_AnalysisPackage.DATA_VISUALIZATION__VISUAL_ELEMENTS:
				getVisualElements().clear();
				getVisualElements().addAll((Collection<? extends GraphicElement>)newValue);
				return;
			case Data_AnalysisPackage.DATA_VISUALIZATION__TABLES:
				getTables().clear();
				getTables().addAll((Collection<? extends Table>)newValue);
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
			case Data_AnalysisPackage.DATA_VISUALIZATION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case Data_AnalysisPackage.DATA_VISUALIZATION__VISUAL_ELEMENTS:
				getVisualElements().clear();
				return;
			case Data_AnalysisPackage.DATA_VISUALIZATION__TABLES:
				getTables().clear();
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
			case Data_AnalysisPackage.DATA_VISUALIZATION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case Data_AnalysisPackage.DATA_VISUALIZATION__VISUAL_ELEMENTS:
				return visualElements != null && !visualElements.isEmpty();
			case Data_AnalysisPackage.DATA_VISUALIZATION__TABLES:
				return tables != null && !tables.isEmpty();
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //DataVisualizationImpl
