package array;

public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int a[]; declares array
		//new int[3]; allocates memory for 3 integers which are continous in memory
		int a[] = new int[3];
		//here a[0] a[1] a[2] are initialised with 0 as value
		for(int i =0 ; i<3 ; i++) {
			System.out.print(a[i] + " ");
		}
		a[0] = 5;
		a[1] = 78;
		a[2] = 64;
		
		System.out.println("\nArray after values added");
		
		System.out.println("Element at a[1] index 1 = " + a[1]);
		
		for(int i =0 ; i<3 ; i++) {
			System.out.print(a[i] + " ");
		}
	}

}
