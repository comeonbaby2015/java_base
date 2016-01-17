package objects;

import java.lang.ref.WeakReference;

public class ReferenceDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = new String("123456");
		WeakReference<String> reference = new WeakReference<String>(str);
		str = null;
		System.out.println(reference.get());	// 123456
		
		System.gc();
		System.runFinalization();
		
		System.out.println(reference.get());	// null

	}

}
