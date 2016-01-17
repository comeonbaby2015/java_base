package objects;

public class WrapperClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean b = true;
		Boolean b2 = new Boolean(b);
		Boolean b3 = new Boolean("tRue");
		Integer i = new Integer(100);
		Float f = new Float(5.65);
		Boolean b4 = new Boolean("123");
		//Long l = new Long("ddd");
		
		System.out.println(i.intValue());
		
		// java.lang.NumberFormatException
		System.out.println(b3.toString());
		
	}

}
