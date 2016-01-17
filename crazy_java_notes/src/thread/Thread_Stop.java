package thread;

public class Thread_Stop implements Runnable {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread_Stop stop = new Thread_Stop();
		Thread thread = new Thread(stop);
		thread.start();

	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 100; i++) {
			System.out.println("i=" + i);

			if (i == 5) {
				// Thread.currentThread().stop();
				break;
			}

		}
	}

}
