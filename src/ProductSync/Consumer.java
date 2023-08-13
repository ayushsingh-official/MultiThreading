package ProductSync;

public class Consumer extends Thread {

	Company c;

	public Consumer(Company c) {
		super();
		this.c = c;
	}

	@Override
	public void run() {

		while (true) {
			c.consume_item();
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
