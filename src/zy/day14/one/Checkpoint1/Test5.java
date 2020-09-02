package zy.day14.one.Checkpoint1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Test5 {
    public static void main(String[] args) {
//        1. 创建HashMap
        HashMap<String,String> hashMap = new HashMap<>();
//        2. 使用put方法添加元素
        hashMap.put("邓超","孙俪");
        hashMap.put("李晨","范冰冰");
        hashMap.put("刘德华","柳岩");
        hashMap.put("黄晓明","Baby");
        hashMap.put("谢霆锋","张柏芝");
//        3. 使用entrySet方法获取到所有的键值对关系
        Set<Map.Entry<String, String>> entries = hashMap.entrySet();
//        4. 获取entrySet的迭代器
        Iterator<Map.Entry<String, String>> it = entries.iterator();
//        5. 使用迭代器查看是否有下一个元素
        while (it.hasNext()) {
//        6. 使用迭代器拿到下一个元素(Entry类型)
            Map.Entry<String, String> next = it.next();
//        7. 通过一个Entry获取到key和value
            String key = next.getKey();
            String value = next.getValue();
            System.out.println(key+"->"+value);
        }
    }
}
