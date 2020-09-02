package lesson.l11._06;

public class Test {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int[] newArr = {-5,-4,-3,-2,-1,0};

        System.arraycopy(arr,3,newArr,0,6);

        for (int i = 0; i < newArr.length; i++) {
            System.out.println(newArr[i]);
        }
    }
}