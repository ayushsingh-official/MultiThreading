package ProductSync;

public class Main {

	public static void main(String[] args) {

		Company company = new Company();
		
		// user defined thread
		Producer produce = new Producer(company);
		Consumer consumer = new Consumer(company);
	
		// start will start the run method if no other thread is available
		// Runnable State
		produce.start();
		consumer.start();
		
	}

}
