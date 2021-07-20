package com.example.WebRequests;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;



@SpringBootApplication
public class WebRequestsApplication {

	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(WebRequestsApplication.class);
	}
	
	public static void main(String[] args) {
		SpringApplication.run(WebRequestsApplication.class, args);
	}

}
