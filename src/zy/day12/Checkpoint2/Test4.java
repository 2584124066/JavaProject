package zy.day12.Checkpoint2;

public class Test4 {
    public static <E> void swap(E[] arr,int index1,int index2){
            E temp = arr[index1];
            arr[index1] = arr[index2];
            arr[index2] = temp;

        for (E e : arr) {
            System.out.println(e);
        }
    }
    public static void main(String[] args) {
        String[] strArr = {"A", "B", "C", "D", "E"};
        swap(strArr,0,1);

        Integer[] intArr = {1,2,3,4,5};
        swap(intArr,0,1);

    }
}
