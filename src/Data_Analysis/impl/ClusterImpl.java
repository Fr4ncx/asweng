/**
 */
package Data_Analysis.impl;

import Data_Analysis.Cluster;
import Data_Analysis.DataPoint;
import Data_Analysis.Data_AnalysisPackage;

import Data_Analysis.Pipeline;
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
 * An implementation of the model object '<em><b>Cluster</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Data_Analysis.impl.ClusterImpl#getDataPoints <em>Data Points</em>}</li>
 *   <li>{@link Data_Analysis.impl.ClusterImpl#getName <em>Name</em>}</li>
 *   <li>{@link Data_Analysis.impl.ClusterImpl#getCluster <em>Cluster</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ClusterImpl extends EObjectImpl implements Cluster {
	/**
	 * The cached value of the '{@link #getDataPoints() <em>Data Points</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataPoints()
	 * @generated
	 * @ordered
	 */
	protected EList<DataPoint> dataPoints;

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
	 * The cached value of the '{@link #getCluster() <em>Cluster</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCluster()
	 * @generated
	 * @ordered
	 */
	protected EList<Pipeline> cluster;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClusterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Data_AnalysisPackage.Literals.CLUSTER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataPoint> getDataPoints() {
		if (dataPoints == null) {
			dataPoints = new EObjectContainmentEList<DataPoint>(DataPoint.class, this, Data_AnalysisPackage.CLUSTER__DATA_POINTS);
		}
		return dataPoints;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Data_AnalysisPackage.CLUSTER__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Pipeline> getCluster() {
		if (cluster == null) {
			cluster = new EObjectContainmentEList<Pipeline>(Pipeline.class, this, Data_AnalysisPackage.CLUSTER__CLUSTER);
		}
		return cluster;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Data_AnalysisPackage.CLUSTER__DATA_POINTS:
				return ((InternalEList<?>)getDataPoints()).basicRemove(otherEnd, msgs);
			case Data_AnalysisPackage.CLUSTER__CLUSTER:
				return ((InternalEList<?>)getCluster()).basicRemove(otherEnd, msgs);
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
			case Data_AnalysisPackage.CLUSTER__DATA_POINTS:
				return getDataPoints();
			case Data_AnalysisPackage.CLUSTER__NAME:
				return getName();
			case Data_AnalysisPackage.CLUSTER__CLUSTER:
				return getCluster();
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
			case Data_AnalysisPackage.CLUSTER__DATA_POINTS:
				getDataPoints().clear();
				getDataPoints().addAll((Collection<? extends DataPoint>)newValue);
				return;
			case Data_AnalysisPackage.CLUSTER__NAME:
				setName((String)newValue);
				return;
			case Data_AnalysisPackage.CLUSTER__CLUSTER:
				getCluster().clear();
				getCluster().addAll((Collection<? extends Pipeline>)newValue);
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
			case Data_AnalysisPackage.CLUSTER__DATA_POINTS:
				getDataPoints().clear();
				return;
			case Data_AnalysisPackage.CLUSTER__NAME:
				setName(NAME_EDEFAULT);
				return;
			case Data_AnalysisPackage.CLUSTER__CLUSTER:
				getCluster().clear();
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
			case Data_AnalysisPackage.CLUSTER__DATA_POINTS:
				return dataPoints != null && !dataPoints.isEmpty();
			case Data_AnalysisPackage.CLUSTER__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case Data_AnalysisPackage.CLUSTER__CLUSTER:
				return cluster != null && !cluster.isEmpty();
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

} //ClusterImpl
