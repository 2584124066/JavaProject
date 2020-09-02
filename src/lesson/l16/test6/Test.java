package lesson.l16.test6;

import java.util.concurrent.*;

public class Test {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService service = Executors.newCachedThreadPool();
        MyCall myCall = new MyCall();
        Future<String> result = service.submit(myCall);
        System.out.println(result.get());


        FutureTask<String> futureTask = new FutureTask<>(myCall);
        Thread thread = new Thread(futureTask);
        thread.start();
        System.out.println(futureTask.get());
    }
}
