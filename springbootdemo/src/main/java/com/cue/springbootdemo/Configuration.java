package com.cue.springbootdemo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Configuration {
	
	@RequestMapping("/hello")
	public String hello(){
		return "Hello World";
	}
}
