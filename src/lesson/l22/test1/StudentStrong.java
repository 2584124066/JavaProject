package lesson.l22.test1;

public class StudentStrong implements Code {
    private Student student;

    public StudentStrong(Student student) {
        this.student = student;
    }

    @Override
    public void study() {
        student.study();
        System.out.println("springMVC");
        System.out.println("Mybatis");
        System.out.println("SpringCould");
        System.out.println("SpringBoot");
        System.out.println("Hapdoop");
    }
}
