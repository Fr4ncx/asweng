/**
 */
package Data_Analysis;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Format Operation</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see Data_Analysis.Data_AnalysisPackage#getFormatOperation()
 * @model
 * @generated
 */
public enum FormatOperation implements Enumerator {
	/**
	 * The '<em><b>Trim</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TRIM_VALUE
	 * @generated
	 * @ordered
	 */
	TRIM(0, "Trim", "Trim"),

	/**
	 * The '<em><b>String Upper Case</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STRING_UPPER_CASE_VALUE
	 * @generated
	 * @ordered
	 */
	STRING_UPPER_CASE(0, "StringUpperCase", "StringUpperCase"),

	/**
	 * The '<em><b>String To Date</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STRING_TO_DATE_VALUE
	 * @generated
	 * @ordered
	 */
	STRING_TO_DATE(0, "StringToDate", "StringToDate"),

	/**
	 * The '<em><b>Time Stamp To Date</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TIME_STAMP_TO_DATE_VALUE
	 * @generated
	 * @ordered
	 */
	TIME_STAMP_TO_DATE(0, "TimeStampToDate", "TimeStampToDate");

	/**
	 * The '<em><b>Trim</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Trim</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TRIM
	 * @model name="Trim"
	 * @generated
	 * @ordered
	 */
	public static final int TRIM_VALUE = 0;

	/**
	 * The '<em><b>String Upper Case</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>String Upper Case</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #STRING_UPPER_CASE
	 * @model name="StringUpperCase"
	 * @generated
	 * @ordered
	 */
	public static final int STRING_UPPER_CASE_VALUE = 0;

	/**
	 * The '<em><b>String To Date</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>String To Date</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #STRING_TO_DATE
	 * @model name="StringToDate"
	 * @generated
	 * @ordered
	 */
	public static final int STRING_TO_DATE_VALUE = 0;

	/**
	 * The '<em><b>Time Stamp To Date</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Time Stamp To Date</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TIME_STAMP_TO_DATE
	 * @model name="TimeStampToDate"
	 * @generated
	 * @ordered
	 */
	public static final int TIME_STAMP_TO_DATE_VALUE = 0;

	/**
	 * An array of all the '<em><b>Format Operation</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final FormatOperation[] VALUES_ARRAY =
		new FormatOperation[] {
			TRIM,
			STRING_UPPER_CASE,
			STRING_TO_DATE,
			TIME_STAMP_TO_DATE,
		};

	/**
	 * A public read-only list of all the '<em><b>Format Operation</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<FormatOperation> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Format Operation</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static FormatOperation get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			FormatOperation result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Format Operation</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static FormatOperation getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			FormatOperation result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Format Operation</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static FormatOperation get(int value) {
		switch (value) {
			case TRIM_VALUE: return TRIM;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private FormatOperation(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
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
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //FormatOperation
