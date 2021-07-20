package com.javatpoint.springbootjpaexample.controller;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller  
public class ControllerDemo   
{  
	@RequestMapping("/")  
	public String home()  
	{  
		return "home.jsp";  
	}  
	
	
}  