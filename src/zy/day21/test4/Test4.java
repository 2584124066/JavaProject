package zy.day21.test4;

import org.junit.Test;

import java.lang.reflect.Method;

public class Test4 {
    @Test
    public void methos() throws Exception {
        Class<Print> printClass = Print.class;
        Method show = printClass.getMethod("show", String.class);
        show.invoke(new Print(), "秀儿！是你吗？");
    }
}
