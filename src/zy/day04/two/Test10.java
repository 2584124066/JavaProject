package zy.day04.two;

public class Test10 {
    public static void main(String[] args) {
        int[] arr = {99, 100, 98, 97, 96};
        int min = arr[1];
        int max = 0;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]<min){
                min=arr[i];
            }
            if (arr[i]>max){
                max=arr[i];
            }
            sum+=arr[i];
        }
        int avg = ((sum-max-min)/(arr.length-2));
        System.out.println("最终得分："+avg);
    }
}
