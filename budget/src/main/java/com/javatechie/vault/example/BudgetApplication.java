package com.javatechie.vault.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;


@SpringBootApplication
@EnableConfigurationProperties(Credential.class)
public class BudgetApplication implements CommandLineRunner{
	
	private final Credential credential;
	
	public BudgetApplication(Credential credential) {
		this.credential = credential;
	}

	public static void main(String[] args) {
		SpringApplication.run(BudgetApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Logger logger = LoggerFactory.getLogger(BudgetApplication.class);
		
		logger.info("------Properties---------");
		//logger.info("Username : "+credential.getUsername());
		//logger.info("Password : "+credential.getPassword());
	}

}
