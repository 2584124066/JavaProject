package lesson.l08;

public class Test {
    public static void main(String[] args) {
        Person[] person = {
                new Person("张三", 20),
                new Person("李四", 30)
        };
        person[0].eat();
        person[0].sleep();
        person[1].eat();
        person[1].sleep();

        Student student = new Student();
        student.name="小明";
        student.age=20;
        student.eat();
        student.sleep();

        Teacher teacher = new Teacher();
        teacher.name="李华";
        teacher.eat();
        teacher.sleep();
        teacher.teach();

        Coder coder = new Coder();
        coder.name="鲁班";
        coder.eat();
        coder.sleep();
        coder.coding();

    }
}