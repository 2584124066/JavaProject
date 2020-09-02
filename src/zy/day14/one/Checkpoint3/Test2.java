package zy.day14.one.Checkpoint3;

import java.util.HashMap;

public class Test2 {
    public static void main(String[] args) {
        HashMap<String,String> hashMap = new HashMap<>();
        hashMap.put("及时雨","宋江");
        hashMap.put( "玉麒麟","卢俊义");
        hashMap.put("智多星","吴用");
        hashMap.put("入云龙","公孙胜");
        hashMap.put("豹子头","林冲");
        System.out.println(hashMap);

        hashMap.remove("玉麒麟");
        hashMap.put("智多星",null);

        String name = hashMap.get("及时雨");
        hashMap.remove("及时雨");
        hashMap.put("呼保义",name);

        System.out.println(hashMap);
    }
}
