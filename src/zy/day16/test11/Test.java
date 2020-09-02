package zy.day16.test11;

import java.util.ArrayList;
import java.util.Random;

public class Test {
    public static ArrayList<Integer> list = new ArrayList<>();
    public static Integer sum = 100;
    public static Integer qian = 0;
    public static Integer hou = 0;
    public static Integer index = 0;


    public static void main(String[] args) {
        DoubleColorBallUtil dcb = new DoubleColorBallUtil();
        Random r = new Random();
        while (list.size() < 100) {
            int num = r.nextInt(100) + 1;
            if (!list.contains(num)) {
                list.add(num);
            }
        }
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                while (true) {
                    synchronized (dcb) {
                        try {
                            Thread.sleep(10);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        if (sum <= 0) {
                            break;
                        } else {
                            System.out.println("编号为:" + list.get(index) + "\t的员工从" + Thread.currentThread().getName() +
                                    "入场!\t拿到的双色球彩票号码是:" + dcb.create());
                            sum--;
                        }
                        if ("前门".equals(Thread.currentThread().getName())) {
                            ++qian;
                        } else {
                            ++hou;
                        }
                    }
                    index++;
                }
                if ("前门".equals(Thread.currentThread().getName())) {
                    System.out.println("从前门入场的员工总共:" + qian + "位员工");
                } else {
                    System.out.println("从前门入场的员工总共:" + hou + "位员工");
                    ;
                }
            }
        };
        new Thread(runnable, "后门").start();
        new Thread(runnable, "前门").start();
    }
}
