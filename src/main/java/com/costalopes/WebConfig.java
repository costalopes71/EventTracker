package com.costalopes;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration // cria um contexto de aplicacao e a servlet do front controller 
// (ou seja elimina a necessidade do  web.xml) isso na vdd ja eh algo da espec. servelt 3.0+ e o spring implementa
@EnableWebMvc // faz a mesma coisa que tinhamos que fazer com o xml de servlet-config.xml
// fara automaticamente o bean do InternalViewResolver por exemplo
public class WebConfig {

	
	
}
