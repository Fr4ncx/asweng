/**
 */
package Data_Analysis.impl;

import Data_Analysis.DataVisualizationTask;
import Data_Analysis.Data_AnalysisPackage;
import Data_Analysis.GraphicElement;
import Data_Analysis.Table;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Visualization Task</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Data_Analysis.impl.DataVisualizationTaskImpl#getVisualElements <em>Visual Elements</em>}</li>
 *   <li>{@link Data_Analysis.impl.DataVisualizationTaskImpl#getTables <em>Tables</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DataVisualizationTaskImpl extends TaskImpl implements DataVisualizationTask {
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
	protected DataVisualizationTaskImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Data_AnalysisPackage.Literals.DATA_VISUALIZATION_TASK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GraphicElement> getVisualElements() {
		if (visualElements == null) {
			visualElements = new EObjectContainmentEList<GraphicElement>(GraphicElement.class, this, Data_AnalysisPackage.DATA_VISUALIZATION_TASK__VISUAL_ELEMENTS);
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
			tables = new EObjectContainmentEList<Table>(Table.class, this, Data_AnalysisPackage.DATA_VISUALIZATION_TASK__TABLES);
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
			case Data_AnalysisPackage.DATA_VISUALIZATION_TASK__VISUAL_ELEMENTS:
				return ((InternalEList<?>)getVisualElements()).basicRemove(otherEnd, msgs);
			case Data_AnalysisPackage.DATA_VISUALIZATION_TASK__TABLES:
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
			case Data_AnalysisPackage.DATA_VISUALIZATION_TASK__VISUAL_ELEMENTS:
				return getVisualElements();
			case Data_AnalysisPackage.DATA_VISUALIZATION_TASK__TABLES:
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
			case Data_AnalysisPackage.DATA_VISUALIZATION_TASK__VISUAL_ELEMENTS:
				getVisualElements().clear();
				getVisualElements().addAll((Collection<? extends GraphicElement>)newValue);
				return;
			case Data_AnalysisPackage.DATA_VISUALIZATION_TASK__TABLES:
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
			case Data_AnalysisPackage.DATA_VISUALIZATION_TASK__VISUAL_ELEMENTS:
				getVisualElements().clear();
				return;
			case Data_AnalysisPackage.DATA_VISUALIZATION_TASK__TABLES:
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
			case Data_AnalysisPackage.DATA_VISUALIZATION_TASK__VISUAL_ELEMENTS:
				return visualElements != null && !visualElements.isEmpty();
			case Data_AnalysisPackage.DATA_VISUALIZATION_TASK__TABLES:
				return tables != null && !tables.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DataVisualizationTaskImpl
