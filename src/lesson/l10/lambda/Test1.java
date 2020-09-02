package lesson.l10.lambda;

public class Test1 {
    public static void invokeCook(Cook cook) {
        cook.makeFood();
    }

    public static void main(String[] args) {

        new Start(new Task() {
            @Override
            public void task() {
                System.out.println("开启任务啦！");
            }
        }).run();

        new Start(() -> System.out.println("使用lambda表达式开启任务！")).run();

        new Start(() -> {
            System.out.println("使用lambda表达式开启任务！");
            System.out.println("我来了");
        }).run();

        invokeCook(() -> System.out.println("吃饭啦！"));
    }
}
