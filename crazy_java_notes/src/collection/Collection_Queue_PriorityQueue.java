package collection;

import java.util.PriorityQueue;

public class Collection_Queue_PriorityQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// demo1();
		demo2();

	}

	public static void demo1() {
		// PriorityQueue<Integer> priorityQueue = new PriorityQueue<Integer>();
		PriorityQueue<Integer> priorityQueue = null;

		priorityQueue.offer(6);
		priorityQueue.offer(-3);
		priorityQueue.offer(9);
		priorityQueue.offer(0);

		System.out.println(priorityQueue);
		System.out.println(priorityQueue.poll());
		System.out.println(priorityQueue.poll());
		System.out.println(priorityQueue.poll());
		System.out.println(priorityQueue.poll());
		System.out.println(priorityQueue.poll());
		// 运行时异常：NoSuchElementException
		// System.out.println(priorityQueue.remove());

	}

	public static void demo2() {
		PriorityQueue<Integer> priorityQueue = new PriorityQueue<Integer>();

		// null
		System.out.println(priorityQueue.peek());

		// 运行时异常：NoSuchElementException
		// System.out.println(priorityQueue.element());

		// null
		System.out.println(priorityQueue.poll());

		// 运行时异常：NoSuchElementException
		System.out.println(priorityQueue.remove());

	}

	public static void demo3() {
		PriorityQueue<Integer> priorityQueue = null;
		// 运行时异常：NoSuchElementException,priorityQueue为null时
		priorityQueue.add(5);

		// 运行时异常：NoSuchElementException,priorityQueue为null时
		priorityQueue.offer(5);

	}
}
