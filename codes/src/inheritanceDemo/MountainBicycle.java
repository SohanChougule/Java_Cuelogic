package inheritanceDemo;


public class MountainBicycle extends Bicycle {
	public int seatHeight;
	public MountainBicycle(int seatHeight,int gear, int speed) {
		super(gear, speed);
		this.seatHeight = seatHeight;
	}
	public int getSeatHeight() {
		return seatHeight;
	}
	public void setHeight(int seatHeight) {
		this.seatHeight = seatHeight;
	}
	
}
