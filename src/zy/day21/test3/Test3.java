package zy.day21.test3;

public class Test3 {
    public static void main(String[] args) throws Exception {
        Class<Student> studentClass = Student.class;
        System.out.println(studentClass);

        Student student = Student.class.getDeclaredConstructor().newInstance();
        System.out.println(student);
    }
}
