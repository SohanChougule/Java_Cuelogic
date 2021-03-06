package dateTimeDemo;

import java.time.LocalDate;
import java.time.LocalDateTime;  


public class DateTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate date = LocalDate.now(); 
		System.out.println("Today date: "+date);  
	    
	    LocalDate yesterday = date.minusDays(1);  
	    System.out.println("Yesterday date: "+yesterday);  
	    
	    LocalDate tomorrow = yesterday.plusDays(2);  
	    System.out.println("Tommorow date: "+tomorrow);  
	    
	    System.out.println("====================================");
	    LocalDate date1 = LocalDate.of(2017, 1, 13);  
	    System.out.println("LocalDate date1 = LocalDate.of(2017, 1, 13); \ndate1.isLeapYear() = " +date1.isLeapYear());  
	    
	    LocalDate date2 = LocalDate.of(2016, 9, 23);  
	    System.out.println("LocalDate date2 = LocalDate.of(2016, 9, 23); \ndate2.isLeapYear() = "+date2.isLeapYear());  
	    
	    System.out.println("====================================");
	    date = LocalDate.of(2017, 1, 13);  
	    LocalDateTime datetime = date.atTime(1,50,9);      
	    System.out.println("date = LocalDate.of(2017, 1, 13);  \nLocalDateTime datetime = date.atTime(1,50,9); = " +datetime);
	    
	    
	}

}
