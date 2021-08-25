
/*	Builder Pattern says that "construct a complex object from simple objects
 *  using step-by-step approach"
*/

public class BuilderExample {
	public static void main(String[] args) {
		Phone p = new PhoneBuilder().setBattery(5000).setOs("Android").setCamera(32).getPhone();
		
		System.out.println(p);
	}
}
