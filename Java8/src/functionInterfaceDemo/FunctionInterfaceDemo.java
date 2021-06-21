package functionInterfaceDemo;

import java.util.function.Function;

import java.util.Scanner;

public class FunctionInterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Function<String,Integer> f = (String x) -> {
			return x.length();
		};
		
		System.out.print("Enter some string value : ");
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		
		int lengthOfString = f.apply(s);
		System.out.println("The length of the string is : " + lengthOfString);
		
		//function interface is used by map() in streams
	}

}
