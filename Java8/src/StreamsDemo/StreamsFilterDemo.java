package StreamsDemo;

import java.util.*;
import java.util.stream.*;

public class StreamsFilterDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<>();
		list.add("java");
		list.add("python");
		list.add("scala");
		list.add("Programming concepts");
		list.add("cpp");
		System.out.println("List of numbers : " + list);
		
		/*
		List<String> filter = new ArrayList<>();
		for(String s : list) {
			if(s.startsWith("p")) {
				filter.add(s);
			}
		}
		*/
		
		List<String> filterresult = list.stream().filter(s->s.startsWith("p") || s.startsWith("P")).collect(Collectors.toList());
		System.out.println("filter list : " + filterresult);
		
	}

}
