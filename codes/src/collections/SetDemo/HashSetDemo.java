package collections.SetDemo;

import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> h = new HashSet<String>();
		
		h.add("A");
		h.add("B");
		boolean r1 = h.add("C");
		boolean r2 = h.add("C");
		
		System.out.println(h);
		
		if(r1) {
			System.out.println("r1 is added");
		}
		if(r2) {
			System.out.println("r2 is added");
		}
		
		System.out.println("hashset contains C or not h.contains(\"C\") " + h.contains("C") );
		
		h.remove("A");
		System.out.println("After removing A = "+ h);
		
		for(String a : h) {
			System.out.print(a + " ");
		}
	}

}
