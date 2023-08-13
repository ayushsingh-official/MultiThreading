package ProductSync;

public class Main {

	public static void main(String[] args) {

		Company company = new Company();
		
		// user defined thread
		Producer produce = new Producer(company);
		Consumer consumer = new Consumer(company);
	
		// start will start the run method
		produce.start();
		consumer.start();
		
	}

}
