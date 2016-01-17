package collection;

import java.util.LinkedList;

public class Collection_Queue_LinkedListQueue {

	public static void main(String[] args) {
		demo1();
	}

	// LinkedList作为双向队列、栈
	public static void demo1() {
		LinkedList<String> linkedList = new LinkedList<String>();
		linkedList.offer("我是一个小小鸟");
		linkedList.offer("hello");
		linkedList.offer("Family");
		linkedList.offer("微软的17处理器电脑");

		System.out.println(linkedList);
		System.out.println(linkedList.peekFirst());
		System.out.println(linkedList.peekLast());
		System.out.println();

		System.out.println(linkedList.pop());
		System.out.println(linkedList);

		System.out.println(linkedList.pollLast());
		System.out.println(linkedList);
	}
}
