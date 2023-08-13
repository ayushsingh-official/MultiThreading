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
			try {
				c.consume_item();
				Thread.sleep(2000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
