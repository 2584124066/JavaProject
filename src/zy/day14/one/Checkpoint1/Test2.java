package zy.day14.one.Checkpoint1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Test2 {
    public static void main(String[] args) {
//        1. 创建HashMap
        HashMap<Integer,String> hashMap = new HashMap<>();
//        2. 使用put添加元素
        hashMap.put(1,"孙七");
        hashMap.put(2,"周八");
        hashMap.put(3,"吴九");
        hashMap.put(4,"郑十");
        hashMap.put(5,"张三");
//        3. 使用Map的keySet方法获取到所有的key
        Set<Integer> integers = hashMap.keySet();
//        4. 使用增强for获取每个key
        for (Integer integer : integers) {
            System.out.println(integer);
        }
//        5. 获取keySet的迭代器
        Iterator<Integer> it = integers.iterator();
//        6. 循环判断迭代器中是否有下一个元素
        while (it.hasNext()){
//        7. 使用迭代器获取每个key
            System.out.println(it.next());
        }
    }
}
