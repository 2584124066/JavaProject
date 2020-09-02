package zy.day02;

public class Test7 {
    public static void add(int x, int y) {
        int result = x + y;
        System.out.println("x,y的和为：" + result);
    }

    public static void sub(int x, int y) {
        int result = x - y;
        System.out.println("x,y的差为：" + result);
    }

    public static void mul(int x, int y) {
        int result = x * y;
        System.out.println("x,y的积为：" + result);
    }

    public static void div(int x, int y) {
        int result = x / y;
        System.out.println("x,y的商为：" + result);
    }

    public static void remain(int x, int y) {
        int result = x% y;
        System.out.println("x,y的余为：" + result);
    }

    public static void main(String[] args) {
        int x=100,y=200;
        add(x,y);
        sub(x,y);
        mul(x,y);
        div(x,y);
        remain(x,y);
    }
}
