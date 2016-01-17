package collection;

import java.util.Arrays;
import java.util.List;

public class Collection_List_Arrays {

	// ????????List
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = Arrays.asList("123", "456", "789");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

		// ?????????????java.lang.UnsupportedOperationException
		list.remove("123");
		list.add("fag"); 
	}
}
