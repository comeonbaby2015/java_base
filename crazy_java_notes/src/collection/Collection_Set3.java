package collection;

import java.util.LinkedHashSet;

public class Collection_Set3 {

	// LinkedHashSet
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet<String> linkedHashSet = new LinkedHashSet<String>();
		linkedHashSet.add("123");
		linkedHashSet.add("abc");
		linkedHashSet.add("567");
		linkedHashSet.add("efg");
		System.out.println(linkedHashSet);

		linkedHashSet.remove(new String("abc"));
		System.out.println(linkedHashSet);
	}

}
