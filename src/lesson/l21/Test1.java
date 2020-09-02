package lesson.l21;


import org.junit.*;

public class Test1 {
    @Test
    public void method() {
        System.out.println("我是测试方法");
        int i = 1 / 0;
    }

    @BeforeClass
    public static void init() {
        System.out.println("类加载时，只运行一次");
    }

    @Before
    public void myBefore() {
        System.out.println("方法前运行");
    }

    @After
    public void myAfter() {
        System.out.println("方法后运行");
    }

    @AfterClass
    public static void destory() {
        System.out.println("类结束前，只运行一次");
    }
}
