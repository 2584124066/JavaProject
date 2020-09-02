package zy.day14.one.Checkpoint1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Test4 {
    public static void main(String[] args) {
//        1. 创建HashMap
        HashMap<String,String> hashMap = new HashMap<>();
//        2. 使用put添加元素
        hashMap.put("邓超","孙俪");
        hashMap.put("李晨","范冰冰");
        hashMap.put("刘德华","柳岩");
        hashMap.put("黄晓明","Baby");
        hashMap.put("谢霆锋","张柏芝");
//        3. 使用Map的keySet方法获取到所有的键
        Set<String> integers = hashMap.keySet();
//        4. 获取keySet的迭代器
        Iterator<String> it = integers.iterator();
//        5. 循环判断迭代器中是否有下一个元素
        while (it.hasNext()){
//        6. 使用迭代器next方法获取到一个键key
            String next = it.next();
//        7. 通过一个键找到一个值
            String value = hashMap.get(next);
//        8. 输出键和值
            System.out.println(next+"->"+value);
        }
    }
}
