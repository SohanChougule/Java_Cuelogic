package collections.ListDemo;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayList1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list;
		list = new ArrayList<String>();
		list.add("Sohan");
		list.add("Rohan");
		list.add("Mohan");
		list.add("John");
		list.add("Joe");
		list.add("Chandler");
		list.add("Ross");
		System.out.println(list);
		System.out.println(list.get(5));
		
		System.out.println("===Iterating Using for loop===");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println("==============================");
		
		System.out.println("===Iterating Using for each loop===");
		for (String string : list) {
			System.out.println(string);
		}
		System.out.println("==============================");
		
		System.out.println("===Iterating Using Iterator===");
		Iterator<String> itr = list.iterator();
		while(itr.hasNext()) {
			String str = itr.next();
			System.out.println(str);
		}
		System.out.println("==============================");
		
	}

}

