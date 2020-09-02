package zy.day14.one.Checkpoint1;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Test1 {
    public static void main(String[] args) {
//        1. 创建HashMap
        HashMap<Integer,String> hashMap = new HashMap<>();
//        2. 使用put添加元素
        hashMap.put(1,"孙七");
        hashMap.put(2,"周八");
        hashMap.put(3,"吴九");
        hashMap.put(4,"郑十");
        hashMap.put(5,"张三");
//        3. 使用put修改元素
        hashMap.put(5,"王五");
//        4. 使用get获取元素
        System.out.println(hashMap.get(1));
//        5. 使用remove删除元素
        hashMap.remove(1);
//        6. 打印集合中的元素
        System.out.println(hashMap);
        Set<Integer> integers = hashMap.keySet();
        for (Integer integer : integers) {
            System.out.println(hashMap.get(integer));
        }
        Set<Map.Entry<Integer, String>> entries = hashMap.entrySet();
        for (Map.Entry<Integer, String> entry : entries) {
            Integer key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key+"-"+value);
        }
    }
}
