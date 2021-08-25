import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
	A Strategy Pattern says that "defines a family of functionality, encapsulate each one, 
	and make them interchangeable".

*/
public class StrategyPatternDemo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));  
        System.out.print("Enter the first value: ");  
        float value1=Float.parseFloat(br.readLine());  
        System.out.print("Enter the second value: ");  
        float value2=Float.parseFloat(br.readLine());  
        
        Context context = new Context(new Addition());          
        System.out.println("Addition = " + context.executeStrategy(value1, value2));  

        context = new Context(new Subtraction());       
        System.out.println("Subtraction = " + context.executeStrategy(value1, value2));  

        context = new Context(new Multiplication());        
        System.out.println("Multiplication = " + context.executeStrategy(value1, value2)); 
	}

}
