import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/*
	Prototype Pattern says that cloning of an existing object instead of
	creating new one and can also be customized as per the requirement.

*/

public class PrototypeDemo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));  
        System.out.print("Enter Employee Id: ");  
        int eid=Integer.parseInt(br.readLine());  
        System.out.print("\n");  
          
        System.out.print("Enter Employee Name: ");  
        String ename=br.readLine();  
        System.out.print("\n");  
          
        System.out.print("Enter Employee Designation: ");  
        String edesignation=br.readLine();  
        System.out.print("\n");  
          
        System.out.print("Enter Employee Address: ");  
        String eaddress=br.readLine();  
        System.out.print("\n");  
          
        System.out.print("Enter Employee Salary: ");  
        double esalary= Double.parseDouble(br.readLine());  
        System.out.print("\n");  
           
        EmployeeRecord e1=new EmployeeRecord(eid,ename,edesignation,esalary,eaddress);  
          
        e1.showRecord();  
        System.out.println("\n");  
        EmployeeRecord e2=(EmployeeRecord) e1.getClone();  
        e2.showRecord();  
        
        
        
        
        EmployeeRecord e3 = (EmployeeRecord)e1.clone();
        e3.showRecord();
        
		/*	here by creating a clone of object e1 it is not actually creating a new object but
		 * 	a copy of e1 object. This is shallow cloning
		*/
    }     
}


