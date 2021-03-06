package timeUnitConverter;

import java.util.concurrent.*;
import java.util.Date;

public class TimeUnitConverter {

	// Java program to demonstrate
	// convert() method of TimeUnit Class

		public static void main(String args[])
		{
			// Get time to be converted in Minutes
			long timeInMinutes = 55L;

			// Create a TimeUnit object
			TimeUnit time = TimeUnit.MILLISECONDS;

			// Convert Minutes to milliseconds
			// using convert() method
			System.out.println("Time " + timeInMinutes + " minutes in milliSeconds = "
							+ time.convert(timeInMinutes, TimeUnit.MINUTES));
			
			// Get time to be converted in Seconds
	        long timeInSec = 356L;
	  
	        // Create a TimeUnit object
	        time = TimeUnit.MINUTES;
	  
	        // Convert Seconds to Minutes
	        // using convert() method
	        System.out.println("Time " + timeInSec + " seconds in minutes = "
	                           + time.convert(timeInSec, TimeUnit.SECONDS));
	        
	        
		}

}
