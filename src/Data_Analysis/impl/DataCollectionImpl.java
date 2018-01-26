/**
 */
package Data_Analysis.impl;

import Data_Analysis.CollectionSchema;
import Data_Analysis.Condition;
import Data_Analysis.DataCollection;
import Data_Analysis.DataSchema;
import Data_Analysis.Data_AnalysisPackage;
import Data_Analysis.FormatType;
import Data_Analysis.Source;

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
 * An implementation of the model object '<em><b>Data Collection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Data_Analysis.impl.DataCollectionImpl#getFormat <em>Format</em>}</li>
 *   <li>{@link Data_Analysis.impl.DataCollectionImpl#getEndpoint <em>Endpoint</em>}</li>
 *   <li>{@link Data_Analysis.impl.DataCollectionImpl#getSource <em>Source</em>}</li>
 *   <li>{@link Data_Analysis.impl.DataCollectionImpl#getInputSchema <em>Input Schema</em>}</li>
 *   <li>{@link Data_Analysis.impl.DataCollectionImpl#getCondition <em>Condition</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DataCollectionImpl extends TaskImpl implements DataCollection {
	/**
	 * The default value of the '{@link #getFormat() <em>Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormat()
	 * @generated
	 * @ordered
	 */
	protected static final FormatType FORMAT_EDEFAULT = FormatType.JSON;

	/**
	 * The cached value of the '{@link #getFormat() <em>Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormat()
	 * @generated
	 * @ordered
	 */
	protected FormatType format = FORMAT_EDEFAULT;

	/**
	 * The default value of the '{@link #getEndpoint() <em>Endpoint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndpoint()
	 * @generated
	 * @ordered
	 */
	protected static final String ENDPOINT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEndpoint() <em>Endpoint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndpoint()
	 * @generated
	 * @ordered
	 */
	protected String endpoint = ENDPOINT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected Source source;

	/**
	 * The cached value of the '{@link #getInputSchema() <em>Input Schema</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputSchema()
	 * @generated
	 * @ordered
	 */
	protected DataSchema inputSchema;

	/**
	 * The cached value of the '{@link #getCondition() <em>Condition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCondition()
	 * @generated
	 * @ordered
	 */
	protected Condition condition;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataCollectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Data_AnalysisPackage.Literals.DATA_COLLECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FormatType getFormat() {
		return format;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFormat(FormatType newFormat) {
		FormatType oldFormat = format;
		format = newFormat == null ? FORMAT_EDEFAULT : newFormat;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Data_AnalysisPackage.DATA_COLLECTION__FORMAT, oldFormat, format));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEndpoint() {
		return endpoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndpoint(String newEndpoint) {
		String oldEndpoint = endpoint;
		endpoint = newEndpoint;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Data_AnalysisPackage.DATA_COLLECTION__ENDPOINT, oldEndpoint, endpoint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Source getSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSource(Source newSource, NotificationChain msgs) {
		Source oldSource = source;
		source = newSource;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Data_AnalysisPackage.DATA_COLLECTION__SOURCE, oldSource, newSource);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(Source newSource) {
		if (newSource != source) {
			NotificationChain msgs = null;
			if (source != null)
				msgs = ((InternalEObject)source).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Data_AnalysisPackage.DATA_COLLECTION__SOURCE, null, msgs);
			if (newSource != null)
				msgs = ((InternalEObject)newSource).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Data_AnalysisPackage.DATA_COLLECTION__SOURCE, null, msgs);
			msgs = basicSetSource(newSource, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Data_AnalysisPackage.DATA_COLLECTION__SOURCE, newSource, newSource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataSchema getInputSchema() {
		return inputSchema;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInputSchema(DataSchema newInputSchema, NotificationChain msgs) {
		DataSchema oldInputSchema = inputSchema;
		inputSchema = newInputSchema;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Data_AnalysisPackage.DATA_COLLECTION__INPUT_SCHEMA, oldInputSchema, newInputSchema);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInputSchema(DataSchema newInputSchema) {
		if (newInputSchema != inputSchema) {
			NotificationChain msgs = null;
			if (inputSchema != null)
				msgs = ((InternalEObject)inputSchema).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Data_AnalysisPackage.DATA_COLLECTION__INPUT_SCHEMA, null, msgs);
			if (newInputSchema != null)
				msgs = ((InternalEObject)newInputSchema).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Data_AnalysisPackage.DATA_COLLECTION__INPUT_SCHEMA, null, msgs);
			msgs = basicSetInputSchema(newInputSchema, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Data_AnalysisPackage.DATA_COLLECTION__INPUT_SCHEMA, newInputSchema, newInputSchema));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Condition getCondition() {
		if (condition != null && condition.eIsProxy()) {
			InternalEObject oldCondition = (InternalEObject)condition;
			condition = (Condition)eResolveProxy(oldCondition);
			if (condition != oldCondition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Data_AnalysisPackage.DATA_COLLECTION__CONDITION, oldCondition, condition));
			}
		}
		return condition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Condition basicGetCondition() {
		return condition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCondition(Condition newCondition) {
		Condition oldCondition = condition;
		condition = newCondition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Data_AnalysisPackage.DATA_COLLECTION__CONDITION, oldCondition, condition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Data_AnalysisPackage.DATA_COLLECTION__SOURCE:
				return basicSetSource(null, msgs);
			case Data_AnalysisPackage.DATA_COLLECTION__INPUT_SCHEMA:
				return basicSetInputSchema(null, msgs);
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
			case Data_AnalysisPackage.DATA_COLLECTION__FORMAT:
				return getFormat();
			case Data_AnalysisPackage.DATA_COLLECTION__ENDPOINT:
				return getEndpoint();
			case Data_AnalysisPackage.DATA_COLLECTION__SOURCE:
				return getSource();
			case Data_AnalysisPackage.DATA_COLLECTION__INPUT_SCHEMA:
				return getInputSchema();
			case Data_AnalysisPackage.DATA_COLLECTION__CONDITION:
				if (resolve) return getCondition();
				return basicGetCondition();
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
			case Data_AnalysisPackage.DATA_COLLECTION__FORMAT:
				setFormat((FormatType)newValue);
				return;
			case Data_AnalysisPackage.DATA_COLLECTION__ENDPOINT:
				setEndpoint((String)newValue);
				return;
			case Data_AnalysisPackage.DATA_COLLECTION__SOURCE:
				setSource((Source)newValue);
				return;
			case Data_AnalysisPackage.DATA_COLLECTION__INPUT_SCHEMA:
				setInputSchema((DataSchema)newValue);
				return;
			case Data_AnalysisPackage.DATA_COLLECTION__CONDITION:
				setCondition((Condition)newValue);
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
			case Data_AnalysisPackage.DATA_COLLECTION__FORMAT:
				setFormat(FORMAT_EDEFAULT);
				return;
			case Data_AnalysisPackage.DATA_COLLECTION__ENDPOINT:
				setEndpoint(ENDPOINT_EDEFAULT);
				return;
			case Data_AnalysisPackage.DATA_COLLECTION__SOURCE:
				setSource((Source)null);
				return;
			case Data_AnalysisPackage.DATA_COLLECTION__INPUT_SCHEMA:
				setInputSchema((DataSchema)null);
				return;
			case Data_AnalysisPackage.DATA_COLLECTION__CONDITION:
				setCondition((Condition)null);
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
			case Data_AnalysisPackage.DATA_COLLECTION__FORMAT:
				return format != FORMAT_EDEFAULT;
			case Data_AnalysisPackage.DATA_COLLECTION__ENDPOINT:
				return ENDPOINT_EDEFAULT == null ? endpoint != null : !ENDPOINT_EDEFAULT.equals(endpoint);
			case Data_AnalysisPackage.DATA_COLLECTION__SOURCE:
				return source != null;
			case Data_AnalysisPackage.DATA_COLLECTION__INPUT_SCHEMA:
				return inputSchema != null;
			case Data_AnalysisPackage.DATA_COLLECTION__CONDITION:
				return condition != null;
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
		result.append(" (format: ");
		result.append(format);
		result.append(", endpoint: ");
		result.append(endpoint);
		result.append(')');
		return result.toString();
	}

} //DataCollectionImpl
