package zy.day03;

public class Test5 {
    public static void main(String[] args) {
        for (int i = 1; i <= 15; i++) {
            if (i%3==0){
                continue;
            }else {
                System.out.println(i);
            }
        }
    }
}
