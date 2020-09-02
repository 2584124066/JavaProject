package zy.day17.Checkpoint2;

import java.io.File;
import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) throws Exception {
//        1. 创建键盘录入对象
        Scanner scanner = new Scanner(System.in);
//        2. 接收键盘录入的字符串路径
        String string = scanner.nextLine();
//        3. 根据字符串路径创建文件对象
        File file = new File(string);
//        4. 判断文件对象是文件还是文件夹，如果是文件，则直接输出文件大小
        if (file.isFile()) {
            System.out.println(file.length());
        } else {
//        5. 如果是文件夹，则获得该文件夹下所有的文件，定义一个求和变量，
            int sum = 0;
//           遍历文件数组获得每一个文件的大小并 累加到求和变量中，最后输出求和变量的值。
            File[] files = file.listFiles();
            for (File f : files) {
                sum += f.length();
            }
            System.out.println(sum);
        }
    }
}
