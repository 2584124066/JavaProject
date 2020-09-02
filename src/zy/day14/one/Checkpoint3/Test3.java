package zy.day14.one.Checkpoint3;

import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class Test3 {
    public static String addNo(HashMap<String, String> noNums) {
            String noStr = "";
            for (int i = 0; i < 8; i++) {
                int no = new Random().nextInt(9);
                noStr += no;
            }
            if (noNums.containsKey(noStr)){
                addNo(noNums);
            }
            return noStr;
    }

    public static void main(String[] args) {
        HashMap<String, String> noNums = new HashMap<>();
        noNums.put(addNo(noNums),"苹果");
        noNums.put(addNo(noNums),"香蕉");
        noNums.put(addNo(noNums),"西瓜");
        noNums.put(addNo(noNums),"橘子");
        System.out.println(noNums);

        String strNo = new Scanner(System.in).next();
        if (noNums.containsKey(strNo)){
            System.out.println("根据商品号："+strNo+"，查询到对应的商品为："+noNums.get(strNo));
        }else {
            System.out.println("查无此商品");
        }


    }
}
