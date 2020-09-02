package zy.day10.test4;

public class Test {
    public static void main(String[] args) {
        Worker worker = new Worker();
        Apple[] apples = {
                new Apple(5, "青色"),
                new Apple(3, "红色")
        };

        System.out.println("默认挑选大的：");
        Apple apple = worker.pickApple(new Compare(), apples[0], apples[1]);
        System.out.println(apple.getSize() + "-" + apple.getColor());

        Apple sortColor = worker.pickApple(new CompareAble() {
            @Override
            public Apple compare(Apple a, Apple b) {
                return "红色".equals(a.getColor()) ? a : b;
            }
        }, apples[0], apples[1]);

        System.out.println("挑红的：");
        System.out.println(sortColor.getSize() + "-" + sortColor.getColor());

    }
}
