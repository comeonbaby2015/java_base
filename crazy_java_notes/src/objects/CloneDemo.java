package objects;

public class CloneDemo implements Cloneable {
	public String name;
	public int a;

	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		name = "";
		System.out.println("finalize");
		// super.finalize();
	}

	public CloneDemo(String name, int a) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.a = a;
	}

	public CloneDemo clone() {
		CloneDemo demo = null;
		try {
			demo = (CloneDemo) super.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return demo;
	}

	@Override
	public String toString() {
		return "CloneDemo [name=" + name + ", a=" + a + "]";
	}

	/**
	 * @param args
	 * @throws Throwable
	 */
	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		CloneDemo demo = new CloneDemo("hello", 5);
		CloneDemo demo2 = demo.clone();
		System.out.println(demo);
		System.out.println(demo2);

		demo.name = "123456";
		demo.a = 10;
		// 证明默认的clone()方法是浅拷贝，引用对象的值改变后都改变
		System.out.println(demo);
		System.out.println(demo2);
	}

}
