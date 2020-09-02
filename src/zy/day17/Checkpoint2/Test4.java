package zy.day17.Checkpoint2;

import java.io.File;
import java.io.FileFilter;

public class Test4 {
    public static void main(String[] args) {
//    1. 创建一个类实现文件过滤器FileFilter接口并重新accept方法，
        FileFilter fileFilter = (file) -> {
//       在该方法根据传入的文件判断是否文件Java文件，如果是则返回true，否则返回false。
            return file.getName().endsWith(".Java");
        };
//    2. 根据文件夹路径字符串创建文件对象和创建文件过滤器接口实现类对象
        File file = new File("D:/A1");
//    3. 调用文件对象的listFiles(FileFilterf)方法，传递文件过滤器实现类对象。
        File[] files = file.listFiles(fileFilter);
//    4. 遍历文件数组，输入每一个文件对象
        for (File f : files) {
            System.out.println(f);
        }
    }
}
