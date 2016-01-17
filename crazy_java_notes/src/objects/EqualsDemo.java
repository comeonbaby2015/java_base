package objects;

public class EqualsDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// demo1();
		// demo2();
		demo3();
	}

	public static void demo1() {
		/**
		 * <pre>
		 * String 是个特殊的类。
		 * == 比较的是是否指向同一个对象。
		 * 
		 * String str3 = "abc";
		 * 程序直接使用字符串直接量，JVM将使用常量池来管理这些字符串。
		 * 
		 *  String str2 = new String("abc");
		 *  JVM先使用常亮池来管理直接量，再调用String 的构造方法来创建找一个新的String对象，新创建的String对象被保存在堆内存中。
		 * 
		 * String 的hashCode()被重写了，是根据字符串内容生成的。所以，只要字符串值一样，那么hashCode值是相同的。
		 * 规则：s[0]*31^(n-1) + s[1]*31^(n-2) + ... + s[n-1]
		 * </pre>
		 */
		String str1 = new String("abc");
		String str2 = new String("abc");
		String str3 = "abc";

		String str4 = "a";
		String str5 = "bc";
		String str6 = str4 + str5;

		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);

		System.out.println("str1==str2 ? " + (str1 == str2)); // 不相等
		System.out.println("str1==str3 ? " + (str1 == str3)); // 不相等
		System.out.println("str1==str3 ? " + (str1 == str3)); // 不相等
		System.out.println("str3==str6 ? " + (str3 == str6)); // 不相等

		System.out.println("str1.equals(str2) ? " + (str1.equals(str2))); // 相等
		System.out.println("str1.equals(str3) ? " + (str1.equals(str2))); // 相等
		System.out.println("str3.equals(str6) ? " + (str3.equals(str6))); // 相等

		System.out.println("str1.hashCode()=" + str1.hashCode()); // 相等
		System.out.println("str2.hashCode()=" + str2.hashCode()); // 相等
		System.out.println("str3.hashCode()=" + str3.hashCode()); // 相等
		System.out.println("str6.hashCode()=" + str6.hashCode()); // 相等

	}

	public static void demo2() {
		/**
		 * <pre>
		 * 	Stu stu1 = new Stu(5, "cy");
		 *  System.out.println(stu1);
		 *  
		 *  打印的是tostring方法。
		 *  如果没有重写toString方法，则打印的是Object.toString()方法。
		 *  如果重写toString方法，则打印的是stu1.toString()方法。
		 *  
		 *  所以，System.out.println(stu1); 等价于System.out.println(stu1.toString());。
		 * </pre>
		 */
		Stu stu1 = new Stu(5, "cy");
		Stu stu2 = new Stu(5, "cy");
		Stu stu3 = new Stu(5, "cyfff");

		System.out.println(stu1);
		System.out.println(stu2);
		System.out.println(stu3);

		System.out.println(stu1.toString());
		System.out.println(stu2.toString());
		System.out.println(stu3.toString());

		System.out.println("stu1.hashCode()=" + stu1.hashCode());
		System.out.println("stu2.hashCode()=" + stu2.hashCode());
		System.out.println("stu3.hashCode()=" + stu3.hashCode());
		stu3.setNum(100);
		stu3.setName("200");
		System.out.println("stu3.hashCode()=" + stu3.hashCode());

		// Stu没有重写hashCode

		if (stu1.equals(stu2)) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}

		if (stu1 == stu2) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}

		/*
		 * if(s == new String("abc")) {
		 * 
		 * }
		 */
	}

	public static void demo3() {
		String s1 = "疯狂Java";
		String s2 = "疯狂";
		String s3 = "Java";
		// 编译阶段不能确定。在运行阶段，重新生成一个新的String对象，并赋值s2 + s3。
		String s6 = s2 + s3;
		// false
		System.out.println(s1 == s6);
	}
}

class Stu {
	int num;
	String name;

	Stu(int num, String name) {
		this.num = num;
		this.name = name;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return name.hashCode();

	}

	@Override
	public String toString() {
		return "Stu [num=" + num + ", name=" + name + "]";
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub

		// 如果是同一个对象，则返回为true
		if (this == obj) {
			return true;

		}

		/*
		 * <pre>
		 * 不能使用instanceof。因为如果前面对象是后面类的实例或是其子类的实例的时候，都返回true。
		 * 实际中，常常要求两个对象是同一个类的实例。
		 * 因此，使用getClass()代替instanceof。 
		 * if (obj != null && obj instanceof Stu)
		 * { 
		 * }
		 * </pre>
		 */

		if (obj != null && obj.getClass() == Stu.class) {
			Stu s = (Stu) obj;
			return s.num == this.num && s.name.equals(this.name);
		}

		return false;
	}
}
