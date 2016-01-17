package collection;


import java.util.IdentityHashMap;

public class Collection_Map_IdentityHashMap {

    public static void main(String[] args) {
        IdentityHashMap<String, Integer> map = new IdentityHashMap<String, Integer>();

        map.put(new String("语文"), 100);
        map.put(new String("数学"), 50);
        map.put(new String("英文"), 80);

        // 加入2个key-value对
        map.put(new String("java"), 80);
        map.put(new String("java"), 100);

        // 加入一个key-value对
        map.put("java", 40);
        map.put("java", 50);

        System.out.println(map);
    }
}
