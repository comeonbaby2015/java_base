package objects;

public class Test1 {
	String str = new String("good");
	char[] ch = { 'a', 'b', 'c' };

	final static String a = "123";
	static int c = 5;
	
	public static void main(String args[]) {
		/*Test1 ex = new Test1();
		ex.change(ex.str, ex.ch);
		System.out.print(ex.str + " and ");
		System.out.print(ex.ch);
		*/
		constant(a);
	}

	public void change(String str, char ch[]) {
		// str = "test ok";
		str = new String("test ok");
		ch[0] = 'g';
	}

	

	public static void constant(String b) {
		System.out.print(a);
		int d = 5;
		c = d;
	}
}