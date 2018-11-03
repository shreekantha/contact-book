package com.contactbook.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.contactbook.dao.ContactDao;
import com.contactbook.domain.Contact;
@Service
public class ContactServiceImpl implements ContactService {
	private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());
	@Autowired
	private ContactDao contactDao;

	@Override
	public Contact addContact(Contact contact) {
		LOGGER.info("1.contactDao {}", contactDao);
		
		return contactDao.addContact(contact);
	}

}
