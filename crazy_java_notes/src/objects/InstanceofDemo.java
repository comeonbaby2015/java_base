package objects;

class Instanceof {

}

public class InstanceofDemo extends Instanceof {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "";
		//Instanceof demo1 = new Instanceof();
		Instanceof demo1 = new Instanceof();
		InstanceofDemo demo2 = new InstanceofDemo();

		System.out.println((str instanceof Object) + "");
		System.out.println((str instanceof String) + "");
		// 编译时错误
		// System.out.println((str instanceof Instanceof) + "");
		System.out.println((demo1 instanceof Instanceof) + "");
		System.out.println((demo1 instanceof InstanceofDemo) + "");
		System.out.println((demo2 instanceof Instanceof) + "");
	}

}
