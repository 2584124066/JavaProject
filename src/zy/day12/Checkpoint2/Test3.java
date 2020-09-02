package zy.day12.Checkpoint2;

import java.util.ArrayList;

public class Test3 {
    public static int frequency(ArrayList arr, String key) {
        int count = 0;//计数
        for (Object o : arr) {
            if (key.equals(o)){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        //创建ArrayList
        ArrayList<String> list = new ArrayList<>();
        String[] strArr = {"a", "b", "c", "c", "a", "b", "b", "b", "a"};
        //添加元素
        for (String s : strArr) {
            list.add(s);
        }
        String key = "c";
        System.out.println(key+"出现"+frequency(list, key)+"次");
    }
}
