package com.cue.dependancyDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.cue.dependancyDemo.Customers;

@SpringBootApplication
public class DependancyDemoApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext  context= SpringApplication.run(DependancyDemoApplication.class, args);
		Customers c = context.getBean(Customers.class);
		
		c.display();
	}

}
