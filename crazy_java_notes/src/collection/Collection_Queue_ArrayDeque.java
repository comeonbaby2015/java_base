package collection;

import java.util.ArrayDeque;

public class Collection_Queue_ArrayDeque {

	public static void main(String[] args) {
		// ArrayDeque<Integer> arrayDeque = new ArrayDeque<Integer>();
		ArrayDeque<Integer> arrayDeque = new ArrayDeque<Integer>(8);
		arrayDeque.push(5);
		arrayDeque.push(-10);
		arrayDeque.push(20);
		arrayDeque.push(10);

		System.out.println(arrayDeque);
		System.out.println(arrayDeque.peek());
		System.out.println(arrayDeque.poll());
		System.out.println(arrayDeque.pop());
		System.out.println(arrayDeque.pop());
		System.out.println(arrayDeque.pop());

	}
}
