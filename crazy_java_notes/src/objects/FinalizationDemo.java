package objects;

public class FinalizationDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i <= 10; i++) {
			FinalizationDemo demo = new FinalizationDemo();

			// System.gc();
			 System.runFinalization();

			Runtime runtime = Runtime.getRuntime();
			// 调用gc不一定每次都会进行垃圾回收
			 //runtime.gc();
			// 调用runFinalization不一定每次都会进行垃圾回收
			runtime.runFinalization();
			try {
				demo.finalize();
			} catch (Throwable e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	protected void finalize() throws Throwable {
		super.finalize();
		System.out.println("执行了finalize");
	}

}
