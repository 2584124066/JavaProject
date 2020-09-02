package zy.day12.Checkpoint1;

import java.util.ArrayList;
import java.util.Collection;

public class Test1 {
    public static void main(String[] args) {
        //创建Collection对象
        Collection<String> collection = new ArrayList<>();
        //添加对象元素
        collection.add("aa");
        collection.add("bb");
        collection.add("cc");
        //删除元素
        collection.remove("aa");
        //集合大小
        System.out.println(collection.size());
        //清空集合
        collection.clear();
        //输出集合内容
        System.out.println(collection);


    }
}
