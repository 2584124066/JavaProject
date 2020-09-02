package zy.day14.one.Checkpoint2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Test9 {
    public static void main(String[] args) {
        //1. 创建HashMap集合key存放书名,value存放价格
        HashMap<String, Double> hashMap = new HashMap<>();
        // 2. 创建键盘录入对象Scanner
        Scanner scanner = new Scanner(System.in);
        // 3. 循环判断HashSet的数量是否小于5
        while (hashMap.size() < 5) {
            // 4. 如果HashSet的数量小于5,让用户输入一本书的信息
            String bookInfo = scanner.next();
            // 5. 使用,分割书名和价格
            String[] splits = bookInfo.split(",");
            String bookName = splits[0];
            double price = Double.valueOf(splits[1]);
            // 6. 将书名和价格添加到HashMap中
            hashMap.put(bookName, price);
        }
        // 7. 使用remove方法删除集合中的C++这本书
        hashMap.remove("C++");
        // 8. 使用put方法将Java的这本书涨价为38.5元
        hashMap.put("Java", 38.5);
        // 9. 使用keySet遍历Map
        Set<String> set = hashMap.keySet();
        for (String key : set) {
            System.out.println(key + "->" + hashMap.get(key));
        }
        // 10. 使用entrySet遍历Map
        Set<Map.Entry<String, Double>> entries = hashMap.entrySet();
        for (Map.Entry<String, Double> entry : entries) {
            System.out.println(entry.getKey() + "->" + entry.getValue());
        }

    }
}
