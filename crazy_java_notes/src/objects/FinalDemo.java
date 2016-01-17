package objects;

interface IncludeFinalInterface {
	// 接口中定义的变量都是public static final的
	// 作为接口成员的变量，其赋值只能在声明中完成
	int staticVar = 2009;
}

class IncludeFinal {
	static final int staticVar;
	final int instanceVar;

	IncludeFinal() {
		// 实例变量的赋值还可以在构造器中进行
//		instanceVar = 9;
	}

	IncludeFinal(final boolean sameAsStatic) {
//		instanceVar = sameAsStatic ? staticVar : 9;
		// 不能编译，final修饰的构造器参数变量在构造器体中不能被再次赋值
		// sameAsStatic = false;
	}

	static final void showStaticVar() {
		System.out.println("IncludeFinal.staticVar = " + staticVar);
	}

	final void showInstanceVar() {
		System.out.println("IncludeFinal.instatnceVar = " + instanceVar);
	}

	void show(final boolean showStatic) {
		if (showStatic)
			showStaticVar();
		else
			showInstanceVar();
		// 不能编译，final修饰的方法参数变量在方法体中不能被再次赋值
		// showStatic = false;
	}

	static void demoExceptionHandlerParameter() {
		try {
			System.out.println(10 / 0);
		} catch (final ArithmeticException ae) {
			ae.printStackTrace();
			// 不能编译，final修饰的异常处理器参数变量在catch语句块中不能被再次赋值
			// ae = null;
		}
	}

	static void showLocalVar() {
		final int localVar;
		// 局部变量在其值被访问之前必须被明确赋值，
		// 当然在其声明中同时指定一个初始化值似乎是一个更好的选择
		localVar = 209;

		System.out.println("LocalVar = " + localVar);
	}

	static { // 除在声明中同时初始化外，作为类成员的静态变量，其赋值还可以在静态初始化块中进行
		staticVar = 2009;
	}

	{ // 实例变量的赋值还可以在实例初始化块中进行
		instanceVar = 9;
	}
}

public class FinalDemo extends IncludeFinal {
//	static void showStaticVar() {
//		// 编译错误，不能重定义父类中用final修饰的静态方法
//		System.out.println("FinalTest.staticVar = " + staticVar);
//	}

//	void showInstanceVar() {
//		// 编译错误，不能替换父类中用final修饰的实例方法
//		System.out.println("FinalTest.instatnceVar = " + instanceVar);
//	}

	public static void main(String[] args) {
		showStaticVar();
		demoExceptionHandlerParameter();
		showLocalVar();
		new IncludeFinal(false).show(false);
	}
}