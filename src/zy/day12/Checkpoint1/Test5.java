package zy.day12.Checkpoint1;

import java.util.ArrayList;

public class Test5 {
    public static void main(String[] args) {
        // 创建集合
        ArrayList<String> list = new ArrayList<>();
        //添加元素
        list.add("xiaom1");
        list.add("xiaom2");
        list.add("xiaom3");
        list.add("xiaom4");
        //使用增强for循环获取元素
        for (String s : list) {
            System.out.println(s);
        }
    }
}
