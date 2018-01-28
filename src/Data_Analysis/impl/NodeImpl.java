/**
 */
package Data_Analysis.impl;

import Data_Analysis.Data_AnalysisPackage;
import Data_Analysis.Edge;
import Data_Analysis.Node;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Data_Analysis.impl.NodeImpl#getName <em>Name</em>}</li>
 *   <li>{@link Data_Analysis.impl.NodeImpl#getWidth <em>Width</em>}</li>
 *   <li>{@link Data_Analysis.impl.NodeImpl#getHeight <em>Height</em>}</li>
 *   <li>{@link Data_Analysis.impl.NodeImpl#getX <em>X</em>}</li>
 *   <li>{@link Data_Analysis.impl.NodeImpl#getY <em>Y</em>}</li>
 *   <li>{@link Data_Analysis.impl.NodeImpl#getToEdge <em>To Edge</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NodeImpl extends GraphElementImpl implements Node {
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
	 * The default value of the '{@link #getWidth() <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
	protected static final int WIDTH_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getWidth() <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
	protected int width = WIDTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getHeight() <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeight()
	 * @generated
	 * @ordered
	 */
	protected static final int HEIGHT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getHeight() <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeight()
	 * @generated
	 * @ordered
	 */
	protected int height = HEIGHT_EDEFAULT;

	/**
	 * The default value of the '{@link #getX() <em>X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getX()
	 * @generated
	 * @ordered
	 */
	protected static final int X_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getX() <em>X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getX()
	 * @generated
	 * @ordered
	 */
	protected int x = X_EDEFAULT;

	/**
	 * The default value of the '{@link #getY() <em>Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getY()
	 * @generated
	 * @ordered
	 */
	protected static final int Y_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getY() <em>Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getY()
	 * @generated
	 * @ordered
	 */
	protected int y = Y_EDEFAULT;

	/**
	 * The cached value of the '{@link #getToEdge() <em>To Edge</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToEdge()
	 * @generated
	 * @ordered
	 */
	protected Edge toEdge;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Data_AnalysisPackage.Literals.NODE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Data_AnalysisPackage.NODE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getWidth() {
		return width;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWidth(int newWidth) {
		int oldWidth = width;
		width = newWidth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Data_AnalysisPackage.NODE__WIDTH, oldWidth, width));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getHeight() {
		return height;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHeight(int newHeight) {
		int oldHeight = height;
		height = newHeight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Data_AnalysisPackage.NODE__HEIGHT, oldHeight, height));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getX() {
		return x;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setX(int newX) {
		int oldX = x;
		x = newX;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Data_AnalysisPackage.NODE__X, oldX, x));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getY() {
		return y;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setY(int newY) {
		int oldY = y;
		y = newY;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Data_AnalysisPackage.NODE__Y, oldY, y));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Edge getToEdge() {
		if (toEdge != null && toEdge.eIsProxy()) {
			InternalEObject oldToEdge = (InternalEObject)toEdge;
			toEdge = (Edge)eResolveProxy(oldToEdge);
			if (toEdge != oldToEdge) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Data_AnalysisPackage.NODE__TO_EDGE, oldToEdge, toEdge));
			}
		}
		return toEdge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Edge basicGetToEdge() {
		return toEdge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setToEdge(Edge newToEdge) {
		Edge oldToEdge = toEdge;
		toEdge = newToEdge;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Data_AnalysisPackage.NODE__TO_EDGE, oldToEdge, toEdge));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Data_AnalysisPackage.NODE__NAME:
				return getName();
			case Data_AnalysisPackage.NODE__WIDTH:
				return getWidth();
			case Data_AnalysisPackage.NODE__HEIGHT:
				return getHeight();
			case Data_AnalysisPackage.NODE__X:
				return getX();
			case Data_AnalysisPackage.NODE__Y:
				return getY();
			case Data_AnalysisPackage.NODE__TO_EDGE:
				if (resolve) return getToEdge();
				return basicGetToEdge();
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
			case Data_AnalysisPackage.NODE__NAME:
				setName((String)newValue);
				return;
			case Data_AnalysisPackage.NODE__WIDTH:
				setWidth((Integer)newValue);
				return;
			case Data_AnalysisPackage.NODE__HEIGHT:
				setHeight((Integer)newValue);
				return;
			case Data_AnalysisPackage.NODE__X:
				setX((Integer)newValue);
				return;
			case Data_AnalysisPackage.NODE__Y:
				setY((Integer)newValue);
				return;
			case Data_AnalysisPackage.NODE__TO_EDGE:
				setToEdge((Edge)newValue);
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
			case Data_AnalysisPackage.NODE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case Data_AnalysisPackage.NODE__WIDTH:
				setWidth(WIDTH_EDEFAULT);
				return;
			case Data_AnalysisPackage.NODE__HEIGHT:
				setHeight(HEIGHT_EDEFAULT);
				return;
			case Data_AnalysisPackage.NODE__X:
				setX(X_EDEFAULT);
				return;
			case Data_AnalysisPackage.NODE__Y:
				setY(Y_EDEFAULT);
				return;
			case Data_AnalysisPackage.NODE__TO_EDGE:
				setToEdge((Edge)null);
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
			case Data_AnalysisPackage.NODE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case Data_AnalysisPackage.NODE__WIDTH:
				return width != WIDTH_EDEFAULT;
			case Data_AnalysisPackage.NODE__HEIGHT:
				return height != HEIGHT_EDEFAULT;
			case Data_AnalysisPackage.NODE__X:
				return x != X_EDEFAULT;
			case Data_AnalysisPackage.NODE__Y:
				return y != Y_EDEFAULT;
			case Data_AnalysisPackage.NODE__TO_EDGE:
				return toEdge != null;
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
		result.append(", width: ");
		result.append(width);
		result.append(", height: ");
		result.append(height);
		result.append(", x: ");
		result.append(x);
		result.append(", y: ");
		result.append(y);
		result.append(')');
		return result.toString();
	}

} //NodeImpl
