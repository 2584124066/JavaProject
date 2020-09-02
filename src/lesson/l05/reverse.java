package lesson.l05;

public class reverse {
    public static void main(String[] args) {
        //反转数组
        int[] num = {1, 2, 3, 4, 5, 6, 7, 8,9};
        for (int i = 0; i < num.length / 2; i++) {
            int temp = num[i];
            num[i] = num[num.length - 1 - i];
            num[num.length - 1 - i] = temp;
        }

        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i]+" ");
        }
    }
}
