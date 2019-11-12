package com.example.appconfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(MessageProperties.class)
public class SpringBootAzureAppConfigApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootAzureAppConfigApplication.class, args);
	}

}
