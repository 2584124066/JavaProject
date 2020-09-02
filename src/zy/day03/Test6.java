package zy.day03;

public class Test6 {
    public static void main(String[] args) {
        for (int i = 100; i < 1000; i++) {
            int bai = i / 100, shi = i / 10 % 10, ge = i % 10;
            if ((bai * bai * bai) + (shi * shi * shi) + (ge * ge * ge) == i) {
                System.out.println(i);
            }
        }
    }
}
