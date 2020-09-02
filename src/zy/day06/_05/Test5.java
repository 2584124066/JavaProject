package zy.day06._05;

import java.util.ArrayList;

public class Test5 {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("姚小明", 23, "打篮球");
        Teacher t2 = new Teacher("景甜", 20, "打羽毛球");
        Teacher t3 = new Teacher("薛之谦", 45, "踢足球");

        ArrayList<Teacher> list = new ArrayList<>();
        list.add(t1);
        list.add(t2);
        list.add(t3);

        for (int i = 0; i < list.size(); i++) {
            Teacher t = list.get(i);
            System.out.println(t.getName() + "," + t.getAge() + "," + t.getLike());
        }

        System.out.println("------------");
        for (int i = 0; i < list.size(); i++) {
            Teacher t = list.get(i);
            if (t.getAge() > 40) {
                t.setLike("打高尔夫");
                t.show();
            }
        }
    }
}
