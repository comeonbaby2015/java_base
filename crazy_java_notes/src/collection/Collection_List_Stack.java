package collection;

import java.util.Stack;

public class Collection_List_Stack {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		demo1();
	}

	public static void demo1() {
		Stack<Integer> stack = new Stack<Integer>();
		stack.add(100);
		stack.add(-9);
		stack.add(10);
		stack.push(10000);
		stack.push(20);

		System.out.println(stack);
		System.out.println(stack.peek());
		System.out.println(stack);
		System.out.println(stack.pop());
		System.out.println(stack);
	}

}
