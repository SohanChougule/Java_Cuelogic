package functionInterfaceDemo;

import java.util.function.Predicate;

public class PredicateInterfaceDemo {

	static Boolean checkAge(int age){  
        if(age>17)  
            return true;  
        else return false;  
    }
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		It is a functional interface which represents a predicate (boolean-valued function)
//		of one argument.It is defined in the java.util.function package and 
//		contains test() a functional method.
//		
		 Predicate<Integer> pr = a -> (a > 18); // Creating predicate  
	     System.out.println(pr.test(10));    // Calling Predicate method
	     
	     Predicate<Integer> predicate =  PredicateInterfaceDemo::checkAge;  
	        // Calling Predicate method  
	        boolean result = predicate.test(25);  
	        System.out.println(result); 
	     
	}

}
