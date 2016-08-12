package demo.kla.calculator;

/**
 * Represents the various pieces of a calculation to be performed.
 */
public class Calculation {

	private String operand1;
	
	private String operator;
	
	private String operand2;

	/**
	 * @return the operand1
	 */
	public String getOperand1() {
		return operand1;
	}

	/**
	 * @param operand1 the operand1 to set
	 */
	public void setOperand1(String operand1) {
		this.operand1 = operand1;
	}

	/**
	 * @return the operator
	 */
	public String getOperator() {
		return operator;
	}

	/**
	 * @param operator the operator to set
	 */
	public void setOperator(String operator) {
		this.operator = operator;
	}

	/**
	 * @return the operand2
	 */
	public String getOperand2() {
		return operand2;
	}

	/**
	 * @param operand2 the operand2 to set
	 */
	public void setOperand2(String operand2) {
		this.operand2 = operand2;
	}
}
