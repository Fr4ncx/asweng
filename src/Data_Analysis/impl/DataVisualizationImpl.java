/**
 */
package Data_Analysis.impl;

import Data_Analysis.DataVisualization;
import Data_Analysis.Data_AnalysisPackage;
import Data_Analysis.Diagram;
import Data_Analysis.Graph;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

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
 *   <li>{@link Data_Analysis.impl.DataVisualizationImpl#getGraphs <em>Graphs</em>}</li>
 *   <li>{@link Data_Analysis.impl.DataVisualizationImpl#getDiagrams <em>Diagrams</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DataVisualizationImpl extends TaskImpl implements DataVisualization {
	/**
	 * The cached value of the '{@link #getGraphs() <em>Graphs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGraphs()
	 * @generated
	 * @ordered
	 */
	protected EList<Graph> graphs;

	/**
	 * The cached value of the '{@link #getDiagrams() <em>Diagrams</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiagrams()
	 * @generated
	 * @ordered
	 */
	protected EList<Diagram> diagrams;

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
	public EList<Graph> getGraphs() {
		if (graphs == null) {
			graphs = new EObjectContainmentEList<Graph>(Graph.class, this, Data_AnalysisPackage.DATA_VISUALIZATION__GRAPHS);
		}
		return graphs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Diagram> getDiagrams() {
		if (diagrams == null) {
			diagrams = new EObjectContainmentEList<Diagram>(Diagram.class, this, Data_AnalysisPackage.DATA_VISUALIZATION__DIAGRAMS);
		}
		return diagrams;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Data_AnalysisPackage.DATA_VISUALIZATION__GRAPHS:
				return ((InternalEList<?>)getGraphs()).basicRemove(otherEnd, msgs);
			case Data_AnalysisPackage.DATA_VISUALIZATION__DIAGRAMS:
				return ((InternalEList<?>)getDiagrams()).basicRemove(otherEnd, msgs);
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
			case Data_AnalysisPackage.DATA_VISUALIZATION__GRAPHS:
				return getGraphs();
			case Data_AnalysisPackage.DATA_VISUALIZATION__DIAGRAMS:
				return getDiagrams();
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
			case Data_AnalysisPackage.DATA_VISUALIZATION__GRAPHS:
				getGraphs().clear();
				getGraphs().addAll((Collection<? extends Graph>)newValue);
				return;
			case Data_AnalysisPackage.DATA_VISUALIZATION__DIAGRAMS:
				getDiagrams().clear();
				getDiagrams().addAll((Collection<? extends Diagram>)newValue);
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
			case Data_AnalysisPackage.DATA_VISUALIZATION__GRAPHS:
				getGraphs().clear();
				return;
			case Data_AnalysisPackage.DATA_VISUALIZATION__DIAGRAMS:
				getDiagrams().clear();
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
			case Data_AnalysisPackage.DATA_VISUALIZATION__GRAPHS:
				return graphs != null && !graphs.isEmpty();
			case Data_AnalysisPackage.DATA_VISUALIZATION__DIAGRAMS:
				return diagrams != null && !diagrams.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DataVisualizationImpl
