package zy.day10.test2;

public class Test {
    public static void main(String[] args) {

        Student[] slist = {
                new Student("小红"),
                new Student("小亮"),
                new Student("小明")
        };

        Teacher teacher = new Teacher("张老师");
        teacher.callName(slist[0],true);
        teacher.callName(slist[1],true);
        teacher.callName(slist[2],false);


        Course course = new Course();
        course.setCourseName("Java");
        course.setTeacher(teacher);
        course.getList().add(slist[0]);
        course.getList().add(slist[1]);
        course.getList().add(slist[2]);
        course.show();



    }
}
