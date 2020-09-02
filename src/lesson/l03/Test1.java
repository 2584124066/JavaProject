package lesson.l03;

public class Test1 {
    public static String getScore(int score) {
        String str;
        if (score < 0 || score > 100) {
            str = "成绩有误";
        } else if (score >= 90 && score <= 100) {
            str = "优秀";
        } else if (score >= 80 && score < 90) {
            str = "好";
        } else if (score >= 70 && score < 80) {
            str = "良";
        } else if (score >= 60 && score < 70) {
            str = "及格";
        } else {
            str = "不及格";
        }
        return str;
    }

    public static int getJiSUm() {
        int sum = 0;
        for (int i = 1; i < 100; i++) {
            if (i % 2 == 1) {
                sum += i;
            }
        }
        return sum;
    }

    public static int getSum() {
        int sum = 0;
        for (int i = 1; i < 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                sum += i;
                System.out.println(i);
            }
        }
        return sum;
    }

    public static String getNumber() {
        String str = "";
        for (int i = 100; i < 1000; i++) {
            int bai = i / 100, shi = i / 10 % 10, ge = i % 10;
            if ((bai * bai * bai) + (shi * shi * shi) + (ge * ge * ge) == i) {
                str += i + " ";
            }
        }
        return str;
    }

    public static String ouSum() {
        String str = "";
        int count = 0;
        for (int i = 2; i <= 60; i += 2) {
            str += i + " ";
            count++;
            if (count % 5 == 0) {
                str += "\n";
            }
        }
        return str;
    }


    public static String getTu() {
        String str = "";
        for (int i = 1; i <= 7; i++) {
            for (int j = 1; j <= 7; j++) {
                if (i == j || i + j == 8) {//对角线打印O
                    str += "O";
                } else {
                    str += "*";;//其他位置打印.
                }
            }
            str+="\n";
        }
        return str;
    }


    public static void main(String[] args) {
        System.out.println(getTu());
    }
}
