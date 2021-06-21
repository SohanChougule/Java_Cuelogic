package collections.StackQueue;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// stack is not a type of list
		// it extends list so we can say it is a type of list
		
		Stack <String> s = new Stack<String>();
		
		s.push("USA");
		s.push("France");
		s.push("India");
		s.push("Europe");
		
		System.out.println("stack = " + s);
		
		String poppedElement = s.pop();
		
		System.out.println("poppedElement s.pop() = " + poppedElement);
		System.out.println("stack = " + s);
		
		String peekElement = s.peek();
		
		System.out.println("peekElement s.peek() = " + peekElement);
		System.out.println("stack = " + s);
		
		
	}
}
