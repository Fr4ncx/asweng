/**
 */
package Data_Analysis.impl;

import Data_Analysis.Condition;
import Data_Analysis.Data_AnalysisPackage;
import Data_Analysis.LogicalExp;

import Data_Analysis.ValueCondition;
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
 * An implementation of the model object '<em><b>Condition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Data_Analysis.impl.ConditionImpl#getName <em>Name</em>}</li>
 *   <li>{@link Data_Analysis.impl.ConditionImpl#getExpressions <em>Expressions</em>}</li>
 *   <li>{@link Data_Analysis.impl.ConditionImpl#getValueConditions <em>Value Conditions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConditionImpl extends EObjectImpl implements Condition {
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
	 * The cached value of the '{@link #getExpressions() <em>Expressions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpressions()
	 * @generated
	 * @ordered
	 */
	protected EList<LogicalExp> expressions;

	/**
	 * The cached value of the '{@link #getValueConditions() <em>Value Conditions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueConditions()
	 * @generated
	 * @ordered
	 */
	protected EList<ValueCondition> valueConditions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConditionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Data_AnalysisPackage.Literals.CONDITION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Data_AnalysisPackage.CONDITION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LogicalExp> getExpressions() {
		if (expressions == null) {
			expressions = new EObjectContainmentEList<LogicalExp>(LogicalExp.class, this, Data_AnalysisPackage.CONDITION__EXPRESSIONS);
		}
		return expressions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ValueCondition> getValueConditions() {
		if (valueConditions == null) {
			valueConditions = new EObjectContainmentEList<ValueCondition>(ValueCondition.class, this, Data_AnalysisPackage.CONDITION__VALUE_CONDITIONS);
		}
		return valueConditions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Data_AnalysisPackage.CONDITION__EXPRESSIONS:
				return ((InternalEList<?>)getExpressions()).basicRemove(otherEnd, msgs);
			case Data_AnalysisPackage.CONDITION__VALUE_CONDITIONS:
				return ((InternalEList<?>)getValueConditions()).basicRemove(otherEnd, msgs);
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
			case Data_AnalysisPackage.CONDITION__NAME:
				return getName();
			case Data_AnalysisPackage.CONDITION__EXPRESSIONS:
				return getExpressions();
			case Data_AnalysisPackage.CONDITION__VALUE_CONDITIONS:
				return getValueConditions();
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
			case Data_AnalysisPackage.CONDITION__NAME:
				setName((String)newValue);
				return;
			case Data_AnalysisPackage.CONDITION__EXPRESSIONS:
				getExpressions().clear();
				getExpressions().addAll((Collection<? extends LogicalExp>)newValue);
				return;
			case Data_AnalysisPackage.CONDITION__VALUE_CONDITIONS:
				getValueConditions().clear();
				getValueConditions().addAll((Collection<? extends ValueCondition>)newValue);
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
			case Data_AnalysisPackage.CONDITION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case Data_AnalysisPackage.CONDITION__EXPRESSIONS:
				getExpressions().clear();
				return;
			case Data_AnalysisPackage.CONDITION__VALUE_CONDITIONS:
				getValueConditions().clear();
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
			case Data_AnalysisPackage.CONDITION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case Data_AnalysisPackage.CONDITION__EXPRESSIONS:
				return expressions != null && !expressions.isEmpty();
			case Data_AnalysisPackage.CONDITION__VALUE_CONDITIONS:
				return valueConditions != null && !valueConditions.isEmpty();
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

} //ConditionImpl
