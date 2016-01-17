package objects;

// http://blog.csdn.net/bear_huangzhen/article/details/25618907
public class FAQ4 {

	public static void main(String args[]) {
		System.out.println("value = " + switchIt(4));
	}

	public static int switchIt(int x) {
		int j = 1;
		switch (x) {
		case 1:
			j++;
		case 2:
			j++;
		case 3:
			j++;
		case 4:
			j++;
		case 5:
			j++;
		default:
			j++;
		}
		return j + x;
	}

}
