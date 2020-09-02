package lesson.l21.test3;

import org.junit.Test;

import java.io.FileInputStream;
import java.lang.reflect.Field;
import java.util.Properties;
import java.util.Set;

public class Test3 {
    @Test
    public void createObject() throws Exception {
        /*第一步：先获取属性集*/
        //1.    创建属性集合
        Properties p = new Properties();
        //2.    从文件中加载内容到集合中
        p.load(new FileInputStream("src/lesson/l21/test3/stu.properties"));
        Set<String> keys = p.stringPropertyNames();

        /*第二步：赋值*/
        //1.    通过反射获得Class对象
        Class c = Class.forName(p.getProperty("class"));
        //2.    创建实例化对象
        Object obj = c.getDeclaredConstructor().newInstance();
        //3.    遍历集合
        for (String key : keys) {
            if ("class".equals(key)) {// 判断key是否class
                continue;
            }
            // key====>成员变量名
            //根据成员变量名(key)获得对应的Field对象
            Field field = c.getDeclaredField(key);
            field.setAccessible(true);
            if (field.getType() == Integer.class) {// 判断成员变量的数据类型是否是Integer类型
                field.set(obj, Integer.valueOf(p.getProperty(key)));
            } else {
                // 给成员变量对象的赋值
                field.set(obj, p.getProperty(key));
            }
        }
        System.out.println(obj.toString());
    }
}
