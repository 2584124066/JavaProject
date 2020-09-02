package zy.day14.one.Checkpoint3;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Test1 {
    public static void main(String[] args) {
        HashMap<Integer,HashMap<String,String>> science = new HashMap<>();

        HashMap<String,String> class1 = new HashMap<>();
        HashMap<String,String> class2 = new HashMap<>();
        class1.put("001","李晨");
        class1.put("002","范冰冰");
        class2.put("001","马云");
        class2.put("002","马化腾");

        science.put(1,class1);
        science.put(2,class2);

        Set<Integer> integers = science.keySet();
        for (Integer integer : integers) {
            System.out.println(science.get(integer));
        }

        Set<Map.Entry<Integer, HashMap<String, String>>> entries = science.entrySet();
        Iterator<Map.Entry<Integer, HashMap<String, String>>> it = entries.iterator();
        while (it.hasNext()){
            Map.Entry<Integer, HashMap<String, String>> next = it.next();
            System.out.println(next);
        }
    }
}
