package lesson.l13.lx;

public class Student2 implements Comparable<Student2> {
    private String name;
    private Integer age;

    public Student2() {
    }

    public Student2(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Student2 o) {
        return this.age - o.age;
    }
}
