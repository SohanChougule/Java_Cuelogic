package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import com.example.demo.service.BankService;

@SpringBootApplication
@EnableAspectJAutoProxy
public class BootAopAroundAdviceApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(BootAopAroundAdviceApplication.class, args);
		
		// Fetching the employee object from the application context.  
		BankService bank = context.getBean(BankService.class);  
		// Displaying balance in the account  
		String accnumber = "12345";  
		bank.displayBalance(accnumber);  
		// Closing the context object  
		context.close();  
	}

}
