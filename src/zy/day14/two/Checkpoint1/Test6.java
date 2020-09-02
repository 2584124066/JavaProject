package zy.day14.two.Checkpoint1;

public class Test6 {
    public static char charAt(String str, int index) throws Exception {
        if (str==null){
            throw  new Exception("字符串不能为null");
        }
        if (str==""){
            throw  new Exception("字符串不能为空");
        }
        if (index<0||index>str.length()-1){
            throw  new Exception("索引越界");
        }
        return str.charAt(index);
    }
    public static void testThrows() throws Exception{
        charAt(null,5);
    }
    public static void testTryCatch(){
        try {
            charAt("",5);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public static void main(String[] args) throws Exception {
        testThrows();
        testTryCatch();
    }
}
