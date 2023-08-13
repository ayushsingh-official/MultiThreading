package ProductSync;

public class Consumer extends Thread {

	Company c;

	public Consumer(Company c) {
		super();
		this.c = c;
	}
	
	@Override
	public void run() {
		
		c.consume_item();
		
	}
}
