package demo.kla.calculator.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

/**
 * Primary web configuration. This handles setting up the necessary resources for Spring Web MVC.
 */
@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "demo.kla.calculator.web")
public class CalculatorWebConfiguration extends WebMvcConfigurerAdapter {

	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/resources/**").addResourceLocations("/resources/");
	}
	
	/**
	 * Creates an {@link InternalResourceViewResolver} for directing to '.jsp' files for the view layer.
	 * 
	 * @return an {@link InternalResourceViewResolver}
	 */
	@Bean
	public InternalResourceViewResolver internalResourceViewResolver() {
		final InternalResourceViewResolver internalResourceViewResolver = new InternalResourceViewResolver();
		internalResourceViewResolver.setPrefix("/WEB-INF/pages/");
		internalResourceViewResolver.setSuffix(".jsp");
		return internalResourceViewResolver;
	}
}
