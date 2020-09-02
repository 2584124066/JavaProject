package zy.day21.test9;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.lang.reflect.Field;
import java.util.Properties;

public class Test {
    public static void main(String[] args) throws Exception {
        File file = new File("src/zy/day21/test9/record.properties");
        if (!file.exists()) {//判断属性文件是否存在，如果不存在则创建一个
            file.createNewFile();
        }
        Properties p = new Properties();
        //使用load()方法加载文件中所有的属性到Properties集合中。
        p.load(new FileInputStream(file));
        //取得count属性，如果count属性为null，则设置count属性为0。
        String count = p.getProperty("count");
        if (count == null) {
            FileWriter fw = new FileWriter(file);
            p.setProperty("count", "0");
            p.store(fw, null);
            fw.flush();
            fw.close();
        } else {
            //将取得的字符串转成整型，并判断是否大于等于3次，大于3次则到期，退出
            Integer c = Integer.valueOf(count);
            ++c;
            if (c > 3) {
                System.out.println("程序使用次数已满，请续费");
                return;
            } else {
                //输出运行次数，并加1
                p.setProperty("count", c + "");
                System.out.println("已运行次数\t" + c + "次 ");
                FileWriter fw = new FileWriter(file);
                p.store(fw, null);
                fw.flush();
                fw.close();
            }
        }
    }
}
