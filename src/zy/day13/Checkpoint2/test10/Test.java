package zy.day13.Checkpoint2.test10;

import java.util.HashSet;
import java.util.Iterator;

public class Test {
    public static void main(String[] args) {
        HashSet<Student> hs = new HashSet<>();
        Student[] students = {
                new Student("赵六",16,60),
                new Student("孙七",17,70),
                new Student("周八",18,80),
                new Student("吴九",19,90),
                new Student("赵六",16,100),
        };
        for (Student student : students) {
            hs.add(student);
        }

        int max = 0;
        int min = students[0].getScore();
        int sum=0;
        Iterator<Student> it = hs.iterator();
        while (it.hasNext()){
            Student next = it.next();
            sum+=next.getScore();
            if (next.getScore()>max){
                max=next.getScore();
            }
            if (next.getScore()<min){
                min = next.getScore();
            }
        }

        System.out.println("最高分："+max);
        System.out.println("最低分："+min);
        System.out.println("平均分："+(double)sum/hs.size());
    }
}
