package zy.day21.test11;

import java.lang.reflect.Method;

public class Test {
    public static void main(String[] args) throws Exception {
        Class<MyTestDemo> c = MyTestDemo.class;
        //获取所有public修饰的方法对象
        Method[] methods = c.getMethods();
        //实例化
        MyTestDemo myTestDemo = c.newInstance();
        for (Method method : methods) {
            if (method.isAnnotationPresent(MyTest.class)){
                method.invoke(myTestDemo);//调用方法
            }
        }

    }
}
