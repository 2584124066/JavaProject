package zy.day12.Checkpoint2.Test5;

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
        while (it.hasNext()) {
            Human person = it.next();
            person.setAge(person.getAge()+2);
        }
        for (Human person : list) {
            System.out.println("姓名:"+person.getName()+" 年龄:"+person.getAge()+"  身高:"+person.getHeight());
        }
    }
}
