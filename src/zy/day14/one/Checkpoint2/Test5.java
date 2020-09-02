package zy.day14.one.Checkpoint2;

import java.util.HashMap;
import java.util.Scanner;

public class Test5 {
    public static void countingKey(HashMap<String, Integer> map, String key) {
        if (!map.containsKey(key)) {
            map.put(key, 1);
        } else {
            map.put(key, map.get(key) + 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String string = sc.nextLine();
        HashMap<String, Integer> map = new HashMap<>();
        char[] chars = string.toCharArray();
        for (char ch : chars) {
            if (ch >= 65 && ch <= 90 || ch >= 97 && ch <= 122) {
                countingKey(map, "字母");
            } else if (ch == 32) {
                countingKey(map, "空格");
            } else if (ch >= 48 && ch <= 57) {
                countingKey(map, "数字");
            } else {
                countingKey(map, "其他");
            }
        }
        System.out.println(map);
    }
}
