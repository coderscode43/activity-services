package com.fitness.activityservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.config.EnableMongoAuditing;

@SpringBootApplication
@EnableMongoAuditing
public class ActivityServicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(ActivityServicesApplication.class, args);
	}

}
