package fileHandlingDemo;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataOutputStreamDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		 	FileOutputStream file = new FileOutputStream("F://javaCue/IOExample/testoutdata.txt");  
	        DataOutputStream data = new DataOutputStream(file);  
	        data.writeInt(65);  
	        data.flush();  
	        data.close();  
	        System.out.println("Succcess..."); 
	}

}
