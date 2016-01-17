package objects;

//Professor没有实现Cloneable接口，默认使用java.lang.Object类的clone()方法
class Professor implements Cloneable {
	String name;
	int age;

	Professor(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Professor [name=" + name + ", age=" + age + "]";
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
}

public class CloneDemo2 implements Cloneable {
	public String name;
	public int a;
	public Professor p;

	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		name = "";
		System.out.println("finalize");
		// super.finalize();
	}

	public CloneDemo2(String name, int a, Professor p) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.a = a;
		this.p = p;
	}

	public CloneDemo2 clone() {
		CloneDemo2 demo = null;
		try {
			demo = (CloneDemo2) super.clone();
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
		Professor p = new Professor("wangwu", 50);
		CloneDemo2 demo = new CloneDemo2("hello", 5, p);
		CloneDemo2 demo2 = demo.clone();

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
