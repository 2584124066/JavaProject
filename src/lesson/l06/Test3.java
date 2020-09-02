package lesson.l06;

import java.util.Random;

public class Test3 {
    public static void main(String[] args) {
        Random r = new Random();
        int[] arr = new int[20];

        for (int i = 0; i < arr.length; i++) {
            int num = r.nextInt(100) + 1;
            arr[i] = num;
        }

        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i != arr.length - 1) {
                System.out.print(arr[i] + " ");
            } else {
                System.out.println(arr[i] + " ");
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}
