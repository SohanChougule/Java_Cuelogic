package inheritanceDemo;

public class InheritanceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MountainBicycle m = new MountainBicycle(10,20,30);
		System.out.println("Gear is : " + m.gear);
		System.out.println("Seat height is : " + m.seatHeight);
		System.out.println("Bike speed is : " + m.speed);
		
		m.applyBrake(5);
		System.out.println("applied brake now speed is : "+m.speed);
		
	}

}
