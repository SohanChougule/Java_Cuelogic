package interfaceDemo;

interface Shape {
	
	double area();
	double volume();
	
}

class Cuboid implements Shape {
	
	int length;
	
	public Cuboid(int length) {
		this.length = length;
		// TODO Auto-generated constructor stub
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return length * length;
	}

	@Override
	public double volume() {
		// TODO Auto-generated method stub
		return length * length* length;
	}
	
}

class Cube implements Shape {
	
	int length,height,width;
	
	public Cube(int length, int width,int height) {
		this.length = length;
		this.width = width;
		this.height = height;
		// TODO Auto-generated constructor stub
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return length * width;
	}

	@Override
	public double volume() {
		// TODO Auto-generated method stub
		return length * width* height;
	}
	
}

class Cylinder implements Shape {
	
	public static final double PI = 3.142;
	int length,height;
	
	public Cylinder(int length, int height) {
		this.length = length;
		this.height = height;
		// TODO Auto-generated constructor stub
	}

	@Override
	public	double area() {
		// TODO Auto-generated method stub
		return PI * length * length;
	}

	@Override
	public double volume() {
		// TODO Auto-generated method stub
		return PI * length * length * height;
	}
	
}


public class ShapeClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Shape c = new Cube(10,20,6);
		System.out.println("Cube");
		System.out.println("Area = " + c.area());
		System.out.println("Volume = " + c.volume());
		System.out.println();
		
		Shape c1 = new Cuboid(8);
		System.out.println("Cuboid");
		System.out.println("Area = " + c1.area());
		System.out.println("Volume = " + c1.volume());
		System.out.println();
		
		Shape c2 = new Cylinder(10,20);
		System.out.println("Cylinder");
		System.out.println("Area = " + c2.area());
		System.out.println("Volume = " + c2.volume());
		System.out.println();
		

	}

}
