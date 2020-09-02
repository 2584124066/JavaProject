package zy.day13.Checkpoint1;

import java.util.LinkedList;

public class Test4 {
    public static void main(String[] args) {
//        1. 创建LinkedList
        LinkedList<Integer> links = new LinkedList<>();
//        2. 使用add方法添加元素
        links.add(1);
        links.add(2);
        links.add(3);
        links.add(4);
        System.out.println(links);
//        3. 使用addFirst添加元素到集合最前面
        links.addFirst(0);
        System.out.println(links);
//        4. 使用addLast添加元素到集合最后面
        links.addLast(5);
        System.out.println(links);
//        5. 使用getFirst获取集合第一个元素
        System.out.println(links.getFirst());
//        6. 使用getLast获取集合最后一个元素
        System.out.println(links.getLast());
//        7. 使用removeLast删除集合第一个元素
        links.removeFirst();
        System.out.println(links);
//        8. 使用removeLast删除集合最后一个元素
        links.removeLast();
        System.out.println(links);
    }
}
