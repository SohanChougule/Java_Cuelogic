package codes;


class InDemo{
	
	void talk() {
	    System.out.println("talk from Indemo parent class");
	}
}

class sub extends InDemo{
	void talk() {
		super.talk();
		System.out.println("talk from sub class");
	}
}


public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		InDemo obj = new InDemo();
		System.out.println("calling talk as InDemo obj = new InDemo(5); obj.talk()");
		obj.talk();
		sub s = new sub();
		System.out.println("calling talk as sub s = new sub(); s.talk()");
		s.talk();
		InDemo o = new sub();
		System.out.println("calling talk as InDemo o = new sub(); o.talk()");
		o.talk();
		
		
		
	}

}
