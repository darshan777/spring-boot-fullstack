package com.darshan.learning.springbootappfullstack.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

@Configuration
public class apiConfig {
	
	@Bean
	public ObjectMapper objectmapper() {
		
		ObjectMapper objectmapper = new ObjectMapper();
		objectmapper.registerModule(new JavaTimeModule());
		return new ObjectMapper();
	} 
	
	@Bean
	public ObjectWriter objectwriter(ObjectMapper objectmapper ) {
		return objectmapper.writerWithDefaultPrettyPrinter();
	}

}
