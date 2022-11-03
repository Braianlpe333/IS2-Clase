package com.javatechie.vault.example;

import org.springframework.boot.context.properties.ConfigurationProperties;

import lombok.Data;

@Data
@ConfigurationProperties("javatechie")
public class Credential {
	
	private String username;
	private String password;
}
