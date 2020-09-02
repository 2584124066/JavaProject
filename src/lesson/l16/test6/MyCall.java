package lesson.l16.test6;

import java.util.concurrent.Callable;

public class MyCall implements Callable {
    @Override
    public String call() throws Exception {
        return "hello";
    }
}
