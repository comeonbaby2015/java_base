package collection;

import java.util.LinkedHashMap;

public class Collection_Map_LinkedHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashMap<String, Integer> list = new LinkedHashMap<String, Integer>();
		list.put("语文", 80);
		list.put("英文", 100);
		list.put("数学", 50);

		for (Object key : list.keySet()) {
			System.out.println(list.get(key));
		}
	}

}
