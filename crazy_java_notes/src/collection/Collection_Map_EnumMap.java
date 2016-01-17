package collection;

import java.util.EnumMap;

public class Collection_Map_EnumMap {

	public static void main(String[] args) {
		EnumMap<Seaon, String> enumMap = new EnumMap<>(Seaon.class);
		enumMap.put(Seaon.SPRING, "春天");
		enumMap.put(Seaon.SUMMER, "夏天");
		System.out.println(enumMap);
	}
}

enum Seaon {
	SPRING, SUMMER, FALL, WINTER
}
