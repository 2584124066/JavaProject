package zy.day14.one.Checkpoint2;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class Test4 {
    public static void main(String[] args) {
        System.out.println("输入字符串：");
//        1. 创建键盘输入对象
        Scanner sc = new Scanner(System.in);
//        2. 使用nextLine从键盘中读取一行内容
        String string = sc.nextLine();
//        3. 将字符串转换成字符数组
        char[] chars = string.toCharArray();
//        4. 创建map集合，用来存放字符：key是字符 value是字符出现的个数
        HashMap<Character, Integer> hashMap = new HashMap<>();
//        5. 遍历字符数组
        for (char c : chars) {
//        6. 拿到每个字符,去map中查看是否有保存对应的次数
            if (!hashMap.containsKey(c)) {//        7. 如果这个字符没有保存次数,就设置为1次
                hashMap.put(c, 1);
            } else {//        8. 如果这个字符有保存次数,就设置为原来的次数+1次
                hashMap.put(c, hashMap.get(c) + 1);
            }
        }
//        9. 创建字符串缓冲区对象
        StringBuffer sb = new StringBuffer();
//        10. 拼接字符串
        Set<Character> characters = hashMap.keySet();
        for (Character c : characters) {
            if (c.equals(' ')) {
                sb.append("空格" + "(" + hashMap.get(c) + ")");
            } else {
                sb.append(c + "(" + hashMap.get(c) + ")");
            }
        }
//        11. 输出结果
        System.out.println(sb);
    }
}
