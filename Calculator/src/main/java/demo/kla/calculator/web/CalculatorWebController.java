package demo.kla.calculator.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Primary web controller used solely to direct a user to the home page with the calculator UI.
 */
@Controller
@RequestMapping(path = "/")
public class CalculatorWebController {
	
	/**
	 * Directs the user to the home calculator UI.
	 * 
	 * @return a {@link ModelAndView} representing the home jsp for the calculator UI
	 */
	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView home() {
		return new ModelAndView("calculator");
	}
}
