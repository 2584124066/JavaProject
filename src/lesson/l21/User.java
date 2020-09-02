package lesson.l21;

public class User {
    private String name;
    public Integer age;
    protected Character sex;

    public User() {
        System.out.println("无参构造!");
    }

    User(String name) {
        System.out.println("默认一个参数构造!");
        this.name = name;
    }

    public User(String name, Integer age) {
        System.out.println("二个参数构造!" + name + "\t" + age);
        this.name = name;
        this.age = age;
    }

    private User(String name, Character sex) {
        System.out.println("私有的二个参数构造!" + name + "\t" + sex);
        this.name = name;
        this.sex = sex;
    }

    public User(String name, Integer age, Character sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    private static void work(String name) {
        System.out.println("private static work() 一个参数");
    }

    public static void work(String name,Character sex) {
        System.out.println("public static work() 两个参数");
    }

    private void eat(String name) {
        System.out.println("private eat() 一个参数");
    }

    private void eat(String name, Integer age) {
        System.out.println("private eat() 两个参数");
    }

    public void sleep(String name) {
        System.out.println("public sleep() 一个参数");
    }

    public void sleep(String name, Integer age) {
        System.out.println("private eat() 两个参数");
    }

    void run(String name) {
        System.out.println("默认 run() 一个参数");
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

    public Character getSex() {
        return sex;
    }

    public void setSex(Character sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                '}';
    }
}
