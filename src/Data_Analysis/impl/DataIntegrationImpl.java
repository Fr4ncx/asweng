/**
 */
package Data_Analysis.impl;

import Data_Analysis.CollectionSchema;
import Data_Analysis.DataIntegration;
import Data_Analysis.DataSchema;
import Data_Analysis.Data_AnalysisPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Integration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Data_Analysis.impl.DataIntegrationImpl#getName <em>Name</em>}</li>
 *   <li>{@link Data_Analysis.impl.DataIntegrationImpl#getJoinAttributes <em>Join Attributes</em>}</li>
 *   <li>{@link Data_Analysis.impl.DataIntegrationImpl#getOutAttributes <em>Out Attributes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DataIntegrationImpl extends TaskImpl implements DataIntegration {
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
	 * The cached value of the '{@link #getJoinAttributes() <em>Join Attributes</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJoinAttributes()
	 * @generated
	 * @ordered
	 */
	protected DataSchema joinAttributes;

	/**
	 * The cached value of the '{@link #getOutAttributes() <em>Out Attributes</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutAttributes()
	 * @generated
	 * @ordered
	 */
	protected DataSchema outAttributes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataIntegrationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Data_AnalysisPackage.Literals.DATA_INTEGRATION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Data_AnalysisPackage.DATA_INTEGRATION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataSchema getJoinAttributes() {
		if (joinAttributes != null && joinAttributes.eIsProxy()) {
			InternalEObject oldJoinAttributes = (InternalEObject)joinAttributes;
			joinAttributes = (DataSchema)eResolveProxy(oldJoinAttributes);
			if (joinAttributes != oldJoinAttributes) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Data_AnalysisPackage.DATA_INTEGRATION__JOIN_ATTRIBUTES, oldJoinAttributes, joinAttributes));
			}
		}
		return joinAttributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataSchema basicGetJoinAttributes() {
		return joinAttributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJoinAttributes(DataSchema newJoinAttributes) {
		DataSchema oldJoinAttributes = joinAttributes;
		joinAttributes = newJoinAttributes;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Data_AnalysisPackage.DATA_INTEGRATION__JOIN_ATTRIBUTES, oldJoinAttributes, joinAttributes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataSchema getOutAttributes() {
		if (outAttributes != null && outAttributes.eIsProxy()) {
			InternalEObject oldOutAttributes = (InternalEObject)outAttributes;
			outAttributes = (DataSchema)eResolveProxy(oldOutAttributes);
			if (outAttributes != oldOutAttributes) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Data_AnalysisPackage.DATA_INTEGRATION__OUT_ATTRIBUTES, oldOutAttributes, outAttributes));
			}
		}
		return outAttributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataSchema basicGetOutAttributes() {
		return outAttributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutAttributes(DataSchema newOutAttributes) {
		DataSchema oldOutAttributes = outAttributes;
		outAttributes = newOutAttributes;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Data_AnalysisPackage.DATA_INTEGRATION__OUT_ATTRIBUTES, oldOutAttributes, outAttributes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Data_AnalysisPackage.DATA_INTEGRATION__NAME:
				return getName();
			case Data_AnalysisPackage.DATA_INTEGRATION__JOIN_ATTRIBUTES:
				if (resolve) return getJoinAttributes();
				return basicGetJoinAttributes();
			case Data_AnalysisPackage.DATA_INTEGRATION__OUT_ATTRIBUTES:
				if (resolve) return getOutAttributes();
				return basicGetOutAttributes();
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
			case Data_AnalysisPackage.DATA_INTEGRATION__NAME:
				setName((String)newValue);
				return;
			case Data_AnalysisPackage.DATA_INTEGRATION__JOIN_ATTRIBUTES:
				setJoinAttributes((DataSchema)newValue);
				return;
			case Data_AnalysisPackage.DATA_INTEGRATION__OUT_ATTRIBUTES:
				setOutAttributes((DataSchema)newValue);
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
			case Data_AnalysisPackage.DATA_INTEGRATION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case Data_AnalysisPackage.DATA_INTEGRATION__JOIN_ATTRIBUTES:
				setJoinAttributes((DataSchema)null);
				return;
			case Data_AnalysisPackage.DATA_INTEGRATION__OUT_ATTRIBUTES:
				setOutAttributes((DataSchema)null);
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
			case Data_AnalysisPackage.DATA_INTEGRATION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case Data_AnalysisPackage.DATA_INTEGRATION__JOIN_ATTRIBUTES:
				return joinAttributes != null;
			case Data_AnalysisPackage.DATA_INTEGRATION__OUT_ATTRIBUTES:
				return outAttributes != null;
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

} //DataIntegrationImpl
