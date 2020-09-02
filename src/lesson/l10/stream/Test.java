package lesson.l10.stream;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("张无忌");
        list.add("周芷若");
        list.add("赵敏");
        list.add("张强");
        list.add("张三丰");

        list.stream().filter((n)->{
           return n.startsWith("张")&&n.length()==3;
        }).forEach(System.out::println);
        System.out.println("-------------------");

        list.stream().limit(2).forEach(s -> System.out.println(s));
        System.out.println("-------------------");

        list.stream().skip(2).forEach(s -> System.out.println(s));

        System.out.println(list.stream().count());
    }
}
