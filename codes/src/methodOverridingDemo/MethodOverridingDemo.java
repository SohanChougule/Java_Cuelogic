package methodOverridingDemo;

class A {
	public int multiply(int x, int y) {
		System.out.println("\nParent Class Called");
		return x * y;
	}
}

class B extends A{
	public int multiply(int x, int y) {
		System.out.println("\nChild Class Called");
		return x * y * 5;
	}
}

public class MethodOverridingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B b = new B();
		System.out.println("B b = new B(); b.multiply(2, 3) = " + b.multiply(2, 3) );
		A a = new B();
		System.out.println("A a = new B(); a.multiply(2, 3) = " + a.multiply(2, 3));
		System.out.println("Hides parent class");
		A a1 = new A();
		System.out.println("A a1 = new A(); a1.multiply(2, 3) = " + a1.multiply(2, 3));
		
		System.out.println("\nB b1 = new A(); is not possible");
		
	}

}
