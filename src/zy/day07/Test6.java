package zy.day07;

import java.util.Scanner;

public class Test6 {
    public static void main(String[] args) {
        String mgc = "奥巴马";
        System.out.println("请输入一个字符串");
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        System.out.println(string.replace(mgc, "*"));
    }
}
