package lesson.l12.Fan;

public class Test {
    public static void main(String[] args) {
        MyGenericClass<String> my = new MyGenericClass<>();
        my.setMvp("你爸爸");
        System.out.println(my.getMvp());
        my.show(my);
        System.out.println(my.show2(my).getMvp());

        MyGenericClass<Integer> my2 = new MyGenericClass<>();
        my2.setMvp(7);
        System.out.println(my2.getMvp());

        MyGenericClass mm = new MyGenericClass();
        mm.show("aaa");
        mm.show(123);
        mm.show(12.456);

        System.out.println(mm.show2("aaa").toString());

    }
}
