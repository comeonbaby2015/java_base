package objects;

class Father {
	public static void print(int n) {
		System.out.println("Father->static print:" + n);
	}

	public void show(int n) {
		System.out.println("Father->show:" + n);
	}
}

class Child extends Father {
	public static void print(int n, String str) {
		Father.print(n);
		System.out.println("Child->static print:" + str);
	}

	public void show(int n, String str) {
		//super.show(n);
		System.out.println("Child->show:" + str);
		super.show(n);
	}

	public void show(int n) {
		System.out.println("Child->show:" + n);
	}
}

public class InheritDemo {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child child = new Child();
		child.show(1);
		child.show(1, "abc");

		System.out.println();

		child.print(2);
		child.print(2, "def");

	}
}
