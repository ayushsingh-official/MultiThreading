package ProductSync;

public class Company {

	int n;

	boolean produce = true;

	public synchronized void produce_item(int n) throws Exception {

		// if produce = false its consumer time/thread
		// So produce thread has to wait
		if (!produce) {
			wait();
		}

		this.n = n;
		System.out.println("produces" + n);

		produce = false;

		// Notify the other threads waiting
		notify();
	}

	public synchronized void consume_item() throws Exception {

		if (produce) {
			wait();
		}

		// when produce will be false this will execute
		System.out.println("consume" + this.n);

		produce = true;

		notify();

	}
}
