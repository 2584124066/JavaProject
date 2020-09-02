package lesson.l17;

public class Test6 {
    public static void main(String[] args) {
        /*
         * n的阶乘：n! = n * (n‐1) *...* 3 * 2 * 1
         * 推理得出: n! = n * (n‐1)!
         * */
        System.out.println(getValue(3));

    }

    public static int getValue(int n) {
        //num为1时,方法返回1, 相当于是方法的出口,num总有是1的情况
        if (n == 1) {
            return 1;
        }
        //num不为1时,方法返回 n! = n*(n‐1)!
        //递归调用getSum方法
        return n * getValue(n - 1);

    }
}
