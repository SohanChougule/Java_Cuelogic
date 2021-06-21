package methodOverloading;

class MethodOverloadingDemo{
	
	public int multiply(int x, int y) {
		return x * y;
	}
	
	public int multiply(int x, int y, int z) {
		return x * y * z;
	}
	
	public double multiply(double x, double y) {
		return x * y;
	}
}


public class MethodOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverloadingDemo m = new MethodOverloadingDemo();
		System.out.println(m.multiply(5, 6));
		System.out.println();
		System.out.println(m.multiply(5, 6, 7));
		System.out.println();
		System.out.println(m.multiply(5.5, 6.6));
		
	}

}
