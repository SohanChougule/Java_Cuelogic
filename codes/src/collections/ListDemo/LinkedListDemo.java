package collections.ListDemo;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> list = new LinkedList<String>();
		
		System.out.println("adding A and B");
		list.add("A");
		list.add("B");
		System.out.println(list);
		
		System.out.println("adding C at index 1");
		list.add(1,"C");
		System.out.println(list);
		
		System.out.println("adding D at first position");
		list.addFirst("D"); //addFirst() and addLast() are present in LinkedList class and not in List interface
		System.out.println(list);
		
		System.out.println("adding E at last position");
		list.addLast("E");
		System.out.println(list);
		
		System.out.println("removing B");
		list.remove("B");
		System.out.println(list);
		
		System.out.println("removing element from index 3");
		list.remove(3);
		System.out.println(list);
		
		System.out.println("removing first element");
		list.removeFirst();
		System.out.println(list);
		
		System.out.println("removing last element");
		list.removeLast();
		System.out.println(list);
		
		
	}

}
