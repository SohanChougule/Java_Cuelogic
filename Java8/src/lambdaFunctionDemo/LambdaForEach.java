package lambdaFunctionDemo;

import java.util.*;

public class LambdaForEach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 	List<String> list=new ArrayList<String>();  
	        list.add("sohan");  
	        list.add("mohan");  
	        list.add("rohan");  
	        list.add("jai");  
	          
	        list.forEach(  
	            (n)->System.out.println(n)  
	        );
	}

}
