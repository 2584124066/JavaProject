package zy.day16.test7;

public class Test {
    public static void main(String[] args) {
        // TODO 请分别使用Lambda【标准格式】及【省略格式】调用invokeCalc方法来计算130‐120的结果
        invokeCalc(130,130,(a,b)->{
            return a-b;
        });
        invokeCalc(130,130,(a,b)-> a-b);
    }
    private static void invokeCalc(int a,int b,Calculator calculator) {
        int result = calculator.calc(a, b);
        System.out.println("结果是：" + result);
    }
}
