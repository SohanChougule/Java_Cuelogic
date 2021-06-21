package codes;

public class NonPrimitiveDataTypeArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Sohan";
		System.out.println("String str = " + str);
		
		String str1 = new String("Chougule");
		System.out.println("String using 'new' str1 = " + str1);
		
		int arr[];
		arr = new int[3];
		arr[0] = 1;
		arr[1] = 55;
		arr[2] = 23;
		
		System.out.println("arr = " + arr);
		System.out.println("arr[2] = " + arr[2]);

	}

}
