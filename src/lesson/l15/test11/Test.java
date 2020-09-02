package lesson.l15.test11;

public class Test {
    public static void main(String[] args) {

        Shower s = new Shower();
        new Thread() {
            @Override
            public void run() {
                while (true) {
                    s.show();
                }
            }
        }.start();

        new Thread() {
            @Override
            public void run() {
                while (true) {
                    s.show2();
                }
            }
        }.start();
    }
}
