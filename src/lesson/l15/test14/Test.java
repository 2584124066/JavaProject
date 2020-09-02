package lesson.l15.test14;

public class Test {
    public static void main(String[] args) {
        Entity entity = new Entity();
        MyRun1 run1 = new MyRun1(entity);
        Thread thread = new Thread(run1);
        thread.start();
        MyRun2 run2 = new MyRun2(entity);
        Thread thread2 = new Thread(run2);
        thread2.start();
    }
}
