package zy.day13.Checkpoint2;

import java.util.HashSet;
import java.util.Scanner;

public class Test8 {
    public static void main(String[] args) {
//        1. 创建Scanner对象,用于键盘录入
        Scanner sc = new Scanner(System.in);
//        2. 创建HashSet.用于去除重复的数字
        HashSet<Integer> hs = new HashSet<>();
        while (true){//        3. 不停循环,让用户输入数字
//        4. 调用Scanner的nextInt()方法,让用户输入一个数字
            int i = sc.nextInt();
            if (i==-1){//        5. 如果用户输入-1,跳出循环
                break;
            }else {//        6. 不是-1将数字添加到HashSet
                hs.add(i);
            }
        }
//        7. 定义求和变量sum
        int sum = 0;
//        8. 使用增强for获取HashSet中的每个元素
        for (Integer integer : hs) {
//        9. 将每个数字添加到sum中
            sum+=integer;
        }
//        10. 输出求和的结果
        System.out.println(sum);
//        11. 输出平均值,平均值 = 总数 / 个数
        System.out.println((double) (sum/hs.size()));
    }
}
