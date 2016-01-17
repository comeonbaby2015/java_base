package collection;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * Created by hades on 2016/1/17.
 */
public class TreeMapTest {
    /**
     * <br>
     * FAQ:
     * HashMap 和 TreeMap的输出顺序是怎样的？
     * <p>
     * 意图：
     * （1）考察HashMap 和 TreeMap的存储结构是什么？
     * （2）尽量不要使用HashMap 和 TreeMap存储可变对象。当存放可变对象时，怎么应对？
     * （3）客户端和服务器交互时，如何实现重新排序？
     * </br>
     */


    public static void main(String[] args) {
        printHashMap();
        printTreeMap();
        printString();
    }

    public static void printHashMap() {
        /**
         * <br>
         验证
         （1）HashSet使用hashCode算法决定元素的存储位置。
         （2）HashMap的存储顺序和存储位置是根据hashCode值决定的。
         （3）HashSet使用hashCode()(默认方法和自定义方法）决定hashCode值。
         （4）HashMap的访问顺序与存储顺序一致。
         <br/>
         */
        Map<String, String> hashMap = new HashMap<>();
        hashMap.put("1", "a");
        hashMap.put("3", "c");
        hashMap.put("22", "bb");

        hashMap.keySet().forEach(key -> System.out.println("key:" + key + "\t\tvalue:" + hashMap.get(key)));
        System.out.println("hashMap:" + hashMap.toString());

    }

    public static void printTreeMap() {
        /**
         * <br>
         验证
         （1）TreeSet集合使用红黑树的数据结构来存储集合元素。
         （2）TreeMap根据Key的compareTo()决定元素的排序大小顺序，顺序有自然顺序或自定义顺序。
         （3）HashMap的访问顺序与存储顺序一致。
         <br/>
         */
        Map<String, String> treeMap = new TreeMap<>();
        treeMap.put("1", "a");
        treeMap.put("30", "c");
        treeMap.put("34", "bb");
        treeMap.put("301", "f");
        treeMap.put("22", "g");
        treeMap.put("33", "m");
        System.out.println("treeMap:" + treeMap.toString());
        //        treeMap.keySet().forEach(tree -> System.out.println("treeKey:" + tree + "\t\tvalue:" + treeMap.get(tree)));
    }

    public static void printString() {
        /**
         * <br>
         验证
         （1）字符串排序，是按照字母顺序排序
         <br/>
         */
        String[] strs = new String[]{"1", "30", "34", "301", "22", "33"};
        Arrays.sort(strs);
        for (String str : strs) {
            System.out.println(str);
        }
    }

}
