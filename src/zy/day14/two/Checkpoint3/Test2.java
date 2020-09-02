package zy.day14.two.Checkpoint3;

import java.util.Random;

public class Test2 {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                int sum = 0;
                Random r = new Random();
                for (int i = 0; i < 10; i++) {
                    int num = r.nextInt(901) + 100;
                    sum += num;
                    if (i < 9) {
                        System.out.print(num + "+");
                    } else {
                        System.out.println(num + "=" + sum);
                    }
                }
            }
        }).run();
    }
}
