package lesson.l14;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Test2 {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("胡歌", "霍建华");
        map.put("郭德纲", "于谦");
        map.put("薛之谦", "大张伟");

        //获取所有的键 获取键集
        Set<String> keys = map.keySet();
        for (String key : keys) {
            System.out.println(key+">>>>>>>"+map.get(key));
        }

        //获取Map集合中所有的键值对对象的集合
        Set<Map.Entry<String,String>> entries = map.entrySet();
        for (Map.Entry<String, String> entry : entries) {
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key+"====>"+value);
        }

    }
}
