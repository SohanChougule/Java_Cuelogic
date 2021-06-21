package functionInterfaceDemo;

import java.util.function.Supplier;

public class SupplierInterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		The Supplier Interface is a part of the java.util.function package 
//		which has been introduced since Java 8, to implement functional 
//		programming in Java. It represents a function which does not take in 
//		any argument but produces a value of type T.
//		The Supplier interface consists of only one function:
//			1. get()
		
		
		// This function returns a random value.
        Supplier<Double> randomValue = () -> Math.random();
  
        // Print the random value using get()
        System.out.println(randomValue.get());
		
	}

}
