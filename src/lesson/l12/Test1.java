package lesson.l12;

import java.util.ArrayList;
import java.util.Collection;

public class Test1 {
    public static void main(String[] args) {
        Collection<String> coll = new ArrayList<String>();
        coll.add("aa");
        coll.add("bb");
        coll.add("cc");
        System.out.println(coll);

        //判断是否在集合中存在
        System.out.println(coll.contains("aa"));

        //转换成一个Object数组
        Object[] objects = coll.toArray();
        for (Object o : objects) {
            System.out.println(o);
        }

        //清空集合
        coll.clear();
        System.out.println(coll);

        //判断是否为空
        System.out.println(coll.isEmpty());
    }
}
