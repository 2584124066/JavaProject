package zy.day14.one.Checkpoint2;

import java.util.HashMap;
import java.util.Set;

public class Test2 {
    public static void main(String[] args) {
//        1. 定义HashMap,姓名作为key,工资作为value
        HashMap<String,Integer> hashMap = new HashMap<>();
//        2. 使用put方法添加需要的元素
        hashMap.put("柳岩",2100);
        hashMap.put("张亮",1700);
        hashMap.put("诸葛亮",1800);
        hashMap.put("灭绝师太",2600);
        hashMap.put("东方不败",3800);
//        3. 获取到柳岩的工资
        Integer salary = hashMap.get("柳岩");
//        4. 修改柳岩的工资为当前工资加上300
        hashMap.put("柳岩",salary+300);
//        5. 使用增强for+keySet迭代出每个员工的工资
        Set<String> set = hashMap.keySet();
        for (String s : set) {
            System.out.println(s+"->"+hashMap.get(s));
        }
    }
}
