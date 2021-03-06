package stringClassNewFeatures;

import java.util.List;
import java.util.stream.Collectors;

public class NewMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		isBlank(): This method returns true 
//		if the string is empty or contains only white spaces code points.

		System.out.println("isBlank()\n");
		
		System.out.println("s=\"abc\"");
		String s = "abc";
		System.out.println("s is blank = "+s.isBlank());
		System.out.println("s is empty = "+s.isEmpty());
		
		s = "";
		System.out.println("s=\"\"");
		System.out.println("s is blank = "+s.isBlank());
		System.out.println("s is empty = "+s.isEmpty());
		
		s = " ";
		System.out.println("s=\" \"");
		System.out.println("s is blank = "+s.isBlank());
		System.out.println("s is empty = "+s.isEmpty());
		
		s = "\t";
		System.out.println("s=\"\t\"");
		System.out.println("s is blank = "+s.isBlank());
		System.out.println("s is empty = "+s.isEmpty());
		
//		lines(): This method returns a stream of lines extracted from 
//		the string, separated by line terminators such as \n, \r etc.
		
		System.out.println("\nlines()\n");
		
		String s1 = "Hi\nHello\rWassup";
		System.out.println(s1);
		List lines = s1.lines().collect(Collectors.toList());
		System.out.println(lines); 

		
//		strip(), stripLeading(), stripTrailing(): These methods are used
//		to strip whitespaces from the string. As the name suggests, 
//		strip()	will remove leading and trailing whitespaces. However, 
//		stripLeading() will remove only leading whitespaces and 
//		stripTrailing() will remove only trailing whitespaces.
		
		System.out.println("\nstrip() , stripLeading() , stripTrailing()\n");

		String s2 = "  Hello,  \tWorld\t ";
		System.out.println("#" + s2 + "#");
		System.out.println("#" + s2.strip() + "#");
		System.out.println("#" + s2.stripLeading() + "#");
		System.out.println("#" + s2.stripTrailing() + "#");

		
//		repeat(int n): This method returns a new string whose value is 
//		the concatenation of this string repeated ?n? times
		
		System.out.println("\nrepeat(int n)\n");

		String s3 = "Hello\n";
		System.out.println(s3.repeat(3));
		s3 = "Do";
		System.out.println(s3.repeat(2));

	}

}
