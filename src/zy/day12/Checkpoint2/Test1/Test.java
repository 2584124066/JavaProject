package zy.day12.Checkpoint2.Test1;

import java.util.ArrayList;
import java.util.Iterator;

public class Test {
    public static void main(String[] args) {
        //定义ArrayList
        ArrayList<Student> list = new ArrayList<>();
        //添加5个学生
        list.add(new Student("赵六", 6, 60));
        list.add(new Student("孙七", 7, 70));
        list.add(new Student("周八", 8, 80));
        list.add(new Student("吴九", 9, 90));
        list.add(new Student("郑十", 10, 100));
        //获取迭代器
        Iterator<Student> it = list.iterator();
        //定义总分、最高分、最低分
        int sum = 0, max = 0, min = list.get(0).getScore();
        while (it.hasNext()) {//循环判断是否有下一个学生
            Student student = it.next();
            sum += student.getScore();
            if (student.getScore() > max) {//判断这个学生的分数是否大于max
                max = student.getScore();
            }
            if (student.getScore() < min) {//判断这个学生的分数是否小于于min
                min = student.getScore();
            }
        }
        double avg = sum / list.size();
        System.out.println("总分：" + sum);
        System.out.println("最高分：" + max);
        System.out.println("最低分：" + min);
    }
}
