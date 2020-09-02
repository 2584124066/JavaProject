package lesson.l15.test14;

public class MyRun2 implements Runnable {
    private Entity entity;

    public MyRun2(Entity entity) {
        this.entity = entity;
    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (entity) {
                System.out.println("线程2开始唤醒");
                entity.notifyAll();
            }
        }
    }
}