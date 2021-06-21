package operators;

public class BitwiseOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Initial Values
		int a = 5;	//bitwise 101
		int b = 7;  //bitwise 111
		
		// bitwise  101 & 111 = 101
		System.out.println("a & b = " + (a&b));
		
		// bitwise  101 | 111 = 111
		System.out.println("a | b = " + (a|b));
				
		a = a<<1; //101 << 1 = 1010 = 10
		System.out.println("a = a<<1 = "+ a);
		
		a = a>>1; //1010 >> 1 = 101 = 5
		System.out.println("a = a>>1 = "+ a);
		
		b = b>>1; //111 >> 1 = 11 = 3
		System.out.println("b = b>>1 = " + b);
		
		b = b<<1; //11 << 1 = 110 = 7
		System.out.println("b = b<<1 = " + b);
		
		
	}

}
