/**
 */
package Data_Analysis.impl;

import Data_Analysis.CollectionSchema;
import Data_Analysis.DataFlow;
import Data_Analysis.Data_AnalysisPackage;
import Data_Analysis.Pipeline;
import Data_Analysis.Task;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pipeline</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Data_Analysis.impl.PipelineImpl#getTasks <em>Tasks</em>}</li>
 *   <li>{@link Data_Analysis.impl.PipelineImpl#getSchemas <em>Schemas</em>}</li>
 *   <li>{@link Data_Analysis.impl.PipelineImpl#getFlows <em>Flows</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PipelineImpl extends EObjectImpl implements Pipeline {
	/**
	 * The cached value of the '{@link #getTasks() <em>Tasks</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTasks()
	 * @generated
	 * @ordered
	 */
	protected EList<Task> tasks;

	/**
	 * The cached value of the '{@link #getSchemas() <em>Schemas</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchemas()
	 * @generated
	 * @ordered
	 */
	protected EList<CollectionSchema> schemas;

	/**
	 * The cached value of the '{@link #getFlows() <em>Flows</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlows()
	 * @generated
	 * @ordered
	 */
	protected EList<DataFlow> flows;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PipelineImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Data_AnalysisPackage.Literals.PIPELINE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Task> getTasks() {
		if (tasks == null) {
			tasks = new EObjectContainmentEList<Task>(Task.class, this, Data_AnalysisPackage.PIPELINE__TASKS);
		}
		return tasks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CollectionSchema> getSchemas() {
		if (schemas == null) {
			schemas = new EObjectContainmentEList<CollectionSchema>(CollectionSchema.class, this, Data_AnalysisPackage.PIPELINE__SCHEMAS);
		}
		return schemas;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataFlow> getFlows() {
		if (flows == null) {
			flows = new EObjectContainmentEList<DataFlow>(DataFlow.class, this, Data_AnalysisPackage.PIPELINE__FLOWS);
		}
		return flows;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Data_AnalysisPackage.PIPELINE__TASKS:
				return ((InternalEList<?>)getTasks()).basicRemove(otherEnd, msgs);
			case Data_AnalysisPackage.PIPELINE__SCHEMAS:
				return ((InternalEList<?>)getSchemas()).basicRemove(otherEnd, msgs);
			case Data_AnalysisPackage.PIPELINE__FLOWS:
				return ((InternalEList<?>)getFlows()).basicRemove(otherEnd, msgs);
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
			case Data_AnalysisPackage.PIPELINE__TASKS:
				return getTasks();
			case Data_AnalysisPackage.PIPELINE__SCHEMAS:
				return getSchemas();
			case Data_AnalysisPackage.PIPELINE__FLOWS:
				return getFlows();
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
			case Data_AnalysisPackage.PIPELINE__TASKS:
				getTasks().clear();
				getTasks().addAll((Collection<? extends Task>)newValue);
				return;
			case Data_AnalysisPackage.PIPELINE__SCHEMAS:
				getSchemas().clear();
				getSchemas().addAll((Collection<? extends CollectionSchema>)newValue);
				return;
			case Data_AnalysisPackage.PIPELINE__FLOWS:
				getFlows().clear();
				getFlows().addAll((Collection<? extends DataFlow>)newValue);
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
			case Data_AnalysisPackage.PIPELINE__TASKS:
				getTasks().clear();
				return;
			case Data_AnalysisPackage.PIPELINE__SCHEMAS:
				getSchemas().clear();
				return;
			case Data_AnalysisPackage.PIPELINE__FLOWS:
				getFlows().clear();
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
			case Data_AnalysisPackage.PIPELINE__TASKS:
				return tasks != null && !tasks.isEmpty();
			case Data_AnalysisPackage.PIPELINE__SCHEMAS:
				return schemas != null && !schemas.isEmpty();
			case Data_AnalysisPackage.PIPELINE__FLOWS:
				return flows != null && !flows.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PipelineImpl
