package zy.day08._04;

public class Test {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("王小平",26,"Java");
        teacher.teach();

        Student student = new Student("李小乐",26,90);
        student.test();
    }
}
