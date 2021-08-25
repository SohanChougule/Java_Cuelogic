
public class MediatorPatternDemo {
	 public static void main(String[] args) {
		 ApnaChatRoom chat = new ApnaChatRoomImpl();  
	      
         User1 u1=new User1(chat);  
         u1.setname("Rohan");  
         u1.sendMsg("Hi Rohan! how are you?");  
       
               
         User2 u2=new User2(chat);  
         u2.setname("Sohan");  
         u2.sendMsg("I am Fine ! You tell?"); 
	}
}
