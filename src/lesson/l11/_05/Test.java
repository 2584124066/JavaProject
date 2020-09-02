package lesson.l11._05;

public class Test {
    public static void main(String[] args) {
        long star = System.currentTimeMillis();
        for (int i = 0; i < 100; i++) {
            System.out.print(i);
        }
        long end = System.currentTimeMillis();
        long result = end-star;

        System.out.println("\n"+result);
    }
}
