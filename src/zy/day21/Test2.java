package zy.day21;

import java.lang.reflect.Method;
import java.util.ArrayList;

public class Test2 {
    public static void main(String[] args) throws Exception {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        Class c = list.getClass();
        Method add = c.getMethod("add",Object.class);
        add.invoke(list,"string");
        System.out.println(list);
    }
}
