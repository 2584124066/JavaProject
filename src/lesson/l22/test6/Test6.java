package lesson.l22.test6;

import org.junit.Test;

public class Test6 {

    @Test
    public void method() {
        System.out.println(ColorEnum.BLUE);
        System.out.println(ColorEnum.GREEN.name());
    }

    @Test
    public void method2() {
        String name = DirectionEnum.FRONT.getName();
        System.out.println(name);
        String name1 = DirectionEnum.BEHIND.name();
        System.out.println(name1);
    }

    @Test
    public void method3() {
        String sex = "3";
        if (SexEnum.MAN.getValue().equals(sex)) {
            System.out.println("男");
        } else if (SexEnum.WOMAN.getValue().equals(sex)) {
            System.out.println("女");
        } else {
            System.out.println("数据不合法");
        }
    }

    @Test
    public void method4() {
        System.out.println(AdminEnum.MA_YUN.getId());
        System.out.println(AdminEnum.MA_YUN.getAccount());
    }
}
