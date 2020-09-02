package zy.day16;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Test4 {
    public static void main(String[] args){

        Runnable r1 = () -> {
            int sum = 1;
            for (int i = 1; i <= 10; i++) {
                sum *= i;
            }
            System.out.println(Thread.currentThread().getName() + "执行\t10的阶乘\t结果是：" + sum);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };
        Runnable r2 = () -> {
            int sum = 1;
            for (int i = 1; i <= 5; i++) {
                sum *= i;
            }
            System.out.println(Thread.currentThread().getName() + "执行\t5的阶乘\t结果是：" + sum);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };
        Runnable r3 = () -> {
            int sum = 1;
            for (int i = 1; i <= 8; i++) {
                sum *= i;
            }
            System.out.println(Thread.currentThread().getName() + "执行\t8的阶乘\t结果是：" + sum);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };

        ExecutorService service = Executors.newFixedThreadPool(2);
        service.submit(r1);
        service.submit(r2);
        service.submit(r3);

    }
}
