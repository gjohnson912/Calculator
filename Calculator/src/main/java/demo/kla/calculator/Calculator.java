package demo.kla.calculator;

import java.math.BigDecimal;
import java.math.RoundingMode;

import org.apache.commons.lang3.math.NumberUtils;
import org.springframework.stereotype.Service;

/**
 * Service designed to perform a calculation as represented by a {@link Calculation}.
 */
@Service
public class Calculator {
	
	/**
	 * Performs the calculation as described in the {@link Calculation}.
	 * 
	 * @param calculation a {@link Calculation}
	 * @return a {@link BigDecimal} representation of the answer to the calculation
	 */
	public BigDecimal performCalculation(Calculation calculation) {
		final BigDecimal operand1 = NumberUtils.createBigDecimal(calculation.getOperand1());
		final BigDecimal operand2 = NumberUtils.createBigDecimal(calculation.getOperand2());
		final Operator operator = Operator.fromSymbol(calculation.getOperator());
		
		switch (operator) {
			case ADDITION:
				return operand1.add(operand2);
				
			case SUBSTRACTION:
				return operand1.subtract(operand2);
				
			case DIVISION:
				return operand1.divide(operand2, 10, RoundingMode.HALF_UP);
				
			case MULTIPLICATION:
				return operand1.multiply(operand2);
				
			case EXPONENT:
				return operand1.pow(operand2.intValue());
				
			case SQUARE_ROOT:
				return NumberUtils.createBigDecimal(Double.valueOf(Math.sqrt(operand1.doubleValue())).toString());
				
			default:
				throw new UnsupportedOperatorException("The operator " + operator + " is not currently supported.");
		}
	}
}
