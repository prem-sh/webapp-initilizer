package com.premsh.webappinitializer;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration.Dynamic;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class AppInitializer implements WebApplicationInitializer{

	public void onStartup(ServletContext servletContext) throws ServletException {
		
		AnnotationConfigWebApplicationContext context = new AnnotationConfigWebApplicationContext();
		context.register(AppConfig.class);
		
		DispatcherServlet servlet = new DispatcherServlet(context);
		
		Dynamic servletDynamic = servletContext.addServlet("dispatcher", servlet);
		servletDynamic.setLoadOnStartup(1);
		servletDynamic.addMapping("/*");
		
	}

}
