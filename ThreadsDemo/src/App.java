/*
 class MyTask{
	void task(){
		for(int doc = 1; doc<=10; doc++) {
			System.out.println("@@  Printing Document #" +doc + " - Printer 2");
		}
	}
}
*/

//MyTask IS-A Thread 
/*
class MyTask extends Thread{
	@Override
	public void run(){
		for(int doc = 1; doc<=10; doc++) {
			System.out.println("@@  Printing Document #" +doc + " - Printer 2");
		}
	}
}
*/

class ca{
	
}

// class MyTask extends ca, Thread -> Error | Multiple inheritance is not supported in java
class MyTask extends ca implements Runnable{
	@Override
	public void run(){
		for(int doc = 1; doc<=10; doc++) {
			System.out.println("@@  Printing Document #" +doc + " - Printer 2");
		}
	}
}


class YourTask extends ca implements Runnable{
	@Override
	public void run(){
		for(int doc = 1; doc<=10; doc++) {
			System.out.println("**  Printing Document #" +doc + " - Printer 3");
		}
	}
}

public class App {
	//main method represents main thread
	public static void main(String[] args) {
		//whatever we write in herer will be executed by main thread
		//threads always execute the jobs in a sequence
		//Execution Context
		
		//Job1
		System.out.println("==Application Started==");
		
		//Job2
//		MyTask t = new MyTask(); //Child Thread / Worker Thread
//		t.start(); // -> start() shall internal execute run method
	
		Runnable r = new MyTask();
		Thread task = new Thread(r);
		task.start();
		
	//	Thread yourTask = new Thread(new YourTask());   //this will also create a new thread
	//	yourTask.start();
		
		new Thread(new YourTask()).start(); //the above 2 lines written in single line
		
		// Till job2 is not finished, below written jobs are waiting and not executed
		// In case job 2 is a long running operation, i.e several documents are suppose to be printed
		// In such a use case OS?JVM shall give a message that app is not responding
		// Some sluggish behavior in app can be observed -> App seems to hang
		
		// Now, main and MyTask are executing both parallely or concurrently !!
		
		//Job3
		//Some code to print the documents
		for(int doc = 1; doc<=10; doc++) {
			System.out.println("^^  Printing Document #" +doc + " - Printer 1");
		}
		
		//Job4
		System.out.println("==Application Finished==");
		
	}

}
