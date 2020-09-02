package zy.day12.Checkpoint2.Test2;

import java.util.ArrayList;
import java.util.Iterator;

public class Test {
    public static void main(String[] args) {
        //定义ArrayList
        ArrayList<Human> list = new ArrayList<>();
        //添加5个学生
        list.add(new Human("赵六", 6, 60));
        list.add(new Human("孙七", 7, 70));
        list.add(new Human("周八", 8, 80));
        list.add(new Human("吴九", 9, 90));
        list.add(new Human("郑十", 10, 100));
        //获取迭代器
        Iterator<Human> it = list.iterator();
        //定义最高人、最矮人
        Human highest = list.get(list.size() - 1);
        Human lowest = list.get(0);
        while (it.hasNext()) {
            Human person = it.next();
            if (person.getHeight() > highest.getHeight()) {
                highest = person;
            }
            if (person.getHeight() < lowest.getHeight()) {
                lowest = person;
            }
        }

        System.out.println("最高："+highest.getName()+",年龄"+highest.getAge()+"岁,身高"+highest.getHeight());
        System.out.println("最低："+lowest.getName()+",年龄"+lowest.getAge()+"岁,身高"+lowest.getHeight());
    }
}
