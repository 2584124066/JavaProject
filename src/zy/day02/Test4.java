package zy.day02;

public class Test4 {
    public static void main(String[] args) {
        int a1 = 10, a2 = 11;
        int b1 = 12, b2 = 13;
        String result1 = a1 % 2 == 0 ? "true" : "false";
        String result2 = a2 % 2 == 0 ? "true" : "false";
        String result3 = b1 % 2 == 1 ? "true" : "false";
        String result4 = b2 % 2 == 1 ? "true" : "false";

        System.out.println(a1+"是偶数？"+result1);
        System.out.println(a2+"是偶数？"+result2);
        System.out.println(b1+"是奇数？"+result3);
        System.out.println(b2+"是奇数？"+result4);

    }
}
