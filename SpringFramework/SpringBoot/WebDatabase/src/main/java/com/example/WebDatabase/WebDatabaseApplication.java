package com.example.WebDatabase;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;



@SpringBootApplication
public class WebDatabaseApplication {

	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(WebDatabaseApplication.class);
	}
	
	public static void main(String[] args) {
		SpringApplication.run(WebDatabaseApplication.class, args);
	}

}
