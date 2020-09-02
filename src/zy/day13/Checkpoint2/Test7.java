package zy.day13.Checkpoint2;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class Test7 {
    public static void main(String[] args) {
//        1. 创建Scanner对象,用于键盘录入
        Scanner sc = new Scanner(System.in);
//        2. 调用Scanner的nextLine()方法,让用户输入一个字符串
        String s = sc.nextLine();
//        3. 创建LinkedHashSet.用于去除重复的字符串,并保证迭代顺序
        LinkedHashSet<Character> lhs = new LinkedHashSet<>();
//        4. 将字符串串转成char[]
        char[] chars = s.toCharArray();
//        5. 使用增强for循环遍历每个字符
        for (char c : chars) {
//        6. 将每个字符添加到LinkedHashSet中
            lhs.add(c);
        }
//        7. 使用增强for打印LinkedHashSet中的内容
        for (Character character : lhs) {
            System.out.println(character);
        }
    }
}
