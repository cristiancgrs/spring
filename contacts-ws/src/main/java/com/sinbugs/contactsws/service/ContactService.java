package com.sinbugs.contactsws.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sinbugs.contactsws.dao.ContactRepository;
import com.sinbugs.contactsws.dto.Contact;

@Service
public class ContactService {

	@Autowired
	ContactRepository dao;
	
	public Contact save(Contact contact) {
		return dao.saveAndFlush(contact);
	}
	
}
