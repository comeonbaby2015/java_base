package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

//  HashSet
public class Collection_Set2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<R> set = new HashSet<R>();

		set.add(new R(5));
		set.add(new R(-3));
		set.add(new R(9));
		set.add(new R(-2));

		System.out.println(set);

		Iterator<R> iterator = set.iterator();
		R r = iterator.next();
		System.out.println(r);

		r.count = -3;
		System.out.println(set);

		set.remove(new R(-3));
		System.out.println(set);

		System.out.println(set.contains(new R(-3)));
		System.out.println(set.contains(new R(5)));
	}
}

class R {
	public int count;

	public R(int count) {
		this.count = count;
	}

	@Override
	public String toString() {
		return "R [count=" + count + "]";
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		// return super.equals(obj);

		if (this == obj) {
			return true;
		}

		if ((null != obj) && (obj.getClass() == R.class)) {
			if (((R) obj).count == count) {
				return true;
			}
		}
		return false;
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		// return super.hashCode();
		return count;
	}
}