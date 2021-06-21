class Printer{
	//synchronized void printDocuments(int numOfCopies, String docName) {
	void printDocuments(int numOfCopies, String docName) {
		for (int i = 1; i <= numOfCopies; i++) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(">> Printing " + docName + " " + i);
		}
	}
}

class MyThread extends Thread{
	
	Printer pRef;
	MyThread(Printer p){
		pRef = p;
	}
	
	@Override
	public void run() {
		synchronized(pRef) {
			pRef.printDocuments(10, "JohnsProfile.pdf");
		}
		
	}
}

class YourThread extends Thread{
	
	Printer pRef;
	YourThread(Printer p){
		pRef = p;
	}
	
	@Override
	public void run() {
		synchronized(pRef) {
			pRef.printDocuments(10, "RonsProfile.pdf");
		}
	}
}

public class SyncApp {
	
	// main is representing main thread
	public static void main(String[] args) {
		System.out.println("==Appilication Started==");
		
		// We have only 1 single object of Printer
		Printer printer = new Printer();
		//printer.printDocuments(10, "SohansProfile.pdf");
		
		
		//Scenario is that we have multiple thread working on the same Printer Object
		//If Multiple Threads are going to work on the same Object we must Synchronize them
		MyThread mRef = new MyThread(printer); // MyThread is having reference to the Printer Object
		YourThread yRef = new YourThread(printer); // YourThread is having reference to the Printer Object
		
		
		mRef.start();
		/*
		try {
			mRef.join();							// i cannot do this for each thread instead i'll make the method synchronized 
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		*/
		
		yRef.start();
		
		System.out.println("==Appilication Finished==");

	}
}
