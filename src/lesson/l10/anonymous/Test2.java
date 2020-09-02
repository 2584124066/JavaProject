package lesson.l10.anonymous;

public class Test2 {
    //模拟，请一些人去游泳
    public static void swim(Swim s) {
        s.swiming();
    }
    public static void main(String[] args) {
        //普通方法
        Student s1 = new Student();
        swim(s1);

        //使用匿名内部类方式,创建了一个匿名的类,该类实现了Swim接口
        swim(new Swim() {
            @Override
            public void swiming() {
                System.out.println("仰泳......");
            }
        });
    }
}
