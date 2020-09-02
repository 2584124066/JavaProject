package lesson.l14;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Test4 {
    public static void main(String[] args) {
        LinkedHashMap<String, String> map = new LinkedHashMap<>();
        map.put("邓超", "孙俪");
        map.put("李晨", "范冰冰");
        map.put("刘德华", "朱丽倩");
        System.out.println(map);

        Set<String> keys = map.keySet();
        for (String key : keys) {
            System.out.println(key+"----->"+map.get(key));
        }

        Set<Map.Entry<String,String>> entries = map.entrySet();
        for (Map.Entry<String, String> entry : entries) {
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key+"=====>"+value);
        }
    }
}
