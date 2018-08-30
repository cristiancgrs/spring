package com.sinbugs.contactsws.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sinbugs.contactsws.dto.Contact;

public interface ContactRepository extends JpaRepository<Contact, Long>{

}
