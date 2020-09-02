package zy.day17.Checkpoint3;

import java.io.File;
import java.util.HashMap;
import java.util.Scanner;

public class Test3 {
    public static HashMap<String, Integer> hashMap = new HashMap<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();

        stat(new File(string));

        hashMap.forEach((s, i) -> {
            System.out.println(s + "的类型的文件有" + i + "个");
        });
    }

    public static void stat(File file) {
        if (file.exists()) {
            if (file.isFile()) {
                String[] fs = file.getName().split("\\.");
                if (!hashMap.containsKey(fs[1])) {
                    hashMap.put(fs[1], 1);
                } else {
                    hashMap.put(fs[1], hashMap.get(fs[1]) + 1);
                }
            } else {
                File[] files = file.listFiles();
                for (File f : files) {
                    stat(f);
                }
            }
        }
    }
}
