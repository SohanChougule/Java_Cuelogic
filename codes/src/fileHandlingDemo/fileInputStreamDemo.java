package fileHandlingDemo;

import java.io.FileInputStream;

public class fileInputStreamDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try{    
            FileInputStream fin=new FileInputStream("F://javaCue/IOExample/testout.txt");    
            int i=fin.read();  
            System.out.print((char)i);    
            
            
            int j =0;    
            while((j=fin.read())!=-1){    
             System.out.print((char)j);    
            }    
  
            fin.close();    
          }catch(Exception e){System.out.println(e);} 
	}

}
