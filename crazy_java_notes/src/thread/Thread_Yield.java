package thread;
public class Thread_Yield {
	public static void main(String[] args) {
		ThreadDemo4 threadOne = new ThreadDemo4();
		Thread thread = new Thread(threadOne, "ThreadDemo4");
		thread.setPriority(Thread.MAX_PRIORITY);
		thread.start();

		ThreadDemo5 threadTwo = new ThreadDemo5();
		Thread thread2 = new Thread(threadTwo, "ThreadDemo5");
		thread.setPriority(Thread.MIN_PRIORITY);
		thread2.start();

	}

}

class ThreadDemo4 implements Runnable {
	private int i;

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (; i <= 1000; i++) {
			System.out.println(Thread.currentThread().getName() + "------" + Thread.currentThread().getId() + "---子线程ThreadDemo4---" + i);
			// Thread.yield()
			Thread.yield();
		}
	}

}

class ThreadDemo5 implements Runnable {
	private int i;

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (; i <= 1000; i++) {
			System.out.println(Thread.currentThread().getName() + "------" + Thread.currentThread().getId() + "---子线程ThreadDemo5---" + i);
		}
	}

}
