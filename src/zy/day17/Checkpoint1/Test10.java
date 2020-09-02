package zy.day17.Checkpoint1;

public class Test10 {
    public static void main(String[] args) {
        System.out.println(getVule(3));
    }

//        1. 定义一个求阶乘方法,接收一个整形参数num
    public static int getVule(int num) {
//        2. 明确递归终止的条件
        if (num <= 1) {
            return 1;
        }
//        3. 分析递归逻辑：1到n的和等于1到(n-1)的和再加n
//        4. 开始递归
        return num * getVule(num - 1);
    }
}
