package io.zipcoder.persistenceapp;

import org.apache.catalina.servlets.WebdavServlet;
import org.h2.server.web.WebServlet;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class PersistenceStarterApplication {

	public static void main(String[] args) {
		SpringApplication.run(PersistenceStarterApplication.class, args);
	}

	@Bean
	ServletRegistrationBean h2servletRegistration(){
		ServletRegistrationBean registrationBean = new ServletRegistrationBean(new WebdavServlet());
		registrationBean.addUrlMappings("/console/*");
		return registrationBean;
	}
}
