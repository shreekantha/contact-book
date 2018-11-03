package com.contactbook;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ContactBookApplication {

	private static final Logger LOGGER = LoggerFactory.getLogger(ContactBookApplication.class);

	public static void main(String[] args) {
		LOGGER.info("Boot Main method");
		SpringApplication.run(ContactBookApplication.class, args);
	}
}
