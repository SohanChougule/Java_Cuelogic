package fileHandlingDemo;

import java.io.FileOutputStream;

public class fileOutputStreamDemo {

	 public static void main(String args[]){    
         
		 try{    
	           FileOutputStream fout=new FileOutputStream("F://javaCue/IOExample/testout.txt");    
	           fout.write(65);
	           
	           
	           String s=" Welcome Sohan.";    
	           byte b[]=s.getBytes();//converting string into byte array 
	           fout.write(b);
	           
	           
	           fout.close();    
	           System.out.println("success...");    
          }catch(Exception e){System.out.println(e);}    
    }    
}
