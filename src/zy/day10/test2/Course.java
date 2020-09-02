package zy.day10.test2;

import java.util.ArrayList;

public class Course {
    private String courseName;
    private Teacher teacher;
    private ArrayList<Student> list = new ArrayList<>();

    public Course() {
    }

    public Course(String courseName, Teacher teacher, ArrayList<Student> list) {
        this.courseName = courseName;
        this.teacher = teacher;
        this.list = list;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public ArrayList<Student> getList() {
        return list;
    }

    public void setList(ArrayList<Student> list) {
        this.list = list;
    }

    public void show(){
        System.out.println("课程名称:"+getCourseName());
        System.out.println("授课老师:"+teacher.getName());
        for (int i = 0; i < list.size(); i++) {
            Student s = list.get(i);
            if (s.isAttendance()){
                System.out.println("上课:"+s.getName());
            }else {
                System.out.println("旷课:"+s.getName());
            }
        }
    }
}
