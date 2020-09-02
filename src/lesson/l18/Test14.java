package lesson.l18;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.Set;

public class Test14 {
    public static void main(String[] args) throws Exception{
        Properties p = new Properties();
        p.load(new FileInputStream("src/lesson_18/p.properties"));

        Set<String> keys = p.stringPropertyNames();
        for (String key : keys) {
            System.out.println(key+"---->"+p.getProperty(key));
        }
    }
}
