package com.edward.paisajesApi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories
public class PruebaloginApplication {

	public static void main(String[] args) {
		SpringApplication.run(PruebaloginApplication.class, args);
	}

}
