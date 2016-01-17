package objects;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;

public class PhantomReferenceDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = new String("abcdef");
		ReferenceQueue<String> queue = new ReferenceQueue<>();
		PhantomReference<String> reference = new PhantomReference<String>(str, queue);

		str = null;

		System.out.println(reference.get()); // null

		System.gc();
		System.runFinalization();

		System.out.println(queue.poll()); // java.lang.ref.PhantomReference@4ec4d412
		//System.out.println(queue.poll() == reference);

	}

}
