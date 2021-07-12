package com.example.SpringBootdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.SpringBootdemo.Customer;

@SpringBootApplication
public class SpringBootdemoApplication {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext context = SpringApplication.run(SpringBootdemoApplication.class, args);
		
	//  Customer c = new Customer();
	//  No need to create an object
		
		//run method returns ConfigurableApplicationContext	
		SpringApplication.run(SpringBootdemoApplication.class, args);
		
		Customer c = context.getBean(Customer.class);
		
		// you need to tell spring container that you are going to use customer class object/ bean
		// so you need to use @Component before Customer class
		
		c.show();
		
		
		Customer c1 = context.getBean(Customer.class);
		
		c1.show();
		
		// Now what happened here is spring created object only once 
		// and then it is just using it with different references
		// as spring uses singleton pattern
		// hence we can see from constructor of customer class is called only once
	
		// now if you want that object should be created then specify
		// @Scope(value="prototype") by this spring will use prototype pattern
		// and will not pre create or instantiate the Customer class
		// every time you call getBean() object will be created
		
		
	
	}

}
