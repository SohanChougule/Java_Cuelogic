package inheritanceDemo;

class Bicycle{
	protected int gear;
	protected int speed;
	
	public Bicycle(int gear, int speed) {
		this.gear = gear;
		this.speed = speed;
	}

	public void setGear(int gear) {
		this.gear = gear;
	}

	public void applyBrake(int decrement) {
		speed = speed - decrement;
	}

	public void speedUp(int increment) {
		speed = speed + increment;
	}
	
	
	
}