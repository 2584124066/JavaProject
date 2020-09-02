package lesson.l06;

import java.util.ArrayList;

public class Test4 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        System.out.println(list);
        list.add("你");
        list.add("我");
        list.add("他");
        System.out.println(list);
        System.out.println(list.size());

        list.remove("我");
        System.out.println(list);

        int index = list.indexOf("他");
        System.out.println(index);

        list.set(index,"我");
        System.out.println(list);

        Student s1 = new Student("吕布", 26, '男');
        Student s2 = new Student("貂蝉", 26, '女');
        Student s3 = new Student("策划", 35, '无');

        ArrayList<Student> list1 = new ArrayList<>();
        list1.add(s1);
        list1.add(s2);
        list1.add(s3);

        Student max = list1.get(0);
        for (int i = 1; i < list1.size(); i++) {
            if (list1.get(i).getAge() > max.getAge()) {
                max = list1.get(i);
            }
        }
        System.out.println(max.getName() + " " + max.getAge() + " " + max.getSex());
        max.setName("小魔仙");
        System.out.println(max.getName() + " " + max.getAge() + " " + max.getSex());

    }
}
