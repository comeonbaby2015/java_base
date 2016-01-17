package collection;

import java.util.WeakHashMap;

public class Collection_Map_WeakHashMap {

	public static void main(String[] args) {
		WeakHashMap<String, String> hashMap = new WeakHashMap<String, String>();

		hashMap.put(new String("语文"), new String("良好"));
		hashMap.put(new String("数学"), new String("中等"));
		hashMap.put(new String("英文"), new String("高"));

		System.out.println(hashMap);
		System.gc();
		System.runFinalization();
		System.out.println(hashMap);
	}

}
