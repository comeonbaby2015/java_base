package objects;

public class StaticDemo2 {
	public static void main(String[] ars) {
		A2 ab = new B2(); // 执行到此处,结果: 1a2b
		System.out.println("");
		ab = new B2(); // 执行到此处,结果: 2b
	}
}

class A2 {
	{
		System.out.println("1");
	}

	public A2() {
		System.out.println("2");
	}
}

class B2 extends A2 {
	{
		System.out.println("a");
	}

	public B2() {
		System.out.println("b");
	}
}