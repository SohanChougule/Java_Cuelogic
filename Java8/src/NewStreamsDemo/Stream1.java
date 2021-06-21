package NewStreamsDemo;

import java.util.*;

public class Stream1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> values = new ArrayList<>();
		for (int i = 3; i <= 100; i++) {
			values.add(i*i);
		}
//		values.forEach(System.out::println);	//iterating over arraylist
		
//		values.stream().forEach(System.out::println); 	//iterating by converting arraylist to stream
		
//		values.parallelStream().forEach(System.out::println); 		//iterating by converting arraylist to parallel stream
		
//		values.parallelStream().filter(i->{      //this will not print anything
//			System.out.println("Hi");			// as stream is lazy
//			return true;						// it is an intermediate operation
//		});
		
		
//		Stream findFirst() returns an Optional (a container object which may or may not contain a non-null value)
//		describing the first element of this stream,
//		or an empty Optional if the stream is empty. 
//		If the stream has no encounter order, then any element may be returned.
//		
		
		System.out.println(values.stream().filter(i-> {
			System.out.println("FindFirst()");
			return true;
		}).findFirst());
		
		
//		Stream findAny() returns an Optional (a container object which may or may not contain a non-null value)
//		describing some element of the stream,
//		or an empty Optional if the stream is empty.
//		
		
		System.out.println(values.stream().filter(i-> {
			System.out.println("FindAny()");
			return true;
		}).findAny());
		
		
		System.out.println("\n======================");
		List<String> list = Arrays.asList("Geeks", "for",
                "GeeksQuiz", "GFG");

		// Using Stream findAny() to return
		// an Optional describing some element
		// of the stream
		Optional<String> answer = list.stream().findAny();
		
		// if the stream is empty, an empty
		// Optional is returned.
		if (answer.isPresent()) {
		System.out.println(answer.get());
		}
		else {
		System.out.println("no value");
		}
		
		
		
		
	}

}
