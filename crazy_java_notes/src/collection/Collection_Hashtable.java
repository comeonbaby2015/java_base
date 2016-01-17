package collection;

import java.util.Hashtable;
import java.util.Iterator;

public class Collection_Hashtable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// demo1();
		demo2();
	}

	// Hashtable和HashMap类 的练习
	public static void demo1() {
		Hashtable<H, Object> hashtable = new Hashtable<H, Object>();
		hashtable.put(new H(6000), "这是一个H对象"); // 没有加入
		hashtable.put(new H(6000), "hello");
		// hashtable.put(new H(97563), "我们");
		hashtable.put(new H(97563), new I());
		hashtable.put(new H(1232), "Hello，这个字段能加入");

		System.out.println(hashtable);
		System.out.println();

		System.out.println(hashtable.contains("123"));
		System.out.println(hashtable.containsValue("hello"));
		System.out.println(hashtable.containsValue(new I()));
		System.out.println(hashtable.containsValue("我们"));
		System.out.println();

		System.out.println(hashtable.containsKey(new H(97563)));
		System.out.println(hashtable.containsKey(new H(123)));
		System.out.println();

		System.out.println(hashtable.remove(new H(97563)));
		System.out.println(hashtable);
	}

	// Hashtable和HashMap类把可变对象作为key。当修改可变对象会发生什么？
	public static void demo2() {
		Hashtable<H, String> hashtable = new Hashtable<H, String>();
		hashtable.put(new H(6000), "123456");
		hashtable.put(new H(87563), "喔喔");
		hashtable.put(new H(8563), "喔喔");
		System.out.println(hashtable);
		System.out.println();

		Iterator<H> iterator = hashtable.keySet().iterator();
		H h = iterator.next();
		System.out.println(h);
		h.count = 87563;
		hashtable.remove(new H(87563));
		System.out.println(h);
		System.out.println(hashtable);
		System.out.println();

		hashtable.remove(new H(87563));
		hashtable.remove(new H(6000));
		System.out.println(hashtable);
	}
}

class H {
	int count;

	public H(int count) {
		this.count = count;
	}

	public boolean equals(Object object) {
		if (object == this) {
			return true;
		}

		if ((null != object) && (object.getClass() == H.class)) {
			return (((H) object).count == this.count);
		}

		return false;
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		// return super.hashCode();
		return count;
	}
}

class I {
	@Override
	public boolean equals(Object obj) {
		return true;
	}
}
