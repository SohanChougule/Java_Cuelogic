import java.io.*;

/*
		A Factory Pattern or Factory Method Pattern says that
		just define an interface or abstract class for creating
		an object but let the subclasses decide which class to 
		instantiate. In other words, subclasses are responsible 
		to create the instance of the class.
*/

public class GenerateBill {
	public static void main(String[] args) {
		PlanFactory pf = new PlanFactory();
		
		System.out.print("Enter the name of plan for which the bill will be generated: ");  
	      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));  
	  
	      String planName;
		try {
			planName = br.readLine();
		  
	      System.out.print("Enter the number of units for bill will be calculated: ");  
	      int units=Integer.parseInt(br.readLine());  
	  
	      Plan p = pf.getPlan(planName);  
	      //call getRate() method and calculateBill()method of DomesticPaln.  
	  
	       System.out.print("Bill amount for "+planName+" of  "+units+" units is: ");  
	           p.getRate();  
	           p.calculateBill(units);  
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}   
	}
}


/*
 *    here we are using a PlanFactory class to determine the class that
 *    needs to be called as all the child classes : domestic, commercial and institutional
 *    are derived from abstract class Plan 
 *    getRate() method is abstract and must be implemented in all the classes
 *    so using the planfactory object call getPlan to determine which class
 *    is to be called and get the object of that class and then call 
 *    calculateBill().
 *    
 */


