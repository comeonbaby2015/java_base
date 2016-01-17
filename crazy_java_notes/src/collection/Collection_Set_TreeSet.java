package collection;

import java.util.*;

public class Collection_Set_TreeSet {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// demo1();
		// demo2();
		// demo3();
		// demo4();
		demo5();
	}

	public static void demo5() {
		SortedSet<Z3> set = Collections.synchronizedSortedSet(new TreeSet<Z3>());
		set.add(new Z3(5));
		set.add(new Z3(-3));
		set.add(new Z3(9));
		set.add(new Z3(-2));
		System.out.println(set);
	}

	// 定制排序
	public static void demo4() {
		TreeSet<Z3> set = new TreeSet<Z3>(new Comparator<Z3>() {
			@Override
			public int compare(Z3 o1, Z3 o2) {
				// TODO Auto-generated method stub
				return o1.num > o2.num ? 1 : (o1.num < o2.num ? -1 : 0);
			}
		});

		set.add(new Z3(5));
		set.add(new Z3(-3));
		set.add(new Z3(9));
		set.add(new Z3(-2));
		System.out.println(set);

		set.first().num = 20;
		System.out.println(set);

		set.last().num = -2;
		System.out.println(set);

		set.remove(new Z3(-2));
		System.out.println(set);

		set.remove(new Z3(5));
		System.out.println(set);

		set.remove(new Z3(20));
		System.out.println(set);
	}

	// 自然排序
	public static void demo3() {
		TreeSet<Z2> set = new TreeSet<Z2>();
		set.add(new Z2(5));
		set.add(new Z2(-3));
		set.add(new Z2(9));
		set.add(new Z2(-2));
		System.out.println(set);

		set.first().num = 20;
		System.out.println(set);

		set.last().num = -2;
		System.out.println(set);

		set.remove(new Z2(-2));
		System.out.println(set);

		set.remove(new Z2(5));
		System.out.println(set);

		set.remove(new Z2(20));
		System.out.println(set);
	}

	// 由于compareTo()方法重写失误，导致插入元素的内容是重复的
	public static void demo2() {
		TreeSet<Z> set = new TreeSet<Z>();
		Z z = new Z(6);

		set.add(z);
		set.add(z);
		System.out.println(set);
		print(set);
		System.out.println();

		set.first().num = 16;
		print(set);
		System.out.println(set);
	}

	public static void print(Set<Z> set) {
		Iterator<Z> iterator = set.iterator();
		while (iterator.hasNext()) {
			Z z1 = iterator.next();
			System.out.println(z1.num);
		}
	}

	public static void demo1() {
		TreeSet<Integer> set = new TreeSet<Integer>();
		set.add(1);
		set.add(-100);
		set.add(90);
		set.add(100);// 能存入
		set.add(5);
		set.add(15);
		set.add(80);
		set.add(100);// 不能存入
		System.out.println(set.toString());
		System.out.println();

		System.out.println(set.first());
		System.out.println(set.last());
		System.out.println();

		System.out.println(set.lower(10));
		System.out.println(set.higher(80));
		System.out.println();

		System.out.println(set.subSet(20, 80));
		System.out.println(set.headSet(5));
		System.out.println(set.headSet(5, true));
		System.out.println(set.tailSet(80));
		System.out.println(set.tailSet(80, true));
		System.out.println();
	}

}

class Z implements Comparable<Z> {
	int num;

	public Z(int age) {
		this.num = age;
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		// return super.equals(obj);
		return true;
	}

	@Override
	public int compareTo(Z o) {
		// TODO Auto-generated method stub
		// return 0;
		return 1;
	}
}

class Z2 implements Comparable<Z2> {
	public int num;

	public Z2(int age) {
		// TODO Auto-generated constructor stub
		this.num = age;
	}

	@Override
	public String toString() {
		return "Z2 [age=" + num + "]";
	}

	@Override
	public int compareTo(Z2 o) {
		// TODO Auto-generated method stub
		// return 0;
		return num > o.num ? 1 : (num < o.num ? -1 : 0);
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		// return super.equals(obj);
		if (this == obj) {
			return true;
		}

		if (null == obj && obj.getClass() == Z2.class) {
			Z2 z2 = (Z2) obj;
			if (z2.num == this.num) {
				return true;
			}
		}
		return false;
	}

}

class Z3 {
	public int num;

	public Z3(int age) {
		// TODO Auto-generated constructor stub
		this.num = age;
	}

	@Override
	public String toString() {
		return "Z2 [age=" + num + "]";
	}
}
