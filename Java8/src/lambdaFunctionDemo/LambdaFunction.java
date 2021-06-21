package lambdaFunctionDemo;

interface Actor{
	void act();
}

interface Sayable{
	public String say();
}

interface Sayable1{
	public String say(String name);
}

interface Addable{  
    int add(int a,int b);  
}  

public class LambdaFunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String act = "Comedy";
		
		//Without Lambda function
		Actor a = new Actor() {
			public void act() {
				System.out.println("Performing "+act);
			}
		};
		
		a.act();
		System.out.println("\n===================\n");
		
		//With Lambda Function
		System.out.println("With Lambda Function");
		
		Actor a1 = ()->{
			System.out.println("Performing "+act);
		};
		a1.act();
		
		System.out.println("\n===================\n");
		
		//return from lambda no parameter
		Sayable s = ()->{
			return "Saying Hello";
		};
		
		System.out.println(s.say());
		
		System.out.println("\n===================\n");
		
		// Lambda expression with single parameter.  
        Sayable1 s1=(name)->{  
            return "Hello, "+name;  
        };  
        System.out.println(s1.say("Sohan"));  
          
        // You can omit function parentheses    
        Sayable1 s2= name ->{  
            return "Hello, "+name;  
        };  
        System.out.println(s2.say("Sohan"));  
		
        System.out.println("\n===================\n");
        
        Addable ad1=(ab,b)->(ab+b);
        
        System.out.println(ad1.add(10,20));  
          
        // Lambda expression with return keyword.    
        Addable ad2=(int ab,int bc)->{  
                            return (ab+bc);   
                            };  
        System.out.println(ad2.add(100,200));  
        
	}

}
