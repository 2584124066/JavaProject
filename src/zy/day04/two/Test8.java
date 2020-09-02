package zy.day04.two;

public class Test8 {
    public static int getSum(char[] arr) {
        char[] array = {'A', 'D', 'B', 'C', 'D'};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == array[i]) {
                sum += 2;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        char[] xMing = {'D','C','B','A','D'};
        char[] xHong = {'A','D','B','C','D'};
        char[] xHuang = {'A','D','B','C','A'};
        char[] xQiang= {'A','B','C','D','D'};
        System.out.println("满分10分，小明得分："+getSum(xMing)+"分");
        System.out.println("满分10分，小红得分："+getSum(xHong)+"分");
        System.out.println("满分10分，小黄得分："+getSum(xHuang)+"分");
        System.out.println("满分10分，小强得分："+getSum(xQiang)+"分");
    }
}
