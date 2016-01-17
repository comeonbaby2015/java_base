package object;

public class ObjectDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 错误的做法
		// print("abc",10);
		print("abc", "def");
	}

	public static void print(String... strings) {
		for (String temp : strings) {
			System.out.println(temp);
		}

	}
}
