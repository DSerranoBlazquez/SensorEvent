package com.microservice.sensorevent;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@ComponentScan(basePackages = {"com.microservice.service","com.microservice.controller", "com.microservice.model"})
@EnableMongoRepositories(basePackages = "com.microservice.repository")
public class SensoreventApplication {

	public static void main(String[] args) {
		SpringApplication.run(SensoreventApplication.class, args);
	}

}
