package objects;

// http://blog.csdn.net/bear_huangzhen/article/details/25618907
public class FAQ2 {

	public static void main(String[] args) {
		try {
			badMethod();
			System.out.print("A");
		} catch (Exception ex) {
			System.out.print("C");
		} finally {
			System.out.print("B");
		}
		System.out.print("D");
	}

	public static void badMethod() throws Exception {
		throw new Exception();
	}
}
