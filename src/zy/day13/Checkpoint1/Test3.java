package zy.day13.Checkpoint1;

import java.util.LinkedList;

public class Test3 {
    public static void main(String[] args) {
//    1. 创建LinkedList
        LinkedList<String> link = new LinkedList<>();
//    2. 使用add方法添加元素
        link.add("A");
        link.add("C");
        link.add("D");
        System.out.println(link);
//    3. 使用add方法在指定索引添加元素
        link.add(1,"B");
        System.out.println(link);
//    4. 使用set方法修改指定位置索引
        link.set(1,"b");
        System.out.println(link);
//    5. 使用get方法获取指定索引的元素
        System.out.println(link.get(1));
//    6. 使用size方法获取集合大小
        System.out.println(link.size());
//    7. 使用remove方法删除指定索引的元素
        link.remove(1);
        System.out.println(link);
//    8. 使用clear清空集合中的元素
        link.clear();
        System.out.println(link);
    }
}
