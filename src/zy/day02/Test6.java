package zy.day02;

import java.util.Scanner;

public class Test6 {
    public static void printString(int num) {
        String str = num % 2 == 0 ? "偶数" : "奇数";
        System.out.println("num："+num+"是"+str);
    }
    public static void main(String[] args) {
        printString(69);
        System.out.println("请输入：");
        //键盘输入
        Scanner scanner = new Scanner(System.in);
        int num= scanner.nextInt();
        System.out.println(num);
        // 编程找出所有的水仙花数
        System.out.print("100-1000中的水仙花数： ");
        for (int i = 100; i < 1000; i++) {
            int bai = i / 100, shi = i / 10 % 10, ge = i % 10;
            if (bai * bai * bai + shi * shi * shi + ge * ge * ge == i) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}
