package lesson.l07;

import java.util.Arrays;

public class Test6 {
    public static void test(){
        String str ="adsJDASLDahbsdfoafhsdfh";
        char[] chs= str.toCharArray();

        Arrays.sort(chs);
        System.out.println(Arrays.toString(chs));

        for (int i = 0; i <chs.length/2 ; i++) {
            char ch = chs[i];
            chs[i]=chs[chs.length-1-i];
            chs[chs.length-1-i]=ch;
        }
        System.out.println(Arrays.toString(chs));
    }
    public static void main(String[] args) {
        int[] arr = {8, 2, 76, 28, 3, 82};
        String[] strArr = {"ccc", "AAA", "BBB"};

        System.out.println(arr);
        System.out.println(Arrays.toString(arr));

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        Arrays.sort(strArr);
        System.out.println(Arrays.toString(strArr));

        test();

        int[] arr1 =  Arrays.copyOf(arr,2);
        System.out.println(Arrays.toString(arr1));
    }

}
