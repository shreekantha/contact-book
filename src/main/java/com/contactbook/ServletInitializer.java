package com.contactbook;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

public class ServletInitializer extends SpringBootServletInitializer {

	private final Logger LOGGER=LoggerFactory.getLogger(this.getClass());
	
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		LOGGER.info("Boot Servlet initializer");
		return application.sources(ContactBookApplication.class);
	}

}
