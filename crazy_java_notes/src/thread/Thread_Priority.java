package thread;
public class Thread_Priority {
	public static void main(String[] args) {
		// 设置主线程的优先级为Thread.MAX_PRIORITY
		//Thread.currentThread().setPriority(Thread.MAX_PRIORITY);
		System.out.println(Thread.currentThread().getName() + "------" + Thread.currentThread().getId() + "-----" + Thread.currentThread().getPriority());

		Thread_Priority_Demo threadOne = new Thread_Priority_Demo();
		threadOne.start();
		// 优先级默认跟主线程的优先级为Thread.MAX_PRIORITY相同
		System.out.println(threadOne.getName() + "------" + threadOne.getId() + "-----" + threadOne.getPriority());

		Thread_Priority_Demo threadTwo = new Thread_Priority_Demo();
		threadTwo.start();
		// 优先级默认跟主线程的优先级为Thread.MAX_PRIORITY相同
		threadTwo.setPriority(Thread.MIN_PRIORITY);
		System.out.println(threadTwo.getName() + "------" + threadTwo.getId() + "-----" + threadTwo.getPriority());
		// 必须在执行start之前设置优先级，否则无效。
		//threadTwo.setPriority(Thread.MIN_PRIORITY);
		System.out.println(threadTwo.getName() + "------" + threadTwo.getId() + "-----" + threadTwo.getPriority());
	}
}

class Thread_Priority_Demo extends Thread {
	private int i;

	@Override
	public void run() {

	}

}
