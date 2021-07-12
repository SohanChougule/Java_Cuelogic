package com.maven.ProjectName;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        Vehicle obj = new Car();
        obj.drive();
        obj = new Bike();
        obj.drive();
        
        
        // this is with xml file
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        
        System.out.println("by xml file");
        
        Vehicle obj1  = (Vehicle) context.getBean("Vehicle");
        obj1.drive();
        
        // with annotations
        // for that go to that class and add annotation @Componenet and then you dont need
        // to write bean in xml file
        
        // here i have annotated @Component to Bike class
        
        // now you know that we have a component as annotation
        // but you need to tell the xml file that there are some annotation 
        // @Component so you need to add Component-Scan in xml file
        
        System.out.println("=====================");
        System.out.println("by annotation");
        Vehicle obj2  = (Vehicle) context.getBean("bike");
        obj2.drive();
        
        // here we mentioned bike as it is the default name associated is the class name in lowercase
        
        System.out.println("=====================");
        
        Tyre t = (Tyre) context.getBean("Tyre");
        System.out.println(t);
        
        // now if there is no property in xml bean of tyre to set brand then
        // it will show null. so you need to mention <property name="" values=""> tag
        // in xml file
        
        // whenever we use property tag that is we are using setter
        // the same thing can be done by constructor
        
        // now we will comment the property tag from xml file and add
        // <constructor-arg value=""> 
        // this is called as constructor injection
        
        System.out.println("=========================");
        System.out.println("Using autowired");
        System.out.println("by xml ->  getBean('Seat')");
        
        
        Seat s = (Seat) context.getBean("Seat");
        System.out.println(s);
        
        // by annotation we have used Bike class as component
        // so now we will use the same
        
        System.out.println("============================");
        System.out.println("Using autowired");
        System.out.println("by annotation -> getBean('bike')");
        
        Vehicle obj3  = (Vehicle) context.getBean("bike");
        obj3.drive();
        
        
        
    }
}
