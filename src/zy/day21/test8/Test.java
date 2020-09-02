package zy.day21.test8;

import java.io.FileInputStream;
import java.lang.reflect.Method;
import java.util.Properties;

public class Test {
    public static void main(String[] args) throws Exception {
        Properties p = new Properties();
        p.load(new FileInputStream("src/zy/day21/test8/test.properties"));
        String aClass = p.getProperty("class");

        Class c = Class.forName(aClass);
        Method run = c.getMethod("run");
        run.setAccessible(true);
        Object o = c.newInstance();
        run.invoke(o);

    }
}
