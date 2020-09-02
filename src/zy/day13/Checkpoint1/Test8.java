package zy.day13.Checkpoint1;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Test8 {
    public static void main(String[] args) {
//        1. 创建LinkedHashSet
        Set<String> set = new LinkedHashSet<>();
//        2. 使用add方法添加元素到LinkedHashSet
        Collections.addAll(set,"王昭君","王昭君","西施","杨玉环","貂蝉");
//        3. 使用迭代器获取LinkedHashSet中的元素
        Iterator<String> it = set.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
//        4. 使用增强for获取LinkedHashSet中的元素
        for (String s : set) {
            System.out.println(s);
        }
    }
}
