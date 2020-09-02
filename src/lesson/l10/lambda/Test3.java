package lesson.l10.lambda;

public class Test3 {
    private static void invokeCalc(int a, int b, Calculator calculator) {
        int result = calculator.calc(a, b);
        System.out.println("结果是：" + result);
    }

    private static void invokeCook(Cook cook) {
        cook.makeFood();
    }

    public static void main(String[] args) {
        invokeCalc(120, 130, (a, b) -> a + b
        );

        invokeCook(()-> System.out.println("吃饭啦！"));
    }
}
