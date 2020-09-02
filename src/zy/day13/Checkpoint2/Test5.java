package zy.day13.Checkpoint2;

import java.util.ArrayList;
import java.util.HashSet;

public class Test5 {
    public static void main(String[] args) {
//        1. 创建arr数组
        String arr[] = {"abc", "bad", "abc", "aab", "bad", "cef", "jhi"};
//        2. 创建HashSet集合
        HashSet<String> set = new HashSet<>();
//        3. 遍历arr数组
        for (String s : arr) {
//        4. 将arr数组中的元素添加进HashSet中.重复的就不会添加进去了
            set.add(s);
        }
//        5. 创建ArrayList集合,将HashSet的元素添加到ArrayList中
        ArrayList<String> list = new ArrayList<>();
        list.addAll(set);
//        6. 遍历ArrayList打印元素
        for (String s : list) {
            System.out.println(s);
        }
    }
}
