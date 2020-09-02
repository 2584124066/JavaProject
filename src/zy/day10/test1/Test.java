package zy.day10.test1;


public class Test {
    public static void main(String[] args) {

        invokeHandleAble((num)->{
            System.out.println("原数字"+num);
            double n = Double.valueOf(num);
            System.out.println("取整后"+(int)n);
            System.out.println("保留4位小数后"+String.format("%.4f",n));
        },"23.23456789");
    }

    public static void invokeHandleAble(HandleAble h,String num){
        h.HandleString(num);
    }
}
