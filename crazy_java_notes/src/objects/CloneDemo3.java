package objects;

/**
 * <pre>
 * 如果对象的属性有的是引用变量，如何实现深拷贝？ 
 * 方式1：
 * 步骤1：属性是引用变量时，给属性对应的类implements Cloneable接口，并实现clone()方法。
 * 步骤2：在对象的clone()方法显式调用引用变量的clone()方法。
 * </pre>
 */
// Professor没有实现Cloneable接口，默认使用java.lang.Object类的clone()方法
class Professor2 implements Cloneable {
	String name;
	int age;

	Professor2(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Professor2 [name=" + name + ", age=" + age + "]";
	}

	// 实现深拷贝
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
}

public class CloneDemo3 implements Cloneable {
	public String name;
	public int a;
	public Professor2 p;

	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		name = "";
		System.out.println("finalize");
		// super.finalize();
	}

	public CloneDemo3(String name, int a, Professor2 p) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.a = a;
		this.p = p;
	}

	public CloneDemo3 clone() {
		CloneDemo3 demo = null;
		try {
			demo = (CloneDemo3) super.clone();
			// 实现深拷贝
			demo.p = (Professor2) p.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return demo;
	}

	@Override
	public String toString() {
		return "CloneDemo2 [name=" + name + ", a=" + a + ", p=" + p + "]";
	}

	/**
	 * @param args
	 * @throws Throwable
	 */
	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		Professor2 p = new Professor2("wangwu", 50);
		CloneDemo3 demo = new CloneDemo3("hello", 5, p);
		CloneDemo3 demo2 = demo.clone();

		System.out.println(demo);
		System.out.println(demo2);
		System.out.println();

		demo.name = "123456";
		demo.a = 10;
		demo.p.age = 100;
		demo.p.name = "这是Professor";

		System.out.println(demo);
		System.out.println(demo2);
	}

}
