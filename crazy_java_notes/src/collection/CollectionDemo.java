package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class CollectionDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// demo2();
		// demo3();
		// demo4();
	}

	// 使用foreach循环遍历集合元素
	public static void demo4() {
		// 遍历操作
		Collection<String> collection = new HashSet<String>();
		collection.add("hello");
		collection.add("world");
		collection.add("Vicky");
		collection.add("Cat");
		System.out.println(collection);

		for (Object obj : collection) {
			// 运行时异常java.util.ConcurrentModificationException
			// collection.remove(obj);
			System.out.println(obj);
		}

		System.out.println(collection);
	}

	// 使用Iterator接口遍历集合元素
	public static void demo3() {
		// 遍历操作
		Collection<String> collection = new HashSet<String>();
		collection.add("hello");
		collection.add("world");
		collection.add("Vicky");
		collection.add("Cat");
		System.out.println(collection);
		System.out.println("使用Iterator遍历集合");
		Iterator<String> iterator = collection.iterator();

		while (iterator.hasNext()) {

			String temp = iterator.next();
			System.out.println(temp);
			if ("Vicky".equals(temp)) {
				// 发生运行时异常：java.util.ConcurrentModificationException
				// 原因是Collection在Iterator迭代过程中，不能使用Collection修改集合元素，目的是避免共享资源而引发的潜在问题。
				collection.remove(temp);
			}
		}

		System.out.println(collection);
	}

	// 使用Iterator接口遍历集合元素
	public static void demo2() {
		// 遍历操作
		Collection<String> collection = new HashSet<String>();
		collection.add("hello");
		collection.add("world");
		collection.add("Vicky");
		collection.add("Cat");
		System.out.println(collection);
		System.out.println("使用Iterator遍历集合");
		Iterator<String> iterator = collection.iterator();

		while (iterator.hasNext()) {

			// 使用next()方法获取迭代变量
			String temp = iterator.next();
			System.out.println(temp);
			if ("Vicky".equals(temp)) {
				// iterator.remove();
				// 发现collection中
				// "Vicky"还存在。那是因为Iterator把集合元素的值，而不是集合元素本身，传给了迭代变量
				temp = "把Vicky换成了Tom";
			}
		}

		System.out.println(collection);
	}

	public static void demo1() {
		Collection<Integer> c = new ArrayList<Integer>();
		// 增删改查操作
		// 增
		c.add(2);
		c.add(20);
		c.add(50);
		c.add(88);
		c.add(99);
		c.add(100);
		System.out.println(c);

		// 删
		c.remove(2);
		System.out.println(c);

		// 查
		boolean querry = c.contains(-20);
		System.out.println("c.contains(-20)=" + querry);
		System.out.println("c.size()=" + c.size());
		System.out.println("c.isEmpty()=" + c.isEmpty());

		// 改
		// c.clear();
		System.out.println("c.size()=" + c.size());

	}
}
