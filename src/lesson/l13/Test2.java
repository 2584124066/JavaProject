package lesson.l13;

import java.util.LinkedList;

public class Test2 {
    public static void main(String[] args) {
        LinkedList<String> link = new LinkedList<>();
        //添加元素
        link.addFirst("3");
        link.addFirst("2");
        link.addFirst("1");
        link.addLast("4");
        link.addLast("5");
        link.add("6");
        System.out.println(link);
        // 获取元素
        System.out.println(link.get(1));
        System.out.println(link.getFirst());
        System.out.println(link.getLast());
        // 删除元素
        link.remove(1);
        System.out.println(link);
        link.removeFirst();
        System.out.println(link);
        link.removeLast();
        System.out.println(link);
        link.remove("3");
        System.out.println(link);

        link.clear();
        System.out.println(link);

        //将元素推入此列表
        link.push("2");
        System.out.println(link);

        while (!link.isEmpty()) {//判断集合是否为空
            System.out.println(link.pop());//弹出集合中的栈顶元素
        }
        System.out.println(link);

    }
}
