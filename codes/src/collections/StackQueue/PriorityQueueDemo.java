package collections.StackQueue;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueDemo {
	public static void main(String[] args) {
		Queue<String> q = new PriorityQueue<>();
		
		q.add("USA");
		q.add("France");
		q.add("Europe");
		q.add("India");
		
		System.out.println("Original queue = " + q);
		
		String removedEle = q.remove(); //throws exception if queue is empty
		System.out.println("queue after removing element q.remove() = " + removedEle);
		System.out.println("Original queue = " + q);
		
		String head = q.peek();
		System.out.println("element q.peek() = " + head);
		System.out.println("Original queue = " + q);
		
		head = q.poll(); //returns null if queue is empty
		System.out.println("element q.poll() = " + head);
		System.out.println("Original queue = " + q);
		
		
		
	}
}
