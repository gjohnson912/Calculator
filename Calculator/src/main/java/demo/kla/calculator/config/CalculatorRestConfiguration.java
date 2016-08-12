package demo.kla.calculator.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * Configuration class meant to set up the RESTful services.
 */
@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "demo.kla.calculator.api")
public class CalculatorRestConfiguration {

}
