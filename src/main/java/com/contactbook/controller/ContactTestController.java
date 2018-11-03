package com.contactbook.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.contactbook.domain.Contact;
import com.contactbook.service.ContactService;

@RestController
@RequestMapping("/testcontact")
public class ContactTestController {
	private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());
	@Autowired
	private ContactService contactService;

	//@RequestMapping(value = "/test", method = RequestMethod.POST)
	@PostMapping("/test")
	public Contact test(@RequestBody Contact contact) {
		LOGGER.info("3.======contactservice {}", contactService);
		return contactService.addContact(contact);
	}

}
