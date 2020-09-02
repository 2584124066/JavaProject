package lesson.l13;

public class Test3 {
    private static int getSum(int... arr) {
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        return sum;
    }

    private static int getSum1(int b,int... arr) {
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] arr = {1, 4, 62, 431, 2};
        int sum = getSum(arr);
        System.out.println(sum);

        int sum2 = getSum(1, 2, 3, 4, 5);
        System.out.println(sum2);

        int sum3 = getSum1(1, 1,2, 3, 4, 5);
        System.out.println(sum3);

    }
}
