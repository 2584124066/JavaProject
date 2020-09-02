package lesson.l16.test3;

public class Test {
    public static void main(String[] args) {
        Printer p = new Printer();
        new Thread() {
            @Override
            public void run() {
                try {
                    p.show1();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }.start();
        new Thread() {
            @Override
            public void run() {
                try {
                    p.show2();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }.start();
        new Thread() {
            @Override
            public void run() {
                try {
                    p.show3();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }.start();
    }
}
