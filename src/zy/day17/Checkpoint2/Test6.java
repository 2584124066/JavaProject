package zy.day17.Checkpoint2;

import java.io.File;
import java.util.Scanner;

public class Test6 {
    public static void main(String[] args) {
//        1. 创建键盘录入对象Scanner
        Scanner scanner = new Scanner(System.in);
//        2. 定义字符串接收用户输入的文件夹路径
        String string = scanner.nextLine();
//        3. 根据文件夹路径创建文件对象
        File file = new File(string);
//        5. 调用calculate方法传入文件夹对象
        long result = calculate(file);
        System.out.println("该文件夹大小"+result);
    }

    //        4. 定义一个方法calculate用来计算指定文件夹的大小，接收文件参数，返回long类型数值表示文件夹的大小。
    private static long calculate(File file) {
//        获得文件夹中所有文件，得到一个文件数组
        File[] files = file.listFiles();
//        定义一个变 量size累加每一个文件的大小，遍历文件数组，
        long size = 0L;
//        判断是否是文件，如果是文件则获得文件大小并累加到变量 size中，如果是文件夹，继续递归调用当前方法。
        for (File f : files) {
            if (f.isFile()) {
                size += f.length();
            }else {
                calculate(f);
            }
        }
        return size;
    }
}
