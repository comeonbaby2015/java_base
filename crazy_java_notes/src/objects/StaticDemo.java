package objects;

public class StaticDemo {
	public static void main(String[] ars) {
		A ab = new B(); // 执行到此处,结果: 1a2b
		System.out.println("");
		ab = new B(); // 执行到此处,结果: 2b
	}
}

class A {
	static {
		System.out.println("1");
	}

	public A() {
		System.out.println("2");
	}
}

class B extends A {
	static {
		System.out.println("a");
	}

	public B() {
		System.out.println("b");
	}
}