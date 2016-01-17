package generic;

import java.util.ArrayList;
import java.util.List;

/**
 * <pre>
 * 泛型的类型通配符
 * </pre>
 */
public class Generic_WildCard {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// demo1();
		// demo3();
		// demo4();
		demo5();
	}

	//
	public static void demo1() {
		Integer[] ia = new Integer[5];
		Number[] na = ia;
		na[0] = 0.5; // 运行时异常：java.lang.ArrayStoreException
	}

	public static void demo2() {
		List<Integer> list = new ArrayList<Integer>();
		// List<Number> nList = list; // 编译错误
	}

	// 使用类型通配符
	public static void demo3() {
		// List<String>
		List<String> list = new ArrayList<String>();
		list.add("123");
		list.add("efg");
		print(list);
		System.out.println();

		// List<Integer>
		List<Integer> list2 = new ArrayList<Integer>();
		list2.add(10);
		list2.add(100);
		print(list2);
	}

	public static void print(List<?> c) {
		for (int i = 0; i < c.size(); i++) {
			System.out.println(c.get(i));
		}
	}

	// 使用通配符形参时设定上限：List<? extends Shape> shapes
	public static void demo4() {
		List<Circle> circles = new ArrayList<Circle>();
		circles.add(new Circle());

		List<Rectangle> rectangles = new ArrayList<Rectangle>();
		rectangles.add(new Rectangle());

		Canvas canvas = new Canvas();
		canvas.drawAll(circles);
		canvas.drawAll(rectangles);
	}

	// 定义类型参数时设定上限：class Car<T extends Number>
	public static void demo5() {
		Car<Integer> car1 = new Car<Integer>(5);
		System.out.println(car1.getSize());

		Car<Double> car2 = new Car<Double>(5.205);
		System.out.println(car2.getSize());
	}
}

abstract class Shape {
	public abstract void draw(Canvas c);
}

class Circle extends Shape {

	@Override
	public void draw(Canvas c) {
		// TODO Auto-generated method stub
		System.out.println("这是一个圆");
	}
}

class Rectangle extends Shape {

	@Override
	public void draw(Canvas c) {
		// TODO Auto-generated method stub
		System.out.println("这是一个矩形");
	}
}

class Canvas {
	public void drawAll(List<? extends Shape> shapes) {
		for (Shape s : shapes) {
			s.draw(this);
		}
	}
}

class Car<T extends Number> {
	T size;

	public Car(T size) {
		// TODO Auto-generated constructor stub
		this.size = size;
	}

	public T getSize() {
		return size;
	}
}
