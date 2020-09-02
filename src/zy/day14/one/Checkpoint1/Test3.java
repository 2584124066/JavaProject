package zy.day14.one.Checkpoint1;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

public class Test3 {
    public static void main(String[] args) {
//        1. 创建HashMap
        HashMap<Integer,String> hashMap = new HashMap<>();
//        2. 使用put添加元素
        hashMap.put(1,"孙七");
        hashMap.put(2,"周八");
        hashMap.put(3,"吴九");
        hashMap.put(4,"郑十");
//        3. 使用Map的values方法获取到所有的value
        Collection<String> values = hashMap.values();
//        4. 使用增强for获取每个value
        for (String value : values) {
            System.out.println(value);
        }
//        5. 使用迭代器获取每个value
        Iterator<String> it = values.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
