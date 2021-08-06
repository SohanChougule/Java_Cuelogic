package com.example.Mockito01;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;  
import static org.mockito.Mockito.when; 


import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class ToDoBusinessStub {
	@Test  
    public void test() {  
          
//        ToDoService doServiceStub = new ToDoServiceStub();   
//              
//        ToDoBusiness business = new ToDoBusiness(doServiceStub);  
//      
//        List<String> retrievedtodos = business.getTodosforSpring(" Dummy ");  
//          
//        assertEquals(2, retrievedtodos.size());  
//       System.out.println(" Stub is working correctly...!!");  
    
	
		ToDoService doService = mock(ToDoService.class);  
        
        List<String> combinedlist = Arrays.asList(" Use Core Java ", " Use Spring Core ", " Use w3eHibernate ", " Use Spring MVC ");  
        
        when(doService.getTodos("dummy")).thenReturn(combinedlist);  
          
        ToDoBusiness business = new ToDoBusiness(doService);  
      
        List<String> alltd = business.getTodosforHibernate("dummy");   
          
        System.out.println(alltd);  
        assertEquals(1, alltd.size());   
        
	
	
	
	}  
}
