package collection;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeMap;

public class Collection_Map_TreeMap {

	public static void main(String[] args) {
		TreeMap<Integer, Integer> treeMap = new TreeMap<Integer, Integer>();
		treeMap.put(1, 80);
		treeMap.put(-5, 100);
		treeMap.put(20, 50);

		System.out.println(treeMap);

		Set<Integer> set = treeMap.keySet();
		Object[] a = set.toArray();
		System.out.println(Arrays.binarySearch(a, 1));
	}
}
