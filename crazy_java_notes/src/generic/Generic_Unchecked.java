package generic;

import java.util.ArrayList;
import java.util.List;

/**
 * <pre>
 * 1、编译时不检查类型的异常
 * 2、手动实现编译时检查类型
 * 3、编译时检查类型的异常：使用泛型
 * </pre>
 */
public class Generic_Unchecked {

	public static void main(String[] args) {
		// 编译时不检查类型的异常
		// demo1();

		// 手动实现编译时检查类型
		demo2();

		// 编译时检查类型的异常：使用泛型
		demo3();
	}

	// 编译时不检查类型的异常
	public static void demo1() {
		List list = new ArrayList();
		list.add("123");
		list.add("561");

		list.add(5);

		for (int i = 0; i < list.size(); i++) {
			// java.lang.ClassCastException
			// 需要强制类型转换
			System.out.println((String) list.get(i));
		}
	}

	// 手动实现编译时检查类型
	public static void demo2() {
		StrList list = new StrList();
		list.add("123");
		list.add("561");

		// list.add(5);

		for (int i = 0; i < list.size(); i++) {
			// 不需要强制类型转换
			System.out.println(list.get(i));
		}
	}

	// 编译时检查类型的异常：使用泛型
	public static void demo3() {
		List<String> list = new ArrayList<String>();
		list.add("123");
		list.add("561");

		// 编译错误
		// list.add(5);

		for (int i = 0; i < list.size(); i++) {
			// 不需要强制类型转换
			System.out.println(list.get(i));
		}
	}
}

class StrList {
	private List strList = new ArrayList();

	public boolean add(String str) {
		return strList.add(str);
	}

	public String get(int index) {
		return (String) strList.get(index);
	}

	public int size() {
		return strList.size();
	}
}
