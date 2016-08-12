package demo.kla.calculator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;

/**
 * Enum used to represent the various types of supported mathematical operators.
 */
public enum Operator {

	ADDITION("+", OperatorType.BINARY),
	SUBSTRACTION("-", OperatorType.BINARY),
	MULTIPLICATION("x", OperatorType.BINARY),
	DIVISION("/", OperatorType.BINARY),
	EXPONENT("^", OperatorType.BINARY),
	SQUARE_ROOT("sqrt", OperatorType.UNARY);
	
	private static final Map<String, Operator> SYMBOL_TO_OPERATOR = new HashMap<>();
	static {
		for (Operator operator : Operator.values()) {
			SYMBOL_TO_OPERATOR.put(operator.operatorSymbol, operator);
		}
	}
	
	private final String operatorSymbol;
	
	private final OperatorType operatorType;
	
	/**
	 * Private constructor.
	 * 
	 * @param operatorSymbol the operator symbol used to indicate what operator it is in a String
	 * @param operatorType the type of operator, indicating how many operands are involved in the operation
	 */
	private Operator(String operatorSymbol, OperatorType operatorType) {
		this.operatorSymbol = operatorSymbol;
		this.operatorType = operatorType;
	}
	
	/**
	 * Determine the {@link Operator} based on the symbol used to represent it.
	 * 
	 * @param operatorSymbol the operator symbol used in the calculation
	 * @return the corresponding {@link Operator}
	 */
	public static Operator fromSymbol(String operatorSymbol) {
		final Operator operator = SYMBOL_TO_OPERATOR.get(StringUtils.trimToEmpty(operatorSymbol));
		
		if (operator != null) {
			return operator;
		}
		
		throw new UnsupportedOperatorException("The operator symbol " + operatorSymbol + " is not supported.");
	}
	
	public static List<String> getValidOperatorSymbols() {
		return new ArrayList<>(SYMBOL_TO_OPERATOR.keySet());
	}

	/**
	 * @return the operatorSymbol
	 */
	public String getOperatorSymbol() {
		return operatorSymbol;
	}

	/**
	 * @return the operatorType
	 */
	public OperatorType getOperatorType() {
		return operatorType;
	}
}
