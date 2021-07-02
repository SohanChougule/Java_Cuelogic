package com.maven.SpringAnno;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	// old method
//        System.out.println( "Hello World!" );
//        Samsung s7 = new Samsung();
//        s7.config();
    	
    	ApplicationContext factory = new AnnotationConfigApplicationContext(AppConfig.class);
    	Samsung s7 = factory.getBean(Samsung.class);
    	s7.config();
  	
    	
    }
}
