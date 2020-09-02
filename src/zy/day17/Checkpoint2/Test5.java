package zy.day17.Checkpoint2;

import java.io.File;
import java.util.Scanner;

public class Test5 {
    public static void main(String[] args) {
//        1. 创建键盘录入对象Scanner
        Scanner scanner = new Scanner(System.in);
//        2. 定义字符串接收用户输入的文件夹路径
        String string = scanner.nextLine();
//        3. 根据文件夹路径创建文件对象
        File file = new File(string);
//        4. 调用文件对象的listFiles方法获得文件数组
        File[] files = file.listFiles();
//        5. 遍历文件数组，删除每一个文件
        for (File f : files) {
            f.delete();
        }
//        6. 最后调用删除方法删除文件夹。
        file.delete();
    }
}
