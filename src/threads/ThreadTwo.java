package threads;

public class ThreadTwo extends Thread {

	@Override
	public void run() {

		for (int i = 10; i >= 0; i--) {
			System.out.println("ThreadTwo :::::::::  "+i);

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
