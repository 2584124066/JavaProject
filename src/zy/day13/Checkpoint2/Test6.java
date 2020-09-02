package zy.day13.Checkpoint2;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;

public class Test6 {
    public static void main(String[] args) {
//    1. 创建HashSet用于保存随机数
        HashSet<Integer> hs = new HashSet<>();
//    2. 创建Random用于产生随机数
        Random r = new Random();
//    3. 使用while循环判断hs的size是否小于10
//    4. hs的size小于10就生成一个随机数
        while (hs.size() < 10) {
//    5. 将随机数添加到HashSet,重复的随机数HashSet不会添加
            int num = r.nextInt(101);
            hs.add(num);
        }
//    6. 获取迭代器
        Iterator<Integer> it = hs.iterator();
        while (it.hasNext()) {//    7. 使用迭代器循环判断是否有下一个元素
//    8. 获取到下一个元素.打印出来
            System.out.println(it.next());
        }
    }
}
