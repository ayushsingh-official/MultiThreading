package threads;

public class Main {

	public static void main(String[] args) {

		//This Thread not defined by user
		Thread currentThread = Thread.currentThread();
		System.out.println("Current  thread : " + currentThread);
		System.out.println("Current  thread  Name : " + currentThread.getName());
		currentThread.setName("Main-Thread");
		System.out.println("Current  thread  Name : " + currentThread.getName());

		ThreadOne t1 = new ThreadOne();

		Thread thread = new Thread(t1);

		ThreadTwo t2 = new ThreadTwo();

		// Runnable state
		thread.start();
		t2.start();

	}
}
