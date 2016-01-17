package objects;

class BaseClass {
	public int book = 6;

	public void base() {
		System.out.println("父类base方法");
	}

	public void test() {
		System.out.println("父类test方法");
	}
}

public class SubClass extends BaseClass {
	public String book = "hello";

	public void sub() {
		System.out.println("子类sub方法");
	}

	public void test() {
		System.out.println("子类test方法");
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BaseClass bc = new SubClass();
		System.out.println(bc.book);
		bc.base();
		bc.test();
		// 编译时错误，因为父类没有提供sub()方法。
		//bc.sub();
		
		// 使用强制类型转换，使得编译时使用的是运行时类型。
		((SubClass)bc).sub();
		
		// ClassCastException
		SubClass subClass = (SubClass)new BaseClass();
		((SubClass)bc).sub();
	}

}
