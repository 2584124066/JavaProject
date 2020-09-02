package zy.day21;

import java.lang.reflect.Field;

public class Test6 {
    //将obj对象中名为propertyName的属性的值设置为value.
    public void setProperty(Object obj, String propertyName, Object value) throws Exception {
        Class aClass = obj.getClass();
        Field field = aClass.getField(propertyName);
        field.setAccessible(true);
        Object o = aClass.newInstance();
        field.set(o, value);
        System.out.println(field);
    }

    //可以获取obj对象中名为propertyName的属性的值
    public Object getProperty(Object obj, String propertyName) throws Exception {
        Class aClass = obj.getClass();
        Field field = aClass.getField(propertyName);
        return field;
    }
}
