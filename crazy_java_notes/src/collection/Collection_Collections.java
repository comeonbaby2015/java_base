package collection;

import java.util.*;

public class Collection_Collections {

    public static void main(String[] args) {
        // 使用Collections对集合排序
        // demo1();

        // 指定集合为线程安全版本
        // demo2();
    }

    // 使用Collections对集合排序
    public static void demo1() {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(2);
        list.add(-5);
        list.add(3);
        list.add(0);
        System.out.println(list);
        System.out.println();

        // 反转
        Collections.reverse(list);
        System.out.println(list);
        System.out.println();

        // 按自然顺序排序
        Collections.sort(list);
        System.out.println(list);
        System.out.println();

        // 随机排序
        Collections.shuffle(list);
        System.out.println(list);
        System.out.println();

        // 交换
        Collections.swap(list, 1, 2);
        System.out.println(list);
        System.out.println();

        // 移动
        Collections.rotate(list, 2);
        System.out.println(list);
        System.out.println();
    }

    // 指定集合为线程安全版本
    public static void demo2() {
        Collection<String> c = Collections.synchronizedCollection(new ArrayList<String>());
        List<String> list = Collections.synchronizedList(new ArrayList<String>());
        Set<String> set = Collections.synchronizedSet(new HashSet<String>());
        Map<String, String> map = Collections.synchronizedMap(new HashMap<String, String>());
    }

    public static void demo3() {
        List list = Collections.emptyList();
    }
}
