package zy.day13.Checkpoint1;

import java.util.HashSet;
import java.util.Iterator;

public class Test5 {
    public static void main(String[] args) {
//        1. 创建HashSet集合
        HashSet<String> hashSet = new HashSet<>();
//        2. 使用add方法往HashSet添加元素
        hashSet.add("zhangsan");
        hashSet.add("lisi");
        hashSet.add("wangwu");
        hashSet.add("zhangsan");
//        3. 使用迭代器获取HashSet中的元素
        Iterator<String> it = hashSet.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
