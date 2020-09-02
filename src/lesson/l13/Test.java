package lesson.l13;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("B");
        list.add("D");
        list.add("E");
        System.out.println(list);
        //删除
        list.removeAll(list);
        System.out.println(list);

        list.add("A");
        //往指定位置添加
        list.add(1, "B");
        list.add(2, "C");
        System.out.println(list);

        //删除指定索引值
        list.remove(1);
        list.remove("A");
        System.out.println(list);
        //清空
        list.clear();
        System.out.println(list);

    }
}
