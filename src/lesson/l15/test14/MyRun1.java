package lesson.l15.test14;

public class MyRun1 implements Runnable {
    public Entity entity;

    public MyRun1(Entity entity) {
        this.entity = entity;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (entity) {
                System.out.println("线程1进入等待状态");
                try {
                    //无限等待
                    entity.wait();
//                    1000毫秒后会自动醒来
//                     entity.wait(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("线程1被唤醒了");
            }
        }
    }
}