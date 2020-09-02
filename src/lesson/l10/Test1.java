package lesson.l10;

public class Test1 {
    public static void main(String[] args) {
        //创建内部类，第一种方式：
        Body1.Heart h = new Body1().new Heart();
        h.jump();

        //第二种方式 先创建外部类
        Body1 body1 = new Body1();
        //通过外部类对象再创建内部类对象
        Body1.Heart h2 = body1.new Heart();
        body1.live=false;
        h2.jump();
    }
}
