package collection;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

// 鍚勭绾挎€ц〃镄勬€ц兘姣旇缉

/**
 * <pre>
 * String[900000]锛氲€楁椂=1姣
 * ArrayList锛氲€楁椂=9姣
 * ArrayDeque锛氲€楁椂=10姣
 * LinkedList锛氲€楁椂=21姣
 * </pre>
 */
public class Collection_Set_PerformanceComparison {

    public static void main(String[] args) {
        System.out.println("String[900000]锛氲€楁椂=" + demo1() + "姣");
        System.out.println("ArrayList锛氲€楁椂=" + demo2() + "姣");
        System.out.println("ArrayDeque锛氲€楁椂=" + demo3() + "姣");
        System.out.println("LinkedList锛氲€楁椂=" + demo4() + "姣");
    }

    public static long demo1() {
        String[] str = new String[900000];
        for (int i = 0; i < 900000; i++) {
            str[i] = String.valueOf(0);
        }

        long startTime = System.currentTimeMillis();
        String s = null;
        for (int i = 0; i < 900000; i++) {
            s = str[i];
        }

        long endTime = System.currentTimeMillis();
        return endTime - startTime;
    }

    public static long demo2() {
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < 900000; i++) {
            list.add(i + "");
        }

        long startTime = System.currentTimeMillis();
        String s = null;
        for (int i = 0; i < 900000; i++) {
            s = list.get(i);
        }

        long endTime = System.currentTimeMillis();
        return endTime - startTime;
    }

    public static long demo3() {
        ArrayDeque<String> list = new ArrayDeque<String>();
        for (int i = 0; i < 900000; i++) {
            list.add(i + "");
        }

        long startTime = System.currentTimeMillis();
        String s = null;
        for (int i = 0; i < 900000; i++) {
            s = list.poll();
        }

        long endTime = System.currentTimeMillis();
        return endTime - startTime;
    }

    public static long demo4() {
        LinkedList<String> list = new LinkedList<String>();
        for (int i = 0; i < 900000; i++) {
            list.add(i + "");
        }

        long startTime = System.currentTimeMillis();
        String s = null;

        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            iterator.next();
        }
        /*
		 * for (int i = 0; i < 900000; i++) { s = list.poll(); }
		 */

        long endTime = System.currentTimeMillis();
        return endTime - startTime;
    }
}
