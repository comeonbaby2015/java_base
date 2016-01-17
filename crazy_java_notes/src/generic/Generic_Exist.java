package generic;

import java.util.ArrayList;
import java.util.List;

/**
 * <pre>
 * 1、并不存在泛型
 * </pre>
 */
public class Generic_Exist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		demo1();
	}

	// 并不存在泛型
	public static void demo1() {
		List<String> list = new ArrayList<String>();
		List<Integer> list2 = new ArrayList<Integer>();
		System.out.println(list.getClass() == list2.getClass());
	}

}
