package lesson.l22.test2;

public class Single {

    //饿汉式
    private static Student student = new Student();

    public static Student getStudent() {
        return student;
    }
}
