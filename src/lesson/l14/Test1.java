package lesson.l14;

import java.util.HashMap;

public class Test1 {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        //添加元素到集合
        map.put("黄晓明", "杨颖");
        map.put("文章", "马伊琍");
        map.put("邓超", "孙俪");
        System.out.println(map);
        //删除
        System.out.println(map.remove("文章"));
        System.out.println(map);
        //获取对应的值
        System.out.println(map.get("邓超"));
        //判断集合中是否包含指定的键
        System.out.println(map.containsKey("黄晓明"));
    }
}
