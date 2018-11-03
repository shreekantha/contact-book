package com.contactbook.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.contactbook.domain.Contact;
import com.contactbook.service.ContactService;
import com.contactbook.service.ContactServiceImpl;

@RestController
@RequestMapping("/contacts")
public class ContactController {

	private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private ContactService contactService;

	@RequestMapping(value = {"/add"}, method = RequestMethod.POST)
	public Contact addContact(@RequestBody Contact contact) {
		LOGGER.info("Name :{}", contact.getName());
		LOGGER.info("1.Contact service {}",contactService);
		
		
		return contactService.addContact(contact);
	}
}
