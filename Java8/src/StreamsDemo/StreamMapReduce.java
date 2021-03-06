package StreamsDemo;

import java.util.*;
import java.util.function.*;
import java.util.stream.Stream;

public class StreamMapReduce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> values = Arrays.asList(1,2,3,4,5);
		
		Function<Integer,Integer> f = new Function<Integer,Integer>()
		{
			public Integer apply(Integer i) {
				return i*2;
			}
		};
		
		BinaryOperator<Integer> b = new BinaryOperator<Integer>() {
			
			int result = 0;
			@Override
			public Integer apply(Integer t, Integer u) {
				// TODO Auto-generated method stub
				return t + u;
			}
		};
		
		Stream s = values.stream();
//		
//		Stream s1 = s.map(f);
//		
//		Integer result = (Integer)s1.reduce(0,b);
//		
//		System.out.println(result);
//		
		
		/////////////////////////////////////////////////////////////////

//		Integer r1 = (Integer)s.map(new Function<Integer,Integer>()
//		{
//			public Integer apply(Integer i) {
//				return i*2;
//			}
//		}).reduce(0,new BinaryOperator<Integer>() {
//			
//			int result = 0;
//			@Override
//			public Integer apply(Integer t, Integer u) {
//				// TODO Auto-generated method stub
//				return t + u;
//			}
//		}); 
//		
//		System.out.println(r1);
		
		/////////////////////////////////////////////////////////////////////
		
		Integer r2 = values.stream().map(i -> i*2).reduce(1,(c,e) -> c*e);
		System.out.println(r2);
 	}

}
