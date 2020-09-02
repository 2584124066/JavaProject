package zy.day17.Checkpoint2;

import java.io.File;
import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) throws Exception{
//        1.使用Scanner类进行键盘录入数据
        Scanner scanner = new Scanner(System.in);
//        2.将键盘输入的内容存放到字符串中
        String string = scanner.nextLine();
//        3.使用File类的构造方法创建文件对象
        File file = new File(string);
//        4.判断文件是否存在，不存在则创建，存在则输出文件大小
        if (file.exists()){
            System.out.println(file.length());
        }else {
            file.createNewFile();
        }
    }
}
