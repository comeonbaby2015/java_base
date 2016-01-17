package generic;

/**
 * <pre>
 * 1、定义泛型的类
 * 2、从泛型派生子类
 * </pre>
 */
public class Generic_Inheritance {

	public static void main(String[] args) {
		// 定义泛型的类
		// demo1();

		// 从泛型派生子类
		// demo2();
		// demo3();
		demo4();
	}

	// 定义泛型的类
	public static void demo1() {
		Apple<String> apple = new Apple<String>("苹果");
		System.out.println(apple.getInfo());
		System.out.println();

		Apple<Integer> apple2 = new Apple<Integer>(100);
		System.out.println(apple2.getInfo());
		System.out.println();
	}

	// 从泛型派生子类
	public static void demo2() {
		A1 apple = new A1("苹果");
		System.out.println(apple.getInfo());
		System.out.println();
	}

	// 从泛型派生子类
	public static void demo3() {
		A2 apple = new A2("苹果");
		System.out.println(apple.getInfo());
		System.out.println();
	}

	// 从泛型派生子类
	public static void demo4() {
		A3<Double> apple = new A3(1550.5554);
		System.out.println(apple.getInfo());
		System.out.println();
	}

}

// 定义泛型的类
class Apple<T> {
	private T info;

	public Apple(T info) {
		this.info = info;
	}

	public T getInfo() {
		return info;
	}
}

// 从泛型派生子类
class A1 extends Apple<String> {

	public A1(String info) {
		super(info);
		// TODO Auto-generated constructor stub
	}

	public String getInfo() {
		return super.getInfo();
	}

}

// 从泛型派生子类
class A2 extends Apple {

	public A2(String info) {
		super(info);
		// TODO Auto-generated constructor stub
	}

	public String getInfo() {
		return (String) super.getInfo();
	}
}

// 从泛型派生子类
class A3<T> extends Apple<T> {

	public A3(T info) {
		super(info);
		// TODO Auto-generated constructor stub
	}

	public T getInfo() {
		return super.getInfo();
	}
}
