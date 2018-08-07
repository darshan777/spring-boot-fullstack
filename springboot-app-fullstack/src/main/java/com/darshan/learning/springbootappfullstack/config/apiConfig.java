package com.darshan.learning.springbootappfullstack.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;

@Configuration
public class apiConfig {
	
	@Bean
	public ObjectMapper objectmapper() {
		return new ObjectMapper();
	} 
	
	@Bean
	public ObjectWriter objectwriter(ObjectMapper objectmapper ) {
		return objectmapper.writerWithDefaultPrettyPrinter();
	}

}
