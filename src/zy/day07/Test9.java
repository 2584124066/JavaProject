package zy.day07;

import java.util.ArrayList;

public class Test9 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        String[] strings = {"bca", "dadfa", "dddaaa", "你好啊", "我来啦你干嘛呢", "别跑啊"};
        for (int i = 0; i < strings.length; i++) {
            list.add(strings[i]);
        }

        System.out.println("源ArrayList："+list);

        System.out.print("删除后的ArrayList：");
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).length() > 4) {
                list.remove(i);
                i -= 1;
            }
        }
        System.out.println(list);
    }
}
