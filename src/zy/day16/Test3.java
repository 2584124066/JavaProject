package zy.day16;

import java.util.Random;
import java.util.concurrent.*;

public class Test3 {
    public static Random r = new Random();
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Callable c = new Callable() {
            @Override
            public Object call() throws Exception {
                double sum = 0;
                for (int i = 0; i < 10; i++) {
                    sum += (r.nextInt(100)+1);
                }
                return sum/10;
            }
        };

        ExecutorService service = Executors.newFixedThreadPool(2);
        Future<Double> result1 = service.submit(c);
        Future<Double> result2 = service.submit(c);
        Future<Double> result3 = service.submit(c);
        double avg = result1.get() + result2.get() + result3.get();
        System.out.println(avg);


    }
}
