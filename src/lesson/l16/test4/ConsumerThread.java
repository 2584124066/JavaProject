package lesson.l16.test4;

//消费
public class ConsumerThread implements Runnable {
    //生产消费标识符
    private BaoZi bz;

    public ConsumerThread() {
    }

    public ConsumerThread(BaoZi bz) {
        this.bz = bz;
    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            //使用同步代码块保证线程同步
            synchronized (bz) {
                if (bz.getFlag() % 2 == 1) {
                    //更改标识符
                    bz.setFlag(bz.getFlag() + 1);
                    System.out.println("消费线程正在消费:" + bz.getName() + "\t价格:" + bz.getPrice());
                    try {
                        //等待之前把生产线程唤醒
                        bz.notify();
                        //消费完毕之后应该等待,生产线程执行
                        bz.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}
