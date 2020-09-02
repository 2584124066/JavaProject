package zy.day12.Checkpoint1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Test3 {
    public static void main(String[] args) {
        // 创建Collection对象
        Collection<String> collection = new ArrayList<>();
        //往集合中存放元素
        collection.add("abc1");
        collection.add("abc2");
        collection.add("abc3");
        collection.add("abc4");
        //获取容器的迭代器
        Iterator<String> iterator = collection.iterator();
        while (iterator.hasNext()) {//使用迭代器判断是否有下一个元素
            System.out.println(iterator.next());//使用迭代器对象获取集合中的元素
        }
    }
}
