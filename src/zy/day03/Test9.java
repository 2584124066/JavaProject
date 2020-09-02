package zy.day03;

public class Test9 {
    public static void main(String[] args) {
        for (int i = 1; i <= 7; i++) {
            for (int j = 1; j <= 7; j++) {
                if (i == j || i + j == 8) {//对角线打印O
                    System.out.print("O");
                } else {
                    System.out.print("*");//其他位置打印.
                }
            }
            System.out.println();
        }
    }
}
