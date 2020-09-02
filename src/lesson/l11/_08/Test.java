package lesson.l11._08;

public class Test {
    public static void main(String[] args) {
        Integer i = new Integer(4);
        System.out.println(i);

        Integer i2 = Integer.valueOf(4);
        System.out.println(i2);

        int num = i.intValue();
        System.out.println(num);

        Integer i3 = 5;
        i3 = i3+1;
        System.out.println(i3);

    }
}
