package lesson.l07;

public class Student {
    private String name;
    private int age;
    private int id;
    static String classRoom;
    static private int count;
    private static String pool;

    static {
        System.out.println("加载外部资源给成员变量赋值");
        pool="数据库连接池....";
    }

    public void test01(){
        System.out.println(pool);
        System.out.println("成员方法");
        //非静态可以访问静态
        System.out.println();
    }

    public static void test02(){
        System.out.println(pool);
        System.out.println("静态方法");
        //静态可以访问静态
        System.out.println(count);
        //静态不可以访问非静态 System.out.println(id);
        //静态不可以this    System.out.println(this);

    }

    public Student(String name, int age) {
        System.out.println("构造方法执行！");
        this.name = name;
        this.age = age;
        this.id=++count;
    }

    public Student() {
        this.id=++count;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static String getClassRoom() {
        return classRoom;
    }

    public static void setClassRoom(String classRoom) {
        Student.classRoom = classRoom;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Student.count = count;
    }

}
