package objects;

import java.io.*;

/**
 * <pre>
 * 如果对象的属性有的是引用变量，如何实现深拷贝？
 * 方式2：
 * 步骤1：若属性为引用变量，该属性对应的类要implements Serializable。
 * 步骤2：把要克隆的类声明implements Serializable。 
 * 步骤3：在要克隆的类中，通过把对象写到二进制流，然后把对象从二进制流中读出来的方式，实现克隆。
 * 
 * </pre>
 */
// Professor没有实现Cloneable接口，默认使用java.lang.Object类的clone()方法
class Professor3 implements Serializable {
	String name;
	int age;

	Professor3(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Professor2 [name=" + name + ", age=" + age + "]";
	}
}

public class CloneDemo4 implements Serializable {
	public String name;
	public int a;
	public Professor3 p;

	public CloneDemo4(String name, int a, Professor3 p) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.a = a;
		this.p = p;
	}

	@Override
	public String toString() {
		return "CloneDemo2 [name=" + name + ", a=" + a + ", p=" + p + "]";
	}

	// 通过把对象写到二进制流，然后把对象从二进制流中读出来的方式，实现克隆
	public CloneDemo4 deepClone() throws IOException, ClassNotFoundException {
		// 将对象写到流里
		ByteArrayOutputStream bo = new ByteArrayOutputStream();
		ObjectOutputStream oo = new ObjectOutputStream(bo);
		oo.writeObject(this);

		// 从流里读出来
		ByteArrayInputStream bi = new ByteArrayInputStream(bo.toByteArray());
		ObjectInputStream oi = new ObjectInputStream(bi);
		return (CloneDemo4) (oi.readObject());
	}

	/**
	 * @param args
	 * @throws Throwable
	 */
	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		Professor3 p = new Professor3("wangwu", 50);
		CloneDemo4 demo = new CloneDemo4("hello", 5, p);
		CloneDemo4 demo2 = demo.deepClone();

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
