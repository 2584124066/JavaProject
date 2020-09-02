package lesson.l17;

public class Test5 {

    public static void main(String[] args) {
        /*
        * 1 ~ n的和
        * 推理得出 n的累和 = n + (n-1)的累和
        * */
        System.out.println(getSum(5));
    }

    public static int getSum(int num){
        //num为1时,方法返回1, 相当于是方法的出口,num总有是1的情况
        if (num==1){
            return 1;
        }
        //num不为1时,方法返回 num +(num‐1)的累和
        //递归调用getSum方法
        return num+getSum(num-1);

    }
}
