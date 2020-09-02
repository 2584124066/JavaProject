package zy.day04.two;

public class Test7 {
    public static boolean equals(int[] arr1, int[] arr2) {
        boolean flag = true;
        if (arr1.length != arr2.length) {
            flag = false;
        } else {
            for (int i = 0; i < arr1.length; i++) {
                if (arr1[i] != arr2[i]) {
                    flag = false;
                    break;
                }
            }
        }
        return flag;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 3, 2, 1};
        int[] arr2 = {1, 2, 3, 4, 3, 2, 1};
        System.out.print("[");
        for (int i = 0; i < arr1.length; i++) {
            if (i < arr1.length - 1) {
                System.out.print(arr1[i] + ",");
            } else {
                System.out.println(arr1[i]+"]");
            }
        }
        System.out.print("[");
        for (int i = 0; i < arr2.length; i++) {
            if (i < arr2.length - 1) {
                System.out.print(arr2[i] + ",");
            } else {
                System.out.println(arr2[i]+"]");
            }
        }
        System.out.println("是否一致："+equals(arr1,arr2));
    }
}
