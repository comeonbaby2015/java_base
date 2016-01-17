package collection;

import java.util.HashSet;
import java.util.Set;

public class Collection_Set {
    private static String TAG = Collection_Set.class.getSimpleName();

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        //demo1();
        demo2();
    }

    // HashSet
    public static void demo2() {
        Set set = new HashSet<>();
        // 存入的情况：A，A，B，B，C
        // [collection.B@1, collection.B@1, collection.C@2, collection.A@8bfc25c, collection.A@65712a80]
        set.add(new A());
        set.add(new A());
        set.add(new B());
        set.add(new B());
        set.add(new C());
        set.add(new C());
        System.out.println("set to str:"+set.toString());
        System.out.println();
        System.out.println();

        set.forEach(s-> System.out.println(s.getClass().getSimpleName()+"-----hashCode:"+s.hashCode()));
    }

    // HashSet练习
    public static void demo1() {
        Set<String> set = new HashSet<String>();
        System.out.println(set.add(new String("hello"))); // 添加成功
        System.out.println(set.add(new String("hello"))); // 添加失败
        System.out.println(set);
    }
}

class A {
    @Override
    public boolean equals(Object obj) {
        // TODO Auto-generated method stub
        // return super.equals(obj);
        return true;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}

class B {
    @Override
    public int hashCode() {
        // TODO Auto-generated method stub
        // return super.hashCode();
        return 1;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}

class C {

    @Override
    public int hashCode() {
        // TODO Auto-generated method stub
        // return super.hashCode();
        return 2;
    }

    @Override
    public boolean equals(Object obj) {
        // TODO Auto-generated method stub
        // return super.equals(obj);
        return true;
    }
}
