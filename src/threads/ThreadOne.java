package threads;

public class ThreadOne implements Runnable {

	@Override
	public void run() {

		Thread currentThread = Thread.currentThread();
		System.out.println("Current  thread 2 : " + currentThread);
		
		for(int i=1; i<= 10 ; i++) {
			System.out.println("ThreadOne : " + i);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
