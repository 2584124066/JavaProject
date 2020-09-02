package lesson.l06;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = (int) (Math.random() * 101);
        System.out.println("请输入0-100的数字");
        int count = 5;
        while (true) {
            if (count > 0) {
                int iptNum = s.nextInt();
                count--;
                if (iptNum == num) {
                    System.out.println("恭喜您猜中了");
                    break;
                } else {
                    if (count == 0) {
                        System.out.println("很遗憾您次数已经用尽了,正确结果是"+num);
                        break;
                    }
                    if (iptNum > num) {
                        System.out.println("您猜大了，请重新输入");
                    } else if (iptNum < num) {
                        System.out.println("您猜小了，请重新输入");
                    }
                }
            }
        }
    }
}
