package zy.day04.one;

public class Test9 {
    public static void main(String[] args) {
        for (int row = 1; row <= 9; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(col+"*"+row+"="+col*row+" ");
            }
            System.out.println();
        }
    }
}
