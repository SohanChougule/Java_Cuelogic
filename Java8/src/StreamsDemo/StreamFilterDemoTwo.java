package StreamsDemo;

import java.util.*;

public class StreamFilterDemoTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> values = new ArrayList<Integer>();
		for (int i = 1; i <= 10; i++) {
			values.add(i*i);
		}
		
		System.out.println(values);
		
		System.out.println("\n=======================================");
		
		System.out.println(values.stream().filter(i->{System.out.println("hi");return true;}).findAny());
		
		System.out.println(values);
		
		System.out.println("\n=======================================");
		
		

	}

}
