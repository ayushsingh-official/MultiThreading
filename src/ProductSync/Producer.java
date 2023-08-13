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
			
			
			try {
				c.produce_item(product);
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			product++;
			
		}
		
	}
	
}
