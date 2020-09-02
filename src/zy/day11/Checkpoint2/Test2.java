package zy.day11.Checkpoint2;

public class Test2 {
    public static void main(String[] args) {
        long star = System.currentTimeMillis();
        String str = "";
        for (int i = 1; i <= 10000; i++) {
            str+=i;
        }
        long end = System.currentTimeMillis();
        long result = end-star;
        System.out.println(result);

        star = System.currentTimeMillis();
        StringBuilder builder = new StringBuilder();
        for (int i = 1; i <= 10000; i++) {
            builder.append(i);
        }
        end = System.currentTimeMillis();
        result = end-star;
        System.out.println(result);
    }
}
