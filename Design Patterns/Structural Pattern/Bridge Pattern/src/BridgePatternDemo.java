/*	A Bridge Pattern says that just "decouple the functional abstraction 
 * from the implementation so that the two can vary independently".*/

public class BridgePatternDemo {
	public static void main(String[] args) {
	      Shape redCircle = new Circle(100,100, 10, new RedCircle());
	      Shape greenCircle = new Circle(100,100, 10, new GreenCircle());

	      redCircle.draw();
	      greenCircle.draw();
	   }
}
