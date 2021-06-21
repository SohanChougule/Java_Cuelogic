package array;

public class TwoDiamensionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][] = { {2, 6, 4} , {1, 8, 4} , {11, 55, 77} };
		
		for(int i =0 ; i<3;i++) {
			for(int j =0; j<3; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
		
		for(int i =0 ; i<3;i++) {
			for(int j =0; j<3; j++) {
				System.out.println("arr[" + i + "][" + j + "] = " + arr[i][j]);
			}
		}

	}
}