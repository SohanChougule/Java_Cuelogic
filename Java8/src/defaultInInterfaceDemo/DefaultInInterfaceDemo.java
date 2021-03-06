package defaultInInterfaceDemo;

interface DefaultInterface{
	void add();
	default void printHi() {
		System.out.println("Hi !! from interface DefaultInterface method printHi()");
	}
	
	static void staticMethod() {
		System.out.println("Static Method from DefaultInterface");
	}
}

interface DefaultInterfaceTwo {
	void sub();
	default void printHi() {
		System.out.println("@@@  Hi !! from interface DefaultInterfaceTwo method printHi()");
	}
}


class SayHello implements DefaultInterface, DefaultInterfaceTwo{

	@Override
	public void add() {
		// TODO Auto-generated method stub
		System.out.println("Addition method from SayHello class");
	}
	
	public void sub() {
		// TODO Auto-generated method stub
		System.out.println("Subtraction method from SayHello class");
	}
	
	public void printHi() {
		System.out.println("###  Hi !! from class SayHello method printHi()");
	}
}

public class DefaultInInterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SayHello s = new SayHello();
		s.add();
		s.printHi();
		System.out.println("\n===================================");
		System.out.println("DefaultInterface.staticMethod();");
		DefaultInterface.staticMethod();
	}

}
