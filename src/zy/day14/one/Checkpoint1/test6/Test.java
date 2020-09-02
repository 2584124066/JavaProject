package zy.day14.one.Checkpoint1.test6;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Test {
    public static void main(String[] args) {
        HashMap<Student,String> hashMap = new HashMap<>();
        hashMap.put(new Student("刘一",11),"北京");
        hashMap.put(new Student("陈二",12),"上海");
        hashMap.put(new Student("孙七",17),"广东");
        hashMap.put(new Student("周八",18),"深圳");
        hashMap.put(new Student("吴九",19),"成都");
        hashMap.put(new Student("郑十",20),"杭州");

        Set<Student> students = hashMap.keySet();
        for (Student key : students) {
            String value = hashMap.get(key);
            System.out.println(key+"->"+value);
        }

        Set<Map.Entry<Student, String>> entries = hashMap.entrySet();
        for (Map.Entry<Student, String> entry : entries) {
            Student key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key+"->"+value);
        }
    }
}
