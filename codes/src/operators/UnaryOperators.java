package operators;

public class UnaryOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Unary operators");
		int result = +1;
		//result = 1
		System.out.println("result = +1 = " + result);
		
		result--;
		//0
		System.out.println("result-- = " + result);
		
		result++;
		//1
		System.out.println("result++ = " + result);
		
		result = -1;
		//result = -1
		System.out.println("result = -1 = " + result);
		
		System.out.println("\nPre-Post Demo");
		int i = 3;
		i++;
		// i = 4
		System.out.println(i);
		++i;
		// i = 5
		System.out.println(i);
		
		//prints 6 when used in print
		System.out.println(++i);
		
		//prints 6 and then adds 1
		System.out.println(i++);
		
		//now value is 
		System.out.println(i);
		
	}

}
