package zy.day15;

public class Test9 {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                int sum = 1;
                for (int i = 1; i <= 10; i++) {
                    sum *= i;
                }
                System.out.println("10的阶乘：" + sum);
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                int sum = 1;
                for (int i = 1; i <= 5; i++) {
                    sum *= i;
                }
                System.out.println("5的阶乘：" + sum);
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                int sum = 1;
                for (int i = 1; i <= 8; i++) {
                    sum *= i;
                }
                System.out.println("8的阶乘：" + sum);
            }
        }).start();
    }
}
