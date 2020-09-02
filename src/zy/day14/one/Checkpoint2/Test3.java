package zy.day14.one.Checkpoint2;

import java.util.HashMap;

public class Test3 {
    public static void main(String[] args) {
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "张三丰");
        hashMap.put(2, "周芷若");
        hashMap.put(3, "汪峰");
        hashMap.put(4, "灭绝师太");
//        1. 将map集合中的所有信息显示到控制台上
        System.out.println(hashMap);
//        2. 向该map集合中插入一个编码为5姓名为李晓红的信息
        hashMap.put(5, "李晓红");
//        3. 移除该map中的编号为1的信息
        hashMap.remove(1);
//        4. 将map集合中编号为2的姓名信息修改为"周林"
        hashMap.put(2,"周林");
        System.out.println(hashMap);
    }
}
