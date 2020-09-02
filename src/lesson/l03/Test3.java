package lesson.l03;

public class Test3 {
    public static void main(String[] args) {
        for (int star = 1, end = 10; star <= end; star++) {
            System.out.println(star);
        }
        System.out.println("------------------------");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("------------------------");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("------------------------");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("------------------------");
        int row = 5;
        for (int i = 1; i <= row; i++) {
            for (int col = 1; col < (11 - (2 * i - 1)) / 2; col++) {
                System.out.print(" ");
            }
            for (int xing = 1; xing <= 2 * i - 1; xing++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = row-1; i >= 1; i--) {
            for (int col = 1; col < (11 - (2 * i - 1)) / 2; col++) {
                System.out.print(" ");
            }
            for (int xing = 1; xing <= 2 * i - 1; xing++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
