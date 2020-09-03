package lesson.l22.test1;

public class Test {
    public static void main(String[] args) {
        Student student = new Student();
        student.study();
        StudentStrong studentStrong = new StudentStrong(student);
        studentStrong.study();
    }
}

