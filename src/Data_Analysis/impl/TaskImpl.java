/**
 */
package Data_Analysis.impl;

import Data_Analysis.DataFlow;
import Data_Analysis.Data_AnalysisPackage;
import Data_Analysis.Task;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Task</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Data_Analysis.impl.TaskImpl#getToFlow <em>To Flow</em>}</li>
 *   <li>{@link Data_Analysis.impl.TaskImpl#getExecutionTimestamp <em>Execution Timestamp</em>}</li>
 *   <li>{@link Data_Analysis.impl.TaskImpl#isIsExecuted <em>Is Executed</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class TaskImpl extends EObjectImpl implements Task {
	/**
	 * The cached value of the '{@link #getToFlow() <em>To Flow</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToFlow()
	 * @generated
	 * @ordered
	 */
	protected DataFlow toFlow;

	/**
	 * The default value of the '{@link #getExecutionTimestamp() <em>Execution Timestamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExecutionTimestamp()
	 * @generated
	 * @ordered
	 */
	protected static final long EXECUTION_TIMESTAMP_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getExecutionTimestamp() <em>Execution Timestamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExecutionTimestamp()
	 * @generated
	 * @ordered
	 */
	protected long executionTimestamp = EXECUTION_TIMESTAMP_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsExecuted() <em>Is Executed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsExecuted()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_EXECUTED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsExecuted() <em>Is Executed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsExecuted()
	 * @generated
	 * @ordered
	 */
	protected boolean isExecuted = IS_EXECUTED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TaskImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Data_AnalysisPackage.Literals.TASK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataFlow getToFlow() {
		if (toFlow != null && toFlow.eIsProxy()) {
			InternalEObject oldToFlow = (InternalEObject)toFlow;
			toFlow = (DataFlow)eResolveProxy(oldToFlow);
			if (toFlow != oldToFlow) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Data_AnalysisPackage.TASK__TO_FLOW, oldToFlow, toFlow));
			}
		}
		return toFlow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataFlow basicGetToFlow() {
		return toFlow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setToFlow(DataFlow newToFlow) {
		DataFlow oldToFlow = toFlow;
		toFlow = newToFlow;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Data_AnalysisPackage.TASK__TO_FLOW, oldToFlow, toFlow));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getExecutionTimestamp() {
		return executionTimestamp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExecutionTimestamp(long newExecutionTimestamp) {
		long oldExecutionTimestamp = executionTimestamp;
		executionTimestamp = newExecutionTimestamp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Data_AnalysisPackage.TASK__EXECUTION_TIMESTAMP, oldExecutionTimestamp, executionTimestamp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsExecuted() {
		return isExecuted;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsExecuted(boolean newIsExecuted) {
		boolean oldIsExecuted = isExecuted;
		isExecuted = newIsExecuted;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Data_AnalysisPackage.TASK__IS_EXECUTED, oldIsExecuted, isExecuted));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Data_AnalysisPackage.TASK__TO_FLOW:
				if (resolve) return getToFlow();
				return basicGetToFlow();
			case Data_AnalysisPackage.TASK__EXECUTION_TIMESTAMP:
				return getExecutionTimestamp();
			case Data_AnalysisPackage.TASK__IS_EXECUTED:
				return isIsExecuted();
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
			case Data_AnalysisPackage.TASK__TO_FLOW:
				setToFlow((DataFlow)newValue);
				return;
			case Data_AnalysisPackage.TASK__EXECUTION_TIMESTAMP:
				setExecutionTimestamp((Long)newValue);
				return;
			case Data_AnalysisPackage.TASK__IS_EXECUTED:
				setIsExecuted((Boolean)newValue);
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
			case Data_AnalysisPackage.TASK__TO_FLOW:
				setToFlow((DataFlow)null);
				return;
			case Data_AnalysisPackage.TASK__EXECUTION_TIMESTAMP:
				setExecutionTimestamp(EXECUTION_TIMESTAMP_EDEFAULT);
				return;
			case Data_AnalysisPackage.TASK__IS_EXECUTED:
				setIsExecuted(IS_EXECUTED_EDEFAULT);
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
			case Data_AnalysisPackage.TASK__TO_FLOW:
				return toFlow != null;
			case Data_AnalysisPackage.TASK__EXECUTION_TIMESTAMP:
				return executionTimestamp != EXECUTION_TIMESTAMP_EDEFAULT;
			case Data_AnalysisPackage.TASK__IS_EXECUTED:
				return isExecuted != IS_EXECUTED_EDEFAULT;
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
		result.append(" (executionTimestamp: ");
		result.append(executionTimestamp);
		result.append(", isExecuted: ");
		result.append(isExecuted);
		result.append(')');
		return result.toString();
	}

} //TaskImpl
