package lesson.l03;

public class Test2 {

    public static void main(String[] args) {

        int sum = 0;
        int jiSum = 0;
        int ouSum = 0;
        int i = 1;
        while (i <= 100) {
            sum += i;
            if (i % 2 == 1) {
                jiSum += i;
            } else {
                ouSum += i;
            }
            i++;
        }
        System.out.println("1-100和：" + sum);
        System.out.println("偶数和：" + ouSum + ",奇数和：" + jiSum);

        int jieSum = 1;
        i = 1;
        while (i <= 8) {
            jieSum *= i;
            i++;
        }
        System.out.println("八的阶乘：" + jieSum);

        i = 100;
        while (i <= 999) {
            int b = i / 100;
            int s = i / 10 % 10;
            int g = i % 10;
            if (b * b * b + s * s * s + g * g * g == i) {
                System.out.print(i + " ");
            }
            i++;
        }
        System.out.println();
        sum = 0;
        for (int j = 1; j <= 100; j++) {
            if (j % 3 == 0) {
                continue;
            }
            sum += j;
        }
        System.out.println("1-100 除了3的倍数和" + sum);

        sum = 0;
        for (int j = 10; j <= 20; j++) {
            if (j % 10 == 3) {
                break;
            }
            System.out.print(j + " ");
        }
    }
}
