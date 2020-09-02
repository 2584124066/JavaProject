package lesson.l10.anonymous;

public class Test1 {
    public static void main(String[] args) {
        new Swim() {
            @Override
            public void swiming() {
                System.out.println("蛙式游戏....");
            }
        }.swiming();

        //返回一个实现了swim接口的子类对象,只不过该对象是匿名的
        Swim swim4 = new Swim() {
            @Override
            public void swiming() {
                System.out.println("鹅划式游戏...");
            }
        };
        swim4.swiming();
    }
}
