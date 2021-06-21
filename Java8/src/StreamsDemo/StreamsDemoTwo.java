package StreamsDemo;

import java.util.*;
import java.util.stream.Collectors;

/*
 * converting list to set and values of set is squared like previous program
 */


public class StreamsDemoTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = new ArrayList<>();
		list.add(30);
		list.add(40);
		list.add(10);
		list.add(20);
		
		
		System.out.println("List of numbers : " + list);
		
		/*
		Set<Integer> squareSet = new HashSet<>();
		for(Integer i : list) {
			squareSet.add(i*i);
		}
		*/
		
		Set<Integer> squareSet = list.stream().map(x -> x*x).collect(Collectors.toSet());
		
		
		System.out.println("Hash Set of squared numbers : " + squareSet);
		
	}

}
