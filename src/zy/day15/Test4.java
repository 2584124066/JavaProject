package zy.day15;

public class Test4 {
    public static void main(String[] args) {
        new Thread("线程1") {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println("播放背景音乐");
                }
            }
        }.run();

        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println("显示画面");
                }
            }
        },"线程2").run();

        int a = 2;
    }
}
