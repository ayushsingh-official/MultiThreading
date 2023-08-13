package threads;

public class Main {

	public static void main(String[] args) {

		
		ThreadOne t1 = new ThreadOne();

		Thread thread = new Thread(t1);
		
		ThreadTwo t2 = new ThreadTwo();
		
		thread.start();
		t2.start();
		
	}
}
