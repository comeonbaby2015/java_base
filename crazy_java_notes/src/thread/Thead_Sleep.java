package thread;
public class Thead_Sleep {
	public static void main(String[] args) {

		for (int i = 0; i <= 1000; i++) {
			System.out.println(Thread.currentThread().getName() + "------" + Thread.currentThread().getId() + "---主线程---" + i);
			if (i == 20) {
				try {
					// 暂停执行两秒。
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

}
