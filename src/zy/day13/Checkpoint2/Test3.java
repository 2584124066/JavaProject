package zy.day13.Checkpoint2;

import java.util.Iterator;
import java.util.LinkedList;

public class Test3 {
    public static void main(String[] args) {
//        1. 定义QQ号码数组String[] strs
        String[] strs = {"12345", "67891", "12347809933", "98765432102", "67891", "12347809933"};
//        2. 创建LinkedList
        LinkedList<String> link = new LinkedList<>();
//        3. 遍历strs获取每个qq号码
        for (String s : strs) {
//        4. 判断LinkedList是否已经存在这个qq号码
            if (!link.contains(s)) {//        5. 不存在这个qq号码则添加到LinkedList中
                link.add(s);
            }
        }
//        6. 增强for遍历LinkedList
        for (String s : link) {
            System.out.println(s);
        }
//        7. 迭代器遍历LinkedList
        Iterator<String> it = link.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
