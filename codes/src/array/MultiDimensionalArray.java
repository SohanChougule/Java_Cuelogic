package array;

public class MultiDimensionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][][] = { 
							{
								{2, 6, 4} , {1, 8, 4} , {11, 55, 77} 
							},
							{
								{1, 3, 5} , {3, 6, 9} , {47, 5, 32} 
							},
							{
								{28, 56, 74} , {41, 78, 14} , {1, 45, 27} 
							}
					  };
		
		for(int i =0 ; i<3;i++) {
			for(int j =0; j<3; j++) {
				for(int k =0; k<3; k++) {
					System.out.print(arr[i][j][k] + " ");
				}
				System.out.println();
			}
			System.out.println();
		}
		System.out.println();
		
		
	}

}
