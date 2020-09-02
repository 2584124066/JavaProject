package zy.day21.test11;

public class MyTestDemo {
    @MyTest
    public void test1() {
        System.out.println("自定义的Test1方法执行啦！！~~~");
    }

    public void test2() {
        System.out.println("自定义的Test2方法执行啦！！~~~");
    }

    @MyTest
    public void test3() {
        System.out.println("自定义的Test3方法执行啦！！~~~");
    }
}
