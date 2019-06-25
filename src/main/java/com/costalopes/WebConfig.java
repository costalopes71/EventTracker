package com.costalopes;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration // cria um contexto de aplicacao e a servlet do front controller 
// (ou seja elimina a necessidade do  web.xml) isso na vdd ja eh algo da espec. servelt 3.0+ e o spring implementa
@EnableWebMvc // faz a mesma coisa que tinhamos que fazer com o xml de servlet-config.xml
// fara automaticamente o bean do InternalViewResolver por exemplo
@ComponentScan(basePackages = "com.costalopes")
public class WebConfig extends WebMvcConfigurerAdapter {

	@Bean
	public InternalResourceViewResolver getInternalResourceViewResolver() {
		InternalResourceViewResolver resolver = new InternalResourceViewResolver();
		resolver.setPrefix("/WEB-INF/jsp/");
		resolver.setSuffix(".jsp");
		
		return resolver;
	}

	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/pdfs/**").addResourceLocations("/WEB-INF/pdf/");
		registry.addResourceHandler("/css/**").addResourceLocations("/WEB-INF/css/");
	}
	
}