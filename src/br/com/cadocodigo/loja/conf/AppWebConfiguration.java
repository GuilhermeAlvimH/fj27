package br.com.cadocodigo.loja.conf;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import br.com.cadocodigo.loja.controllers.HomeController;
import br.com.cadocodigo.loja.daos.ProductDAO;

@EnableWebMvc
@ComponentScan(basePackageClasses={HomeController.class,ProductDAO.class})
public class AppWebConfiguration {
	
	@Bean
	public InternalResourceViewResolver InternalResourceViewResolver(){
		org.springframework.web.servlet.view.InternalResourceViewResolver resolver = new InternalResourceViewResolver();
		resolver.setPrefix("/WEB-INF/views/");
		resolver.setSuffix(".jsp");
		return resolver;
	}

}
