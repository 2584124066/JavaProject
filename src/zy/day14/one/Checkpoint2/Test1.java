package zy.day14.one.Checkpoint2;

import java.util.HashMap;
import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        HashMap<String, Integer> hashMap = new HashMap<>();
        System.out.println("使用键盘录入5个学生信息,录入格式为:姓名,年龄");
        Scanner sc = new Scanner(System.in);
        while (hashMap.size() < 5) {
            String[] strArr = sc.next().split(",");
            hashMap.put(strArr[0],Integer.valueOf(strArr[1]));
        }
        System.out.println(hashMap);
    }
}
