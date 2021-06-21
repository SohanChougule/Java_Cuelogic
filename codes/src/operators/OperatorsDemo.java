package operators;

public class OperatorsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Arithmetic operators");
		int result = 1 + 2;
		//result =3
		System.out.println("1 + 2 = " + result);
		int original_result = result;
		result = result - 1;
		//result = 2
		System.out.println(original_result + " - 1 = " + result);
		original_result = result;
		
		result = result * 5;
		//10
		System.out.println(original_result + " * 5 = " + result);
		original_result = result;
		
		result = result / 2;
		//5
		System.out.println(original_result + " / 2 = " + result);
		original_result = result;
		
		result = result % 2;
		//1
		System.out.println(original_result + " % 2 = " + result);
		original_result = result;
		
	}

}
