package zy.day14.one.Checkpoint2;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class Test7 {
    public static void main(String[] args) {
//        1. 创建键盘输入对象
        Scanner sc = new Scanner(System.in);
//        2. 使用nextLine从键盘中读取一行内容
        String string = sc.nextLine();
//        3. 定义HashMap,key是单词,value是字符对应的次数
        HashMap<String, Integer> hashMap = new HashMap<>();
//        4. 使用空格分割字符串
        String[] strings = string.split(" ");
//        5. 遍历分割好的每个字符串
        for (String s : strings) {
//        6. 获取拿到每个字符串,使用字符去HashMap中查找次数
            if (!hashMap.containsKey(s)) {//        7. 如果为空,说明该字符串第一次出现
//        8. 放入字符串作为key,把次数设置为1
                hashMap.put(s, 1);
            } else {//        9. 如果之前,已经有字符串了,就把字符的次数+1
                hashMap.put(s, hashMap.get(s) + 1);
            }
        }
//        9. 输出
        Set<String> set = hashMap.keySet();
        for (String s : set) {
            System.out.println(s + "=" + hashMap.get(s));
        }
    }
}
