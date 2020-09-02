package zy.day21.test5;

import java.lang.reflect.Method;
import java.util.Scanner;

public class TestA {
    public static void main(String[] args) throws Exception {

        String s = new Scanner(System.in).nextLine();
        Class aClass = Class.forName(s);
        Method show = aClass.getMethod("showString", String.class);
        show.invoke(new A(), "秀儿！是你吗？");

    }
}
