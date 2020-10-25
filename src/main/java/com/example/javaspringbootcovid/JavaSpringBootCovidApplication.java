package com.example.javaspringbootcovid;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class JavaSpringBootCovidApplication {

	public static void main(String[] args) {
		SpringApplication.run(JavaSpringBootCovidApplication.class, args);
	}

}
