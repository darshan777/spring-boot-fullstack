package com.darshan.learning.springbootappfullstack.config;

import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableJpaRepositories("com.darshan.learning.springbootappfullstack.repository")
@EnableTransactionManagement
public class DatabaseConfig {

		
}
