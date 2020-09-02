package lesson.l14;

import java.util.HashMap;
import java.util.Set;

public class Test3 {
    public static void main(String[] args) {
        HashMap<Student, String> map = new HashMap<>();
        map.put(new Student("lisi", 28), "上海");
        map.put(new Student("wangwu", 22), "北京");
        map.put(new Student("zhaoliu", 24), "成都");
        map.put(new Student("zhouqi", 25), "广州");
        map.put(new Student("wangwu", 22), "南京");

        Set<Student> keySet = map.keySet();
        for (Student student : keySet) {
            System.out.println(student.toString()+map.get(student));
        }
    }
}
