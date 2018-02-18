/**
 */
package Data_Analysis.impl;

import Data_Analysis.AttributeSchema;
import Data_Analysis.Cluster;
import Data_Analysis.Clustering;
import Data_Analysis.Data_AnalysisPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Clustering</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Data_Analysis.impl.ClusteringImpl#getK <em>K</em>}</li>
 *   <li>{@link Data_Analysis.impl.ClusteringImpl#getInputAttributes <em>Input Attributes</em>}</li>
 *   <li>{@link Data_Analysis.impl.ClusteringImpl#getClusters <em>Clusters</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ClusteringImpl extends CategoryImpl implements Clustering {
	/**
	 * The default value of the '{@link #getK() <em>K</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getK()
	 * @generated
	 * @ordered
	 */
	protected static final int K_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getK() <em>K</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getK()
	 * @generated
	 * @ordered
	 */
	protected int k = K_EDEFAULT;

	/**
	 * The cached value of the '{@link #getInputAttributes() <em>Input Attributes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputAttributes()
	 * @generated
	 * @ordered
	 */
	protected EList<AttributeSchema> inputAttributes;

	/**
	 * The cached value of the '{@link #getClusters() <em>Clusters</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClusters()
	 * @generated
	 * @ordered
	 */
	protected EList<Cluster> clusters;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClusteringImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Data_AnalysisPackage.Literals.CLUSTERING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getK() {
		return k;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setK(int newK) {
		int oldK = k;
		k = newK;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Data_AnalysisPackage.CLUSTERING__K, oldK, k));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AttributeSchema> getInputAttributes() {
		if (inputAttributes == null) {
			inputAttributes = new EObjectResolvingEList<AttributeSchema>(AttributeSchema.class, this, Data_AnalysisPackage.CLUSTERING__INPUT_ATTRIBUTES);
		}
		return inputAttributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Cluster> getClusters() {
		if (clusters == null) {
			clusters = new EObjectResolvingEList<Cluster>(Cluster.class, this, Data_AnalysisPackage.CLUSTERING__CLUSTERS);
		}
		return clusters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Data_AnalysisPackage.CLUSTERING__K:
				return getK();
			case Data_AnalysisPackage.CLUSTERING__INPUT_ATTRIBUTES:
				return getInputAttributes();
			case Data_AnalysisPackage.CLUSTERING__CLUSTERS:
				return getClusters();
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
			case Data_AnalysisPackage.CLUSTERING__K:
				setK((Integer)newValue);
				return;
			case Data_AnalysisPackage.CLUSTERING__INPUT_ATTRIBUTES:
				getInputAttributes().clear();
				getInputAttributes().addAll((Collection<? extends AttributeSchema>)newValue);
				return;
			case Data_AnalysisPackage.CLUSTERING__CLUSTERS:
				getClusters().clear();
				getClusters().addAll((Collection<? extends Cluster>)newValue);
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
			case Data_AnalysisPackage.CLUSTERING__K:
				setK(K_EDEFAULT);
				return;
			case Data_AnalysisPackage.CLUSTERING__INPUT_ATTRIBUTES:
				getInputAttributes().clear();
				return;
			case Data_AnalysisPackage.CLUSTERING__CLUSTERS:
				getClusters().clear();
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
			case Data_AnalysisPackage.CLUSTERING__K:
				return k != K_EDEFAULT;
			case Data_AnalysisPackage.CLUSTERING__INPUT_ATTRIBUTES:
				return inputAttributes != null && !inputAttributes.isEmpty();
			case Data_AnalysisPackage.CLUSTERING__CLUSTERS:
				return clusters != null && !clusters.isEmpty();
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
		result.append(" (K: ");
		result.append(k);
		result.append(')');
		return result.toString();
	}

} //ClusteringImpl
