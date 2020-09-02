package zy.day13.Checkpoint2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class Test1 {
    public static void main(String[] args) {
//        1. 创建ArrayList
        ArrayList<String> list = new ArrayList<>();
//        2. 使用add方法往ArrayList添加元素
        Collections.addAll(list, "a", "f", "b", "c", "a", "d");
//        3. 创建HashSet.用于将ArrayList中重复的元素去除
        HashSet<String> set = new HashSet<>();
//        4. 调用HashSet的addAll方法,将ArrayList中的元素添加到HashSet中
        set.addAll(list);
//        5. 清空list的所有元素
        list.clear();
//        6. 将set集合中的元素再添加回ArrayList集合
        list.addAll(set);
        for (String s : list) {
            System.out.println(s);
        }
    }
}
