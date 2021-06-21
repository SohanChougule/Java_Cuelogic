package abstractDemo;

abstract class Shape {
	public int height;
	public int width;
	public int length;
	
	abstract double area();
	abstract double volume();
	
}

class Cuboid extends Shape {
	
	public Cuboid(int length) {
		super.length = length;
		// TODO Auto-generated constructor stub
	}

	@Override
	double area() {
		// TODO Auto-generated method stub
		return length * length;
	}

	@Override
	double volume() {
		// TODO Auto-generated method stub
		return length * length* length;
	}
	
}

class Cube extends Shape {
	
	public Cube(int length, int width,int height) {
		super.length = length;
		super.width = width;
		super.height = height;
		// TODO Auto-generated constructor stub
	}

	@Override
	double area() {
		// TODO Auto-generated method stub
		return length * width;
	}

	@Override
	double volume() {
		// TODO Auto-generated method stub
		return length * width* height;
	}
	
}

class Cylinder extends Shape {
	
	public static final double PI = 3.142;
	
	public Cylinder(int length, int height) {
		super.length = length;
		super.height = height;
		// TODO Auto-generated constructor stub
	}

	@Override
	double area() {
		// TODO Auto-generated method stub
		return PI * length * length;
	}

	@Override
	double volume() {
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
