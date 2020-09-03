package lesson.l22.test2;

public class Single2 {
    //懒汉式
    private static Student student;

    public static Student getStudent() {
        if (student == null) {
            student = new Student();
        }
        return student;
    }
}
