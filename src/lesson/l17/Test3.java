package lesson.l17;

import java.io.File;

public class Test3 {
    public static void main(String[] args) throws Exception{
        File file = new File("A2:\\B.txt");
        //创建文件
        file.createNewFile();
        //删除文件  delete方法，如果此File表示目录，则目录必须为空才能删除
        file.delete();

        //创建文件夹(目录)
        File file2 = new File("A3:\\C");
        file2.mkdir();

        //创建多级目录
        File file3 = new File("A4:\\D\\d");
        file3.mkdirs();

    }
}
