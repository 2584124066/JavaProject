package zy.day16.test6;

public class Test {
    public static void main(String[] args) {
        // TODO 请分别使用Lambda【标准格式】及【省略格式】调用invokeCalc方法来计算130‐120的结果
        invokeDirect(() -> {
            System.out.println("导演拍电影啦!");
        });

        invokeDirect(() -> System.out.println("导演拍电影啦!"));
    }

    private static void invokeDirect(Director director) {
        director.makeMovie();
    }
}
