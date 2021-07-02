package com.maven.SpringAnno;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages="com.maven.SpringAnno")
public class AppConfig {
	
//	@Bean
//	public Samsung getPhone(){
//		return new Samsung();
//	}
//	
//	@Bean
//	public MobileProcessor getProcessor(){
//		return new Snapdragon();
//	}

// if you dont want to use the above bean annotation, 
//	make all the classes as @Component
//  and add @ComponentScan(basePackages="com.maven.SpringAnno")

	
// what if there are two Components returning same type like snapdragon and mediatek
// if there is a confusion use @Primary in snapdragon or mediatek
	
	
// but what if you dont want the primary now ?
// use @Qualifier("classname") after @Autowired  
}
