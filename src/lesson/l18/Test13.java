package lesson.l18;

import java.util.Properties;
import java.util.Set;

public class Test13 {
    public static void main(String[] args) {
        Properties p = new Properties();
        p.setProperty("a","曹丕");
        p.setProperty("b","刘备");
        p.setProperty("c","孙权");
        p.setProperty("d","司马严");

        System.out  .println(p.getProperty("a"));

        Set<String> keys = p.stringPropertyNames();
        for (String key : keys) {
            System.out.println(key+"---->"+p.getProperty(key));
        }
    }
}
