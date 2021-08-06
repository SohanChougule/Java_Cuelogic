package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	
	@RequestMapping("/")
	public String home() {
		logger.trace("Home method accessed");
		return "Hello from Sohan";
	}
	
	@RequestMapping("/test/{name}")
	public String greeting(@PathVariable String name) {
		logger.debug("Request {}", name );
		String response = "Hi "+name+" Welcome to My Page";
		logger.debug("Response {}", response);
		return response;
	}
}
