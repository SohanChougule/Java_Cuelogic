class Abc{
//	public static Abc obj = new Abc();  //eager loading 
	public static Abc obj;
	int i;
	private Abc() {
		System.out.println("instance created");
	}
	
	public static Abc getInstance(){
		
		if(obj==null)
		{
		//	obj = new Abc();
			// but what if there are multiple threads and enter here at same time
			// we can use synchronized method
			
			
			//but what if this method has a lot of data to handle so execution time
			//will also increase
			
			// so instaed of synchronizing the method use synchronized block
			
			synchronized (Abc.class) {
				if(obj==null)
					obj = new Abc();
				
			}
		}
		return obj;
	}
}

public class SingletonDemo {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Abc o = Abc.getInstance();
		o.i = 50;
		
		Abc p = Abc.getInstance();
		p.i = 60;
		
		
		System.out.println("value of i with o obj = " + o.i);
		System.out.println("value of i with p obj = " + p.i);
		
		
	}

}
