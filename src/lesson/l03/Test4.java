package lesson.l03;

public class Test4 {
    public static void main(String[] args) {
        test01:for (int i = 1; i <= 3; i++) {
            test02:for (int j = 1; j <= 3; j++) {
                if (i == 3) {
                    break test01;
                }
                if (j==2){
                    continue test02;
                }
                System.out.print(i + "-" + j + " ");
            }
            System.out.println();
        }
    }
}
