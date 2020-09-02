package zy.day04.one;

public class Test6 {
    public static void printX(int row) {
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= row; j++) {
                if (i == j || i + j == row + 1) {
                    System.out.print("O");
                }else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        printX(10);
    }
}
