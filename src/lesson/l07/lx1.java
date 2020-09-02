package lesson.l07;

import java.util.Scanner;

public class lx1 {
    public static void main(String[] args) {
        //创建scanner对象，调用next()方法
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入字符串");
        String userStr = sc.next();
        //定义4个变量记录大小写、数字、其他字符出现的次数
        int bigCount = 0;
        int smallCount = 0;
        int numCount = 0;
        int otherCount = 0;
        for (int i = 0; i < userStr.length(); i++) {
            //遍历字符串，取出字符串中的每一个字符
            char ch = userStr.charAt(i);
            //在循环内部判断字符 对应的次数+1
            if (ch>='A'&&ch<='Z'){
                bigCount++;
            }else if (ch>='a'&&ch<='z'){
                smallCount++;
            }else if (ch>='0'&&ch<='9'){
                numCount++;
            }else {
                otherCount++;
            }
        }
        System.out.println("大写字母有："+bigCount);
        System.out.println("小写字母有："+smallCount);
        System.out.println("数字有："+numCount);
        System.out.println("其他字符有："+otherCount);
    }
}
