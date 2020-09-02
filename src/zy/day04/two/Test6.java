package zy.day04.two;

public class Test6 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,3,2,1};
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if (i<arr.length-1){
                System.out.print(arr[i]+",");
            }else {
                System.out.print(arr[i]);
            }
        }
        System.out.print("] 是否对称:");
        boolean flag = true;
        for (int i = 0; i < arr.length/2; i++) {
            if(arr[i]!=arr[arr.length-1-i]){
                flag=false;
                break;
            }
        }
        System.out.println(flag);
    }
}
