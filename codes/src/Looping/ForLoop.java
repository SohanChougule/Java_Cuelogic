package Looping;

public class ForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 1;
		
		for(int i = 0 ; i< 10; i++) {
			System.out.println(a);
			a++;
		}
		
		System.out.println("Outside of loop  = " + a);
		
		for(int i = 10 ; i >0; i--) {
			a--;
			System.out.println(a);
			
		}
		
		
	}

}
