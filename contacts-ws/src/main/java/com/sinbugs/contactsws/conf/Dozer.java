package com.sinbugs.contactsws.conf;

import org.dozer.DozerBeanMapper;
import org.dozer.Mapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Dozer {

	@Bean
	public Mapper beanMapper() {
		return new DozerBeanMapper();
	}
	
}
