package collection;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Collection_List {

    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        // demo1();
        // demo2();
        demo3();
    }

    public static void demo3() {
        List<String> list = new ArrayList<String>();
        list.add("ahcg");
        list.add("www.baidu.com");
        list.add("你好");

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println(list);

        ListIterator<String> listIterator = list.listIterator();
        while (listIterator.hasPrevious()) {
            String temp = listIterator.previous();
            System.out.println(temp);
            if (temp.equals("www.baidu.com")) {
                // TODO没有添加成功
                listIterator.add("2015年");
            }
        }
        System.out.println(list);

        while (listIterator.hasNext()) {
            String temp = listIterator.next();
            if (temp.equals("www.baidu.com")) {
                listIterator.add("--->");
            }
        }
        System.out.println(list);
    }

    public static void demo2() {
        // List判断两个对象相等是通过equals()方法
        List<F> list = new ArrayList<F>();
        list.add(new F());
        list.add(new F());
        System.out.println(list);
        System.out.println(list.size());

        list.remove(new F());
        System.out.println(list);
        System.out.println(list.size());

        list.remove(new F());
        System.out.println(list);
        System.out.println(list.size());
    }

    public static void demo1() {
        {
            List<Integer> list = new ArrayList<Integer>();
            // 增
            list.add(100);
            list.add(-5);
            list.add(-8);
            list.add(10);
            list.add(8);
            list.add(6);
            list.add(8);
            System.out.println(list);

            // 删除
            list.remove(1);
            System.out.println(list);

            // 改
            list.set(0, 99);
            System.out.println(list);

            // 查
            System.out.println(list.get(1));
            System.out.println(list.indexOf(10));
            System.out.println(list.subList(1, 5));
            System.out.println(list.lastIndexOf(8));
            System.out.println();

            for (int i = 0; i < list.size(); i++) {
                System.out.println(list.get(i));
            }
        }
    }
}

class F {
    @Override
    public boolean equals(Object obj) {
        // TODO Auto-generated method stub
        // return super.equals(obj);
        return true;
    }
}

