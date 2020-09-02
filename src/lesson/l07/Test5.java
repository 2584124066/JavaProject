package lesson.l07;

public class Test5 {
    private static void test() {
        System.out.println("本类的静态方法");
    }

    public static void main(String[] args) {
        Student stu1 = new Student("张三", 21);
        Student stu2 = new Student("李四", 24);

        stu1.test01();
        Student.classRoom = "java45";

        System.out.println(stu1.getName() + "," + stu1.getAge() + "," + Student.classRoom
                + "," + stu1.getId());
        System.out.println(stu2.getName() + "," + stu2.getAge() + "," + Student.classRoom
                + "," + stu2.getId());
        test();
    }


}
