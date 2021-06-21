package classes;

class Cuboid{
	int width, height, depth;
	
	Cuboid(){
		width = 10;
		height = 20;
		depth = 30;
	}
	
	Cuboid(int dimension){
		width = dimension;
		height = dimension;
		depth = dimension;
	}
	
	Cuboid(int width, int height) {
		this.width = width;
		this.height = height;
		this.depth = height;
	}
	
	Cuboid(int width, int height, int depth) {
		this.width = width;
		this.height = height;
		this.depth = 10;
	}
	
	void volume() {
		double volume = width * height * depth;
		System.out.println("Volume = " + volume); 
	}
	
}

public class ConstuctorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cuboid c = new Cuboid();
		c.volume();
		Cuboid d = new Cuboid(7);
		d.volume();
		Cuboid e = new Cuboid(6,7);
		e.volume();
		Cuboid f = new Cuboid(5,6,4);
		f.volume();
	}

}
