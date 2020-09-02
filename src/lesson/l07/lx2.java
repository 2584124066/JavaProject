package lesson.l07;

import java.util.Scanner;

public class lx2 {
    public static int getCount(String str,char ch){
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (ch == str.charAt(i)) {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入一个字符串");
        String str = sc.next();

        System.out.println("请输入要查询出现次数的字符");
        char ch = sc.next().charAt(0);

        System.out.println(ch+" 出现的次数："+getCount(str,ch));
    }
}
