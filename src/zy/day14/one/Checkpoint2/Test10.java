package zy.day14.one.Checkpoint2;

import java.util.HashMap;

public class Test10 {
    public static void main(String[] args) {
//        1. 定义第一个数组arr1
        String[] arr1 = {"黑龙江省","浙江省","江西省","广东省","福建省"};
//        2. 定义第二个数组arr2
        String[] arr2 = {"哈尔滨","杭州","南昌","广州","福州"};
//        3. 创建HashMap,key存放省,value存放市
        HashMap<String,String> hashMap = new HashMap<>();
//        4. 使用普通for循环遍历arr1
        for (int i = 0; i < arr1.length; i++) {
//        5. 根据索引到arr1中获取到省
//        6. 根据索引到arr2中获取到省会城市
//        7. 将省和省会城市添加到HashMap中
            hashMap.put(arr1[i],arr2[i]);
        }
//        8. 输出HashMap中的内容
        System.out.println(hashMap);
    }
}
