package lesson.l10.anonymous;

public class Test3 {
    ////随便获取一个可以游泳的对象即可
    public static Swimable getSwimableObj(){
        SwimStudent ss = new SwimStudent();
        SwimTeacher st = new SwimTeacher();
        return ss;
    }
    public static void main(String[] args) {
        Swimable sw = getSwimableObj();
        sw.swiming();
    }
}
