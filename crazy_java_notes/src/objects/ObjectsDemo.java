package objects;

import java.util.Objects;

public class ObjectsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ObjectsDemo demo = null;

		// 对象为null时，调用该对象的toString方法，发生运行时异常java.lang.NullPointerException
		// System.out.println(demo.toString());
		// 对象为null时，调用对象的demo.hashCode()方法，发生运行时异常java.lang.NullPointerException
		// System.out.println(demo.hashCode());

		// 对象为null时，调用Objects.hashCode(demo)，输出为0
		System.out.println(Objects.hashCode(demo));
		// 对象为null时，调用Objects.hashCode(demo)，输出为null
		System.out.println(Objects.toString(demo));
		// 对象为null时，因为要求变量不能为null，因此引发了异常。
		// System.out.println(Objects.requireNonNull(demo));
		System.out.println(Objects.requireNonNull(demo, "该对象为null，因此发生了运行时异常"));
	}
}
