package thread;
public class Thread_Daemon {
	public static void main(String[] args) {
		Thread_Daemon_Demo threadOne = new Thread_Daemon_Demo();
		Thread thread = new Thread(threadOne, "");
		// 设置为后台线程。发现前台线程（此处前台线程是main线程）执行结束后，后台线程还没执行完就结束了。
		//thread.setDaemon(true);
		thread.start();
		thread.setDaemon(true);
		
		for (int i = 0; i <= 1000; i++) {
			System.out.println(Thread.currentThread().getName() + "------" + Thread.currentThread().getId() + "---主线程---" + i);
		}
	}

}

class Thread_Daemon_Demo implements Runnable {
	private int i;

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (; i <= 1000; i++) {
			System.out.println(Thread.currentThread().getName() + "------" + Thread.currentThread().getId() + "---子线程---" + i);
		}
	}

}
