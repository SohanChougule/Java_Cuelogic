
public class ObserverPatternDemo {
	
	public static void main(String[] args) {
		
		Channel javaProgramming = new Channel();
		
		Subscriber s1 = new Subscriber("Sohan");
		Subscriber s2 = new Subscriber("Rohan");
		Subscriber s3 = new Subscriber("Mohan");
		Subscriber s4 = new Subscriber("Yohan");
		
		javaProgramming.subscribe(s1);
		javaProgramming.subscribe(s2);
		javaProgramming.subscribe(s3);
		javaProgramming.subscribe(s4);
		
		s1.SubscribeChannel(javaProgramming);
		s2.SubscribeChannel(javaProgramming);
		s3.SubscribeChannel(javaProgramming);
		s4.SubscribeChannel(javaProgramming);
		
		javaProgramming.upload("Learn design Patterns");
		
	}
}
