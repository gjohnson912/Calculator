package demo.kla.calculator;

import java.math.BigDecimal;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {
	
	private Calculator calculator;
	
	@Before
	public void setUp() {
		this.calculator = new Calculator();
	}

	@Test(expected = UnsupportedOperatorException.class)
	public void performCalculation_nullOperator() {
		final Calculation calculation = new Calculation();
		calculation.setOperator(null);
		this.calculator.performCalculation(calculation);
	}
	
	@Test(expected = UnsupportedOperatorException.class)
	public void performCalculation_invalidOperator() {
		final Calculation calculation = new Calculation();
		calculation.setOperator("thisisaninvalidoperator");
		this.calculator.performCalculation(calculation);
	}
	
	@Test
	public void performCalculation_operator_Addition() {
		final Calculation calculation = new Calculation();
		calculation.setOperand1("2");
		calculation.setOperand2("2");
		calculation.setOperator("+");
		final BigDecimal response = this.calculator.performCalculation(calculation);
		
		Assert.assertEquals(new BigDecimal("4"), response);
	}
	
	@Test
	public void performCalculation_operator_Subtraction() {
		final Calculation calculation = new Calculation();
		calculation.setOperand1("2");
		calculation.setOperand2("2");
		calculation.setOperator("-");
		final BigDecimal response = this.calculator.performCalculation(calculation);
		
		Assert.assertEquals(new BigDecimal("0"), response);
	}
	
	@Test
	public void performCalculation_operator_Multiplication() {
		final Calculation calculation = new Calculation();
		calculation.setOperand1("2");
		calculation.setOperand2("2");
		calculation.setOperator("x");
		final BigDecimal response = this.calculator.performCalculation(calculation);
		
		Assert.assertEquals(new BigDecimal("4"), response);
	}
	
	@Test
	public void performCalculation_operator_Division() {
		final Calculation calculation = new Calculation();
		calculation.setOperand1("2");
		calculation.setOperand2("2");
		calculation.setOperator("/");
		final BigDecimal response = this.calculator.performCalculation(calculation);
		
		Assert.assertEquals(new BigDecimal("1"), response);
	}
}
