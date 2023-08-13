package ProductSync;

public class Producer extends Thread {

	Company c;
	
	public Producer(Company c) {
		super();
		this.c = c;
	}
	
	@Override
	public void run() {
		
		int product  = 1;
		
		while(true) {
			c.produce_item(product);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			product++;
			
		}
		
	}
	
}
