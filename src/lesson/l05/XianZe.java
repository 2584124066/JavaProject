package lesson.l05;

public class XianZe {
    public static void main(String[] args) {
        //选择排序 优化
        int[] arr = {1,4,5,6,8,2,3,7,9,10,20,17,14,13,16,18};
        for (int i = 0; i < arr.length-1; i++) {
            int num = arr[i];
            int index = i;
            for (int j = i+1; j < arr.length; j++) {
                if (num>arr[j]){
                    num=arr[j];
                    index=j;
                }
            }
            if (i!=index){
                int temp = arr[i];
                arr[i] = arr[index];
                arr[index] = temp;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
