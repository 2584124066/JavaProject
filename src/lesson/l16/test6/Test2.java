package lesson.l16.test6;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

public class Test2 {
    public static void main(String[] args) throws Exception {
        FutureTask<String> futureTask = new FutureTask<>(()->{
            return "hello";
        });
        Thread thread = new Thread(futureTask);
        thread.start();
        System.out.println(futureTask.get());

        FutureTask<String> futureTask1 = new FutureTask<>(new Callable<String>() {
            @Override
            public String call() throws Exception {
                return "hello";
            }
        });
        Thread thread1 = new Thread(futureTask1);
        thread1.start();
        System.out.println(futureTask1.get());
    }
}
