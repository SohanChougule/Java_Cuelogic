package fileHandlingDemo;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;


public class BufferedOutputStreamDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 FileOutputStream fout;
		try {
			fout = new FileOutputStream("F://javaCue/IOExample/testoutbuff.txt");
			BufferedOutputStream bout=new BufferedOutputStream(fout);    
		     String s="Welcome Sohan.";    
		     byte b[]=s.getBytes();    
		     
		     bout.write(b);    
		     bout.flush();    
		     bout.close();    
		     fout.close();    
		     System.out.println("success");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}    
	        
	}

}
