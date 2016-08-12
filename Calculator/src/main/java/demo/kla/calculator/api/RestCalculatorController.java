package demo.kla.calculator.api;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import demo.kla.calculator.Calculation;
import demo.kla.calculator.Calculator;

/**
 * RESTful controller for accepting requests for the /api/ path and doing the actual calculations.
 */
@RestController
@RequestMapping(path = "/calculation")
public class RestCalculatorController {
	
	private Calculator calculator;
	
	/**
	 * Constructor for setting up the required services.
	 * 
	 * @param calculator the {@link Calculator} service used to perform the actual calculations
	 */
	@Autowired
	public RestCalculatorController(Calculator calculator) {
		this.calculator = calculator;
	}

	/**
	 * Method used to perform the calculations provided from the front end.
	 * 
	 * @param calculation the {@link Calculation} representing the calculation that needs to occur
	 * @return a {@link HttpEntity} containing a String representing the answer to the calculation
	 */
	@RequestMapping(method = RequestMethod.POST,
			consumes = MediaType.APPLICATION_JSON_VALUE,
			produces = MediaType.APPLICATION_JSON_VALUE)
	public HttpEntity<String> calculate(@RequestBody Calculation calculation) {
		final BigDecimal result = this.calculator.performCalculation(calculation);
		return new ResponseEntity<String>(result.toString(), HttpStatus.OK);
	}
}
