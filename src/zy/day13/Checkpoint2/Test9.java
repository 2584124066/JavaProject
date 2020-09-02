package zy.day13.Checkpoint2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class Test9 {
    public static void main(String[] args) {
//        1. 创建ArrayList array1
        ArrayList<String> array1 = new ArrayList();
//        2. 使用add方法为array1存放对应的元素
        Collections.addAll(array1,"a","b","a","c","d");
//        3. 创建ArrayList array2
        ArrayList<String> array2 = new ArrayList();
//        4. 使用add方法为array2存放对应的元素
        Collections.addAll(array2,"e","f","a","d","g");
//        5. 创建HashSet用于存放去除重复的元素
        HashSet<String> hs = new HashSet<>();
//        6. 遍历array1,获取到每个元素,将每个元素添加到HashSet中
        for (String s : array1) {
            hs.add(s);
        }
//        7. 遍历array2,获取到每个元素,将每个元素添加到HashSet中
        for (String s : array2) {
            hs.add(s);
        }
//        8. 输出HashSet中去除重复后的元素
        hs.stream().forEach(System.out::println);
    }
}
