package zy.day14.one.Checkpoint2;

import java.util.*;

public class Test8 {
    public static void main(String[] args) {
//        1. 创建键盘输入对象
        Scanner sc = new Scanner(System.in);
//        2. 创建随机数对象
        Random r = new Random();
//        3. 创建HashMap集合key存放姓名,value存放成绩
        HashMap<String, Integer> hashMap = new HashMap<>();
//        4. 循环判断HashMap中数量是否小于5
        while (hashMap.size() < 5) {
//        5. 如果HashMap中数量小于5,让用户再输入一个姓名
            String name = sc.next();
//        6. 使用随机数生成一个成绩
            int score = r.nextInt(101);
//        7. 将姓名和分数添加到HashMap中
            hashMap.put(name, score);
        }
        System.out.println(hashMap);
//        8. 使用迭代器获取一个键
        Iterator<String> it = hashMap.keySet().iterator();
//        9. 通过键找到对应的分数,作为默认分数
//        10. 定义总分分变量
        int sum = 0;
//        11. 定义最高分变量=默认分数
        Integer max = hashMap.get(it.next());
//        12. 定义最低分变量=默认分数
        Integer min = hashMap.get(it.next());
//        13. 使用keySet获取到所有的key
        Set<String> set = hashMap.keySet();
//        14. 使用增强for遍历所有的key
        for (String key : set) {
//        15. 根据key找到对应的value
            Integer value = hashMap.get(key);
//        16. 将这个分数添加到总分
            sum += value;
//        17. 如果最高分小于这个分数,让最高分=这个分数
            if (max < value) {
                max = value;
            }
//        18. 如果最低分大于这个分数,让最低分=这个分数
            if (min > value) {
                min = value;
            }
        }
//        19. 计算平均分
        double avg = sum / hashMap.size();
//        20. 输出结果
        System.out.println("总分=" + sum + ",最高=" + max + ",最低分=" + min + ",平均分" + avg);
    }
}
