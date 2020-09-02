import java.io.File;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class readFile {
    public static String[] nameList =
            { "田鋆","王振龙","谢燚均","周宇婷","陈俊杰", "陈伟杰", "陈雪儿", "陈晓明", "陈增文", "段绪伟",
              "余俊锋","方俊杰", "冯江涛", "龚磊", "何浩贤", "梁接升", "刘奇广", "廖庆鸿", "林锐沛", "苏文皓",
              "夏国斌","周罗校", "曹鑫","张观林","莫兴聪"};
    public static ArrayList<String> edfinsh = new ArrayList<String>();
    public static void folderMethod(String path) {
        File file = new File(path);
        if (file.exists()) {
            File[] files = file.listFiles();
            if (null != files) {
                for (File file2 : files) {
                    if (file2.isDirectory()) {
//                        System.out.println("文件夹:" + file2.getName());
                        edfinsh.add(file2.getName());
                        folderMethod(file2.getAbsolutePath());
                    } else {
//                        System.out.println(file2.getName());
                    }
                }
            }
        } else {
            System.out.println("文件不存在!");
        }
    }

    public static void unFinshList() {
        ArrayList<String> unFinshs = new ArrayList<String>();
        boolean flag;
        for (int i = 0; i < nameList.length; i++) {
            flag = false;
            for (int j = 0; j < edfinsh.size(); j++) {
                if (edfinsh.get(j).equals(nameList[i])) {
                    flag = true;
                }
            }
            if (!flag) {
                unFinshs.add(nameList[i]);
            }
        }
        System.out.println("还有"+unFinshs.size()+"人未交");
        System.out.print("未提交名单：");
        for (String str : unFinshs) {
            System.out.print(str + " ");
        }
    }
}
