package thread;
public class Thread_Join {
	public static void main(String[] args) {
		ThreadDemo2 threadOne = new ThreadDemo2();
		Thread thread = new Thread(threadOne, "");
		thread.start();
		try {
			// 主线程执行了thread.join()，那么，主线程将等待线程thread执行行结束后才会向下执行。
			thread.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

		for (int i = 0; i <= 100; i++) {
			System.out.println(Thread.currentThread().getName() + "------" + Thread.currentThread().getId() + "---主线程---" + i);
		}
	}

}

class ThreadDemo2 implements Runnable {
	private int i;

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (; i <= 100; i++) {
			System.out.println(Thread.currentThread().getName() + "------" + Thread.currentThread().getId() + "---子线程---" + i);
		}
	}

}
