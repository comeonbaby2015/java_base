package thread;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

public class Thread_Create {
	public static void main(String[] args) {
		// demo1();
		// demo2();
		//demo3();

		ThreadThree three = new ThreadThree();
		FutureTask<Integer> task = new FutureTask<Integer>(three);
		new Thread(task, "有返回值的线程").start();
		// 主线程中执行打印

		long result = 0;

		try {
			//System.out.println(Thread.currentThread().getName() + "------" + Thread.currentThread().getId() + "---结果---" + task.get());
			//System.out.println( "---结果---" + task.get());
		} catch (Exception ex) {

		}

		for (int i = 0; i <= 1000; i++) {
			//System.out.println(Thread.currentThread().getName() + "------" + Thread.currentThread().getId() + "------" + i);
			System.out.println( "主线程正在计算------" + i);
			result +=i;
		}

		//System.out.println(Thread.currentThread().getName() + "------" + Thread.currentThread().getId() + "---结果---" + result);
		System.out.println( "---主线程结果---" + result);
	}

	private static void demo1() {
		ThreadOne threadOne = new ThreadOne();
		threadOne.start();

		ThreadOne two = new ThreadOne();
		two.start();
	}

	private static void demo2() {
		ThreadTwo threadOne = new ThreadTwo();
		new Thread(threadOne, "One").start();

		ThreadTwo two = new ThreadTwo();
		// new Thread(two,"two").start();
		new Thread(threadOne, "two").start();
	}

	private static void demo3() {
		ThreadThree three = new ThreadThree();
		FutureTask<Integer> task = new FutureTask<Integer>(three);
		new Thread(task, "有返回值的线程").start();
		// 主线程中执行打印

		long result = 0;

		try {
			System.out.println(Thread.currentThread().getName() + "------" + Thread.currentThread().getId() + "---结果---" + task.get());
		} catch (Exception ex) {

		}

		for (int i = 0; i <= 10000; i++) {
			System.out.println(Thread.currentThread().getName() + "------" + Thread.currentThread().getId() + "------" + i);
			result +=i;
		}

		System.out.println(Thread.currentThread().getName() + "------" + Thread.currentThread().getId() + "---结果---" + result);
	}

}

// 创建线程的第1种方法
class ThreadOne extends Thread {
	private int i;

	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();

		for (; i <= 100; i++) {
			System.out.println(Thread.currentThread().getName() + "------" + Thread.currentThread().getId() + "------" + i);
		}

	}
}

// 创建线程的第2种方法
class ThreadTwo implements Runnable {
	private int i;

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (; i <= 100; i++) {
			System.out.println(Thread.currentThread().getName() + "------" + Thread.currentThread().getId() + "------" + i);
		}
	}

}

// 创建线程的第3种方法
class ThreadThree implements Callable<Integer> {
	int i;
	int result = 0;

	@Override
	public Integer call() throws Exception {
		// TODO Auto-generated method stub

		for (; i <= 1000; i++) {
			System.out.println(Thread.currentThread().getName() + "------" + Thread.currentThread().getId() + "------" + i);
			result += i;
		}

		return result;
	}

}
