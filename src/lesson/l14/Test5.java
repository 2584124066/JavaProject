package lesson.l14;

import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.Set;

public class Test5 {
    public static void main(String[] args) {
        System.out.println("请录入一个字符串:");
        String line = new Scanner(System.in).next();
        findChar(line);
    }

    private static void findChar(String line) {
        LinkedHashMap<Character,Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < line.length(); i++) {
            char c = line.charAt(i);
            if (!map.containsKey(c)){
                map.put(c,1);
            }else {
                Integer count = map.get(c);
                map.put(c,++count);
            }
        }
        Set<Character> characters = map.keySet();
        for (Character character : characters) {
            System.out.println(character+" 出现了"+map.get(character)+"次");
        }
    }
}
