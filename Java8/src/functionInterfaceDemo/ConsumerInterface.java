package functionInterfaceDemo;

import java.util.*;
import java.util.function.Consumer;;

//class ConsImpl implements Consumer<Employee>{
//
//	@Override
//	public void accept(Employee t) {
//		// TODO Auto-generated method stub
//		t.sal = 50000;
//	}
//	
//}
//
//class Employee{
//	public int id;
//	public int sal;
//	
//}

public class ConsumerInterface {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> values = Arrays.asList(4,5,6,7,8,1,9);
		
//		List<Employee> emp = new ArrayList();
//		Employee e = new Employee();
//		e.id=1;
//		emp.add(e);
//		Employee e1 = new Employee();
//		e1.id=5;
//		emp.add(e1);
//		
//		Consumer<Employee> c = new ConsImpl();
//
//		emp.forEach(c);
//		System.out.println(e.id +" "+ e.sal);
//		
//		
		
		//		values.forEach(i -> System.out.println(i*i));		//lambda //consumer
//		System.out.println("\n=============================");
//		Consumer<Employee> c = new ConsImpl();
//		values.forEach(c);
//		System.out.println("\n=============================");
//		
//		
//		//same as above
//		Consumer<Integer> c1 = new Consumer<Integer>() {
//			public void accept(Integer t) {
//				// TODO Auto-generated method stub
//				System.out.println(t*t);
//			}
//		};
//		values.forEach(c1);
//		
//		System.out.println("\n=============================");
//		
//		//same as above
//		Consumer<Integer> c2 = (Integer i) -> {
//			System.out.println(i*i);
//		};
//		values.forEach(c2);
//		
//		System.out.println("\n=============================");
//		
//		//same as above
//		Consumer<Integer> c3 = (Integer i) -> System.out.println(i*i);
//		values.forEach(c3);
//		
//		System.out.println("\n=============================");
//		
//		//same as above
//		Consumer<Integer> c4 = i -> System.out.println(i*i);
//		values.forEach(c4);
//		
//		System.out.println("\n=============================");
//		
//		//same as above
//		//the one which we started with
//		values.forEach(i -> System.out.println(i*i));
//		
////		
////		The Consumer Interface is a part of the java.util.function package which has been introduced
////		since Java 8, to implement functional programming in Java. 
////		It represents a function which takes in one argument and produces a result. 
////		However these kind of functions don?t return any value.
////
////				Hence this functional interface which takes in one generic namely:-
////
////				T: denotes the type of the input argument to the operation
////		The lambda expression assigned to an object of Consumer type is used to define 
////		its accept() which eventually applies the given operation on its argument. 
////		Consumers are useful when it not needed to return any value as they are 
////		expected to operate via side-effects.
//		
//		
		System.out.println("\n=============================");
		// Consumer to display a number
        Consumer<Integer> display = a -> System.out.println(a);
  
        // Implement display using accept()
    //    display.accept(10);
  
        // Consumer to multiply 2 to every integer of a list
        Consumer<List<Integer> > modify = list ->
        {
            for (int i = 0; i < list.size(); i++)
                list.set(i, 2 * list.get(i));
        };
		
        // Consumer to display a list of numbers
        Consumer<List<Integer> > 
        dispList = list -> list.stream().forEach(a -> System.out.print(a + " "));
        
        List<Integer> list = new ArrayList<Integer>();
        list.add(2);
        list.add(1);
        list.add(3);
  
        // Implement modify using accept()
        modify.accept(list);
  
        // Implement dispList using accept()
        dispList.accept(list);
//	}
	}
}
