package zy.day14.one.Checkpoint2;

import java.util.ArrayList;
import java.util.HashMap;

public class Test6 {
    public static void main(String[] args) {
//        1. 定义ArrayList存放元素
        ArrayList<String> list = new ArrayList<>();
//        2. 使用add方法添加需要的元素
        list.add("abc");
        list.add("bcd");
//        3. 定义HashMap,key是字符,value是字符对应的次数
        HashMap<Character, Integer> hashMap = new HashMap<>();
//        4. 使用增强for获取ArrayList中的每个字符串
        for (String s : list) {
//        5. 将每个字符串转成字符数组
            char[] chars = s.toCharArray();
//        6. 使用增强for遍历字符数组
            for (char ch : chars) {
//        7. 获取拿到每个字符,使用字符去HashMap中查找次数
                if (!hashMap.containsKey(ch)) {//        8. 如果为空,说明该字符第一次出现
//        9. 放入字符作为key,把次数设置为1
                    hashMap.put(ch, 1);
                } else {//        10. 如果之前,已经有字符了,就把字符的次数+1
                    hashMap.put(ch, hashMap.get(ch) + 1);
                }
            }
        }
//        11. 输出map中的内容]
        System.out.println(hashMap);
    }
}
