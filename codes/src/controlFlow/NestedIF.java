package controlFlow;

public class NestedIF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 50;
		if (a < 75){
			System.out.println("a is samller than 75");
			if(a<60) {
				System.out.println("a is also smaller than 60");
				if(a<55) {
					System.out.println("a is also smaller than 55");
				}
			}
		}
	}

}
