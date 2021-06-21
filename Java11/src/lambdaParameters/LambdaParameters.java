package lambdaParameters;

import java.util.Arrays;

public class LambdaParameters {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//without local variable
		var arrInteger = new Integer[]{5, 9, 3, 6, 2, 4, 8, 7, 1};
        long cnt = Arrays.stream(arrInteger).filter(
                x -> (x != null && x > 5)).count();
        System.out.println(cnt);
        System.out.println("=================");
        
        //with local variable
        var arrInteger1 = new Integer[]{5, 9, 3, 6, 2, 4, 8, 7, 1};
        long cnt1 = Arrays.stream(arrInteger1).filter(
                (var a) -> (a != null && a > 5)).count();
        System.out.println(cnt1);
	}

}
