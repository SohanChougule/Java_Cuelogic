/*
	A Composite Pattern says that just "allow clients to operate in 
	generic manner on objects that may or may not represent a hierarchy 
	of objects".

*/

public class CompositePatternDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Component hd = new Leaf(4000,"HDD");
		Component mouse = new Leaf(5000,"mouse");
		Component monitor = new Leaf(8000,"monitor");
		Component ram = new Leaf(3000,"ram");
		Component cpu = new Leaf(9000,"cpu");
		
		
		Composite ph = new Composite("Peripherals");
		Composite cabinet = new Composite("cabinet");
		Composite mb = new Composite("MB");
		Composite computer = new Composite("computer");
		
		mb.addComponent(cpu);
		mb.addComponent(ram);
		
		ph.addComponent(mouse);
		ph.addComponent(monitor);
		
		cabinet.addComponent(hd);
		cabinet.addComponent(mb);
		
		computer.addComponent(ph);
		computer.addComponent(cabinet);
		
		//========================
		// now if i print peripherals price i will get mouse and monitor price
		ph.showPrice();
		
		System.out.println("===========================================");
		
		// if i print the co puter it will print all the components in the 
		// hierarchy
		computer.showPrice();
		
	}

}
