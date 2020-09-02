package zy.day13.Checkpoint2;

import java.util.Collections;
import java.util.HashSet;

public class Test2 {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        Collections.addAll(set, "张三", "李四", "王五", "二丫", "钱六", "孙七");
        set.remove("二丫");
        set.add("王小丫");
        System.out.println(set);
    }
}
