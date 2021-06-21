package collections.ListDemo;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = new ArrayList<Integer>(5);
		
		//Adding list elements
		for(int i = 0; i<5;i++) {
			list.add(i);
		}

		//printing list
		System.out.println(list);
		
		//remove element at 3
		int a = list.remove(3);
		//removing element = 
		System.out.println("removing element = " + a + " from index 3");
		
		//printing elements one by one
		//accessing the elements is easier by get(index) method
		for(int i = 0; i<list.size();i++) {
			System.out.println(list.get(i));
		}

		System.out.println("Using for each loop");
		for(int i : list) {
			System.out.print(i + " ");
		}

				
				
	}

}
