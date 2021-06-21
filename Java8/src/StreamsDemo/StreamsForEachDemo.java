package StreamsDemo;

import java.util.*;
import java.util.stream.*;

public class StreamsForEachDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<>();
		
		list.add("scala");
		list.add("java");
		list.add("python");
		list.add("basic");
		System.out.println("List of numbers : " + list);
		
		/*
		List<String> filter = new ArrayList<>();
		for(String s : list) {
			if(s.startsWith("p")) {
				filter.add(s);
			}
		}
		*/
		
		List<String> sortedresult = list.stream().sorted().collect(Collectors.toList());
		System.out.println("sorted list : " + sortedresult);
		
		//using streams().forEach()
		System.out.println("using streams().forEach()");
		list.stream().forEach(y -> System.out.println("element is : " + y));
		
	}

}
