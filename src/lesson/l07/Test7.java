package lesson.l07;

public class Test7 {
    public static void main(String[] args) {
        double num1 = -10.8;
        double num2 = 5.9;
        int count = 0;
        for(double i = Math.ceil(num1);i<Math.ceil(num2);i++){
            if (Math.abs(i)>6||Math.abs(i)<2.1){
                count++;
            }
        }
        System.out.println(count);

    }
}
