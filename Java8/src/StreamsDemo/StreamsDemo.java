package StreamsDemo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = new ArrayList<>();
		list.add(40);
		list.add(10);
		list.add(20);
		list.add(30);
		
		
		/*
		List<Integer> squarelist = new ArrayList<>();
		for(Integer i : list) {
			squarelist.add(i*i);
		}
		
		*/
		List<Integer> squarelist = list.stream().map(x -> x*x).collect(Collectors.toList());
		
		System.out.println("List of squared numbers : " + squarelist);
		 
	}

}
