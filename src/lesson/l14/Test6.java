package lesson.l14;

public class Test6 {
    public static void main(String[] args) {
        int[] arr = {2, 4, 52, 2};
        int index = 4;
        int element = getElement(arr, index);
        System.out.println(element);
        System.out.println("over");

    }

    private static int getElement(int[] arr, int index) {
        if (index < 0 || index >= arr.length) {
            throw new ArrayIndexOutOfBoundsException("下标越界了~~~"+index);
        } else {
            return arr[index];
        }
    }

}
